package xc.hikvisionsdk.isc.managers.eventservice;

import xc.hikvisionsdk.isc.managers.eventservice.models.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;

/** 
 事件服务api
*/
public interface IHikEventServiceApiManager
{

	/** 
	 获取联动事件列表
	 
	 @param model
	 @return 
	*/
	EventsSearchResponse EventsSearch(EventsSearchRequest model);

	/** 
	 获取联动事件列表
	 
	 @param model
	 @return 
	*/
	Task<EventsSearchResponse> EventsSearchAsync(EventsSearchRequest model);

	/** 
	 按事件类型订阅事件
	 
	 @param model
	 @return 
	*/
	EventSubscriptionByEventTypesResponse EventSubscriptionByEventTypes(EventSubscriptionByEventTypesRequest model);

	/** 
	 按事件类型订阅事件
	 
	 @param model
	 @return 
	*/
	Task<EventSubscriptionByEventTypesResponse> EventSubscriptionByEventTypesAsync(EventSubscriptionByEventTypesRequest model);

	/** 
	 查询事件订阅信息
	 
	 @return 
	*/
	EventSubscriptionViewResponse EventSubscriptionView();

	/** 
	 查询事件订阅信息
	 
	 @return 
	*/
	Task<EventSubscriptionViewResponse> EventSubscriptionViewAsync();

	/** 
	 按事件类型取消订阅
	 
	 @param model
	 @return 
	*/
	EventUnSubscriptionByEventTypesResponse EventUnSubscriptionByEventTypes(EventUnSubscriptionByEventTypesRequest model);

	/** 
	 按事件类型取消订阅
	 
	 @param model
	 @return 
	*/
	Task<EventUnSubscriptionByEventTypesResponse> EventUnSubscriptionByEventTypesAsync(EventUnSubscriptionByEventTypesRequest model);









}