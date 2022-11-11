package xc.hikvisionsdk.isc.managers.resource.models.org;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 高级查询请求
*/
public class AdvanceOrgListV2Request extends PagedRequest
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
	 组织唯一标识码集合        多个值使用英文逗号分隔，不超过1000个，从获取组织列表接口获取返回参数orgIndexCode
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
	 父组织唯一标识集合，多个时使用英文逗号分隔，总数不超过1000个。指定parentOrgIndexCodes时会返回available值为false的父组织信息
	*/
	private String ParentOrgIndexCodes;
	public final String getParentOrgIndexCodes()
	{
		return ParentOrgIndexCodes;
	}
	public final void setParentOrgIndexCodes(String value)
	{
		ParentOrgIndexCodes = value;
	}
	/** 
	  	true时，搜索parentOrgIndexCodes的所有子孙组织；        false时，只搜索直接子组织
	*/
	private boolean IsSubOrg;
	public final boolean isSubOrg()
	{
		return IsSubOrg;
	}
	public final void setSubOrg(boolean value)
	{
		IsSubOrg = value;
	}
	/** 
	 查询表达式
	*/
	private RequestExpression[] Expressions;
	public final RequestExpression[] getExpressions()
	{
		return Expressions;
	}
	public final void setExpressions(RequestExpression[] value)
	{
		Expressions = value;
	}

	/** 
	 排序字段，注意：排序字段必须是查询条件，否则返回参数错误
	*/
	private String OrderBy;
	public final String getOrderBy()
	{
		return OrderBy;
	}
	public final void setOrderBy(String value)
	{
		OrderBy = value;
	}
	/** 
	 降序：desc
	 升序：asc
	*/
	private String OrderType;
	public final String getOrderType()
	{
		return OrderType;
	}
	public final void setOrderType(String value)
	{
		OrderType = value;
	}

	/** 
	 
	 
	 @param pageNo
	 @param pageSize
	*/
	public AdvanceOrgListV2Request(int pageNo, int pageSize)
	{
		super(pageNo, pageSize);
	}

}