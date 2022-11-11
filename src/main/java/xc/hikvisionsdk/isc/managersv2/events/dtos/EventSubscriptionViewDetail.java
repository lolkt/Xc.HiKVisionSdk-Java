package xc.hikvisionsdk.isc.managersv2.events.dtos;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.events.*;

/** 
 查询事件订阅信息详细
*/
public class EventSubscriptionViewDetail
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
	 事件接收地址
	*/
	private String EventDest;
	public final String getEventDest()
	{
		return EventDest;
	}
	public final void setEventDest(String value)
	{
		EventDest = value;
	}
}