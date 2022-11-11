package xc.hikvisionsdk.isc.enums.irds;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 使用状态标记
*/
public enum UseStatus
{
	/** 
	 无效
	*/
	None(0),
	/** 
	 正常
	*/
	Normal(1),
	/** 
	 丢失
	*/
	Loss(2);

	public static final int SIZE = java.lang.Integer.SIZE;

	private int intValue;
	private static java.util.HashMap<Integer, UseStatus> mappings;
	private static java.util.HashMap<Integer, UseStatus> getMappings()
	{
		if (mappings == null)
		{
			synchronized (UseStatus.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, UseStatus>();
				}
			}
		}
		return mappings;
	}

	private UseStatus(int value)
	{
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static UseStatus forValue(int value)
	{
		return getMappings().get(value);
	}
}