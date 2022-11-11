package xc.hikvisionsdk.isc.managersv2.faces.dtos;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.faces.*;

/** 
 人脸结果数据
*/
public class FaceResponseData
{
	/** 
	  	人脸Id
	*/
	private String FaceId;
	public final String getFaceId()
	{
		return FaceId;
	}
	public final void setFaceId(String value)
	{
		FaceId = value;
	}
	/** 
	 人脸图片Url
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
	 人员ID
	*/
	private String PersonId;
	public final String getPersonId()
	{
		return PersonId;
	}
	public final void setPersonId(String value)
	{
		PersonId = value;
	}
}