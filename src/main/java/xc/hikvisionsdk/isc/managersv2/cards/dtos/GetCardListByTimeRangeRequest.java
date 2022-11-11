package xc.hikvisionsdk.isc.managersv2.cards.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.utils.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.cards.*;
import java.time.*;

/** 
 增量获取卡片数据请求
*/
public class GetCardListByTimeRangeRequest extends PagedRequest
{

	/** 
	 针对更新时间的查询开始日期，IOS8601格式，参考附录B ISO8601时间格式说明
	*/
	private String StartTime;
	public final String getStartTime()
	{
		return StartTime;
	}
	/** 
	 针对更新时间的查询截止日期，IOS8601格式，参考附录B ISO8601时间格式说明
	*/
	private String EndTime;
	public final String getEndTime()
	{
		return EndTime;
	}

	/** 
	 增量获取卡片数据请求
	 
	 @param pageNo
	 @param pageSize
	 @param startTime 针对更新时间的查询开始日期
	 @param endTime 针对更新时间的查询截止日期
	*/

	public GetCardListByTimeRangeRequest(int pageNo, int pageSize, java.time.LocalDateTime startTime)
	{
		this(pageNo, pageSize, startTime, null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public GetCardListByTimeRangeRequest(int pageNo, int pageSize, DateTime startTime, System.Nullable<DateTime> endTime = null)
	public GetCardListByTimeRangeRequest(int pageNo, int pageSize, LocalDateTime startTime, LocalDateTime endTime)
	{
		super(pageNo, pageSize);
		StartTime = DateTimeFormat.ToIOS8601(startTime);
		if (endTime != null)
		{
			if (endTime.getValue().compareTo(startTime) < 0)
			{
				throw new IndexOutOfBoundsException("endTime", "查询截止日期必须大于查询开始日期");
			}
			if ((endTime.getValue() - startTime).TotalSeconds > 60 * 60 * 48)
			{
				throw new IndexOutOfBoundsException("endTime", "查询截止日期与查询开始日期的时间差必须在48小时内");
			}

			EndTime = DateTimeFormat.ToIOS8601(endTime.getValue());
		}
	}

}