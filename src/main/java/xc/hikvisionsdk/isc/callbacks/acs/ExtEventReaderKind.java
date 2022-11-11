package xc.hikvisionsdk.isc.callbacks.acs;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 读卡器类别
*/
public enum ExtEventReaderKind
{
	/** 
	 无
	*/
	None,
	/** 
	 ic卡
	*/
	Ic,
	/** 
	 身份证
	*/
	Id,
	/** 
	 二维码
	*/
	QrCode,
	/** 
	 指纹
	*/
	Fingerprint;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static ExtEventReaderKind forValue(int value)
	{
		return values()[value];
	}
}