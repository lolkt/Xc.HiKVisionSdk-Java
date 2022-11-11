package xc.hikvisionsdk.isc.managers.resource.models.camera;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.utils.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;
import java.time.*;

/** 
 增量获取监控点数据
*/
public class CameraTimeRangeRequest extends PagedRequest
{

	/** 
	 针对更新时间的查询开始日期，IOS8601格式，参考附录B ISO8601时间格式说明
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
	 针对更新时间的查询截止日期，IOS8601格式，参考附录B ISO8601时间格式说明
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
	 增量获取监控点数据
	 
	 @param pageNo
	 @param pageSize
	 @param startTime
	 @param endTime
	*/

	public CameraTimeRangeRequest(int pageNo, int pageSize, java.time.LocalDateTime startTime)
	{
		this(pageNo, pageSize, startTime, null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public CameraTimeRangeRequest(int pageNo, int pageSize, DateTime startTime, System.Nullable<DateTime> endTime = null)
	public CameraTimeRangeRequest(int pageNo, int pageSize, LocalDateTime startTime, LocalDateTime endTime)
	{
		super(pageNo, pageSize);
		setStartTime(DateTimeFormat.ToIOS8601(startTime));
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

			setEndTime(DateTimeFormat.ToIOS8601(endTime.getValue()));
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