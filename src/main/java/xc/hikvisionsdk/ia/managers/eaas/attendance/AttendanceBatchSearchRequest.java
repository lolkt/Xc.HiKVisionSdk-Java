package xc.hikvisionsdk.ia.managers.eaas.attendance;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.managers.*;
import xc.hikvisionsdk.ia.managers.eaas.*;
import java.time.*;

/** 
 批量查询员工考勤数据请求
*/
public class AttendanceBatchSearchRequest extends PagedRequest
{
	/** 
	 人员工号
	*/
	private String JobNo;
	public final String getJobNo()
	{
		return JobNo;
	}
	private void setJobNo(String value)
	{
		JobNo = value;
	}
	/** 
	 人员姓名 支持中英文字符
	*/
	private String PersonName;
	public final String getPersonName()
	{
		return PersonName;
	}
	private void setPersonName(String value)
	{
		PersonName = value;
	}
	/** 
	 开始时间，如2021-10-01 00:00:00
	*/
	private String StartTime;
	public final String getStartTime()
	{
		return StartTime;
	}
	private void setStartTime(String value)
	{
		StartTime = value;
	}
	/** 
	 结束时间，如2021-10-31 23:59:59
	*/
	private String EndTime;
	public final String getEndTime()
	{
		return EndTime;
	}
	private void setEndTime(String value)
	{
		EndTime = value;
	}

	/** 
	 
	 
	 @param index
	 @param size
	*/
	public AttendanceBatchSearchRequest(int index, int size)
	{
		super(index, size);
	}

	/** 
	 设置工号
	 
	 @param jobNo
	 @return 
	*/
	public final AttendanceBatchSearchRequest SetJobNo(String jobNo)
	{
		setJobNo(jobNo);
		return this;
	}
	/** 
	 设置姓名
	 
	 @param personName
	 @return 
	*/
	public final AttendanceBatchSearchRequest SetPersonName(String personName)
	{
		setPersonName(personName);
		return this;
	}

	/** 
	 设置开始时间
	 
	 @param startTime
	 @return 
	*/
	public final AttendanceBatchSearchRequest SetStartTime(LocalDateTime startTime)
	{
		setStartTime(startTime.toString("yyyy-MM-dd HH:mm:ss"));
		return this;
	}

	/** 
	 设置结束时间
	 
	 @param endTime
	 @return 
	*/
	public final AttendanceBatchSearchRequest SetEndTime(LocalDateTime endTime)
	{
		setEndTime(endTime.toString("yyyy-MM-dd HH:mm:ss"));
		return this;
	}


}