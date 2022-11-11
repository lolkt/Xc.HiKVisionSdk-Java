package xc.hikvisionsdk.isc.callbacks.frs.facerecognition;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;
import xc.hikvisionsdk.isc.callbacks.frs.*;

/** 
 抓拍信息
*/
public class Snap
{
	/** 
	 年龄段，见附录附录A.34 设备年龄段类型
	*/
	private String AgeGroup;
	public final String getAgeGroup()
	{
		return AgeGroup;
	}
	public final void setAgeGroup(String value)
	{
		AgeGroup = value;
	}
	/** 
	 背景图片URL
	 位于超脑上则为完整的URL，位于asw上则为不带IP、PORT的URI，调用人脸服务图片下载 获取图片数据
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
	 抓拍图片的时间
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
	 人脸图片URI
	 位于超脑上则为完整的URL，位于asw上则为不带IP、PORT的URI，调用人脸服务图片下载 获取图片数据
	*/
	private String FaceUrl;
	public final String getFaceUrl()
	{
		return FaceUrl;
	}
	public final void setFaceUrl(String value)
	{
		FaceUrl = value;
	}
	/** 
	 性别，见数据字典设备性别类型
	*/
	private String Gender;
	public final String getGender()
	{
		return Gender;
	}
	public final void setGender(String value)
	{
		Gender = value;
	}
	/** 
	 是否戴眼镜，见数据字典设备戴眼镜类别
	*/
	private String Glass;
	public final String getGlass()
	{
		return Glass;
	}
	public final void setGlass(String value)
	{
		Glass = value;
	}
}