package xc.hikvisionsdk.ia.extensions;

import xc.hikvisionsdk.ia.managers.*;
import xc.hikvisionsdk.ia.managers.eaas.*;
import xc.hikvisionsdk.ia.models.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;

/** 
 di扩展
*/
public final class ServiceCollectionExtensions
{
	/** 
	 添加海康考勤平台API管理
	 
	 @param services
	 @param configuration
	 @return 
	*/
	public static IServiceCollection AddHikVisionIa(IServiceCollection services, IConfiguration configuration)
	{

		services.<IaSdkOption>Configure(configuration.GetSection(IaSdkOption.Position));

		//services.AddSingleton<IPlanStatusCollection, PlanStatusCollection>();
		//services.AddSingleton<IInstallLocationCollection, InstallLocationCollection>();
		//services.AddSingleton<IEventCollection, EventCollection>();
		//services.AddSingleton<IDoorEventSortCollection, DoorEventSortCollection>();


		services.<IHikVisionIaApiManager, HikVisionIaApiManager>AddHttpClient(option ->
		{
					option.DefaultRequestHeaders.Accept.Add(new System.Net.Http.Headers.MediaTypeWithQualityHeaderValue("application/json"));
		}).ConfigurePrimaryHttpMessageHandler(() ->
		{
					return new HttpClientHandler() {ServerCertificateCustomValidationCallback = (message, certificate2, arg3, arg4) -> true};
				});

		//services.AddScoped<IHikAcsApiManager, HikAcsApiManager>();
		//services.AddScoped<IHikEventServiceApiManager, HikEventServiceApiManager>();
		//services.AddScoped<IHikFrsApiManager, HikFrsApiManager>();
		//services.AddScoped<IHikPmsApiManager, HikPmsApiManager>();
		//services.AddScoped<IHikResourceApiManager, HikResourceApiManager>();
		//services.AddScoped<IHikIrdsApiManager, HikIrdsApiManager>();
		services.<IHikEaasApiManager, HikEaasApiManager>AddScoped();


		return services;
	}
}