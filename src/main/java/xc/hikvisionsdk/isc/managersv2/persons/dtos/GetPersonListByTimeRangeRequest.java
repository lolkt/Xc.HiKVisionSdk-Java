package xc.hikvisionsdk.isc.managersv2.persons.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.utils.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.persons.*;
import java.time.*;

/** 
 增量获取人员数据请求
*/
public class GetPersonListByTimeRangeRequest extends PagedRequest
{

	/** 
	 针对更新时间的查询开始日期，IOS8601格式
	*/
	private String StartTime;
	public final String getStartTime()
	{
		return StartTime;
	}
	/** 
	 针对更新时间的查询截止日期，IOS8601格式
	*/
	private String EndTime;
	public final String getEndTime()
	{
		return EndTime;
	}


	/** 
	 增量获取组织数据
	 
	 @param pageNo 当前页码
	 @param pageSize 每页记录总数
	 @param start 针对更新时间的查询开始日期
	 @param end 针对更新时间的查询截止日期
	 @exception ArgumentOutOfRangeException
	*/

	public GetPersonListByTimeRangeRequest(int pageNo, int pageSize, java.time.LocalDateTime start)
	{
		this(pageNo, pageSize, start, null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public GetPersonListByTimeRangeRequest(int pageNo, int pageSize, DateTime start, System.Nullable<DateTime> end = null)
	public GetPersonListByTimeRangeRequest(int pageNo, int pageSize, LocalDateTime start, LocalDateTime end)
	{
		super(pageNo, pageSize);
		StartTime = DateTimeFormat.ToIOS8601(start);
		if (end == null)
		{
			EndTime = DateTimeFormat.ToIOS8601(start.plusHours(48));
		}
		else
		{
			if (end.getValue().compareTo(start) < 0)
			{
				throw new IndexOutOfBoundsException("end", "查询截止时间必须大于开始时间");
			}
			if ((end.getValue() - start).TotalSeconds > 60 * 60 * 48)
			{
				throw new IndexOutOfBoundsException("end", "开始日期与结束日期的时间差必须在1-48小时内");

			}
			EndTime = DateTimeFormat.ToIOS8601(end.getValue());
		}
	}

}