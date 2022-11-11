package xc.hikvisionsdk.isc.enums.acs;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 进出状态
*/
public enum InAndOutType
{
	/** 
	 未知
	*/
	Unknown(-1),
	/** 
	 出
	*/
	Out(0),
	/** 
	 进
	*/
	In(1);

	public static final int SIZE = java.lang.Integer.SIZE;

	private int intValue;
	private static java.util.HashMap<Integer, InAndOutType> mappings;
	private static java.util.HashMap<Integer, InAndOutType> getMappings()
	{
		if (mappings == null)
		{
			synchronized (InAndOutType.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, InAndOutType>();
				}
			}
		}
		return mappings;
	}

	private InAndOutType(int value)
	{
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static InAndOutType forValue(int value)
	{
		return getMappings().get(value);
	}
}