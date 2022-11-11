package xc.hikvisionsdk.ia.managers.eaas.attendance;

import xc.hikvisionsdk.ia.models.reponse.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.managers.*;
import xc.hikvisionsdk.ia.managers.eaas.*;

/** 
 批量查询员工考勤数据结果数据
*/
public class AttendanceBatchSearchResponseData
{
	/** 
	 考勤数据id
	*/
	private String AttendanceId;
	public final String getAttendanceId()
	{
		return AttendanceId;
	}
	public final void setAttendanceId(String value)
	{
		AttendanceId = value;
	}
	/** 
	 人员姓名
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
	 考勤组名称
	*/
	private String TimeGroupName;
	public final String getTimeGroupName()
	{
		return TimeGroupName;
	}
	public final void setTimeGroupName(String value)
	{
		TimeGroupName = value;
	}
	/** 
	 组织路径名称
	*/
	private String OrgPathName;
	public final String getOrgPathName()
	{
		return OrgPathName;
	}
	public final void setOrgPathName(String value)
	{
		OrgPathName = value;
	}
	/** 
	 工号
	*/
	private String JobNo;
	public final String getJobNo()
	{
		return JobNo;
	}
	public final void setJobNo(String value)
	{
		JobNo = value;
	}
	/** 
	 班次日期集合数据
	*/
	private DayValueItem[] DayValue;
	public final DayValueItem[] getDayValue()
	{
		return DayValue;
	}
	public final void setDayValue(DayValueItem[] value)
	{
		DayValue = value;
	}

}