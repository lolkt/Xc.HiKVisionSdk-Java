package xc.hikvisionsdk.isc.managersv2.resources;

import xc.hikvisionsdk.isc.managersv2.resources.dtos.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 资源属性接口
 <list type="bullet">
 <item>
 <term>GetPropertiesAsync</term>
 <description>获取资源属性</description>
 </item>
 <item>
 <term>GetOnlineHistoryAsync</term>
 <description>获取资源的历史在线记录</description>
 </item>
 </list>
*/
public interface IHikResourceManager
{
	/** 
	 获取资源属性
	 
	 @param request 请求
	 @return 
	 查询当前平台指定资源已定义的属性信息集合， 适用于平台资源自定义属性的场景， 部分接口需要使用这部分自定义属性。
	*/
	Task<GetPropertiesResponse> GetPropertiesAsync(GetPropertiesRequest request);

	/** 
	 获取资源的历史在线记录
	 
	 @param request 请求
	 @return 
	 获取资源的历史在线记录接口
	*/
	Task<GetOnlineHistoryResponse> GetOnlineHistoryAsync(GetOnlineHistoryRequest request);
}