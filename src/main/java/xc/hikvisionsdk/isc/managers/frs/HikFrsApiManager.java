package xc.hikvisionsdk.isc.managers.frs;

import xc.hikvisionsdk.isc.managers.frs.models.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;

/** 
 人脸api
*/
 人脸识别api
 
public class HikFrsApiManager implements IHikFrsApiManager
{
	/** 
	 单个添加重点人员识别计划
	 
	 @param model
	 @return 
	*/
	public final Task<PlanRecognitionBlackAdditionResponse> PlanRecognitionBlackAdditionAsync(PlanRecognitionBlackAdditionRequest model)
	{
		return HikVisionApiManagerExtensions.<PlanRecognitionBlackAdditionRequest, PlanRecognitionBlackAdditionResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/plan/recognition/black/addition", model, VersionConsts.V1_2);

	}

	/** 
	 删除重点人员识别计划
	 
	 @param model
	 @return 
	*/
	public final Task<PlanRecognitionBlackDeletionResponse> PlanRecognitionBlackDeletionAsync(PlanRecognitionBlackDeletionRequest model)
	{
		return HikVisionApiManagerExtensions.<PlanRecognitionBlackDeletionRequest, PlanRecognitionBlackDeletionResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/plan/recognition/black/deletion", model, VersionConsts.V1_2);

	}

	/** 
	 单个修改重点人员识别计划
	 
	 @param model
	 @return 
	*/
	public final Task<PlanRecognitionBlackUpdateResponse> PlanRecognitionBlackUpdateAsync(PlanRecognitionBlackUpdateRequest model)
	{
		return HikVisionApiManagerExtensions.<PlanRecognitionBlackUpdateRequest, PlanRecognitionBlackUpdateResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/plan/recognition/black/update", model, VersionConsts.V1_2);
	}

	/** 
	 单个查询重点人员识别计划详情
	 
	 @param model
	 @return 
	*/
	public final Task<PlanRecognitionBlackDetailResponse> PlanRecognitionBlackDetailAsync(PlanRecognitionBlackDetailRequest model)
	{
		return HikVisionApiManagerExtensions.<PlanRecognitionBlackDetailRequest, PlanRecognitionBlackDetailResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/plan/recognition/black/detail", model, VersionConsts.V1_2);
	}

	/** 
	 查询重点人员识别计划
	 
	 @param model
	 @return 
	*/
	public final Task<PlanRecognitionBlackResponse> PlanRecognitionBlackAsync(PlanRecognitionBlackRequest model)
	{
		return HikVisionApiManagerExtensions.<PlanRecognitionBlackRequest, PlanRecognitionBlackResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/plan/recognition/black", model, VersionConsts.V1_2);
	}

	/** 
	 重新下发重点人员识别计划
	 
	 @param model
	 @return 
	*/
	public final Task<PlanRecognitionBlackRestartResponse> PlanRecognitionBlackRestartAsync(PlanRecognitionBlackRestartRequest model)
	{
		return HikVisionApiManagerExtensions.<PlanRecognitionBlackRestartRequest, PlanRecognitionBlackRestartResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/plan/recognition/black/restart", model, VersionConsts.V1_2);
	}


	private final IHikVisionIscApiManager _hikVisionApiManager;
	/** 
	 
	 
	 @param hikVisionApiManager
	*/
	public HikFrsApiManager(IHikVisionIscApiManager hikVisionApiManager)
	{
		_hikVisionApiManager = hikVisionApiManager;
	}

	/** 
	 按条件查询识别资源
	 
	 @param model
	 @return 
	*/
	public final Task<RecognitionResponse> ResourceRecognitionAsync(RecognitionRequest model)
	{
		return HikVisionApiManagerExtensions.<RecognitionRequest, RecognitionResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/resource/recognition", model, VersionConsts.V1_2);
	}






	/** 
	 按条件查询重点人员事件
	 
	 @param model
	 @return 
	*/
	public final Task<EventBlackSearchResponse> EventBlackSearchAsync(EventBlackSearchRequest model)
	{
		return HikVisionApiManagerExtensions.<EventBlackSearchRequest, EventBlackSearchResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/event/black/search", model, VersionConsts.V1_3);
	}




	/** 
	 单个添加人脸
	 
	 @param model
	 @return 
	*/
	public final Task<FaceSingleAdditionResponse> FaceSingleAdditionAsync(FaceSingleAdditionRequest model)
	{
		return HikVisionApiManagerExtensions.<FaceSingleAdditionRequest, FaceSingleAdditionResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/face/single/addition", model, VersionConsts.V1_2);
	}

	/** 
	 批量添加人脸
	 
	 @param model
	 @return 
	*/
	public final Task<FaceBatchAdditionResponse> FaceBatchAdditionAsync(FaceBatchAdditionRequest model)
	{
		return HikVisionApiManagerExtensions.<FaceBatchAdditionRequest, FaceBatchAdditionResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/face/batch/addition", model, VersionConsts.V1_2);
	}

	/** 
	 批量删除人脸
	 
	 @param model
	 @return 
	*/
	public final Task<FaceBatchDeletionResponse> FaceBatchDeletionAsync(FaceBatchDeletionRequest model)
	{
		return HikVisionApiManagerExtensions.<FaceBatchDeletionRequest, FaceBatchDeletionResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/face/deletion", model, VersionConsts.V1_2);
	}

	/** 
	 单个修改人脸
	 
	 @param model
	 @return 
	*/
	public final Task<FaceSingleUpdateResponse> FaceSingleUpdateAsync(FaceSingleUpdateRequest model)
	{
		return HikVisionApiManagerExtensions.<FaceSingleUpdateRequest, FaceSingleUpdateResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/face/single/update", model, VersionConsts.V1_2);
	}

	/** 
	 按条件批量查询人脸
	 
	 @param model
	 @return 
	*/
	public final Task<FaceResponse> FaceAsync(FaceRequest model)
	{
		return HikVisionApiManagerExtensions.<FaceRequest, FaceResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/face", model, VersionConsts.V1_2);
	}

	/** 
	 批量拷贝人脸到人脸分组
	 
	 @param model
	 @return 
	*/
	public final Task<FaceBatchCopyResponse> FaceBatchCopyAsync(FaceBatchCopyRequest model)
	{
		return HikVisionApiManagerExtensions.<FaceBatchCopyRequest, FaceBatchCopyResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/face/batch/copy", model, VersionConsts.V1_2);
	}


	/** 
	 单个添加人脸分组
	 
	 @param model
	 @return 
	*/
	public final Task<FaceGroupSingleAdditionResponse> FaceGroupSingleAdditionAsync(FaceGroupSingleAdditionRequest model)
	{
		return HikVisionApiManagerExtensions.<FaceGroupSingleAdditionRequest, FaceGroupSingleAdditionResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/face/group/single/addition", model, VersionConsts.V1_2);
	}

	/** 
	 删除人脸分组
	 
	 @param model
	 @return 
	*/
	public final Task<FaceGroupBatchDeletionResponse> FaceGroupBatchDeletionAsync(FaceGroupBatchDeletionRequest model)
	{
		return HikVisionApiManagerExtensions.<FaceGroupBatchDeletionRequest, FaceGroupBatchDeletionResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/face/group/batch/deletion", model, VersionConsts.V1_2);
	}

	/** 
	 单个修改人脸分组
	 
	 @param model
	 @return 
	*/
	public final Task<FaceGroupSingleUpdateResponse> FaceGroupSingleUpdateAsync(FaceGroupSingleUpdateRequest model)
	{
		return HikVisionApiManagerExtensions.<FaceGroupSingleUpdateRequest, FaceGroupSingleUpdateResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/face/group/single/update", model, VersionConsts.V1_2);
	}

	/** 
	 按条件查询人脸分组
	 
	 @param model
	 @return 
	*/
	public final Task<FaceGroupResponse> FaceGroupAsync(FaceGroupRequest model)
	{
		return HikVisionApiManagerExtensions.<FaceGroupRequest, FaceGroupResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/face/group", model, VersionConsts.V1_2);
	}


	/** 
	 按条件查询重点人员事件
	 
	 @param model
	 @return 
	*/
	public final Task<GetFaceRelationResponse> GetFaceRelationAsync(GetFaceRelationRequest model)
	{
		return HikVisionApiManagerExtensions.<GetFaceRelationRequest, GetFaceRelationResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/plan/getFaceRelation", model, VersionConsts.V1_2);
	}


	/** 
	 抓拍计划配置
	 
	 @param model
	 @return 
	*/
	public final Task<GetFaceRelationResponse> CaptureConfigurationAsync(CaptureConfigurationRequest model)
	{
		return HikVisionApiManagerExtensions.<CaptureConfigurationRequest, GetFaceRelationResponse>PostAndGetAsync(_hikVisionApiManager, "/api/frs/v1/plan/capture/configuration", model, VersionConsts.V1_2);
	}






}