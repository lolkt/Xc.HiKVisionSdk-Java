package xc.hikvisionsdk.isc.managers.resource.models.org;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 获取组织列表请求
*/
public class OrgListRequest extends PagedRequest
{
	/** 
	 获取组织列表请求
	*/
	public OrgListRequest()
	{
	}

	/** 
	 获取组织列表请求
	 
	 @param pageNo
	 @param pageSize
	*/
	public OrgListRequest(int pageNo, int pageSize)
	{
		super(pageNo, pageSize);

	}
}