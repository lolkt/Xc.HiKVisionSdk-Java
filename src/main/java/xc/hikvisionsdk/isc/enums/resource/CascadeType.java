package xc.hikvisionsdk.isc.enums.resource;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 级联性
*/
public enum CascadeType
{
	/** 
	 非级联
	*/
	None,
	/** 
	 级联
	*/
	Cascade,
	/** 
	 不限（包括级联和非级联）
	*/
	All;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static CascadeType forValue(int value)
	{
		return values()[value];
	}
}