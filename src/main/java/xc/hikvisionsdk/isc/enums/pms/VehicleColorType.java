package xc.hikvisionsdk.isc.enums.pms;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 车辆颜色
*/
public enum VehicleColorType
{
	/** 
	 其他颜色
	*/
	Other(0),
	/** 
	 白色
	*/
	White(1),
	/** 
	 银色
	*/
	Silver(2),
	/** 
	 灰色
	*/
	Gray(3),
	/** 
	 黑色
	*/
	Black(4),
	/** 
	 红色
	*/
	Red(5),
	/** 
	 深蓝色
	*/
	DarkBlue(6),
	/** 
	 蓝色
	*/
	Blue(7),
	/** 
	 黄色
	*/
	Yellow(8),
	/** 
	 绿色
	*/
	Green(9),
	/** 
	 棕色
	*/
	Brown(10),
	/** 
	 粉色
	*/
	Pink(11),
	/** 
	 紫色
	*/
	Purple(12),
	/** 
	 深灰
	*/
	DarkGray(13),
	/** 
	 杏色
	*/
	Apricot(14),
	/** 
	 未识别的车辆颜色
	*/
	UnKnown(255);

	public static final int SIZE = java.lang.Integer.SIZE;

	private int intValue;
	private static java.util.HashMap<Integer, VehicleColorType> mappings;
	private static java.util.HashMap<Integer, VehicleColorType> getMappings()
	{
		if (mappings == null)
		{
			synchronized (VehicleColorType.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, VehicleColorType>();
				}
			}
		}
		return mappings;
	}

	private VehicleColorType(int value)
	{
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static VehicleColorType forValue(int value)
	{
		return getMappings().get(value);
	}
}