package xc.hikvisionsdk.isc.managersv2.events.dtos;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.events.*;

/** 
 查询事件订阅信息结果数据
*/
public class EventSubscriptionView
{
	/** 
	 详细数据
	*/
	private EventSubscriptionViewDetail[] Detail;
	public final EventSubscriptionViewDetail[] getDetail()
	{
		return Detail;
	}
	public final void setDetail(EventSubscriptionViewDetail[] value)
	{
		Detail = value;
	}
}