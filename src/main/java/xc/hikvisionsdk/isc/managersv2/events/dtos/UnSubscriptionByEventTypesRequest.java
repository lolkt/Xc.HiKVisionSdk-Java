package xc.hikvisionsdk.isc.managersv2.events.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.events.*;

/** 
 按事件类型取消订阅请求
*/
public class UnSubscriptionByEventTypesRequest extends BaseRequest
{
	/** 
	 事件类型
	*/
	private int[] EventTypes;
	public final int[] getEventTypes()
	{
		return EventTypes;
	}


	/** 
	 按事件类型取消订阅请求
	 
	 @param eventTypes 事件类型
	*/
	public UnSubscriptionByEventTypesRequest(int... eventTypes)
	{
		if (eventTypes == null || eventTypes.length == 0)
		{
			throw new NullPointerException("eventTypes");
		}
		EventTypes = eventTypes;
	}



}