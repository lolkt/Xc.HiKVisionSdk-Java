package xc.hikvisionsdk.ia.managers.eventservice.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.managers.*;
import xc.hikvisionsdk.ia.managers.eventservice.*;

/** 
 按事件类型订阅事件请求
*/
public class EventSubscriptionByEventTypesRequest extends BaseRequest
{
	/** 
	 事件类型
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Required] public int[] EventTypes {get;set;}
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
	 指定事件接收的地址，采用restful回调模式，支持http和https，
	 样式如下：http://ip:port/eventRcv或者      
	 https://ip:port/eventRcv
	 不超过1024个字符，事件接收地址由应用方负责按指定的规范提供，事件接收接口不需要认证
	 三方客户收到消息，请注意立即返回HTTP/1.1 200 OK， 否则因为接收太慢，导致事件积压
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Required] public string EventDest {get;set;}
	private String EventDest;
	public final String getEventDest()
	{
		return EventDest;
	}
	public final void setEventDest(String value)
	{
		EventDest = value;
	}
	/** 
	 订阅类型，0-订阅原始事件，1-联动事件，2-原始事件和联动事件，不填使用默认值0
	*/
	private SubType SubType = SubType.values()[0];
	public final SubType getSubType()
	{
		return SubType;
	}
	public final void setSubType(SubType value)
	{
		SubType = value;
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
	public final void setEventLvl(int[] value)
	{
		EventLvl = value;
	}


	/** 
	 按事件类型订阅事件请求
	 
	 @param eventDest 指定事件接收的地址
	 @param eventTypes 事件类型
	*/
	public EventSubscriptionByEventTypesRequest(String eventDest, int... eventTypes)
	{
		setEventDest(eventDest);
		setEventTypes(eventTypes);
	}

	/** 
	 按事件类型订阅事件请求
	 
	 @param eventTypes 事件类型
	 @param eventDest 指定事件接收的地址
	 @param subType 订阅类型，0-订阅原始事件，1-联动事件，2-原始事件和联动事件，不填使用默认值0
	 @param eventLvl 事件等级，0-未配置，1-低，2-中，3-高
	*/
	public EventSubscriptionByEventTypesRequest(int[] eventTypes, String eventDest, SubType subType, int[] eventLvl)
	{
		this(eventDest, eventTypes);
		setSubType(subType);
		setEventLvl(eventLvl);
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	 @exception IndexOutOfRangeException
	*/
	@Override
	public void CheckParams()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getEventDest()))
		{
			throw new NullPointerException("EventDest");
		}
		if (getEventDest().length() > 1024)
		{
			throw new IndexOutOfBoundsException("EventDest");
		}
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