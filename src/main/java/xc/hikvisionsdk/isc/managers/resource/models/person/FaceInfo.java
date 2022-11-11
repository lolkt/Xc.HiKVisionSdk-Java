package xc.hikvisionsdk.isc.managers.resource.models.person;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 人脸数据
*/
public class FaceInfo
{
	/** 
	 人脸图片base64编码后的字符
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Required] public string FaceDate {get;set;}
	private String FaceDate;
	public final String getFaceDate()
	{
		return FaceDate;
	}
	public final void setFaceDate(String value)
	{
		FaceDate = value;
	}
}