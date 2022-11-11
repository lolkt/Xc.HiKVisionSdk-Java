package xc.hikvisionsdk.isc.managers.eventservice.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.eventservice.*;

/** 
 查询事件订阅信息结果数据
*/
public class EventSubscriptionViewResponseData
{
	/** 
	 详细数据
	*/
	private EventSubscriptionViewResponseDataDetail[] Detail;
	public final EventSubscriptionViewResponseDataDetail[] getDetail()
	{
		return Detail;
	}
	public final void setDetail(EventSubscriptionViewResponseDataDetail[] value)
	{
		Detail = value;
	}
}