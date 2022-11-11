package xc.hikvisionsdk.isc.managers.eventservice.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.eventservice.*;

/** 
 事件记录
*/
public class EventsSearchResponseDataEventLogSrc
{
	/** 
	 事件源id
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
	 事件id
	*/
	private String EventLogId;
	public final String getEventLogId()
	{
		return EventLogId;
	}
	public final void setEventLogId(String value)
	{
		EventLogId = value;
	}
	/** 
	  事件分类，详见附录A.62
	*/
	private String Ability;
	public final String getAbility()
	{
		return Ability;
	}
	public final void setAbility(String value)
	{
		Ability = value;
	}
	/** 
	 事件类型，详见附录D.1
	*/
	private String EventType;
	public final String getEventType()
	{
		return EventType;
	}
	public final void setEventType(String value)
	{
		EventType = value;
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
	 事件源编号
	*/
	private String ResIndexCode;
	public final String getResIndexCode()
	{
		return ResIndexCode;
	}
	public final void setResIndexCode(String value)
	{
		ResIndexCode = value;
	}
	/** 
	 事件源类型，详见附录A.63
	*/
	private String ResType;
	public final String getResType()
	{
		return ResType;
	}
	public final void setResType(String value)
	{
		ResType = value;
	}
	/** 
	 事件源名称
	*/
	private String ResName;
	public final String getResName()
	{
		return ResName;
	}
	public final void setResName(String value)
	{
		ResName = value;
	}
	/** 
	 所属区域编号
	*/
	private String RegionIndexCode;
	public final String getRegionIndexCode()
	{
		return RegionIndexCode;
	}
	public final void setRegionIndexCode(String value)
	{
		RegionIndexCode = value;
	}
	/** 
	 所属区域名称
	*/
	private String RegionName;
	public final String getRegionName()
	{
		return RegionName;
	}
	public final void setRegionName(String value)
	{
		RegionName = value;
	}
	/** 
	 所属位置，详见附录A.81 安装位置
	*/
	private String LocationIndexCode;
	public final String getLocationIndexCode()
	{
		return LocationIndexCode;
	}
	public final void setLocationIndexCode(String value)
	{
		LocationIndexCode = value;
	}
	/** 
	 所属位置名称
	*/
	private String LocationName;
	public final String getLocationName()
	{
		return LocationName;
	}
	public final void setLocationName(String value)
	{
		LocationName = value;
	}
	/** 
	 扩展字段1，暂不使用
	*/
	private String Extend1;
	public final String getExtend1()
	{
		return Extend1;
	}
	public final void setExtend1(String value)
	{
		Extend1 = value;
	}
	/** 
	 扩展字段2，暂不使用
	*/
	private String Extend2;
	public final String getExtend2()
	{
		return Extend2;
	}
	public final void setExtend2(String value)
	{
		Extend2 = value;
	}
	/** 
	  开始时间,ISO8601时间
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
	 事件扩展信息
	*/
	private String Data;
	public final String getData()
	{
		return Data;
	}
	public final void setData(String value)
	{
		Data = value;
	}
}