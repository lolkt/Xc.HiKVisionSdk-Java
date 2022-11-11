package xc.hikvisionsdk.isc;

import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.acs.*;
import xc.hikvisionsdk.isc.managers.eventservice.*;
import xc.hikvisionsdk.isc.managers.frs.*;
import xc.hikvisionsdk.isc.managers.irds.*;
import xc.hikvisionsdk.isc.managers.mpc.*;
import xc.hikvisionsdk.isc.managers.pms.*;
import xc.hikvisionsdk.isc.managers.resource.*;
import xc.hikvisionsdk.isc.managers.video.*;
import xc.hikvisionsdk.isc.managersv2.cards.*;
import xc.hikvisionsdk.isc.managersv2.events.*;
import xc.hikvisionsdk.isc.managersv2.faces.*;
import xc.hikvisionsdk.isc.managersv2.orgs.*;
import xc.hikvisionsdk.isc.managersv2.persons.*;
import xc.hikvisionsdk.isc.managersv2.resources.*;
import xc.hikvisionsdk.isc.models.*;
import xc.hikvisionsdk.options.*;
import xc.hikvisionsdk.*;

/** 
 di扩展
*/
public final class ServiceCollectionExtensions
{
	/** 
	 添加海康ISCAPI管理
	 
	 @param services
	 @param configuration
	 @return 
	*/
	public static IServiceCollection AddHikVisionIsc(IServiceCollection services, IConfiguration configuration)
	{
		//
		services.<HiKVisionOptions>Configure(configuration.GetSection("Hikvision"));
		services.<IscSdkOption>Configure(configuration.GetSection(IscSdkOption.Position));

		//services.AddSingleton<IPlanStatusCollection, PlanStatusCollection>();
		//services.AddSingleton<IInstallLocationCollection, InstallLocationCollection>();
		//services.AddSingleton<IEventCollection, EventCollection>();
		//services.AddSingleton<IDoorEventSortCollection, DoorEventSortCollection>();


		services.<IHikVisionIscApiManager, HikVisionIscApiManager>AddHttpClient(option ->
		{
					option.DefaultRequestHeaders.Accept.Add(new System.Net.Http.Headers.MediaTypeWithQualityHeaderValue("application/json"));
		}).ConfigurePrimaryHttpMessageHandler(() ->
		{
					return new HttpClientHandler() {ServerCertificateCustomValidationCallback = (message, certificate2, arg3, arg4) -> true};
				});



		xc.hikvisionsdk.isc.ServiceCollectionExtensions.AddManagers(services);

		xc.hikvisionsdk.isc.ServiceCollectionExtensions.AddV2Managers(services);


		return services;
	}

	/** 
	 
	 
	 @param services
	 @return 
	*/
	private static IServiceCollection AddManagers(IServiceCollection services)
	{
		services.<IHikAcsApiManager, HikAcsApiManager>AddScoped();
		services.<IHikEventServiceApiManager, HikEventServiceApiManager>AddScoped();
		services.<IHikFrsApiManager, HikFrsApiManager>AddScoped();
		services.<IHikPmsApiManager, HikPmsApiManager>AddScoped();
		services.<IHikResourceApiManager, HikResourceApiManager>AddScoped();
		services.<IHikIrdsApiManager, HikIrdsApiManager>AddScoped();
		services.<IHikMpcApiManager, HikMpcApiManager>AddScoped();
		services.<IHikVideoApiManager, HikVideoApiManager>AddScoped();
		return services;

	}

	/** 
	 
	 
	 @param services
	 @return 
	*/
	private static IServiceCollection AddV2Managers(IServiceCollection services)
	{

		return services.<IHikCardManager, HikCardManager>AddScoped().<IHikOrgManager, HikOrgManager>AddScoped().<IHikResourceManager, HikResourceManager>AddScoped().<IHikPersonManager, HikPersonManager>AddScoped().<IHikFaceManager, HikFaceManager>AddScoped().<IHikEventManager, HikEventManager>AddScoped();

	}
}