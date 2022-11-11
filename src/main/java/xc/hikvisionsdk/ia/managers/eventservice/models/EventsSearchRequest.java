package xc.hikvisionsdk.ia.managers.eventservice.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.managers.*;
import xc.hikvisionsdk.ia.managers.eventservice.*;
import java.time.*;

/** 
 获取联动事件列表请求
*/
public class EventsSearchRequest extends IOSTimeRangeWithPagedRequest
{
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
	 区域编号
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
	 所属位置，详见附录A.81 安装位置
	*/
	private String[] LocationIndexCodes;
	public final String[] getLocationIndexCodes()
	{
		return LocationIndexCodes;
	}
	public final void setLocationIndexCodes(String[] value)
	{
		LocationIndexCodes = value;
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
	 事件源编号
	*/
	private String[] ResIndexCodes;
	public final String[] getResIndexCodes()
	{
		return ResIndexCodes;
	}
	public final void setResIndexCodes(String[] value)
	{
		ResIndexCodes = value;
	}
	/** 
	  事件源类型，详见附录A.63
	*/
	private String[] ResTypes;
	public final String[] getResTypes()
	{
		return ResTypes;
	}
	public final void setResTypes(String[] value)
	{
		ResTypes = value;
	}
	/** 
	 事件类型，详见附录D
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
	 事件等级，1-低，2-中，3-高
	*/
	private String[] EventLevels;
	public final String[] getEventLevels()
	{
		return EventLevels;
	}
	public final void setEventLevels(String[] value)
	{
		EventLevels = value;
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
	  处理状态，0-未处理，1-已处理
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
	 获取联动事件列表请求
	*/
	public EventsSearchRequest()
	{
	}

	/** 
	 获取联动事件列表请求
	 
	 @param startTime 开始时间
	 @param endTime 结束时间
	 @param pageNo 当前页码
	 @param pageSize 每页记录总数
	*/
	public EventsSearchRequest(LocalDateTime startTime, LocalDateTime endTime, int pageNo, int pageSize)
	{
		super(pageNo, pageSize, startTime, endTime);

	}
}