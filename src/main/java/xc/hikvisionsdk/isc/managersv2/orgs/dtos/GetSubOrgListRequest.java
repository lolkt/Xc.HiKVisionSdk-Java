package xc.hikvisionsdk.isc.managersv2.orgs.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.orgs.*;

/** 
 根据父组织编号获取下级组织列表请求
*/
public class GetSubOrgListRequest extends PagedRequest
{
	/** 
	 父组织编号，        从获取组织列表 接口获取返回参数orgIndexCode
	*/
	private String ParentOrgIndexCode;
	public final String getParentOrgIndexCode()
	{
		return ParentOrgIndexCode;
	}

	/** 
	 根据父组织编号获取下级组织列表请求
	 
	 @param pageNo
	 @param pageSize
	 @param parentOrgIndexCode
	*/
	public GetSubOrgListRequest(int pageNo, int pageSize, String parentOrgIndexCode)
	{
		super(pageNo, pageSize);
		if (tangible.StringHelper.isNullOrWhiteSpace(parentOrgIndexCode))
		{
			throw new NullPointerException("parentOrgIndexCode");
		}
		ParentOrgIndexCode = parentOrgIndexCode;
	}
}