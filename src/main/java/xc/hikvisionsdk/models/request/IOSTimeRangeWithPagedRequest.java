package xc.hikvisionsdk.models.request;

import xc.hikvisionsdk.utils.*;
import xc.hikvisionsdk.*;
import java.time.*;

/** 
 开始时间 - 结束时间
*/
public class IOSTimeRangeWithPagedRequest extends PagedRequest
{
	/** 
	 设置StartTime和EndTime为必填项
	*/
	protected boolean DateIsRequired = true;
	/** 
	 开始时间（事件开始时间，采用ISO8601时间格式，与endTime配对使用，不能单独使用，时间范围最大不能超过3个月），参考附录B ISO8601时间格式说明
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
	 结束时间（事件结束时间，采用ISO8601时间格式，最大长度32个字符，与startTime配对使用，不能单独使用，时间范围最大不能超过3个月），参考附录B ISO8601时间格式说明
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
	 开始时间 - 结束时间
	 
	 @param dateIsRequired 设置StartTime和EndTime为必填项
	*/

	public IOSTimeRangeWithPagedRequest()
	{
		this(null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public IOSTimeRangeWithPagedRequest(System.Nullable<bool> dateIsRequired = null)
	public IOSTimeRangeWithPagedRequest(Boolean dateIsRequired)
	{
		if (dateIsRequired != null)
		{
			DateIsRequired = dateIsRequired.booleanValue();
		}
	}



	/** 
	 开始时间 - 结束时间
	 
	 @param pageNo 当前页码
	 @param pageSize 每页记录总数
	 @param dateIsRequired 设置StartTime和EndTime为必填项
	*/

	public IOSTimeRangeWithPagedRequest(int pageNo, int pageSize)
	{
		this(pageNo, pageSize, null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public IOSTimeRangeWithPagedRequest(int pageNo, int pageSize, System.Nullable<bool> dateIsRequired = null)
	public IOSTimeRangeWithPagedRequest(int pageNo, int pageSize, Boolean dateIsRequired)
	{
		super(pageNo, pageSize);
		if (dateIsRequired != null)
		{
			DateIsRequired = dateIsRequired.booleanValue();
		}
	}

	/** 
	 开始时间 - 结束时间
	 
	 @param pageNo 当前页码
	 @param pageSize 每页记录总数
	 @param startTime 开始时间
	 @param endTime 结束时间
	*/

	public IOSTimeRangeWithPagedRequest(int pageNo, int pageSize, java.time.LocalDateTime startTime, java.time.LocalDateTime endTime)
	{
		this(pageNo, pageSize, startTime, endTime, null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public IOSTimeRangeWithPagedRequest(int pageNo, int pageSize, DateTime startTime, DateTime endTime, System.Nullable<bool> dateIsRequired = null)
	public IOSTimeRangeWithPagedRequest(int pageNo, int pageSize, LocalDateTime startTime, LocalDateTime endTime, Boolean dateIsRequired)
	{
		this(pageNo, pageSize, dateIsRequired);
		setStartTime(DateTimeFormat.ToIOS8601(startTime));
		setEndTime(DateTimeFormat.ToIOS8601(endTime));
	}


	@Override
	public void CheckParams()
	{
		if (!DateIsRequired)
		{
			return;
		}

		if (tangible.StringHelper.isNullOrWhiteSpace(getStartTime()))
		{
			throw new NullPointerException("StartTime");
		}
		if (tangible.StringHelper.isNullOrWhiteSpace(getEndTime()))
		{
			throw new NullPointerException("EndTime");
		}

		super.CheckParams();
	}


}