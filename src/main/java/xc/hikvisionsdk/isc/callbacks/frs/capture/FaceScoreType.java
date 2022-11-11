package xc.hikvisionsdk.isc.callbacks.frs.capture;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;
import xc.hikvisionsdk.isc.callbacks.frs.*;

/** 
 过滤类型
 0-全部类型 
 1-人脸抓拍图片过滤 
 2-黑名单库 
 3-白名单库
*/
public enum FaceScoreType
{
	/** 
	 全部类型
	*/
	All,
	/** 
	 人脸抓拍图片过滤
	*/
	Capture,
	/** 
	 黑名单库
	*/
	Black,
	/** 
	 白名单库
	*/
	White;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static FaceScoreType forValue(int value)
	{
		return values()[value];
	}
}