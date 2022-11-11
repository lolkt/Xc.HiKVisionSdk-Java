package xc.hikvisionsdk.isc.managersv2.orgs.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.orgs.*;

/** 
 获取组织列表请求
*/
public class GetOrgListRequest extends PagedRequest
{


	/** 
	 获取组织列表请求
	 
	 @param pageNo
	 @param pageSize
	*/
	public GetOrgListRequest(int pageNo, int pageSize)
	{
		super(pageNo, pageSize);

	}
}