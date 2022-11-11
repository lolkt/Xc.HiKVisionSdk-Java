package xc.hikvisionsdk.isc.managersv2.faces.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.faces.*;

/** 
 添加人脸请求
*/
public class AddFaceRequest extends BaseRequest
{
	/** 
	 人员Id
	*/
	private String PersonId;
	public final String getPersonId()
	{
		return PersonId;
	}
	/** 
	 人脸图片base64编码后的字符数据
	*/
	private String FaceData;
	public final String getFaceData()
	{
		return FaceData;
	}


	/** 
	 添加人脸请求
	 
	 @param personId 人员Id
	 @param faceData 人脸图片base64编码后的字符数据
	*/
	public AddFaceRequest(String personId, String faceData)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(personId))
		{
			throw new NullPointerException("personId");
		}

		if (tangible.StringHelper.isNullOrWhiteSpace(faceData))
		{
			throw new NullPointerException("faceData");
		}
		PersonId = personId;
		FaceData = faceData;
	}
}