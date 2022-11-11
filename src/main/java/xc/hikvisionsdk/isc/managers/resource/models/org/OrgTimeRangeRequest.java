package xc.hikvisionsdk.isc.managers.resource.models.org;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.utils.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;
import java.time.*;

/** 
 增量获取组织数据
*/
public class OrgTimeRangeRequest extends PagedRequest
{
	/** 
	 针对更新时间的查询开始日期，IOS8601格式
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
	 针对更新时间的查询截止日期，IOS8601格式
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
	 增量获取组织数据
	 
	 @param pageNo 当前页码
	 @param pageSize 每页记录总数
	 @param start 针对更新时间的查询开始日期
	 @param end 针对更新时间的查询截止日期
	*/


	public OrgTimeRangeRequest(int pageNo, int pageSize, java.time.LocalDateTime start)
	{
		this(pageNo, pageSize, start, null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public OrgTimeRangeRequest(int pageNo, int pageSize, DateTime start, System.Nullable<DateTime> end = null)
	public OrgTimeRangeRequest(int pageNo, int pageSize, LocalDateTime start, LocalDateTime end)
	{
		super(pageNo, pageSize);
		setStartTime(DateTimeFormat.ToIOS8601(start));
		if (end == null)
		{
			setEndTime(DateTimeFormat.ToIOS8601(start.plusHours(48)));
		}
		else
		{
			if (end.getValue().compareTo(start) < 0)
			{
				throw new IndexOutOfBoundsException("end", "查询截止时间必须大于开始时间");
			}
			setEndTime(DateTimeFormat.ToIOS8601(end.getValue()));
		}
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	*/
	@Override
	public void CheckParams()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getStartTime()))
		{
			throw new NullPointerException("StartTime");
		}

		super.CheckParams();
	}
}