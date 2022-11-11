package xc.hikvisionsdk.ia.enums;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;

/** 
 是/否
*/
public enum YesOrNo
{
	/** 
	 否
	*/
	No,
	/** 
	 是
	*/
	Yes;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static YesOrNo forValue(int value)
	{
		return values()[value];
	}
}