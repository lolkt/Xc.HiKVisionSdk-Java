package xc.hikvisionsdk.isc.managersv2.faces;

import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managersv2.faces.dtos.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 人脸管理
*/
public class HikFaceManager implements IHikFaceManager
{
	private final IHikVisionIscApiManager _hikVisionApiManager;

	/** 
	 人员及照片管理
	 
	 @param hikVisionApiManager
	*/
	public HikFaceManager(IHikVisionIscApiManager hikVisionApiManager)
	{
		_hikVisionApiManager = hikVisionApiManager;
	}

	/** 
	 
	 
	 @param request
	 @return 
	*/
	public final Task<AddFaceResponse> AddAsync(AddFaceRequest request)
	{
		return HikVisionApiManagerExtensions.<AddFaceRequest, AddFaceResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/face/single/add", request, VersionConsts.V1_3);
	}

	/** 
	 修改人脸
	 
	 @param request
	 @return 
	*/
	public final Task<UpdateFaceResponse> UpdateAsync(UpdateFaceRequest request)
	{
		return HikVisionApiManagerExtensions.<UpdateFaceRequest, UpdateFaceResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/face/single/update", request, VersionConsts.V1_3);
	}

	/** 
	 删除人脸
	 
	 @param request
	 @return 
	*/
	public final Task<DeleteFaceResponse> DeleteAsync(DeleteFaceRequest request)
	{
		return HikVisionApiManagerExtensions.<DeleteFaceRequest, DeleteFaceResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/face/single/delete", request, VersionConsts.V1_5);
	}

}