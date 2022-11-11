package xc.hikvisionsdk.isc.managersv2.events;

import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managersv2.events.dtos.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 事件
*/
public class HikEventManager implements IHikEventManager
{
	private final IHikVisionIscApiManager _hikVisionApiManager;
	private static final GetSubscriptionViewRequest _getSubscriptionViewRequest = new GetSubscriptionViewRequest();
	/** 
	 人员及照片管理
	 
	 @param hikVisionApiManager
	*/
	public HikEventManager(IHikVisionIscApiManager hikVisionApiManager)
	{
		_hikVisionApiManager = hikVisionApiManager;
	}

	/** 
	 获取联动事件列表
	 
	 @param request
	 @return 
	*/
	public final Task<GetEventsListResponse> GetEventsListAsync(GetEventsListRequest request)
	{
		return HikVisionApiManagerExtensions.<GetEventsListRequest, GetEventsListResponse>PostAndGetAsync(_hikVisionApiManager, "/api/els/v1/events/search", request, VersionConsts.V1_3);
	}


	/** 
	 按事件类型订阅事件
	 
	 @param request
	 @return 
	*/
	public final Task<SubscriptionByEventTypesResponse> SubscriptionByEventTypesAsync(SubscriptionByEventTypesRequest request)
	{
		return HikVisionApiManagerExtensions.<SubscriptionByEventTypesRequest, SubscriptionByEventTypesResponse>PostAndGetAsync(_hikVisionApiManager, "/api/eventService/v1/eventSubscriptionByEventTypes", request, VersionConsts.V1_3);
	}


	/** 
	 查询事件订阅信息
	 
	 @return 
	*/
	public final Task<GetSubscriptionViewResponse> GetEventSubscriptionViewAsync()
	{
		return HikVisionApiManagerExtensions.<GetSubscriptionViewRequest, GetSubscriptionViewResponse>PostAndGetAsync(_hikVisionApiManager, "/api/eventService/v1/eventSubscriptionView", _getSubscriptionViewRequest, VersionConsts.V1);
	}

	/** 
	 按事件类型取消订阅
	 
	 @param request
	 @return 
	*/
	public final Task<UnSubscriptionByEventTypesResponse> UnSubscriptionByEventTypesAsync(UnSubscriptionByEventTypesRequest request)
	{
		return HikVisionApiManagerExtensions.<UnSubscriptionByEventTypesRequest, UnSubscriptionByEventTypesResponse>PostAndGetAsync(_hikVisionApiManager, "/api/eventService/v1/eventUnSubscriptionByEventTypes", request, VersionConsts.V1);
	}
}