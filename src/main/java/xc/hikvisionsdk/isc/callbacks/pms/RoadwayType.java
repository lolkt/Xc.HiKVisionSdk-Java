package xc.hikvisionsdk.isc.callbacks.pms;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 车道类型
*/
public enum RoadwayType
{
	/** 
	 进场
	*/
	In(1),
	/** 
	 免费出场
	*/
	FreeOut(2),
	/** 
	 收费出场
	*/
	Out(3),
	/** 
	 中央缴费车道
	*/
	Central(4);

	public static final int SIZE = java.lang.Integer.SIZE;

	private int intValue;
	private static java.util.HashMap<Integer, RoadwayType> mappings;
	private static java.util.HashMap<Integer, RoadwayType> getMappings()
	{
		if (mappings == null)
		{
			synchronized (RoadwayType.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, RoadwayType>();
				}
			}
		}
		return mappings;
	}

	private RoadwayType(int value)
	{
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static RoadwayType forValue(int value)
	{
		return getMappings().get(value);
	}
}