package xc.hikvisionsdk.ia.managers.eventservice.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.managers.*;
import xc.hikvisionsdk.ia.managers.eventservice.*;

/** 
 订阅类型
*/
public enum SubType
{
	/** 
	 原始事件
	*/
	Raw,
	/** 
	 联动事件
	*/
	Linkage,
	/** 
	 原始事件和联动事件
	*/
	RawAndLinkage;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static SubType forValue(int value)
	{
		return values()[value];
	}
}