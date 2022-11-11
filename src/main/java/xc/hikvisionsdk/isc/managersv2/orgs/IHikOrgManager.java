package xc.hikvisionsdk.isc.managersv2.orgs;

import xc.hikvisionsdk.isc.managersv2.orgs.dtos.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 组织管理
 <list type="bullet">
 <item>
 <term>UpdateAsync</term>
 <description>修改组织</description>
 </item>
 <item>
 <term>BatchDeleteAsync</term>
 <description>批量删除组织</description>
 </item>
 <item>
 <term>BatchAddAsync</term>
 <description>批量添加组织</description>
 </item>
 <item>
 <term>GetRootAsync</term>
 <description>获取根组织</description>
 </item>
 <item>
 <term>GetListAsync</term>
 <description>获取组织列表</description>
 </item>
 <item>
 <term>GetListByParametersV2Async</term>
 <description>查询组织列表v2</description>
 </item>
 <item>
 <term>GetSubListAsync</term>
 <description>根据父组织编号获取下级组织列表</description>
 </item>
 <item>
 <term>GetListByTimeRangeAsync</term>
 <description>增量获取组织数据</description>
 </item>
 <item>
 <term>GetListByIndexCodesAsync</term>
 <description>根据组织编号获取组织详细信息</description>
 </item>
 </list>
*/
public interface IHikOrgManager
{
	/** 
	 修改组织
	 
	 @param request 请求
	 @return 
	 根据组织编号修改组织信息。其它扩展属性按照定义以 key：value 上传即可，根据获取资源属性接口查询平台已配置的资源属性
	*/

	Task<UpdateOrgResponse> UpdateAsync(UpdateOrgRequest request);

	/** 
	 批量删除组织
	 
	 @param request 请求
	 @return 
	 仅支持删除无子结点且组织下不存在人员的组织。
	*/
	Task<BatchDeleteOrgsResponse> BatchDeleteAsync(BatchDeleteOrgsRequest request);

	/** 
	 批量添加组织
	 
	 @param request 请求
	 @return 
	 支持三方指定组织唯一标识， 也支持ISC独立生成组织唯一标识。
	*/
	Task<BatchAddOrgsResponse> BatchAddAsync(BatchAddOrgsRequest request);

	/** 
	 获取根组织
	 
	 @return 
	 获取根组织接口用来获取组织的根节点。
	*/
	Task<GetRootOrgResponse> GetRootAsync();

	/** 
	 获取组织列表
	 
	 @param request 请求
	 @return 
	 根据该接口全量同步组织信息,不作权限过滤，返回结果分页展示。
	*/
	Task<GetOrgListResponse> GetListAsync(GetOrgListRequest request);

	/** 
	 获取组织列表v2
	 
	 @param request 请求
	 @return 
	 根据不同的组织属性分页查询组织信息。        查询组织列表接口可以根据组织唯一标识集、组织名称、组织状态等查询条件来进行高级查询。
	*/
	Task<GetOrgListByParametersV2Response> GetListByParametersV2Async(GetOrgListByParametersV2Request request);

	/** 
	 根据父组织编号获取下级组织列表
	 
	 @param request 请求
	 @return 
	 根据父组织编号获取下级组织列表，主要用于逐层获取父组织的下级组织信息，返回结果分页展示
	*/
	Task<GetSubOrgListResponse> GetSubListAsync(GetSubOrgListRequest request);

	/** 
	 增量获取组织数据
	 
	 @param request 请求
	 @return 
	 根据查询条件查询组织列表信息，主要根据时间段分页获取组织数据，包含已删除数据。其中开始日期与结束日期的时间差必须在1-48小时内。
	*/
	Task<GetOrgListByTimeRangeResponse> GetListByTimeRangeAsync(GetOrgListByTimeRangeRequest request);

	/** 
	 根据组织编号获取组织详细信息
	 
	 @param request 请求
	 @return 
	 根据组织编号orgIndexCode列表获取指定的组织信息，如存在多组织则返回总条数及多组织信息。
	*/
	Task<GetOrgListByIndexCodesResponse> GetListByIndexCodesAsync(GetOrgListByIndexCodesRequest request);
}