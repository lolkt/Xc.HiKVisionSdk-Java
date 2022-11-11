package xc.hikvisionsdk.isc.enums.pms;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 车牌颜色
*/
public enum PlateColorType
{
	/** 
	 蓝色
	*/
	Blue(0),
	/** 
	 黄色
	*/
	Yellow(1),
	/** 
	 白色
	*/
	White(2),
	/** 
	 黑色
	*/
	Black(3),
	/** 
	 绿色
	*/
	Green(4),
	/** 
	 民航黑
	*/
	CivilAviationBlack(5),
	/** 
	 其他
	*/
	Other(255);

	public static final int SIZE = java.lang.Integer.SIZE;

	private int intValue;
	private static java.util.HashMap<Integer, PlateColorType> mappings;
	private static java.util.HashMap<Integer, PlateColorType> getMappings()
	{
		if (mappings == null)
		{
			synchronized (PlateColorType.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, PlateColorType>();
				}
			}
		}
		return mappings;
	}

	private PlateColorType(int value)
	{
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static PlateColorType forValue(int value)
	{
		return getMappings().get(value);
	}
}