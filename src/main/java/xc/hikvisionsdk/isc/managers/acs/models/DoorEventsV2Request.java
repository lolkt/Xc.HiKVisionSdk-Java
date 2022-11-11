package xc.hikvisionsdk.isc.managers.acs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.acs.*;
import java.time.*;

/** 
 查询门禁事件V2请求
*/
public class DoorEventsV2Request extends IOSTimeRangeWithPagedRequest
{
	/** 
	 门禁点唯一标识数组，最大支持10个门禁点，查询门禁点列表v2接口获取返回报文中的doorIndexCode字段
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
	 门禁点名称，支持模糊查询，从查询门禁点列表v2接口获取返回报文中的name字段
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
	 读卡器唯一标识数组，最大支持50个读卡器，查询门禁读卡器列表接口获取返回报文中的indexCode字段
	*/
	private String[] ReaderDevIndexCodes;
	public final String[] getReaderDevIndexCodes()
	{
		return ReaderDevIndexCodes;
	}
	public final void setReaderDevIndexCodes(String[] value)
	{
		ReaderDevIndexCodes = value;
	}

	/** 
	 入库开始时间，采用ISO8601时间格式，与receiveEndTime配对使用，不能单独使用，时间范围最大不能超过3个月，参考附录B ISO8601时间格式说明
	*/
	private String ReceiveStartTime;
	public final String getReceiveStartTime()
	{
		return ReceiveStartTime;
	}
	public final void setReceiveStartTime(String value)
	{
		ReceiveStartTime = value;
	}

	/** 
	 入库结束时间，采用ISO8601时间格式，最大长度32个字符，与receiveStartTime配对使用，不能单独使用，时间范围最大不能超过3个月，参考附录B ISO8601时间格式说明
	*/
	private String ReceiveEndTime;
	public final String getReceiveEndTime()
	{
		return ReceiveEndTime;
	}
	public final void setReceiveEndTime(String value)
	{
		ReceiveEndTime = value;
	}

	/** 
	 门禁点所在区域，查询区域列表v2接口获取返回参数indexCode
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
	 事件类型，参考附录D2.1 门禁事件
	*/
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
	 人员姓名(支持中英文字符，不能包含 ' / \ : * ? " 
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
	 排序字段（支持personName、doorName、eventTime填写排序的字段名称）
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
	 升/降序（指定排序字段是使用升序（asc）还是降序（desc）
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
	public DoorEventsV2Request()
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
	public DoorEventsV2Request(int pageNo, int pageSize, LocalDateTime startTime, LocalDateTime endTime)
	{
		super(pageNo, pageSize, startTime, endTime, false);
	}
}