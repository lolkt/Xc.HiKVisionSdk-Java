package xc.hikvisionsdk.isc.managersv2.persons.dtos;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.persons.*;

/** 
 成功添加的人员信息
*/
public class AddPersonV2ResponseData
{
	/** 
	 成功添加的人员Id
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
	/** 
	 成功添加的人脸Id
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
}