package xc.hikvisionsdk.ia.managers.eventservice.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.managers.*;
import xc.hikvisionsdk.ia.managers.eventservice.*;

/** 
 获取联动事件列表结果数据
*/
public class EventsSearchResponseData
{
	/** 
	 事件id
	*/
	private String Id;
	public final String getId()
	{
		return Id;
	}
	public final void setId(String value)
	{
		Id = value;
	}
	/** 
	 事件规则id
	*/
	private String EventRuleId;
	public final String getEventRuleId()
	{
		return EventRuleId;
	}
	public final void setEventRuleId(String value)
	{
		EventRuleId = value;
	}
	/** 
	 事件规则名称
	*/
	private String RuleName;
	public final String getRuleName()
	{
		return RuleName;
	}
	public final void setRuleName(String value)
	{
		RuleName = value;
	}
	/** 
	 事件开始时间，ISO8601格式：yyyy-MM-ddTHH:mm:ss.zzz+当前时区，例如北京时间：2018-07-26T15:00:00.000+08:00
	*/
	private String StartTime;
	public final String getStartTime()
	{
		return StartTime;
	}
	public final void setStartTime(String value)
	{
		StartTime = value;
	}
	/** 
	 事件结束时间，ISO8601格式：yyyy-MM-ddTHH:mm:ss.zzz+当前时区，例如北京时间：2018-07-26T15:00:00.000+08:00
	*/
	private String EndTime;
	public final String getEndTime()
	{
		return EndTime;
	}
	public final void setEndTime(String value)
	{
		EndTime = value;
	}
	/** 
	 事件等级,1-低，2-中，3-高
	*/
	private EventLevel EventLevel = EventLevel.values()[0];
	public final EventLevel getEventLevel()
	{
		return EventLevel;
	}
	public final void setEventLevel(EventLevel value)
	{
		EventLevel = value;
	}
	/** 
	 事件等级value，低、中、高
	*/
	private String EventLevelValue;
	public final String getEventLevelValue()
	{
		return EventLevelValue;
	}
	public final void setEventLevelValue(String value)
	{
		EventLevelValue = value;
	}
	/** 
	 事件等级颜色，RGB格式，例如#AE8D06
	*/
	private String EventLevelColor;
	public final String getEventLevelColor()
	{
		return EventLevelColor;
	}
	public final void setEventLevelColor(String value)
	{
		EventLevelColor = value;
	}
	/** 
	 事件类型名称
	*/
	private String EventTypeName;
	public final String getEventTypeName()
	{
		return EventTypeName;
	}
	public final void setEventTypeName(String value)
	{
		EventTypeName = value;
	}
	/** 
	 处理意见
	*/
	private String Remark;
	public final String getRemark()
	{
		return Remark;
	}
	public final void setRemark(String value)
	{
		Remark = value;
	}
	/** 
	 事件处理状态，0-未处理，1-已处理
	*/
	private HandleStatus HandleStatus = HandleStatus.values()[0];
	public final HandleStatus getHandleStatus()
	{
		return HandleStatus;
	}
	public final void setHandleStatus(HandleStatus value)
	{
		HandleStatus = value;
	}
	/** 
	 事件记录列表
	*/
	private EventsSearchResponseDataEventLogSrc[] EventLogSrcList;
	public final EventsSearchResponseDataEventLogSrc[] getEventLogSrcList()
	{
		return EventLogSrcList;
	}
	public final void setEventLogSrcList(EventsSearchResponseDataEventLogSrc[] value)
	{
		EventLogSrcList = value;
	}
}