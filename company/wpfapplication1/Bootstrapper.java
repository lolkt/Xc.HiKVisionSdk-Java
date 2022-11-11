package company.wpfapplication1;

import company.wpfapplication1.pages.*;
import Stylet.*;
import StyletIoC.*;
import xc.hikvisionsdk.ia.managers.*;
import xc.hikvisionsdk.ia.managers.eaas.*;
import xc.hikvisionsdk.ia.managers.eattendanceengine.*;
import xc.hikvisionsdk.ia.models.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.acs.*;
import xc.hikvisionsdk.isc.managers.eventservice.*;
import xc.hikvisionsdk.isc.managers.frs.*;
import xc.hikvisionsdk.isc.managers.irds.*;
import xc.hikvisionsdk.isc.managers.pms.*;
import xc.hikvisionsdk.isc.managers.resource.*;
import xc.hikvisionsdk.isc.models.*;

public class Bootstrapper extends Bootstrapper<ShellViewModel>
{
	@Override
	protected void ConfigureIoC(IStyletIoCBuilder builder)
	{
		//var p = new Xc.HiKVisionSdk.Isc.Managers.EventService.Models.EventsSearchRequest(System.DateTime.Now, System.DateTime.Now, 1, 50);
		//var d = p.ToString();

		builder.<HttpClient>Bind().ToFactory(container ->
		{

				var client = new HttpClient(new HttpClientHandler {ServerCertificateCustomValidationCallback = (message, certificate2, arg3, arg4) -> true});
				client.DefaultRequestHeaders.Accept.Add(new System.Net.Http.Headers.MediaTypeWithQualityHeaderValue("application/json"));
				return client;
		});

		// builder.Bind<IscSdkOption>().ToSelf().InSingletonScope();

		builder.<IOptions<IscSdkOption>>Bind().<SdkOption>To().InSingletonScope();
		builder.<IOptions<IaSdkOption>>Bind().<IaOption>To().InSingletonScope();

		builder.<IHikVisionIscApiManager>Bind().<HikVisionIscApiManager>To();
		builder.<IHikPmsApiManager>Bind().<HikPmsApiManager>To();
		builder.<IHikResourceApiManager>Bind().<HikResourceApiManager>To();
		builder.<IHikEventServiceApiManager>Bind().<HikEventServiceApiManager>To();
		builder.<IHikFrsApiManager>Bind().<HikFrsApiManager>To();
		builder.<IHikAcsApiManager>Bind().<HikAcsApiManager>To();
		builder.<IHikIrdsApiManager>Bind().<HikIrdsApiManager>To();



		builder.<xc.hikvisionsdk.ia.managers.eventservice.IHikEventServiceApiManager>Bind().<xc.hikvisionsdk.ia.managers.eventservice.HikEventServiceApiManager>To();

		builder.<IHikVisionIaApiManager>Bind().<HikVisionIaApiManager>To();
		builder.<IHikEattendanceEngineApiManager>Bind().<HikEattendanceEngineApiManager>To();
		builder.<IHikEaasApiManager>Bind().<HikEaasApiManager>To();



	}

	@Override
	protected void Configure()
	{
		// Perform any other configuration before the application starts
	}
}