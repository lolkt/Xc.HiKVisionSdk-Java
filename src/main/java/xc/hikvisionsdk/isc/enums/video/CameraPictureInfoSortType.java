package xc.hikvisionsdk.isc.enums.video;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 图片排序方式
*/
public enum CameraPictureInfoSortType
{
	/** 
	 按监控点排序
	*/
	OrderByName,
	/** 
	 按时间排序
	*/
	OrderByTime;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static CameraPictureInfoSortType forValue(int value)
	{
		return values()[value];
	}
}