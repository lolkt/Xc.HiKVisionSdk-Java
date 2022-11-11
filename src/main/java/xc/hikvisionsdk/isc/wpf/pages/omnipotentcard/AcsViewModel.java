package xc.hikvisionsdk.isc.wpf.pages.omnipotentcard;

import Stylet.*;
import StyletIoC.*;
import xc.hikvisionsdk.isc.managers.acs.*;
import xc.hikvisionsdk.isc.managers.resource.*;
import xc.hikvisionsdk.isc.managers.resource.Models.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.wpf.*;
import xc.hikvisionsdk.isc.wpf.pages.*;
import java.nio.file.*;

public class AcsViewModel extends BaseScreenViewModel
{


	public AcsViewModel(IWindowManager windowManager, IContainer container)
	{
		super(windowManager, container);
		DisplayName = "门禁";
	}

	private boolean IsRun;
	public final boolean isRun()
	{
		return IsRun;
	}
	public final void setRun(boolean value)
	{
		IsRun = value;
	}

//C# TO JAVA CONVERTER TODO TASK: There is no equivalent in Java to the 'async' keyword:
//ORIGINAL LINE: public async Task Events()
	public final Task Events()
	{

		try
		{
			setRun(false);

			IHikAcsApiManager resourceApiManagerV2 = Container.<IHikAcsApiManager>Get();

			managers.acs.models.DoorEventsV2Request tempVar = new managers.acs.models.DoorEventsV2Request();
			tempVar.setPageSize(1000);
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
			var result = await resourceApiManagerV2.DoorEventsV2Async(tempVar);

			if (result.Data == null)
			{
				WindowManager.ShowMessageBox(String.format("查询结果为空\r\n状态:%1$s\r\n消息:$%2$s", result.Code, result.Msg));
				return;
			}

			var path = Paths.get(Directory.GetCurrentDirectory()).resolve("acs.json").toString();
			Files.writeString(path, JsonExtensions.Serialize(result));
			WindowManager.ShowMessageBox(String.format("查询成功，共有%1$s个人门禁信息", result.Data.Total));
		}
		catch (RuntimeException ex)
		{
			WindowManager.ShowMessageBox(String.format("查询失败\r\n") + ex);

		}
		finally
		{
			setRun(true);
		}
	}






}