package xc.hikvisionsdk.isc.managers.video.models.pictures;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.video.*;

/** 
 平台抓拍计划图片获取结果数据
*/
public class CameraPictureInfosResponseData
{
	/** 
	 图片唯一标识
	*/
	private String CaptureId;
	public final String getCaptureId()
	{
		return CaptureId;
	}
	public final void setCaptureId(String value)
	{
		CaptureId = value;
	}
	/** 
	 监控点唯一标识
	*/
	private String CameraIndexCode;
	public final String getCameraIndexCode()
	{
		return CameraIndexCode;
	}
	public final void setCameraIndexCode(String value)
	{
		CameraIndexCode = value;
	}
	/** 
	 监控点名称
	*/
	private String CameraName;
	public final String getCameraName()
	{
		return CameraName;
	}
	public final void setCameraName(String value)
	{
		CameraName = value;
	}
	/** 
	 通道类型。0-枪机；1-半球；2-球机；3-云台枪机
	*/
	private String CameraType;
	public final String getCameraType()
	{
		return CameraType;
	}
	public final void setCameraType(String value)
	{
		CameraType = value;
	}
	/** 
	 原图图片地址，24小时后失效
	*/
	private String CaptureUrl;
	public final String getCaptureUrl()
	{
		return CaptureUrl;
	}
	public final void setCaptureUrl(String value)
	{
		CaptureUrl = value;
	}
	/** 
	 缩略图图片地址，24小时后失效
	*/
	private String ThumbnailUrl;
	public final String getThumbnailUrl()
	{
		return ThumbnailUrl;
	}
	public final void setThumbnailUrl(String value)
	{
		ThumbnailUrl = value;
	}
	/** 
	 抓图时间（IOS8601格式：yyyy-MM-dd'T'HH:mm:ss.SSSzzz +当前时区，例如北京时间：2018-07-26T15:00:00.000+08:00）
	*/
	private String CaptureTime;
	public final String getCaptureTime()
	{
		return CaptureTime;
	}
	public final void setCaptureTime(String value)
	{
		CaptureTime = value;
	}
}