package xc.hikvisionsdk.isc.managersv2.resources;

import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managersv2.resources.dtos.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 资源属性接口
*/
public class HikResourceManager implements IHikResourceManager
{
	private final IHikVisionIscApiManager _hikVisionApiManager;

	/** 
	 人员及照片管理
	 
	 @param hikVisionApiManager
	*/
	public HikResourceManager(IHikVisionIscApiManager hikVisionApiManager)
	{
		_hikVisionApiManager = hikVisionApiManager;
	}

	/** 
	 获取资源属性
	 
	 @param request
	 @return 
	*/
	public final Task<GetPropertiesResponse> GetPropertiesAsync(GetPropertiesRequest request)
	{
		return HikVisionApiManagerExtensions.<GetPropertiesRequest, GetPropertiesResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/resource/properties", request, VersionConsts.V1_3);
	}

	/** 
	 获取资源的历史在线记录
	 
	 @param request
	 @return 
	*/
	public final Task<GetOnlineHistoryResponse> GetOnlineHistoryAsync(GetOnlineHistoryRequest request)
	{
		return HikVisionApiManagerExtensions.<GetOnlineHistoryRequest, GetOnlineHistoryResponse>PostAndGetAsync(_hikVisionApiManager, "/api/nms/v1/online/history_status", request, VersionConsts.V1_3);
	}
}