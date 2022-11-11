package xc.hikvisionsdk.isc.managers.acs;

import xc.hikvisionsdk.isc.managers.acs.models.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;

/** 
 门禁api
*/
public interface IHikAcsApiManager
{
	/** 
	 查询门禁点事件
	 
	 @param model
	 @return 
	 功能描述：该接口可以查询发生在门禁点上的人员出入事件，支持多个维度来查询，支持按时间、人员、门禁点、事件类型四个维度来查询；其中按事件类型来查询的方式，如果查询不到事件，存在两种情况，一种是该类型的事件没有发生过，所以查询不到，还有一种情况，该类型的事件发生过，但是由于门禁管理组件对该事件类型订阅配置处于关闭状态，所以不会存储该类型的事件，导致查询不到，对于这种情况，需要到门禁管理组件中，将该事件类型的订阅配置打开。
	*/
	Task<DoorEventsResponse> DoorEventsAsync(DoorEventsRequest model);
	/** 
	 查询门禁点事件v2
	 
	 功能描述：该接口可以查询发生在门禁点上的人员出入事件，支持多个维度来查询，支持按时间、人员、门禁点、事件类型四个维度来查询；其中按事件类型来查询的方式，如果查询不到事件，存在两种情况，一种是该类型的事件没有发生过，所以查询不到，还有一种情况，该类型的事件发生过，但是由于门禁管理组件对该事件类型订阅配置处于关闭状态，所以不会存储该类型的事件，导致查询不到，对于这种情况，需要到门禁管理组件中，将该事件类型的订阅配置打开。
	 @param model
	 @return 
	*/
	Task<DoorEventsV2Response> DoorEventsV2Async(DoorEventsV2Request model);

	/** 
	 查询门禁点列表v2
	 
	 @param model
	 @return 
	 根据条件查询目录下有权限的门禁点列表。当返回字段对应的值为空时，该字段不返回。
	*/
	Task<DoorSearchV2Response> DoorSearchV2Async(DoorSearchV2Request model);


}