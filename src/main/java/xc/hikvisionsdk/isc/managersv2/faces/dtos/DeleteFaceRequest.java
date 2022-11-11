package xc.hikvisionsdk.isc.managersv2.faces.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.faces.*;

/** 
 删除人脸请求
*/
public class DeleteFaceRequest extends BaseRequest
{
	/** 
	 人脸图片Id ，        添加人脸 接口返回报文中的faceId字段，或获取人员列表v2 接口返回报文中的personPhotoIndexCode字段
	*/
	private String FaceId;
	public final String getFaceId()
	{
		return FaceId;
	}
	/** 
	 修改人脸结果
	 
	 @param faceId 人脸图片Id ，        添加人脸 接口返回报文中的faceId字段，或获取人员列表v2 接口返回报文中的personPhotoIndexCode字段
	*/
	public DeleteFaceRequest(String faceId)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(faceId))
		{
			throw new NullPointerException("faceId");
		}
		FaceId = faceId;
	}


}