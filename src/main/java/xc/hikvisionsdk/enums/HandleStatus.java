package xc.hikvisionsdk.enums;

import xc.hikvisionsdk.*;

/** 
 事件处理状态
*/
public enum HandleStatus
{
	/** 
	 未处理
	*/
	UnProcessed,
	/** 
	 已处理
	*/
	Processed;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static HandleStatus forValue(int value)
	{
		return values()[value];
	}
}