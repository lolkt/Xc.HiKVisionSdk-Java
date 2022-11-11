package xc.hikvisionsdk.isc.managers.resource.models.person;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 人员图片信息
*/
public class PersonPhoto
{
	/** 
	 人脸图片唯一标示
	*/
	private String PersonPhotoIndexCode;
	public final String getPersonPhotoIndexCode()
	{
		return PersonPhotoIndexCode;
	}
	public final void setPersonPhotoIndexCode(String value)
	{
		PersonPhotoIndexCode = value;
	}
	/** 
	 图片相对url, 通过提取人员图片接口获取图片数据
	*/
	private String PicUri;
	public final String getPicUri()
	{
		return PicUri;
	}
	public final void setPicUri(String value)
	{
		PicUri = value;
	}
	/** 
	 图片服务器唯一标示        提取人员图片接口必要参数
	*/
	private String ServerIndexCode;
	public final String getServerIndexCode()
	{
		return ServerIndexCode;
	}
	public final void setServerIndexCode(String value)
	{
		ServerIndexCode = value;
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