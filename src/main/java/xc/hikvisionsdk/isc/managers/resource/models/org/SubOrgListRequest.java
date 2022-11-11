package xc.hikvisionsdk.isc.managers.resource.models.org;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 根据父组织编号获取下级组织列表请求
*/
public class SubOrgListRequest extends PagedRequest
{
	/** 
	 父组织编号，        
	 从获取组织列表 接口获取返回参数orgIndexCode
	*/
	private String ParentOrgIndexCode;
	public final String getParentOrgIndexCode()
	{
		return ParentOrgIndexCode;
	}
	public final void setParentOrgIndexCode(String value)
	{
		ParentOrgIndexCode = value;
	}

	/** 
	 根据父组织编号获取下级组织列表请求
	*/
	public SubOrgListRequest()
	{
	}

	/** 
	 根据父组织编号获取下级组织列表请求
	 
	 @param parentOrgIndexCode 父组织编号
	 @param pageNo 当前页码
	 @param pageSize 每页记录总数
	*/
	public SubOrgListRequest(String parentOrgIndexCode, int pageNo, int pageSize)
	{
		super(pageNo, pageSize);
		setParentOrgIndexCode(parentOrgIndexCode);
	}


}