package xc.hikvisionsdk.isc.managers.eventservice;

import xc.hikvisionsdk.isc.managers.eventservice.models.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;

/** 
 事件服务api
*/
public class HikEventServiceApiManager implements IHikEventServiceApiManager
{
	private final IHikVisionIscApiManager _hikVisionApiManager;
	/** 
	 
	 
	 @param hikVisionApiManager
	*/
	public HikEventServiceApiManager(IHikVisionIscApiManager hikVisionApiManager)
	{
		_hikVisionApiManager = hikVisionApiManager;
	}

	/** 
	 获取联动事件列表
	 
	 @param model
	 @return 
	*/
	public final EventsSearchResponse EventsSearch(EventsSearchRequest model)
	{
		return HikVisionApiManagerExtensions.<EventsSearchRequest, EventsSearchResponse>PostAndGet(_hikVisionApiManager, "/api/eventService/v1/events/search", model, VersionConsts.V1_3);
	}

	/** 
	 获取联动事件列表
	 
	 @param model
	 @return 
	*/
	public final Task<EventsSearchResponse> EventsSearchAsync(EventsSearchRequest model)
	{
		return HikVisionApiManagerExtensions.<EventsSearchRequest, EventsSearchResponse>PostAndGetAsync(_hikVisionApiManager, "/api/els/v1/events/search", model, VersionConsts.V1_3);
	}

	/** 
	 按事件类型订阅事件
	 
	 @param model
	 @return 
	*/
	public final EventSubscriptionByEventTypesResponse EventSubscriptionByEventTypes(EventSubscriptionByEventTypesRequest model)
	{
		return HikVisionApiManagerExtensions.<EventSubscriptionByEventTypesRequest, EventSubscriptionByEventTypesResponse>PostAndGet(_hikVisionApiManager, "/api/eventService/v1/eventSubscriptionByEventTypes", model, VersionConsts.V1_3);
	}

	/** 
	 按事件类型订阅事件
	 
	 @param model
	 @return 
	*/
	public final Task<EventSubscriptionByEventTypesResponse> EventSubscriptionByEventTypesAsync(EventSubscriptionByEventTypesRequest model)
	{
		return HikVisionApiManagerExtensions.<EventSubscriptionByEventTypesRequest, EventSubscriptionByEventTypesResponse>PostAndGetAsync(_hikVisionApiManager, "/api/eventService/v1/eventSubscriptionByEventTypes", model, VersionConsts.V1_3);
	}

	/** 
	 查询事件订阅信息
	 
	 @return 
	*/
	public final EventSubscriptionViewResponse EventSubscriptionView()
	{
		return HikVisionApiManagerExtensions.<EventSubscriptionViewRequest, EventSubscriptionViewResponse>PostAndGet(_hikVisionApiManager, "/api/eventService/v1/eventSubscriptionView", null, VersionConsts.V1);
	}

	/** 
	 查询事件订阅信息
	 
	 @return 
	*/
	public final Task<EventSubscriptionViewResponse> EventSubscriptionViewAsync()
	{
		return HikVisionApiManagerExtensions.<EventSubscriptionViewRequest, EventSubscriptionViewResponse>PostAndGetAsync(_hikVisionApiManager, "/api/eventService/v1/eventSubscriptionView", null, VersionConsts.V1);
	}

	/** 
	 按事件类型取消订阅
	 
	 @param model
	 @return 
	*/
	public final EventUnSubscriptionByEventTypesResponse EventUnSubscriptionByEventTypes(EventUnSubscriptionByEventTypesRequest model)
	{
		return HikVisionApiManagerExtensions.<EventUnSubscriptionByEventTypesRequest, EventUnSubscriptionByEventTypesResponse>PostAndGet(_hikVisionApiManager, "/api/eventService/v1/eventUnSubscriptionByEventTypes", model, VersionConsts.V1);
	}

	/** 
	 按事件类型取消订阅
	 
	 @param model
	 @return 
	*/
	public final Task<EventUnSubscriptionByEventTypesResponse> EventUnSubscriptionByEventTypesAsync(EventUnSubscriptionByEventTypesRequest model)
	{
		return HikVisionApiManagerExtensions.<EventUnSubscriptionByEventTypesRequest, EventUnSubscriptionByEventTypesResponse>PostAndGetAsync(_hikVisionApiManager, "/api/eventService/v1/eventUnSubscriptionByEventTypes", model, VersionConsts.V1);
	}
}