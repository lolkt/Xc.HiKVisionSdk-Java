package xc.hikvisionsdk.enums;

import xc.hikvisionsdk.*;

/** 
 订阅类型
*/
public enum SubscribeType
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

	public static SubscribeType forValue(int value)
	{
		return values()[value];
	}
}