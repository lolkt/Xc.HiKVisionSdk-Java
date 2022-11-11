package xc.hikvisionsdk.ia.enums;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;

/** 
 日期类型
*/
public enum DateType
{
	/** 
	 工作日
	*/
	Workday,
	/** 
	 休息日
	*/
	Playday,
	/** 
	 节假日
	*/
	Holiday;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static DateType forValue(int value)
	{
		return values()[value];
	}
}