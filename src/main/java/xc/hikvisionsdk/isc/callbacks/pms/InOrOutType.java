package xc.hikvisionsdk.isc.callbacks.pms;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 进出状态
*/
public enum InOrOutType
{
	/** 
	 进场
	*/
	In(0),
	/** 
	 出场
	*/
	Out(1);

	public static final int SIZE = java.lang.Integer.SIZE;

	private int intValue;
	private static java.util.HashMap<Integer, InOrOutType> mappings;
	private static java.util.HashMap<Integer, InOrOutType> getMappings()
	{
		if (mappings == null)
		{
			synchronized (InOrOutType.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, InOrOutType>();
				}
			}
		}
		return mappings;
	}

	private InOrOutType(int value)
	{
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static InOrOutType forValue(int value)
	{
		return getMappings().get(value);
	}
}