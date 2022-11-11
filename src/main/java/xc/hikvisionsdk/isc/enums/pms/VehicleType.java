package xc.hikvisionsdk.isc.enums.pms;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 车型
*/
public enum VehicleType
{
	/** 
	 其他车
	*/
	Other(0),
	/** 
	 小型车
	*/
	compact(1),
	/** 
	 大型车
	*/
	FullSize(2),
	/** 
	 摩托车
	*/
	Motorbike(3);

	public static final int SIZE = java.lang.Integer.SIZE;

	private int intValue;
	private static java.util.HashMap<Integer, VehicleType> mappings;
	private static java.util.HashMap<Integer, VehicleType> getMappings()
	{
		if (mappings == null)
		{
			synchronized (VehicleType.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, VehicleType>();
				}
			}
		}
		return mappings;
	}

	private VehicleType(int value)
	{
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static VehicleType forValue(int value)
	{
		return getMappings().get(value);
	}
}