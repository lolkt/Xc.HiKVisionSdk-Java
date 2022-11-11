package xc.hikvisionsdk.ia.models.reponse;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.models.*;

/** 
 班次日期数据
*/
public class DayValueItem
{
	/** 
	 日期
	*/
	private String Date;
	public final String getDate()
	{
		return Date;
	}
	public final void setDate(String value)
	{
		Date = value;
	}
	/** 
	 班次名称
	*/
	private String ShiftName;
	public final String getShiftName()
	{
		return ShiftName;
	}
	public final void setShiftName(String value)
	{
		ShiftName = value;
	}
	/** 
	 班次id
	*/
	private String ShiftId;
	public final String getShiftId()
	{
		return ShiftId;
	}
	public final void setShiftId(String value)
	{
		ShiftId = value;
	}
	/** 
	 打卡id
	*/
	private String UUID;
	public final String getUUID()
	{
		return UUID;
	}
	public final void setUUID(String value)
	{
		UUID = value;
	}
	/** 
	 考勤状态
	*/
	private String Status;
	public final String getStatus()
	{
		return Status;
	}
	public final void setStatus(String value)
	{
		Status = value;
	}
	/** 
	 是否补签
	*/
	private boolean IsSignStatus;
	public final boolean isSignStatus()
	{
		return IsSignStatus;
	}
	public final void setSignStatus(boolean value)
	{
		IsSignStatus = value;
	}
	/** 
	 是否请假
	*/
	private boolean IsLeaveStatus;
	public final boolean isLeaveStatus()
	{
		return IsLeaveStatus;
	}
	public final void setLeaveStatus(boolean value)
	{
		IsLeaveStatus = value;
	}
}