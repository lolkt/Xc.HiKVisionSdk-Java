package xc.hikvisionsdk.ia.managers.eattendanceengine;

import xc.hikvisionsdk.ia.managers.eattendanceengine.mobile.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.managers.*;

/** 
 配置api
*/
public class HikEattendanceEngineApiManager implements IHikEattendanceEngineApiManager
{
	private final IHikVisionIaApiManager _hikVisionApiManager;

	/** 
	 
	 
	 @param hikVisionApiManager
	*/
	public HikEattendanceEngineApiManager(IHikVisionIaApiManager hikVisionApiManager)
	{
		_hikVisionApiManager = hikVisionApiManager;
	}


	/** 
	 查询是否是指定打卡地点
	 
	 @param model
	 @return 
	*/
	public final Task<QueryIsCardResponse> QueryIsCardAsync(QueryIsCardRequest model)
	{
		return HikVisionApiManagerExtensions.<QueryIsCardRequest, QueryIsCardResponse>PostAndGetAsync(_hikVisionApiManager, "/api/eattendance-engine/v1/mobile/card/query/is/card", model, VersionConsts.V1_0);
	}

	/** 
	 查询高德授权密钥
	 
	 @return 
	*/
	public final Task<QueryGaoDeKeyResponse> QueryGaoDeKeyAsync()
	{
		return HikVisionApiManagerExtensions.<QueryGaoDeKeyResponse>GetAsync(_hikVisionApiManager, "/api/eattendance-engine/v1/mobile/card/query/gaoDe/key", VersionConsts.V1_0);
	}

	/** 
	 获取移动考勤有效打卡地点
	 
	 @param model
	 @return 
	*/
	public final Task<QueryMobileCardResponse> QueryMobileCardAsync(QueryMobileCardRequest model)
	{
		return HikVisionApiManagerExtensions.<QueryMobileCardRequest, QueryMobileCardResponse>PostAndGetAsync(_hikVisionApiManager, "/api/eattendance-engine/v1/mobile/card/query/mobile/card", model, VersionConsts.V1_0);
	}


}