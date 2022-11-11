package xc.hikvisionsdk.isc.callbacks.acs;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 有效截止日期
*/
public enum TermOfValidity
{
	/** 
	 0-否（有效截止日期有效）
	*/
	No,
	/** 
	 1-是（有效截止日期无效）
	*/
	Yes;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static TermOfValidity forValue(int value)
	{
		return values()[value];
	}
}