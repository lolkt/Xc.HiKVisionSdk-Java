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
import java.time.*;

public class BlackViewModel extends BaseScreenViewModel
{

	public BlackViewModel(IWindowManager windowManager, IContainer container)
	{
		super(windowManager, container);
		DisplayName = "重点人员识别计划";
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
//ORIGINAL LINE: public async Task Black()
	public final Task Black()
	{

		try
		{
			setRun(false);

			IHikFrsApiManager api = Container.<IHikFrsApiManager>Get();

//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
			var result = await api.PlanRecognitionBlackAsync(new managers.frs.models.PlanRecognitionBlackRequest());

			if (result.Data == null)
			{
				WindowManager.ShowMessageBox(String.format("查询结果为空\r\n状态:%1$s\r\n消息:$%2$s", result.Code, result.Msg));
				return;
			}


			WindowManager.ShowMessageBox(String.format("查询成功，共有%1$s个重点人员识别计划", result.Data.Length));
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
//ORIGINAL LINE: public async Task BlackSearch()
	public final Task BlackSearch()
	{

		try
		{
			setRun(false);

			IHikFrsApiManager api = Container.<IHikFrsApiManager>Get();

			var request = new managers.frs.models.EventBlackSearchRequest();
			request.setStartTime(LocalDateTime.now().plusMonths(-1).toString("yyyy-MM-ddTHH:mm:ss") + ".000+08:00");
			request.setEndTime(LocalDateTime.now().toString("yyyy-MM-ddTHH:mm:ss") + ".000+08:00");
			request.setPageSize(1000);

//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
			var result = await api.EventBlackSearchAsync(request);

			if (result.Data == null)
			{
				WindowManager.ShowMessageBox(String.format("查询结果为空\r\n状态:%1$s\r\n消息:$%2$s", result.Code, result.Msg));
				return;
			}


			WindowManager.ShowMessageBox(String.format("查询成功，一个月内共有%1$s个重点人员识别计划记录", result.Data.List.Length));
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