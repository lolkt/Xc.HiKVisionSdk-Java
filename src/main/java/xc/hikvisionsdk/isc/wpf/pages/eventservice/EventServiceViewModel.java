package xc.hikvisionsdk.isc.wpf.pages.eventservice;

import Stylet.*;
import StyletIoC.*;
import xc.hikvisionsdk.isc.managers.eventservice.*;
import xc.hikvisionsdk.isc.managers.pms.*;
import xc.hikvisionsdk.isc.managers.pms.models.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.wpf.*;
import xc.hikvisionsdk.isc.wpf.pages.*;

public class EventServiceViewModel extends BaseScreenViewModel
{
	public EventServiceViewModel(IWindowManager windowManager, IContainer container)
	{
		super(windowManager, container);
		DisplayName = "事件服务";
	}



//C# TO JAVA CONVERTER TODO TASK: There is no equivalent in Java to the 'async' keyword:
//ORIGINAL LINE: public async Task EventSubscriptionView()
	public final Task EventSubscriptionView()
	{

		try
		{

			IHikEventServiceApiManager apiManagerV1 = Container.<IHikEventServiceApiManager>Get();

//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
			var result = await apiManagerV1.EventSubscriptionViewAsync();


			if (result.Data == null)
			{
				WindowManager.ShowMessageBox(String.format("查询结果为空\r\n状态:%1$s\r\n消息:$%2$s", result.Code, result.Msg));
				return;
			}


			WindowManager.ShowMessageBox(String.format("查询成功，共有%1$s个事件", result.Data.Detail == null ? null : (result.Data.Detail.Length != null ? result.Data.Detail.Length : 0)));
		}
		catch (RuntimeException ex)
		{
			WindowManager.ShowMessageBox(String.format("查询失败\r\n") + ex);

		}
		finally
		{

		}

	}

}