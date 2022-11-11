package xc.hikvisionsdk.isc.enums.pms;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 车牌类型
*/
public enum PlateType
{
	/** 
	 标准民用
	*/
	Civil(0),
	/** 
	 02民用
	*/
	Civil02(1),
	/** 
	 武警
	*/
	Wj(2),
	/** 
	 警车
	*/
	Police(3),
	/** 
	 民用车双行尾牌
	*/
	DoubleRow(4),
	/** 
	 使馆车牌
	*/
	Embassy(5),
	/** 
	 农用车辆
	*/
	Agricultural(6),
	/** 
	 摩托车
	*/
	Motorcycle(7),
	/** 
	 新能源
	*/
	NewEnergy(8),
	/** 
	 军车
	*/
	Military(9);

	public static final int SIZE = java.lang.Integer.SIZE;

	private int intValue;
	private static java.util.HashMap<Integer, PlateType> mappings;
	private static java.util.HashMap<Integer, PlateType> getMappings()
	{
		if (mappings == null)
		{
			synchronized (PlateType.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, PlateType>();
				}
			}
		}
		return mappings;
	}

	private PlateType(int value)
	{
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static PlateType forValue(int value)
	{
		return getMappings().get(value);
	}
}