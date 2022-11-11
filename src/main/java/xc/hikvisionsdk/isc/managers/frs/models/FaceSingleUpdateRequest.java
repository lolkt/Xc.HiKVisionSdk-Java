package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 单个修改人脸请求
*/
public class FaceSingleUpdateRequest extends BaseRequest
{
	/** 
	 人脸的唯一标识，可从按条件批量查询人脸获取
	*/
	private String IndexCode;
	public final String getIndexCode()
	{
		return IndexCode;
	}
	public final void setIndexCode(String value)
	{
		IndexCode = value;
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
	 单个修改人脸请求
	*/
	public FaceSingleUpdateRequest()
	{
	}

	/** 
	 单个修改人脸请求
	 
	 @param indexCode 人脸的唯一标识
	 @param name 姓名
	*/
	public FaceSingleUpdateRequest(String indexCode, String name)
	{
		setIndexCode(indexCode);
		setFaceInfo(new FaceInfo());
		getFaceInfo().setName(name);
	}

	/** 
	 单个修改人脸请求
	 
	 @param indexCode 人脸的唯一标识
	 @param faceInfo 人脸信息对象
	 @param facePic 人脸图片对象
	*/
	public FaceSingleUpdateRequest(String indexCode, FaceInfo faceInfo, FacePic facePic)
	{
		setIndexCode(indexCode);
		setFaceInfo(faceInfo);
		setFacePic(facePic);
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	*/
	@Override
	public void CheckParams()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getIndexCode()))
		{
			throw new NullPointerException("IndexCode");
		}
		if (getFaceInfo() == null && getFacePic() == null)
		{
			throw new NullPointerException(String.format("%1$s 和 %2$s", "FaceInfo", "FacePic"), "不能都为空");

		}
	}
}