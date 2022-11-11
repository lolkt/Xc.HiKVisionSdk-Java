package xc.hikvisionsdk.isc.wpf.pages.resource;

import Stylet.*;
import StyletIoC.*;
import xc.hikvisionsdk.ia.managers.eaas.*;
import xc.hikvisionsdk.ia.managers.eattendanceengine.*;
import xc.hikvisionsdk.isc.managers.acs.*;
import xc.hikvisionsdk.isc.managers.irds.*;
import xc.hikvisionsdk.isc.managers.resource.*;
import xc.hikvisionsdk.isc.managers.resource.models.card.*;
import xc.hikvisionsdk.isc.managers.resource.models.person.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.wpf.*;
import xc.hikvisionsdk.isc.wpf.pages.*;
import java.nio.file.*;

public class PersonViewModel extends BaseScreenViewModel
{

	public PersonViewModel(IWindowManager windowManager, IContainer container)
	{
		super(windowManager, container);
		DisplayName = "人员信息接口";
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
//ORIGINAL LINE: public async Task PersonList()
	public final Task PersonList()
	{

		try
		{
			setRun(false);

			IHikResourceApiManager resourceApiManagerV2 = Container.<IHikResourceApiManager>Get();

			//var r = await resourceApiManagerV2.AcsDoorAdvanceAcsDoorListAsync(new Managers.Resource.Models.Acs.AcsDoorAdvanceAcsDoorListRequest
			//{

			//    PageNo = 1,
			//    PageSize = 10

			//});

//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
			var result = await resourceApiManagerV2.PersonListV2Async(new PersonListV2Request(1, 1000));

			if (result.Data == null)
			{
				WindowManager.ShowMessageBox(String.format("查询结果为空\r\n状态:%1$s\r\n消息:$%2$s", result.Code, result.Msg));
				return;
			}



			var path = Paths.get(Directory.GetCurrentDirectory()).resolve("PersonList.json").toString();
			Files.writeString(path, JsonExtensions.Serialize(result));
			WindowManager.ShowMessageBox(String.format("查询成功，共有%1$s个人员信息", result.Data.Total));
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
//ORIGINAL LINE: public async Task OrgList()
	public final Task OrgList()
	{

		try
		{
			//Xc.HiKVisionSdk.Ia.Managers.EventService.IHikEventServiceApiManager hikEventServiceApiManager = Container.Get<Xc.HiKVisionSdk.Ia.Managers.EventService.IHikEventServiceApiManager>();
			//var x = await hikEventServiceApiManager.EventsSearchAsync(new Ia.Managers.EventService.Models.EventsSearchRequest { PageNo = 1, PageSize = 1000 });
			//IHikAcsApiManager _hikAcsApiManager = Container.Get<IHikAcsApiManager>();

			//var requestDto1 = new Xc.HiKVisionSdk.Isc.Managers.Acs.Models.DoorEventsV2Request
			//{
			//    PageSize = 1000,
			//    PageNo = 1,
			//    StartTime = $"{new DateTime(2022, 6, 23, 0, 0, 0):yyyy-MM-ddTHH:mm:ss}+08:00",
			//    EndTime = $"{new DateTime(2022, 6, 23, 23, 0, 0):yyyy-MM-ddTHH:mm:ss}+08:00",
			//    Order = "asc",
			//    Sort = "eventTime",
			//};
			//var result1 = await _hikAcsApiManager.DoorEventsV2Async(requestDto1);

			//var r = result1.Data.List.Where(u => u.PersonId == "10000001").ToList();


			IHikResourceApiManager resourceApiManagerV2 = Container.<IHikResourceApiManager>Get();


			managers.resource.models.camera.AdvanceCameraListRequest tempVar = new managers.resource.models.camera.AdvanceCameraListRequest();
			tempVar.setPageNo(1);
			tempVar.setPageSize(100);
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
			var result1 = await resourceApiManagerV2.AdvanceCameraListAsync(tempVar);




			IHikAcsApiManager hikEaasServiceApiManager = Container.<IHikAcsApiManager>Get();

			//var x = await hikEaasServiceApiManager.AttendanceBatchSearchAsync(new Ia.Managers.Eaas.Attendance.AttendanceBatchSearchRequest(1, 1000));
			var requestDto = new xc.hikvisionsdk.isc.managers.acs.models.DoorEventsV2Request();
			requestDto.setPageSize(1000);
			requestDto.setPageNo(1);
			requestDto.setStartTime(String.format("2022-03-25T00:00:00+08:00"));
			requestDto.setEndTime(String.format("2022-03-26T00:00:00+08:00"));
			requestDto.setOrder("asc");
			requestDto.setSort("eventTime");
			requestDto.setPersonName("蒋伟东");
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
			var result = await hikEaasServiceApiManager.DoorEventsV2Async(requestDto);
		}
		catch (RuntimeException ex)
		{
		}



		//try
		//{
		//    IHikEaasApiManager hikEaasServiceApiManager = Container.Get<IHikEaasApiManager>();

		//    //var x = await hikEaasServiceApiManager.AttendanceBatchSearchAsync(new Ia.Managers.Eaas.Attendance.AttendanceBatchSearchRequest(1, 1000));
		//    var x = await hikEaasServiceApiManager.AttendanceResultListAsync(new Ia.Managers.Eaas.Attendance.AttendanceResultListRequest(1, 10)
		//        //.AddFieldOption("create_time", "2022-03-13 06:00:00", "gte")
		//        //.AddFieldOption("date", "2022-03-13 00:00:00", "eq")
		//        .AddSort("date", "desc")
		//        );
		//}
		//catch (Exception ex)
		//{
		//}


		//try
		//{
		//    IHikResourceApiManager hikEaasServiceApiManager = Container.Get<IHikResourceApiManager>();

		//    var x = await hikEaasServiceApiManager.OrgBatchDeleteAsync(new Managers.Resource.Models.Org.OrgBatchDeleteRequest("8cd881aa-d348-45ea-9ab0-0b606f9215dc"));
		//}
		//catch (Exception ex)
		//{
		//}
		//try
		//{
		//    IHikResourceApiManager hikEaasServiceApiManager = Container.Get<IHikResourceApiManager>();

		//    var x = await hikEaasServiceApiManager.OrgSingleUpdateAsync(new Managers.Resource.Models.Org.OrgSingleUpdateRequest("7257b84f-2dd6-491e-af76-68d6ba7ec82c", "bba"));
		//}
		//catch (Exception ex)
		//{
		//}

		try
		{
			setRun(false);

			IHikResourceApiManager resourceApiManager = Container.<IHikResourceApiManager>Get();

			managers.resource.models.org.OrgListRequest tempVar2 = new managers.resource.models.org.OrgListRequest();
			tempVar2.setPageSize(10);
			tempVar2.setPageNo(1);
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
			var orgList = await resourceApiManager.OrgListAsync(tempVar2);

			if (orgList.Data == null)
			{
				WindowManager.ShowMessageBox(String.format("查询结果为空\r\n状态:%1$s\r\n消息:$%2$s", orgList.Code, orgList.Msg));
				return;
			}

			var path = Paths.get(Directory.GetCurrentDirectory()).resolve("OrgList.json").toString();
			Files.writeString(path, JsonExtensions.Serialize(orgList));

			WindowManager.ShowMessageBox(String.format("查询成功，共有%1$s个组织", orgList.Data.Total));
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
//ORIGINAL LINE: public async Task CardList()
	public final Task CardList()
	{
		try
		{
			setRun(false);

			IHikResourceApiManager resourceApiManager = Container.<IHikResourceApiManager>Get();

			CardListRequest tempVar = new CardListRequest();
			tempVar.setPageNo(1);
			tempVar.setPageSize(10);
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
			var result = await resourceApiManager.CardListAsync(tempVar);

			if (result.Data == null)
			{
				WindowManager.ShowMessageBox(String.format("查询结果为空\r\n状态:%1$s\r\n消息:$%2$s", result.Code, result.Msg));
				return;
			}

			var path = Paths.get(Directory.GetCurrentDirectory()).resolve("CardList.json").toString();
			Files.writeString(path, JsonExtensions.Serialize(result));


			WindowManager.ShowMessageBox(String.format("查询成功:%1$s张卡", result.Data.Total));
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
//ORIGINAL LINE: public async Task CardInfo()
	public final Task CardInfo()
	{

		try
		{
			setRun(false);

			IHikIrdsApiManager resourceApiManager = Container.<IHikIrdsApiManager>Get();

//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
			var result = await resourceApiManager.CardInfoAsync(new managers.irds.models.CardInfoRequest("1314307314"));

			if (result.Data == null)
			{
				WindowManager.ShowMessageBox(String.format("查询结果为空\r\n状态:%1$s\r\n消息:$%2$s", result.Code, result.Msg));
				return;
			}

			WindowManager.ShowMessageBox(String.format("查询成功:%1$s-%2$s", result.Data.PersonName, result.Data.PersonId));
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