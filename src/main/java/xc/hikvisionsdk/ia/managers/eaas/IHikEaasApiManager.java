package xc.hikvisionsdk.ia.managers.eaas;

import xc.hikvisionsdk.ia.managers.eaas.attendance.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.managers.*;

/** 
 考勤
*/
 资源api
public interface IHikEaasApiManager
{

	/** 
	 批量查询员工考勤数据
	 
	 @param model
	 @return 
	 批量查询员工考勤数据
	*/
	Task<AttendanceBatchSearchResponse> AttendanceBatchSearchAsync(AttendanceBatchSearchRequest model);

	/** 
	 考勤结果查询
	 
	 @param model
	 @return 
	 考勤结果查询接口
	*/
	Task<AttendanceResultListResponse> AttendanceResultListAsync(AttendanceResultListRequest model);





}