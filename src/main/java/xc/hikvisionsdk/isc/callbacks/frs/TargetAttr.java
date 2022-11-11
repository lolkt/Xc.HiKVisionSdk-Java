package xc.hikvisionsdk.isc.callbacks.frs;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 目标属性
*/
public class TargetAttr
{
	/** 
	 抓拍图片的完整原图
	 调用人脸服务图片下载 获取图片数据
	*/
	private String BkgUrl;
	public final String getBkgUrl()
	{
		return BkgUrl;
	}
	public final void setBkgUrl(String value)
	{
		BkgUrl = value;
	}
	/** 
	 抓拍这张图片的监控点的唯一标识
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
	 抓拍这张图片的监控点所属的设备的唯一标识
	*/
	private String DeviceIndexCode;
	public final String getDeviceIndexCode()
	{
		return DeviceIndexCode;
	}
	public final void setDeviceIndexCode(String value)
	{
		DeviceIndexCode = value;
	}
	/** 
	 抓拍这张图片时的时间
	*/
	private String FaceTime;
	public final String getFaceTime()
	{
		return FaceTime;
	}
	public final void setFaceTime(String value)
	{
		FaceTime = value;
	}
	/** 
	 图片服务唯一标志
	*/
	private String PicServerIndexCode;
	public final String getPicServerIndexCode()
	{
		return PicServerIndexCode;
	}
	public final void setPicServerIndexCode(String value)
	{
		PicServerIndexCode = value;
	}
	/** 
	 人脸坐标
	*/
	private FaceRect Rect;
	public final FaceRect getRect()
	{
		return Rect;
	}
	public final void setRect(FaceRect value)
	{
		Rect = value;
	}
}