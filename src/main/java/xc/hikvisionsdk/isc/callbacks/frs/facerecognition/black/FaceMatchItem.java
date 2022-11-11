package xc.hikvisionsdk.isc.callbacks.frs.facerecognition.black;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;
import xc.hikvisionsdk.isc.callbacks.frs.*;
import xc.hikvisionsdk.isc.callbacks.frs.facerecognition.*;

/** 
 识别到的目标信息
*/
public class FaceMatchItem
{
	/** 
	 目标所属的人脸分组的唯一标识
	*/
	private String FaceGroupCode;
	public final String getFaceGroupCode()
	{
		return FaceGroupCode;
	}
	public final void setFaceGroupCode(String value)
	{
		FaceGroupCode = value;
	}
	/** 
	 目标所属的人脸分组的名称
	*/
	private String FaceGroupName;
	public final String getFaceGroupName()
	{
		return FaceGroupName;
	}
	public final void setFaceGroupName(String value)
	{
		FaceGroupName = value;
	}
	/** 
	 目标对应的人脸的唯一标识
	*/
	private String FaceInfoCode;
	public final String getFaceInfoCode()
	{
		return FaceInfoCode;
	}
	public final void setFaceInfoCode(String value)
	{
		FaceInfoCode = value;
	}
	/** 
	 目标对应的人脸的名称
	*/
	private String FaceInfoName;
	public final String getFaceInfoName()
	{
		return FaceInfoName;
	}
	public final void setFaceInfoName(String value)
	{
		FaceInfoName = value;
	}
	/** 
	 目标对应的人脸的性别
	*/
	private String FaceInfoSex;
	public final String getFaceInfoSex()
	{
		return FaceInfoSex;
	}
	public final void setFaceInfoSex(String value)
	{
		FaceInfoSex = value;
	}
	/** 
	 目标对应的人脸的证件号码
	*/
	private String Certificate;
	public final String getCertificate()
	{
		return Certificate;
	}
	public final void setCertificate(String value)
	{
		Certificate = value;
	}
	/** 
	 目标对应的人脸的证件类型
	 111：身份证
	 officerID：军官证
	 其余为其它证件
	*/
	private String CertificateType;
	public final String getCertificateType()
	{
		return CertificateType;
	}
	public final void setCertificateType(String value)
	{
		CertificateType = value;
	}
	/** 
	 目标人脸和抓拍人脸的相似度
	*/
	private double Similarity;
	public final double getSimilarity()
	{
		return Similarity;
	}
	public final void setSimilarity(double value)
	{
		Similarity = value;
	}
	/** 
	 目标人脸的图片
	 存储于超脑上则为完整的URL，存储于asw上则为不带IP、PORT的URI，调用人脸服务图片下载 获取图片数据
	*/
	private String FacePicUrl;
	public final String getFacePicUrl()
	{
		return FacePicUrl;
	}
	public final void setFacePicUrl(String value)
	{
		FacePicUrl = value;
	}
}