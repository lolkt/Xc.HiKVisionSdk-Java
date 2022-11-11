package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 按条件批量查询人脸结果数据
*/
public class FaceResponseData
{

	/** 
	 人脸的唯一标识
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
	 人脸所属的人脸分组的唯一标识
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
}