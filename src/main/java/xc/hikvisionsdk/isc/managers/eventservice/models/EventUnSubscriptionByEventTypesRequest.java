package xc.hikvisionsdk.isc.managers.eventservice.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.eventservice.*;

/** 
 按事件类型取消订阅请求
*/
public class EventUnSubscriptionByEventTypesRequest extends BaseRequest
{
	/** 
	 事件类型
	*/
	private int[] EventTypes;
	public final int[] getEventTypes()
	{
		return EventTypes;
	}
	public final void setEventTypes(int[] value)
	{
		EventTypes = value;
	}

	/** 
	 按事件类型取消订阅请求
	*/
	public EventUnSubscriptionByEventTypesRequest()
	{
	}

	/** 
	 按事件类型取消订阅请求
	 
	 @param eventTypes 事件类型
	*/
	public EventUnSubscriptionByEventTypesRequest(int... eventTypes)
	{
		setEventTypes(eventTypes);
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	 @exception IndexOutOfRangeException
	*/
	@Override
	public void CheckParams()
	{
		if (getEventTypes() == null)
		{
			throw new NullPointerException("EventTypes");
		}
		if (getEventTypes().length == 0)
		{
			throw new IndexOutOfBoundsException("EventTypes");
		}
	}

}