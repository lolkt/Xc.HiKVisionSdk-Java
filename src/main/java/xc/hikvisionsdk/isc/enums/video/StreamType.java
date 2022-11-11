package xc.hikvisionsdk.isc.enums.video;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 码流类型
*/
public enum StreamType
{
	/** 
	 0:主码流
	*/
	Main,
	/** 
	 子码流
	*/
	Sub,
	/** 
	 第三码流
	*/
	Other;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static StreamType forValue(int value)
	{
		return values()[value];
	}
}