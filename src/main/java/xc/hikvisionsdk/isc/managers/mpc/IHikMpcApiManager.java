package xc.hikvisionsdk.isc.managers.mpc;

import xc.hikvisionsdk.isc.managers.mpc.models.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;

/** 
 园区卡口api
*/
public interface IHikMpcApiManager
{
	/** 
	 批量添加车辆黑名单
	 
	 @param model
	 @return 
	 批量添加车辆黑名单，该车辆布控为黑名单后，当有过车事件上报时，会产生对应的黑名单事件，一次添加最大不超过400个车辆黑名单。
	*/
	Task<AlarmBlackAddResponse> AlarmBlackAdd(AlarmBlackAddRequest model);
}