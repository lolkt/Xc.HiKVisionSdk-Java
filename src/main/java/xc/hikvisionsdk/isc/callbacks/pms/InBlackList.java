package xc.hikvisionsdk.isc.callbacks.pms;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 是否在车辆黑名单
*/
public enum InBlackList
{
	/** 
	 不在黑名单
	*/
	NotIn(0),
	/** 
	 在黑名单
	*/
	In(1);

	public static final int SIZE = java.lang.Integer.SIZE;

	private int intValue;
	private static java.util.HashMap<Integer, InBlackList> mappings;
	private static java.util.HashMap<Integer, InBlackList> getMappings()
	{
		if (mappings == null)
		{
			synchronized (InBlackList.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, InBlackList>();
				}
			}
		}
		return mappings;
	}

	private InBlackList(int value)
	{
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static InBlackList forValue(int value)
	{
		return getMappings().get(value);
	}
}