package xc.hikvisionsdk.enums;

import xc.hikvisionsdk.*;

/** 
 性别
*/
public enum Gender
{
	/** 
	 无
	*/
	None,
	/** 
	 男
	*/
	Man,
	/** 
	 女
	*/
	Female;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static Gender forValue(int value)
	{
		return values()[value];
	}
}