package xc.hikvisionsdk.isc.enums.video;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 存储类型
*/
public enum RecordLocationTyep
{
	/** 
	 中心存储
	*/
	Center,
	/** 
	 设备存储
	*/
	Device;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static RecordLocationTyep forValue(int value)
	{
		return values()[value];
	}
}