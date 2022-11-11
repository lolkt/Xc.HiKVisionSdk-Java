package xc.hikvisionsdk.isc.wpf.pages.vehicle;

import Stylet.*;
import StyletIoC.*;
import xc.hikvisionsdk.isc.managers.pms.*;
import xc.hikvisionsdk.isc.managers.pms.models.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.wpf.*;
import xc.hikvisionsdk.isc.wpf.pages.*;
import java.nio.file.*;

public class CarParkViewModel extends BaseScreenViewModel
{
	public CarParkViewModel(IWindowManager windowManager, IContainer container)
	{
		super(windowManager, container);
		DisplayName = "停车场功能";
	}




//C# TO JAVA CONVERTER TODO TASK: There is no equivalent in Java to the 'async' keyword:
//ORIGINAL LINE: public async Task AlarmCar()
	public final Task AlarmCar()
	{

		try
		{

			IHikPmsApiManager pmsApiManagerV1 = Container.<IHikPmsApiManager>Get();

//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
			var result = await pmsApiManagerV1.AlarmCarPageAsync(new AlarmCarPageRequest());


			if (result.Data == null)
			{
				WindowManager.ShowMessageBox(String.format("查询结果为空\r\n状态:%1$s\r\n消息:$%2$s", result.Code, result.Msg));
				return;
			}


			WindowManager.ShowMessageBox(String.format("查询成功，共有%1$s个布控车辆", result.Data.Total));
		}
		catch (RuntimeException ex)
		{
			WindowManager.ShowMessageBox(String.format("查询失败\r\n") + ex);

		}
		finally
		{

		}

	}


//C# TO JAVA CONVERTER TODO TASK: There is no equivalent in Java to the 'async' keyword:
//ORIGINAL LINE: public async Task ParkRemainSpaceNum()
	public final Task ParkRemainSpaceNum()
	{

		try
		{

			IHikPmsApiManager pmsApiManagerV1 = Container.<IHikPmsApiManager>Get();

//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
			var result = await pmsApiManagerV1.ParkRemainSpaceNumAsync(new ParkRemainSpaceNumRequest());
			int parks = 0;
			int left = 0;
			int place = 0;
			if (result.Data == null)
			{
				WindowManager.ShowMessageBox(String.format("查询结果为空\r\n状态:%1$s\r\n消息:$%2$s", result.Code, result.Msg));
				return;
			}
			for (var xx : result.Data)
			{
				parks++;
				place += xx.TotalPlace;
				left += xx.LeftPlace;
			}

			var path = Paths.get(Directory.GetCurrentDirectory()).resolve("ParkRemainSpaceNum.json").toString();
			Files.writeString(path, JsonExtensions.Serialize(result));

			WindowManager.ShowMessageBox(String.format("查询成功，共有%1$s个停个车，共%2$s个车位，剩余%3$s个车位", parks, place, left));
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