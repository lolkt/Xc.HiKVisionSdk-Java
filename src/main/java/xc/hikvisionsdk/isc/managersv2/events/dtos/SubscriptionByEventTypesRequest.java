package xc.hikvisionsdk.isc.managersv2.events.dtos;

import xc.hikvisionsdk.enums.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.events.*;

/** 
 按事件类型订阅事件请求
*/
public class SubscriptionByEventTypesRequest extends BaseRequest
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
	 指定事件接收的地址，采用restful回调模式，支持http和https，
	 样式如下：http://ip:port/eventRcv或者      
	 https://ip:port/eventRcv
	 不超过1024个字符，事件接收地址由应用方负责按指定的规范提供，事件接收接口不需要认证
	 三方客户收到消息，请注意立即返回HTTP/1.1 200 OK， 否则因为接收太慢，导致事件积压
	*/
	private String EventDest;
	public final String getEventDest()
	{
		return EventDest;
	}
	/** 
	 订阅类型，0-订阅原始事件，1-联动事件，2-原始事件和联动事件，不填使用默认值0
	*/
	private SubscribeType SubType = SubscribeType.values()[0];
	public final SubscribeType getSubType()
	{
		return SubType;
	}
	/** 
	 事件等级，0-未配置，1-低，2-中，3-高
	 此处事件等级是指在事件联动中配置的等级
	 订阅类型为0时，此参数无效，使用默认值0
	 在订阅类型为1时，不填使用默认值[1, 2, 3]
	 在订阅类型为2时，不填使用默认值[0, 1, 2, 3]
	 数组大小不超过32，事件等级大小不超过31
	*/
	private int[] EventLvl;
	public final int[] getEventLvl()
	{
		return EventLvl;
	}

	/** 
	 
	 
	 @param eventDest 指定事件接收的地址
	 @param eventTypes 事件类型
	 @exception ArgumentNullException
	 @exception ArgumentOutOfRangeException
	*/
	public SubscriptionByEventTypesRequest(String eventDest, int... eventTypes)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(eventDest))
		{
			throw new NullPointerException("eventDest");
		}
		if (eventDest.length() > 1024)
		{
			throw new IndexOutOfBoundsException("eventDest", eventDest, "不超过1024个字符");
		}
		if (eventTypes == null || eventTypes.length == 0)
		{
			throw new NullPointerException("eventTypes");
		}
		EventDest = eventDest;
		EventTypes = eventTypes;
	}

	/** 
	 按事件类型订阅事件请求
	 
	 @param eventDest 指定事件接收的地址
	 @param eventTypes 事件类型
	 @param subType 订阅类型，0-订阅原始事件，1-联动事件，2-原始事件和联动事件，不填使用默认值0
	 @param eventLvl 事件等级，0-未配置，1-低，2-中，3-高
	 @exception ArgumentOutOfRangeException
	*/

	public SubscriptionByEventTypesRequest(String eventDest, int[] eventTypes, SubscribeType subType)
	{
		this(eventDest, eventTypes, subType, null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public SubscriptionByEventTypesRequest(string eventDest, int[] eventTypes, SubscribeType subType, int[] eventLvl = null)
	public SubscriptionByEventTypesRequest(String eventDest, int[] eventTypes, SubscribeType subType, int[] eventLvl)
	{
		this(eventDest, eventTypes);
		if (eventLvl != null && eventLvl.length > 32)
		{
			throw new IndexOutOfBoundsException("eventLvl", "数组大小不超过32");
		}


		SubType = subType;
		EventLvl = eventLvl;
	}


}