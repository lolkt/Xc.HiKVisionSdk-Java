package xc.hikvisionsdk.isc.callbacks.frs.compare;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;
import xc.hikvisionsdk.isc.callbacks.frs.*;

/** 
 人脸信息
*/
public class FacesItem
{
	/** 
	 抓拍到的人脸图片的URL
	 可能位于设备或ASW服务上，调用人脸服务图片下载 获取图片数据
	*/
	private String URL;
	public final String getURL()
	{
		return URL;
	}
	public final void setURL(String value)
	{
		URL = value;
	}
	/** 
	 年龄信息
	*/
	private Age Age;
	public final Age getAge()
	{
		return Age;
	}
	public final void setAge(Age value)
	{
		Age = value;
	}
	/** 
	 人脸坐标
	*/
	private FaceRect FaceRect;
	public final FaceRect getFaceRect()
	{
		return FaceRect;
	}
	public final void setFaceRect(FaceRect value)
	{
		FaceRect = value;
	}
	/** 
	 性别信息
	*/
	private Gender Gender = Gender.values()[0];
	public final Gender getGender()
	{
		return Gender;
	}
	public final void setGender(Gender value)
	{
		Gender = value;
	}
	/** 
	 是否戴眼镜
	*/
	private Glass Glass;
	public final Glass getGlass()
	{
		return Glass;
	}
	public final void setGlass(Glass value)
	{
		Glass = value;
	}
	/** 
	 识别信息
	*/
	private IdentifyItem[] Identify;
	public final IdentifyItem[] getIdentify()
	{
		return Identify;
	}
	public final void setIdentify(IdentifyItem[] value)
	{
		Identify = value;
	}
}