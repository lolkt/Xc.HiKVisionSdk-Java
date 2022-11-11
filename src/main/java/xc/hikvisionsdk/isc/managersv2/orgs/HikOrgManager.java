package xc.hikvisionsdk.isc.managersv2.orgs;

import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managersv2.orgs.dtos.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 组织管理
*/
public class HikOrgManager implements IHikOrgManager
{
	private static GetRootOrgRequest getRootOrgRequest = new GetRootOrgRequest();

	private final IHikVisionIscApiManager _hikVisionApiManager;

	/** 
	 组织管理
	 
	 @param hikVisionApiManager
	*/
	public HikOrgManager(IHikVisionIscApiManager hikVisionApiManager)
	{
		_hikVisionApiManager = hikVisionApiManager;
	}

	/** 
	 修改组织
	 
	 @param request
	 @return 
	*/
	public final Task<UpdateOrgResponse> UpdateAsync(UpdateOrgRequest request)
	{
		return HikVisionApiManagerExtensions.<UpdateOrgRequest, UpdateOrgResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/org/single/update", request, VersionConsts.V1_3);
	}

	/** 
	 批量删除组织
	 
	 @param request
	 @return 
	*/
	public final Task<BatchDeleteOrgsResponse> BatchDeleteAsync(BatchDeleteOrgsRequest request)
	{
		return HikVisionApiManagerExtensions.<BatchDeleteOrgsRequest, BatchDeleteOrgsResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/org/batch/delete", request, VersionConsts.V1_3);
	}

	/** 
	 批量添加组织
	 
	 @param request
	 @return 
	*/
	public final Task<BatchAddOrgsResponse> BatchAddAsync(BatchAddOrgsRequest request)
	{
		return HikVisionApiManagerExtensions.<BatchAddOrgsRequest, BatchAddOrgsResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/org/batch/add", request, VersionConsts.V1_3);
	}

	/** 
	 获取根组织
	 
	 @return 
	*/
	public final Task<GetRootOrgResponse> GetRootAsync()
	{
		return HikVisionApiManagerExtensions.<GetRootOrgRequest, GetRootOrgResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/org/rootOrg", getRootOrgRequest, VersionConsts.V1);
	}

	/** 
	 获取组织列表
	 
	 @param request
	 @return 
	*/
	public final Task<GetOrgListResponse> GetListAsync(GetOrgListRequest request)
	{
		return HikVisionApiManagerExtensions.<GetOrgListRequest, GetOrgListResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/org/orgList", request, VersionConsts.V1);
	}

	/** 
	 查询组织列表v2
	 
	 @param request
	 @return 
	*/
	public final Task<GetOrgListByParametersV2Response> GetListByParametersV2Async(GetOrgListByParametersV2Request request)
	{
		return HikVisionApiManagerExtensions.<GetOrgListByParametersV2Request, GetOrgListByParametersV2Response>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v2/org/advance/orgList", request, VersionConsts.V1_4);
	}

	/** 
	 根据父组织编号获取下级组织列表
	 
	 @param request
	 @return 
	*/
	public final Task<GetSubOrgListResponse> GetSubListAsync(GetSubOrgListRequest request)
	{
		return HikVisionApiManagerExtensions.<GetSubOrgListRequest, GetSubOrgListResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/org/parentOrgIndexCode/subOrgList", request, VersionConsts.V1);
	}

	/** 
	 增量获取组织数据
	 
	 @param request
	 @return 
	*/
	public final Task<GetOrgListByTimeRangeResponse> GetListByTimeRangeAsync(GetOrgListByTimeRangeRequest request)
	{
		return HikVisionApiManagerExtensions.<GetOrgListByTimeRangeRequest, GetOrgListByTimeRangeResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/org/timeRange", request, VersionConsts.V1_4);
	}


	/** 
	 根据组织编号获取组织详细信息
	 
	 @param request
	 @return 
	*/
	public final Task<GetOrgListByIndexCodesResponse> GetListByIndexCodesAsync(GetOrgListByIndexCodesRequest request)
	{
		return HikVisionApiManagerExtensions.<GetOrgListByIndexCodesRequest, GetOrgListByIndexCodesResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/org/orgIndexCodes/orgInfo", request, VersionConsts.V1_4);
	}
}