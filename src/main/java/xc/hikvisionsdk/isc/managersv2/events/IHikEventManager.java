package xc.hikvisionsdk.isc.managersv2.events;

import xc.hikvisionsdk.isc.managersv2.events.dtos.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 事件
 <list type="bullet">
 <item>
 <term>GetEventsListAsync</term>
 <description>获取联动事件列表</description>
 </item>
 <item>
 <term>SubscriptionByEventTypesAsync</term>
 <description>按事件类型订阅事件</description>
 </item>
 <item>
 <term>GetEventSubscriptionViewAsync</term>
 <description>查询事件订阅信息</description>
 </item>
 <item>
 <term>UnSubscriptionByEventTypesAsync</term>
 <description>按事件类型取消订阅</description>
 </item>
 </list>
*/
public interface IHikEventManager
{
	/** 
	 获取联动事件列表
	 
	 @param request 请求
	 @return 
	 通过查询条件获取l联动事件信息列表，返回结果分页展示。
	*/
	Task<GetEventsListResponse> GetEventsListAsync(GetEventsListRequest request);

	/** 
	 按事件类型订阅事件
	 
	 @param request 请求
	 @return 
	 该接口用于满足应用方按事件类型码订阅事件，同一个用户重复订阅相同的事件，接口内部逻辑自动去重，确保不重复投递事件。        事件订阅接口， 支持订阅平台的所有业务的各种事件类型，具体参考附录D        本接口要求，三方订阅的时候，要求三方指定的http/https接收事件的服务地址。后续平台产生对应的事件，会推送到此http/https服务地址。
	*/
	Task<SubscriptionByEventTypesResponse> SubscriptionByEventTypesAsync(SubscriptionByEventTypesRequest request);

	/** 
	 查询事件订阅信息
	 
	 @return 
	 应用方根据用户查询事件订阅详情。
	*/
	Task<GetSubscriptionViewResponse> GetEventSubscriptionViewAsync();
	/** 
	 按事件类型取消订阅
	 
	 @param request 请求
	 @return 
	 应用方指定事件类型取消订阅。
	*/
	Task<UnSubscriptionByEventTypesResponse> UnSubscriptionByEventTypesAsync(UnSubscriptionByEventTypesRequest request);
}