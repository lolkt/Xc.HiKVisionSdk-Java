package xc.hikvisionsdk.isc.enums.resource;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 卡片类型
*/
public enum CardType
{
	/** 
	 ic
	*/
	Ic(1),
	/** 
	 cpu
	*/
	Cpu(2),
	/** 
	 远距离
	*/
	Remote(3),
	/** 
	 mifare
	*/
	Mifare(4);

	public static final int SIZE = java.lang.Integer.SIZE;

	private int intValue;
	private static java.util.HashMap<Integer, CardType> mappings;
	private static java.util.HashMap<Integer, CardType> getMappings()
	{
		if (mappings == null)
		{
			synchronized (CardType.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, CardType>();
				}
			}
		}
		return mappings;
	}

	private CardType(int value)
	{
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static CardType forValue(int value)
	{
		return getMappings().get(value);
	}
}