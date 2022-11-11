package xc.hikvisionsdk.isc.managers.mpc;

import xc.hikvisionsdk.isc.managers.mpc.models.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;

/** 
 园区卡口api
*/
public class HikMpcApiManager implements IHikMpcApiManager
{
	private final IHikVisionIscApiManager _hikVisionApiManager;
	/** 
	 
	 
	 @param hikVisionApiManager
	*/
	public HikMpcApiManager(IHikVisionIscApiManager hikVisionApiManager)
	{
		_hikVisionApiManager = hikVisionApiManager;
	}

	/** 
	 批量添加车辆黑名单
	 
	 @param model
	 @return 
	*/
	public final Task<AlarmBlackAddResponse> AlarmBlackAdd(AlarmBlackAddRequest model)
	{
		return HikVisionApiManagerExtensions.<AlarmBlackAddRequest, AlarmBlackAddResponse>PostAndGetAsync(_hikVisionApiManager, "/api/mpc/v1/alarm/black/add", model, VersionConsts.V1_4);
	}


}