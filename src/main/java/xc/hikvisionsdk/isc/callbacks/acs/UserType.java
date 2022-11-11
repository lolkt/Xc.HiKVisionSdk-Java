package xc.hikvisionsdk.isc.callbacks.acs;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 人员类型
*/
public enum UserType
{
	/** 
	 未知
	*/
	None,
	/** 
	 普通
	*/
	General,
	/** 
	 来宾
	*/
	Guest,
	/** 
	 黑名单
	*/
	Black,
	/** 
	 管理员
	*/
	Admin;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static UserType forValue(int value)
	{
		return values()[value];
	}
}