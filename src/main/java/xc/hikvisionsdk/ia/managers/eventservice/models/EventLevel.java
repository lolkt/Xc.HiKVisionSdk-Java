package xc.hikvisionsdk.ia.managers.eventservice.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.managers.*;
import xc.hikvisionsdk.ia.managers.eventservice.*;

/** 
 事件级别
*/
public enum EventLevel
{
	/** 
	 低
	*/
	Low(1),
	/** 
	 中
	*/
	Middle(2),
	/** 
	 高
	*/
	Height(3);

	public static final int SIZE = java.lang.Integer.SIZE;

	private int intValue;
	private static java.util.HashMap<Integer, EventLevel> mappings;
	private static java.util.HashMap<Integer, EventLevel> getMappings()
	{
		if (mappings == null)
		{
			synchronized (EventLevel.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, EventLevel>();
				}
			}
		}
		return mappings;
	}

	private EventLevel(int value)
	{
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static EventLevel forValue(int value)
	{
		return getMappings().get(value);
	}
}