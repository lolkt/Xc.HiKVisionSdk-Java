package xc.hikvisionsdk.enums;

import xc.hikvisionsdk.*;

/** 
 婚姻状态
*/
public enum Marriaged
{
	/** 
	 无
	*/
	None(0),
	/** 
	 未婚
	*/
	Unmarried(1),
	/** 
	 已婚
	*/
	Married(2),
	/** 
	 丧偶
	*/
	DeathOfaSpouse(3),
	/** 
	 离婚
	*/
	Divorce(4),
	/** 
	 未知
	*/
	Unknow(5);

	public static final int SIZE = java.lang.Integer.SIZE;

	private int intValue;
	private static java.util.HashMap<Integer, Marriaged> mappings;
	private static java.util.HashMap<Integer, Marriaged> getMappings()
	{
		if (mappings == null)
		{
			synchronized (Marriaged.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, Marriaged>();
				}
			}
		}
		return mappings;
	}

	private Marriaged(int value)
	{
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static Marriaged forValue(int value)
	{
		return getMappings().get(value);
	}
}