package xc.hikvisionsdk.isc.managersv2.events.dtos;

import xc.hikvisionsdk.enums.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.events.*;
import java.time.*;

/** 
 获取联动事件列表
*/
public class GetEventsListRequest extends IOSTimeRangeWithPagedRequest
{


	/** 
	  事件规则id
	*/
	private String EventRuleId;
	public final String getEventRuleId()
	{
		return EventRuleId;
	}
	private void setEventRuleId(String value)
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
	private void setAbility(String value)
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
	private void setRegionIndexCode(String value)
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
	private void setLocationIndexCodes(String[] value)
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
	private void setResName(String value)
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
	private void setResIndexCodes(String[] value)
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
	private void setResTypes(String[] value)
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
	private void setEventType(String value)
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
	private void setEventLevels(String[] value)
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
	private void setRemark(String value)
	{
		Remark = value;
	}
	/** 
	  处理状态，0-未处理，1-已处理
	*/
	private HandleStatus HandleStatus = null;
	public final HandleStatus getHandleStatus()
	{
		return HandleStatus;
	}
	private void setHandleStatus(HandleStatus value)
	{
		HandleStatus = value;
	}




	/** 
	 获取联动事件列表请求
	 
	 @param pageNo 当前页码
	 @param pageSize 每页记录总数
	 @param startTime 开始时间
	 @param endTime 结束时间
	 @param eventRuleId 事件规则id
	 @param ability 事件分类
	 @param regionIndexCode 区域编号
	 @param resName 事件源名称
	 @param eventType 事件类型
	 @param remark 处理意见
	 @param handleStatus 处理状态
	*/


	public GetEventsListRequest(int pageNo, int pageSize, java.time.LocalDateTime startTime, java.time.LocalDateTime endTime, String eventRuleId, String ability, String regionIndexCode, String resName, String eventType, String remark)
	{
		this(pageNo, pageSize, startTime, endTime, eventRuleId, ability, regionIndexCode, resName, eventType, remark, null);
	}

	public GetEventsListRequest(int pageNo, int pageSize, java.time.LocalDateTime startTime, java.time.LocalDateTime endTime, String eventRuleId, String ability, String regionIndexCode, String resName, String eventType)
	{
		this(pageNo, pageSize, startTime, endTime, eventRuleId, ability, regionIndexCode, resName, eventType, "", null);
	}

	public GetEventsListRequest(int pageNo, int pageSize, java.time.LocalDateTime startTime, java.time.LocalDateTime endTime, String eventRuleId, String ability, String regionIndexCode, String resName)
	{
		this(pageNo, pageSize, startTime, endTime, eventRuleId, ability, regionIndexCode, resName, "", "", null);
	}

	public GetEventsListRequest(int pageNo, int pageSize, java.time.LocalDateTime startTime, java.time.LocalDateTime endTime, String eventRuleId, String ability, String regionIndexCode)
	{
		this(pageNo, pageSize, startTime, endTime, eventRuleId, ability, regionIndexCode, "", "", "", null);
	}

	public GetEventsListRequest(int pageNo, int pageSize, java.time.LocalDateTime startTime, java.time.LocalDateTime endTime, String eventRuleId, String ability)
	{
		this(pageNo, pageSize, startTime, endTime, eventRuleId, ability, "", "", "", "", null);
	}

	public GetEventsListRequest(int pageNo, int pageSize, java.time.LocalDateTime startTime, java.time.LocalDateTime endTime, String eventRuleId)
	{
		this(pageNo, pageSize, startTime, endTime, eventRuleId, "", "", "", "", "", null);
	}

	public GetEventsListRequest(int pageNo, int pageSize, java.time.LocalDateTime startTime, java.time.LocalDateTime endTime)
	{
		this(pageNo, pageSize, startTime, endTime, "", "", "", "", "", "", null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public GetEventsListRequest(int pageNo, int pageSize, DateTime startTime, DateTime endTime, string eventRuleId = "", string ability = "", string regionIndexCode = "", string resName = "", string eventType = "", string remark = "", System.Nullable<HandleStatus> handleStatus = null)
	public GetEventsListRequest(int pageNo, int pageSize, LocalDateTime startTime, LocalDateTime endTime, String eventRuleId, String ability, String regionIndexCode, String resName, String eventType, String remark, HandleStatus handleStatus)
	{
		super(pageNo, pageSize, startTime, endTime);
		setEventRuleId(eventRuleId);
		setAbility(ability);
		setRegionIndexCode(regionIndexCode);
		setResName(resName);
		setRemark(remark);
		setHandleStatus(handleStatus);
		setEventType(eventType);
	}

	/** 
	 使用事件等级
	 
	 @param eventLevels 	事件等级，1-低，2-中，3-高
	 @return 
	 @exception ArgumentNullException
	*/
	public final GetEventsListRequest UseEventLevels(EventLevel... eventLevels)
	{

		if (eventLevels == null || eventLevels.length == 0)
		{
			throw new NullPointerException("eventLevels");
		}


		setEventLevels(eventLevels.Select(u -> String.valueOf(((int)u))).ToArray());
		return this;
	}

	/** 
	 使用事件源类型
	 
	 @param resTypes 事件源类型
	 @return 
	 @exception ArgumentNullException
	*/
	public final GetEventsListRequest UseResTypes(String... resTypes)
	{

		if (resTypes == null || resTypes.length == 0)
		{
			throw new NullPointerException("resTypes");
		}

		setResTypes(resTypes);
		return this;
	}
	/** 
	 使用事件源编号
	 
	 @param resIndexCodes 事件源编号
	 @return 
	 @exception ArgumentNullException
	*/
	public final GetEventsListRequest UseResIndexCodes(String... resIndexCodes)
	{

		if (resIndexCodes == null || resIndexCodes.length == 0)
		{
			throw new NullPointerException("resIndexCodes");
		}

		setResIndexCodes(resIndexCodes);
		return this;
	}
	/** 
	 使用所属位置
	 
	 @param locationIndexCodes 所属位置
	 @return 
	 @exception ArgumentNullException
	*/
	public final GetEventsListRequest UseLocationIndexCodes(String... locationIndexCodes)
	{

		if (locationIndexCodes == null || locationIndexCodes.length == 0)
		{
			throw new NullPointerException("locationIndexCodes");
		}

		setLocationIndexCodes(locationIndexCodes);
		return this;
	}
}