package xc.hikvisionsdk.isc.managers.resource;

import xc.hikvisionsdk.isc.managers.resource.models.acs.*;
import xc.hikvisionsdk.isc.managers.video.models.cameras.*;
import xc.hikvisionsdk.isc.managers.resource.models.camera.*;
import xc.hikvisionsdk.isc.managers.resource.models.card.*;
import xc.hikvisionsdk.isc.managers.resource.models.org.*;
import xc.hikvisionsdk.isc.managers.resource.models.person.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;

/** 
 资源API
*/
 资源api
public class HikResourceApiManager implements IHikResourceApiManager
{
	/** 
	 查询门禁点列表
	 
	 @param model
	 @return 
	*/
	public final Task<AcsDoorAdvanceAcsDoorListResponse> AcsDoorAdvanceAcsDoorListAsync(AcsDoorAdvanceAcsDoorListRequest model)
	{
		return HikVisionApiManagerExtensions.<AcsDoorAdvanceAcsDoorListRequest, AcsDoorAdvanceAcsDoorListResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/acsDoor/advance/acsDoorList", model, VersionConsts.V1);
	}



	/** 
	 查询监控点列表
	 
	 @param request
	 @return 
	*/
	public final Task<AdvanceCameraListResponse> AdvanceCameraListAsync(AdvanceCameraListRequest request)
	{
		return HikVisionApiManagerExtensions.<AdvanceCameraListRequest, AdvanceCameraListResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/camera/advance/cameraList", request, VersionConsts.V1);
	}

	/** 
	 查询监控点列表v2
	 
	 @param model
	 @return 
	*/
	public final Task<CameraSearchV2Response> CamerSearchV2Async(CameraSearchV2Request model)
	{
		return HikVisionApiManagerExtensions.<CameraSearchV2Request, CameraSearchV2Response>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v2/camera/search", model, VersionConsts.V1_4);

	}

	/** 
	 分页获取监控点资源
	 
	 @param request
	 @return 
	*/
	public final Task<CamerasResponse> CamerasAsync(CamerasRequest request)
	{
		return HikVisionApiManagerExtensions.<CamerasRequest, CamerasResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/cameras", request, VersionConsts.V1);
	}

	/** 
	 根据编号获取监控点详细信息
	 
	 @param request
	 @return 
	*/
	public final Task<CamerasIndexCodeResponse> CamerasIndexCodeAsync(CamerasIndexCodeRequest request)
	{
		return HikVisionApiManagerExtensions.<CamerasIndexCodeRequest, CamerasIndexCodeResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/cameras/indexCode", request, VersionConsts.V1);
	}

	/** 
	 根据区域编号获取下级监控点列表
	 
	 @param request
	 @return 
	*/
	public final Task<RegionIndexCodeCamerasResponse> RegionIndexCodeCamerasAsync(RegionIndexCodeCamerasRequest request)
	{
		return HikVisionApiManagerExtensions.<RegionIndexCodeCamerasRequest, RegionIndexCodeCamerasResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/regions/regionIndexCode/cameras", request, VersionConsts.V1);
	}

	///// <summary>
	///// 增量获取监控点数据
	///// </summary>
	///// <param name="request"></param>
	///// <returns></returns>
	//public Task<CameraTimeRangeResponse> CameraTimeRangeAsync(CameraTimeRangeRequest request)
	//{
	//    return _hikVisionApiManager.PostAndGetAsync<CameraTimeRangeRequest, CameraTimeRangeResponse>("/api/resource/v1/camera/timeRange", request, VersionConsts.V1_4);
	//}



	/** 
	 卡列表
	 
	 @param request
	 @return 
	*/
	public final Task<CardListResponse> CardListAsync(CardListRequest request)
	{
		return HikVisionApiManagerExtensions.<CardListRequest, CardListResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/card/cardList", request, VersionConsts.V1_2);
	}


	/** 
	 
	 
	 @param request
	 @return 
	*/
	public final Task<CardTimeRangeResponse> CardTimeRangeAsync(CardTimeRangeRequest request)
	{
		return HikVisionApiManagerExtensions.<CardTimeRangeRequest, CardTimeRangeResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/card/timeRange", request, VersionConsts.V1_4);
	}



	private final IHikVisionIscApiManager _hikVisionApiManager;

	/** 
	 
	 
	 @param hikVisionApiManager
	*/
	public HikResourceApiManager(IHikVisionIscApiManager hikVisionApiManager)
	{
		_hikVisionApiManager = hikVisionApiManager;
	}








	/** 
	 组织
	 
	 @param model
	 @return 
	*/
	public final Task<OrgListResponse> OrgListAsync(OrgListRequest model)
	{
		return HikVisionApiManagerExtensions.<OrgListRequest, OrgListResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/org/orgList", model, VersionConsts.V1);
	}


	/** 
	 根组织
	 
	 @param model
	 @return 
	*/
	public final Task<RootOrgResponse> RootOrgAsync(RootOrgRequest model)
	{
		return HikVisionApiManagerExtensions.<RootOrgRequest, RootOrgResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/org/rootOrg", model, VersionConsts.V1);
	}

	/** 
	 修改组织
	 
	 @param request
	 @return 
	*/
	public final Task<OrgSingleUpdateResponse> OrgSingleUpdateAsync(OrgSingleUpdateRequest request)
	{
		return HikVisionApiManagerExtensions.<OrgSingleUpdateRequest, OrgSingleUpdateResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/org/single/update", request, VersionConsts.V1_3);
	}


	/** 
	 批量删除组织
	 
	 @param request
	 @return 
	*/
	public final Task<OrgBatchDeleteResponse> OrgBatchDeleteAsync(OrgBatchDeleteRequest request)
	{
		return HikVisionApiManagerExtensions.<OrgBatchDeleteRequest, OrgBatchDeleteResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/org/batch/delete", request, VersionConsts.V1_3);
	}

	/** 
	 批量添加组织
	 
	 @param request
	 @return 
	*/
	public final Task<OrgBatchAddResponse> OrgBatchAddAsync(OrgBatchAddRequest request)
	{
		return HikVisionApiManagerExtensions.<OrgBatchAddRequest, OrgBatchAddResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/org/batch/add", request, VersionConsts.V1_3);
	}


	/** 
	 查询组织列表v2
	 
	 @param model
	 @return 
	*/
	public final Task<AdvanceOrgListV2Response> AdvanceOrgListV2Async(AdvanceOrgListV2Request model)
	{
		return HikVisionApiManagerExtensions.<AdvanceOrgListV2Request, AdvanceOrgListV2Response>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v2/org/advance/orgList", model, VersionConsts.V1_4);
	}

	/** 
	 查询组织列表
	 
	 @param model
	 @return 
	*/
	public final Task<AdvanceOrgListResponse> AdvanceOrgListAsync(AdvanceOrgListRequest model)
	{
		return HikVisionApiManagerExtensions.<AdvanceOrgListRequest, AdvanceOrgListResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/org/advance/orgList", model, VersionConsts.V1);
	}

	/** 
	 根据父组织编号获取下级组织列表
	 
	 @param model
	 @return 
	*/
	public final Task<SubOrgListResponse> SubOrgListAsync(SubOrgListRequest model)
	{
		return HikVisionApiManagerExtensions.<SubOrgListRequest, SubOrgListResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/org/parentOrgIndexCode/subOrgList", model, VersionConsts.V1);
	}

	/** 
	 增量获取组织数据
	 
	 @param model
	 @return 
	*/
	public final Task<OrgTimeRangeResponse> OrgTimeRangeAsync(OrgTimeRangeRequest model)
	{
		return HikVisionApiManagerExtensions.<OrgTimeRangeRequest, OrgTimeRangeResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/org/timeRange", model, VersionConsts.V1_4);
	}

	/** 
	 根据组织编号获取组织详细信息
	 
	 @param model
	 @return 
	*/
	public final Task<OrgInfoResponse> OrgInfoAsync(OrgInfoRequest model)
	{
		return HikVisionApiManagerExtensions.<OrgInfoRequest, OrgInfoResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/org/orgIndexCodes/orgInfo", model, VersionConsts.V1_4);
	}


	/** 
	 获取组织下人员列表v2
	 
	 @param model
	 @return 
	*/
	public final Task<OrgIndexCodePersonListV2Response> OrgIndexCodePersonListV2Async(OrgIndexCodePersonListV2Request model)
	{
		return HikVisionApiManagerExtensions.<OrgIndexCodePersonListV2Request, OrgIndexCodePersonListV2Response>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v2/person/orgIndexCode/personList", model, VersionConsts.V1_3);
	}

	/** 
	 根据人员编号获取单个人员信息
	 
	 @param model
	 @return 
	*/
	public final Task<PersonIdPersonInfoResponse> PersonIdPersonInfoAsync(PersonIdPersonInfoRequest model)
	{
		return HikVisionApiManagerExtensions.<PersonIdPersonInfoRequest, PersonIdPersonInfoResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/person/personId/personInfo", model, VersionConsts.V1);
	}

	/** 
	 根据证件号码获取单个人员信息
	 
	 @param model
	 @return 
	*/
	public final Task<CertificateNoPersonInfoResponse> CertificateNoPersonInfoAsync(CertificateNoPersonInfoRequest model)
	{
		return HikVisionApiManagerExtensions.<CertificateNoPersonInfoRequest, CertificateNoPersonInfoResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/person/certificateNo/personInfo", model, VersionConsts.V1);
	}

	/** 
	 根据手机号码获取单个人员信息
	 
	 @param model
	 @return 
	*/
	public final Task<PhoneNoPersonInfoResponse> PhoneNoPersonInfoAsync(PhoneNoPersonInfoRequest model)
	{
		return HikVisionApiManagerExtensions.<PhoneNoPersonInfoRequest, PhoneNoPersonInfoResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/person/phoneNo/personInfo", model, VersionConsts.V1);
	}

	/** 
	 获取人员列表v2
	 
	 @param model
	 @return 
	*/
	public final Task<PersonListV2Response> PersonListV2Async(PersonListV2Request model)
	{
		return HikVisionApiManagerExtensions.<PersonListV2Request, PersonListV2Response>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v2/person/personList", model, VersionConsts.V1_3);
	}

	/** 
	 查询人员列表v2
	 
	 @param model
	 @return 
	*/
	public final Task<AdvancePersonListV2Response> AdvancePersonListV2Async(AdvancePersonListV2Request model)
	{
		return HikVisionApiManagerExtensions.<AdvancePersonListV2Request, AdvancePersonListV2Response>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v2/person/advance/personList", model, VersionConsts.V1_3);
	}

	/** 
	 添加人员
	 
	 @param model
	 @return 
	*/
	public final Task<PersonSingleAddResponse> PersonSingleAddAsync(PersonSingleAddRequest model)
	{
		return HikVisionApiManagerExtensions.<PersonSingleAddRequest, PersonSingleAddResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/person/single/add", model, VersionConsts.V1_3);
	}

	/** 
	 批量添加人员
	 
	 @param model
	 @return 
	*/
	public final Task<PersonBatchAddResponse> PersonBatchAddAsync(PersonBatchAddRequest model)
	{
		return HikVisionApiManagerExtensions.<PersonBatchAddRequest, PersonBatchAddResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/person/batch/add", model, VersionConsts.V1_3);
	}

	/** 
	 修改人员
	 
	 @param model
	 @return 
	*/
	public final Task<PersonSingleUpdateResponse> PersonSingleUpdateAsync(PersonSingleUpdateRequest model)
	{
		return HikVisionApiManagerExtensions.<PersonSingleUpdateRequest, PersonSingleUpdateResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/person/single/update", model, VersionConsts.V1_3);
	}

	/** 
	 批量删除人员
	 
	 @param model
	 @return 
	*/
	public final Task<PersonBatchDeleteResponse> PersonBatchDeleteAsync(PersonBatchDeleteRequest model)
	{
		return HikVisionApiManagerExtensions.<PersonBatchDeleteRequest, PersonBatchDeleteResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/person/batch/delete", model, VersionConsts.V1_3);
	}


}