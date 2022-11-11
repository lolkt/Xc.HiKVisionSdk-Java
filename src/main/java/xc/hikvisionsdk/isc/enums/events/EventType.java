package xc.hikvisionsdk.isc.enums.events;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 通知类型
*/
public enum EventType
{
	/** 
	 通知
	*/
	Notify,
	/** 
	 新增
	*/
	Add,
	/** 
	 删除
	*/
	Delete;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static EventType forValue(int value)
	{
		return values()[value];
	}
}