package xc.hikvisionsdk.isc.managersv2.persons.dtos;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.persons.*;

/** 
 人脸信息
*/
public class FaceDataInfo
{
	/** 
	 人脸图片base64编码后的字符
	*/
	private String FaceData;
	public final String getFaceData()
	{
		return FaceData;
	}

	/** 
	 人脸信息
	 
	 @param faceData 人脸图片base64编码后的字符
	*/
	public FaceDataInfo(String faceData)
	{
		FaceData = faceData;
	}
}