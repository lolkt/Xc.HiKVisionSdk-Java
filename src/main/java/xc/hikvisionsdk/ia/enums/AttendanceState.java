package xc.hikvisionsdk.ia.enums;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;

/** 
 出勤状态
*/
public enum AttendanceState
{
	/** 
	 正常
	*/
	Normal,
	/** 
	 迟到
	*/
	Late,
	/** 
	 早退
	*/
	LeaveEarly,
	/** 
	 旷工
	*/
	Absence,
	/** 
	 请假
	*/
	Leave,
	/** 
	 出差
	*/
	Out;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static AttendanceState forValue(int value)
	{
		return values()[value];
	}
}