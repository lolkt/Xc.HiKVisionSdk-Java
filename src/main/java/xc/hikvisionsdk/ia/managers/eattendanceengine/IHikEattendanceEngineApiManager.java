package xc.hikvisionsdk.ia.managers.eattendanceengine;

import xc.hikvisionsdk.ia.managers.eattendanceengine.mobile.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.managers.*;

/** 
 配置api
*/
public interface IHikEattendanceEngineApiManager
{


	/** 
	 查询是否是指定打卡地点
	 
	 @param model
	 @return 
	 查询是否是指定打卡地点,移动端调用此接口，可识别员工是否需要在指定区域进行打卡
	*/
	Task<QueryIsCardResponse> QueryIsCardAsync(QueryIsCardRequest model);

	/** 
	 查询高德授权密钥
	 
	 @return 
	*/
	Task<QueryGaoDeKeyResponse> QueryGaoDeKeyAsync();

	/** 
	 获取移动考勤有效打卡地点
	 
	 @param model
	 @return 
	 获取移动考勤有效打卡地点
	*/
	Task<QueryMobileCardResponse> QueryMobileCardAsync(QueryMobileCardRequest model);
}