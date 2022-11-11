package xc.hikvisionsdk.isc.managers.pms;

import xc.hikvisionsdk.isc.managers.pms.models.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;

/** 
 停车场api
*/
public interface IHikPmsApiManager
{
	/** 
	 查询停车库剩余车位数
	 
	 @param model
	 @return 
	*/
	Task<ParkRemainSpaceNumResponse> ParkRemainSpaceNumAsync(ParkRemainSpaceNumRequest model);

	/** 
	 车辆布控
	 
	 @param model
	 @return 
	 简述：车辆被布控后，进出场时出入口岗亭会对车辆进行相应的布控措施，完善出入口管控场景；根据布控时间段进行管控，时间段为空时则全时段布控。        支持：支持通过车牌号或卡号进行车辆布控。
	*/
	Task<AlarmCarAdditionResponse> AlarmCarAdditionAsync(AlarmCarAdditionRequest model);

	/** 
	 取消车辆布控
	 
	 @param model
	 @return 
	 简述：车辆取消布控后，进出场和普通车辆一样，不再被布控。
	 支持：支持通过布控车辆编号集合取消车辆布控。
	*/
	Task<AlarmCarDeletionResponse> AlarmCarDeletionAsync(AlarmCarDeletionRequest model);

	/** 
	 查询布控车辆
	 
	 @param model
	 @return 
	*/
	Task<AlarmCarPageResponse> AlarmCarPageAsync(AlarmCarPageRequest model);
}