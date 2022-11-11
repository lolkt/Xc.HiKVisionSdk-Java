package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 重点人员事件目标图信息集
*/
public class TargetInfo
{
	/** 
	 姓名
	*/
	private String Name;
	public final String getName()
	{
		return Name;
	}
	public final void setName(String value)
	{
		Name = value;
	}
	/** 
	 相似度
	*/
	private String Similarity;
	public final String getSimilarity()
	{
		return Similarity;
	}
	public final void setSimilarity(String value)
	{
		Similarity = value;
	}
	/** 
	 证件类型，111-身份证，OTHER-其他证件
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
	 性别，1-男，2-女，UNKNOWN-未知
	*/
	private String Sex;
	public final String getSex()
	{
		return Sex;
	}
	public final void setSex(String value)
	{
		Sex = value;
	}
	/** 
	 证件号
	*/
	private String CertificateNumber;
	public final String getCertificateNumber()
	{
		return CertificateNumber;
	}
	public final void setCertificateNumber(String value)
	{
		CertificateNumber = value;
	}
	/** 
	 人脸唯一标识
	*/
	private String FaceInfoIndexcode;
	public final String getFaceInfoIndexcode()
	{
		return FaceInfoIndexcode;
	}
	public final void setFaceInfoIndexcode(String value)
	{
		FaceInfoIndexcode = value;
	}
	/** 
	 人脸分组唯一标识
	*/
	private String FaceGroupIndexcode;
	public final String getFaceGroupIndexcode()
	{
		return FaceGroupIndexcode;
	}
	public final void setFaceGroupIndexcode(String value)
	{
		FaceGroupIndexcode = value;
	}
	/** 
	 人脸分组名称
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
	  	人脸图片url
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
}