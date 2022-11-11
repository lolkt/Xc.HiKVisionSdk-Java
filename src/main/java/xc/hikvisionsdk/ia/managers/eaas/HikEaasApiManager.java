package xc.hikvisionsdk.ia.managers.eaas;

import xc.hikvisionsdk.ia.managers.eaas.attendance.*;
import xc.hikvisionsdk.ia.managers.eattendanceengine.mobile.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.managers.*;

/** 
 考勤api
*/
 打卡
 资源api
 请假
 出差
 加班
public class HikEaasApiManager implements IHikEaasApiManager
{
	/** 
	 批量查询员工考勤数据
	 
	 @param model
	 @return 
	*/
	public final Task<AttendanceBatchSearchResponse> AttendanceBatchSearchAsync(AttendanceBatchSearchRequest model)
	{
		return HikVisionApiManagerExtensions.<AttendanceBatchSearchRequest, AttendanceBatchSearchResponse>PostAndGetAsync(_hikVisionApiManager, "/api/eaas/v1/attendance/batch/search", model, VersionConsts.V1_0);
	}

	/** 
	 考勤结果查询
	 
	 @param model
	 @return 
	*/
	public final Task<AttendanceResultListResponse> AttendanceResultListAsync(AttendanceResultListRequest model)
	{
		return HikVisionApiManagerExtensions.<AttendanceResultListRequest, AttendanceResultListResponse>PostAndGetAsync(_hikVisionApiManager, "/api/v1/attendance/result/list", model, VersionConsts.V1_0);
	}





	private final IHikVisionIaApiManager _hikVisionApiManager;

	/** 
	 
	 
	 @param hikVisionApiManager
	*/
	public HikEaasApiManager(IHikVisionIaApiManager hikVisionApiManager)
	{
		_hikVisionApiManager = hikVisionApiManager;
	}














}