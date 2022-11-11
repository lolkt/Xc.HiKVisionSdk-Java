package xc.hikvisionsdk.isc.managers.video.models.cameras;

import xc.hikvisionsdk.isc.enums.video.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.video.*;

/** 
 获取监控点回放取流URLv2数据
*/
public class CameraPlaybackURLsV2ResponseData
{
	/** 
	 开始时间
	*/
	private String BeginTime;
	public final String getBeginTime()
	{
		return BeginTime;
	}
	public final void setBeginTime(String value)
	{
		BeginTime = value;
	}
	/** 
	 结束时间
	*/
	private String EndTime;
	public final String getEndTime()
	{
		return EndTime;
	}
	public final void setEndTime(String value)
	{
		EndTime = value;
	}
	/** 
	 录像片段大小（byte）
	*/
	private long Size;
	public final long getSize()
	{
		return Size;
	}
	public final void setSize(long value)
	{
		Size = value;
	}
	/** 
	 查询录像的锁定类型，0-全部录像；1-未锁定录像；2-已锁定录像。
	*/
	private LockType LockType = LockType.values()[0];
	public final LockType getLockType()
	{
		return LockType;
	}
	public final void setLockType(LockType value)
	{
		LockType = value;
	}
}