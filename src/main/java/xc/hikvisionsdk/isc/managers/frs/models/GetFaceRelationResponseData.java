package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 获取人脸及分组关联关系
*/
public class GetFaceRelationResponseData
{
	/** 
	 人脸监控应用服务人脸编号
	*/
	private String FaceIndexCode;
	public final String getFaceIndexCode()
	{
		return FaceIndexCode;
	}
	public final void setFaceIndexCode(String value)
	{
		FaceIndexCode = value;
	}

	/** 
	 人脸监控应用服务人脸分组唯一编号
	*/
	private String FaceGroupIndexCode;
	public final String getFaceGroupIndexCode()
	{
		return FaceGroupIndexCode;
	}
	public final void setFaceGroupIndexCode(String value)
	{
		FaceGroupIndexCode = value;
	}

	/** 
	 识别资源上人脸的唯一编号
	*/
	private String ResFaceIndexCode;
	public final String getResFaceIndexCode()
	{
		return ResFaceIndexCode;
	}
	public final void setResFaceIndexCode(String value)
	{
		ResFaceIndexCode = value;
	}

	/** 
	 识别资源上人脸库的唯一编号
	*/
	private String ResFaceGroupIndexCode;
	public final String getResFaceGroupIndexCode()
	{
		return ResFaceGroupIndexCode;
	}
	public final void setResFaceGroupIndexCode(String value)
	{
		ResFaceGroupIndexCode = value;
	}

	/** 
	 识别资源的唯一编号
	*/
	private String ResIndexCode;
	public final String getResIndexCode()
	{
		return ResIndexCode;
	}
	public final void setResIndexCode(String value)
	{
		ResIndexCode = value;
	}
}