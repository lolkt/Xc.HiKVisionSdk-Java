package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 单个添加人脸请求
*/
public class FaceSingleAdditionRequest extends BaseRequest
{
	/** 
	 指定人脸添加到的人脸分组的唯一标识,人脸监控应用服务会校验该值的有效性，可从按条件查询人脸分组获取
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
	 人脸信息对象
	*/
	private FaceInfo FaceInfo;
	public final FaceInfo getFaceInfo()
	{
		return FaceInfo;
	}
	public final void setFaceInfo(FaceInfo value)
	{
		FaceInfo = value;
	}
	/** 
	 人脸图片对象
	*/
	private FacePic FacePic;
	public final FacePic getFacePic()
	{
		return FacePic;
	}
	public final void setFacePic(FacePic value)
	{
		FacePic = value;
	}

	/** 
	 单个添加人脸请求
	*/
	public FaceSingleAdditionRequest()
	{
	}

	/** 
	 单个添加人脸请求
	 
	 @param faceGroupIndexCode
	 @param faceInfo
	 @param facePic
	*/
	public FaceSingleAdditionRequest(String faceGroupIndexCode, FaceInfo faceInfo, FacePic facePic)
	{
		setFaceGroupIndexCode(faceGroupIndexCode);
		setFaceInfo(faceInfo);
		setFacePic(facePic);
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	*/
	@Override
	public void CheckParams()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getFaceGroupIndexCode()))
		{
			throw new NullPointerException("FaceGroupIndexCode");
		}

		if (getFaceInfo() == null)
		{
			throw new NullPointerException("FaceInfo");
		}

		if (getFacePic() == null)
		{
			throw new NullPointerException("FacePic");
		}
		getFaceInfo().Check();
		getFacePic().Check();


	}

}