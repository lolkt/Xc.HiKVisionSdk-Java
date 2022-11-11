package xc.hikvisionsdk.isc.managersv2.resources.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.resources.*;

/** 
 获取资源属性请求
*/
public class GetPropertiesRequest extends BaseRequest
{
	/** 
	 资源类型，当前版本支持,        person: 人员，region：区域，vehicle：车辆，organization：组织
	*/
	private String ResourceType;
	public final String getResourceType()
	{
		return ResourceType;
	}

	/** 
	 获取资源属性请求
	 
	 @param resourceType 资源类型，当前版本支持,        person: 人员，region：区域，vehicle：车辆，organization：组织
	*/
	public GetPropertiesRequest(String resourceType)
	{
		if (tangible.StringHelper.isNullOrEmpty(resourceType))
		{
			throw new NullPointerException("resourceType");
		}
		ResourceType = resourceType;
	}
}