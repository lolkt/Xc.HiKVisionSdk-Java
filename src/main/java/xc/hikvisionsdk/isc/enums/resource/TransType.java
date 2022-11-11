package xc.hikvisionsdk.isc.enums.resource;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 传输协议
*/
public enum TransType
{
	/** 
	 udp
	*/
	UDP,
	/** 
	 tpc
	*/
	TCP;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static TransType forValue(int value)
	{
		return values()[value];
	}
}