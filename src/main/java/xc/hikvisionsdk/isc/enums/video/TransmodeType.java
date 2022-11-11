package xc.hikvisionsdk.isc.enums.video;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 传输协议（传输层协议）
*/
public enum TransmodeType
{
	/** 
	 udp
	*/
	UDP,
	/** 
	 tcp
	*/
	TCP;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static TransmodeType forValue(int value)
	{
		return values()[value];
	}
}