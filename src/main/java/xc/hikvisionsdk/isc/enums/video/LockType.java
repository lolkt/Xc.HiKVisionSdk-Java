package xc.hikvisionsdk.isc.enums.video;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 查询录像的锁定类型
*/
public enum LockType
{
	/** 
	 全部录像
	*/
	All,
	/** 
	 未锁定录像
	*/
	Unlocked,
	/** 
	 已锁定录像
	*/
	Locked;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static LockType forValue(int value)
	{
		return values()[value];
	}
}