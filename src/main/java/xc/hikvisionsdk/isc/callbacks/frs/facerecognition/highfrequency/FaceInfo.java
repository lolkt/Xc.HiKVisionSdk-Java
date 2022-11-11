package xc.hikvisionsdk.isc.callbacks.frs.facerecognition.highfrequency;

import xc.hikvisionsdk.isc.callbacks.frs.capture.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;
import xc.hikvisionsdk.isc.callbacks.frs.*;
import xc.hikvisionsdk.isc.callbacks.frs.facerecognition.*;

/** 
 人脸信息
*/
public class FaceInfo
{
	/** 
	 抓拍到的人脸图片的URL，可能位于设备或ASW服务上。
	 调用人脸服务图片下载 获取图片数据
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
	 人脸评分参数
	*/
	private FaceScore FaceScore;
	public final FaceScore getFaceScore()
	{
		return FaceScore;
	}
	public final void setFaceScore(FaceScore value)
	{
		FaceScore = value;
	}
	/** 
	 性别，见数据字典设备性别类型
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
	 眼镜
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
	 人脸ID
	*/
	private int FaceId;
	public final int getFaceId()
	{
		return FaceId;
	}
	public final void setFaceId(int value)
	{
		FaceId = value;
	}
	/** 
	 是否带口罩
	*/
	private Mask Mask;
	public final Mask getMask()
	{
		return Mask;
	}
	public final void setMask(Mask value)
	{
		Mask = value;
	}
	/** 
	 目标出现次数
	*/
	private int Occurrences;
	public final int getOccurrences()
	{
		return Occurrences;
	}
	public final void setOccurrences(int value)
	{
		Occurrences = value;
	}
	/** 
	 是否微笑
	*/
	private Smile Smile;
	public final Smile getSmile()
	{
		return Smile;
	}
	public final void setSmile(Smile value)
	{
		Smile = value;
	}
}