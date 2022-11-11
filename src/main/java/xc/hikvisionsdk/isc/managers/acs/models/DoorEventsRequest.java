package xc.hikvisionsdk.isc.managers.acs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.acs.*;
import java.time.*;

/** 
 查询门禁事件
*/
public class DoorEventsRequest extends IOSTimeRangeWithPagedRequest
{
	/** 
	 事件类型，参考附录D2.1 门禁事件
	*/
	private int EventType;
	public final int getEventType()
	{
		return EventType;
	}
	public final void setEventType(int value)
	{
		EventType = value;
	}
	/** 
	 人员姓名(支持中英文字符，不能包含 ' / \ : * ? " ）
	*/
	private String PersonName;
	public final String getPersonName()
	{
		return PersonName;
	}
	public final void setPersonName(String value)
	{
		PersonName = value;
	}
	/** 
	 人员数组，获取人员列表v2接口可以获取到
	*/
	private String[] PersonIds;
	public final String[] getPersonIds()
	{
		return PersonIds;
	}
	public final void setPersonIds(String[] value)
	{
		PersonIds = value;
	}
	/** 
	 门禁点名称，查询门禁点列表接口可以获取
	*/
	private String DoorName;
	public final String getDoorName()
	{
		return DoorName;
	}
	public final void setDoorName(String value)
	{
		DoorName = value;
	}
	/** 
	 门禁点唯一标识，查询门禁点列表接口可以获取，最大支持10个门禁点
	*/
	private String[] DoorIndexCodes;
	public final String[] getDoorIndexCodes()
	{
		return DoorIndexCodes;
	}
	public final void setDoorIndexCodes(String[] value)
	{
		DoorIndexCodes = value;
	}
	/** 
	 门禁点所在区域，分页获取区域列表接口可以获取
	*/
	private String DoorRegionIndexCode;
	public final String getDoorRegionIndexCode()
	{
		return DoorRegionIndexCode;
	}
	public final void setDoorRegionIndexCode(String value)
	{
		DoorRegionIndexCode = value;
	}
	/** 
	 支持personName、doorName、eventTime填写排序的字段名称，例如："personName”
	*/
	private String Sort;
	public final String getSort()
	{
		return Sort;
	}
	public final void setSort(String value)
	{
		Sort = value;
	}

	/** 
	 指定排序字段是使用升序（asc）还是降序（desc），例如："asc”
	*/
	private String Order;
	public final String getOrder()
	{
		return Order;
	}
	public final void setOrder(String value)
	{
		Order = value;
	}

	/** 
	 查询门禁事件
	*/
	public DoorEventsRequest()
	{
		super(false);
	}

	/** 
	 查询门禁事件
	 
	 @param pageNo 当前页码
	 @param pageSize 每页记录总数
	 @param startTime 开始时间
	 @param endTime 结束时间
	*/
	public DoorEventsRequest(int pageNo, int pageSize, LocalDateTime startTime, LocalDateTime endTime)
	{
		super(pageNo, pageSize, startTime, endTime, false);
	}

}