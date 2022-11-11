package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 人脸图片对象
*/
public class FacePic implements ICheckRequestItem
{
	/** 
	 人脸图片的URL。和faceBinaryData不能同时为空，同时存在时优先取faceBinaryData；图片的大小范围在10KB到200KB之间，只支持JGP格式图片。
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
	 人脸图片的二进制数据经过Base64编码后的字符串，和faceUrl不能同时为空，同时存在时优先取faceBinaryData。 图片的大小范围在10KB到200KB之间，只支持JGP格式图片。
	*/
	private String FaceBinaryData;
	public final String getFaceBinaryData()
	{
		return FaceBinaryData;
	}
	public final void setFaceBinaryData(String value)
	{
		FaceBinaryData = value;
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	*/
	public final void Check()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getFaceUrl()) && tangible.StringHelper.isNullOrWhiteSpace(getFaceBinaryData()))
		{
			throw new NullPointerException("FaceUrl 或 FaceBinaryData", "FaceBinaryData 和 FaceUrl 不能同时为空");
		}
	}
}