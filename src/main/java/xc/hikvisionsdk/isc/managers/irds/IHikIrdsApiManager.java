package xc.hikvisionsdk.isc.managers.irds;

import xc.hikvisionsdk.isc.managers.irds.models.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;

/** 
 卡片API
*/
public interface IHikIrdsApiManager
{

	/** 
	 获取单个卡片信息
	 
	 @param request
	 @return 
	 获取卡片列表接口可用来全量同步卡片信息，返回结果分页展示，不作权限过滤。
	 注：卡号为精确查找
	*/
	Task<CardInfoResponse> CardInfoAsync(CardInfoRequest request);




	/** 
	 查询卡片列表
	 
	 @param request
	 @return 
	 
	 查询卡片列表接口可以根据卡片号码、人员姓名、卡片状态、人员ID集合等查询条件来进行高级查询；若不指定查询条件，即全量获取所有的卡片信息。返回结果分页展示。
	 注：若指定多个查询条件，表示将这些查询条件进行"与”的组合后进行查询。
	 "人员名称personName”条件查询为模糊查询。
	 "卡片号码cardNo”条件查询为模糊查询。
	 
	*/
	Task<AdvanceCardListResponse> AdvanceCardListAsync(AdvanceCardListRequest request);



}