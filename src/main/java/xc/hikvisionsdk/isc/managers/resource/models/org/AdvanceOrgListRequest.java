package xc.hikvisionsdk.isc.managers.resource.models.org;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 高级查询请求
*/
public class AdvanceOrgListRequest extends PagedRequest
{

	/** 
	 组织名称，支持模糊查询
	*/
	private String OrgName;
	public final String getOrgName()
	{
		return OrgName;
	}
	public final void setOrgName(String value)
	{
		OrgName = value;
	}

	/** 
	 组织唯一标识码集合        
	 多个值使用英文逗号分隔，不超过1000个，从获取组织列表接口获取返回参数orgIndexCode
	*/
	private String OrgIndexCodes;
	public final String getOrgIndexCodes()
	{
		return OrgIndexCodes;
	}
	public final void setOrgIndexCodes(String value)
	{
		OrgIndexCodes = value;
	}

	/** 
	 高级查询请求
	 
	 @param pageNo
	 @param pageSize
	*/
	public AdvanceOrgListRequest(int pageNo, int pageSize)
	{
		super(pageNo, pageSize);
	}
}