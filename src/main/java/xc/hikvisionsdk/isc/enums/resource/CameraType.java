package xc.hikvisionsdk.isc.enums.resource;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 摄像机类型
*/
public enum CameraType
{
	/** 
	 枪机
	*/
	Box,
	/** 
	 半球
	*/
	Demo,
	/** 
	 快球
	*/
	HighSpeedDemo,
	/** 
	 云台枪机
	*/
	Ptz;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static CameraType forValue(int value)
	{
		return values()[value];
	}
}