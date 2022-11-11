package xc.hikvisionsdk.isc.wpf.pages.frs;

import Stylet.*;
import StyletIoC.*;
import xc.hikvisionsdk.isc.managers.frs.*;
import xc.hikvisionsdk.isc.managers.resource.*;
import xc.hikvisionsdk.isc.managers.resource.Models.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.wpf.*;
import xc.hikvisionsdk.isc.wpf.pages.*;

public class FaceViewModel extends BaseScreenViewModel
{

	public FaceViewModel(IWindowManager windowManager, IContainer container)
	{
		super(windowManager, container);
		DisplayName = "人脸";
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
//ORIGINAL LINE: public async Task Face()
	public final Task Face()
	{

		try
		{
			setRun(false);

			IHikFrsApiManager api = Container.<IHikFrsApiManager>Get();

//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
			var result = await api.FaceAsync(new managers.frs.models.FaceRequest());

			if (result.Data == null)
			{
				WindowManager.ShowMessageBox(String.format("查询结果为空\r\n状态:%1$s\r\n消息:$%2$s", result.Code, result.Msg));
				return;
			}


			WindowManager.ShowMessageBox(String.format("查询成功，共有%1$s个人脸", result.Data.Total));
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


//C# TO JAVA CONVERTER TODO TASK: There is no equivalent in Java to the 'async' keyword:
//ORIGINAL LINE: public async Task Recognition()
	public final Task Recognition()
	{
		try
		{
			setRun(false);

			IHikFrsApiManager api = Container.<IHikFrsApiManager>Get();

//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
			var result = await api.ResourceRecognitionAsync(new managers.frs.models.RecognitionRequest());

			if (result.Data == null)
			{
				WindowManager.ShowMessageBox(String.format("查询结果为空\r\n状态:%1$s\r\n消息:$%2$s", result.Code, result.Msg));
				return;
			}


			WindowManager.ShowMessageBox(String.format("查询成功，共有%1$s个人脸资源", result.Data.Length));
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