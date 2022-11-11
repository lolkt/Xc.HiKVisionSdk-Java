package xc.hikvisionsdk.isc.callbacks.pms;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 事件号
*/
public enum EventCmd
{
	/** 
	 压线
	*/
	LinePressing(1),
	/** 
	 上传图片
	*/
	UploadPic(2),
	/** 
	 入场
	*/
	Entrance(3),
	/** 
	 出场
	*/
	Leave(4),
	/** 
	 车牌矫正
	*/
	LicensePlateCorrection(5),
	/** 
	 重新上传图片
	*/
	ReUploadPic(6);

	public static final int SIZE = java.lang.Integer.SIZE;

	private int intValue;
	private static java.util.HashMap<Integer, EventCmd> mappings;
	private static java.util.HashMap<Integer, EventCmd> getMappings()
	{
		if (mappings == null)
		{
			synchronized (EventCmd.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, EventCmd>();
				}
			}
		}
		return mappings;
	}

	private EventCmd(int value)
	{
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static EventCmd forValue(int value)
	{
		return getMappings().get(value);
	}
}