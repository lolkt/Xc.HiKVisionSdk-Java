package xc.hikvisionsdk.ia.managers.eventservice.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.managers.*;
import xc.hikvisionsdk.ia.managers.eventservice.*;

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