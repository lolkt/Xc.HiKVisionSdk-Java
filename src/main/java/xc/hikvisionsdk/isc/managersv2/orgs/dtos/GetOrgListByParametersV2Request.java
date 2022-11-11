package xc.hikvisionsdk.isc.managersv2.orgs.dtos;

import xc.hikvisionsdk.consts.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.orgs.*;

/** 
 获取组织列表V2请求
*/
public class GetOrgListByParametersV2Request extends PagedRequest
{

	/** 
	 组织名称，支持模糊查询
	*/
	private String OrgName;
	public final String getOrgName()
	{
		return OrgName;
	}

	/** 
	 组织唯一标识码集合        多个值使用英文逗号分隔，不超过1000个，从获取组织列表接口获取返回参数orgIndexCode
	*/
	private String OrgIndexCodes;
	public final String getOrgIndexCodes()
	{
		return OrgIndexCodes;
	}
	private void setOrgIndexCodes(String value)
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
	private void setParentOrgIndexCodes(String value)
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
	/** 
	 查询表达式
	*/
	private RequestExpression[] Expressions;
	public final RequestExpression[] getExpressions()
	{
		return Expressions;
	}
	private void setExpressions(RequestExpression[] value)
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
	/** 
	 降序：desc
	 升序：asc
	*/
	private String OrderType;
	public final String getOrderType()
	{
		return OrderType;
	}


	/** 
	 获取组织列表V2请求
	 
	 @param pageNo
	 @param pageSize
	 @param orgName 组织名称，支持模糊查询
	 @param isSubOrg true时，搜索parentOrgIndexCodes的所有子孙组织；        false时，只搜索直接子组织
	 @param orderBy 排序字段，注意：排序字段必须是查询条件，否则返回参数错误
	 @param isAsc 升序
	*/

	public GetOrgListByParametersV2Request(int pageNo, int pageSize, String orgName, boolean isSubOrg, String orderBy)
	{
		this(pageNo, pageSize, orgName, isSubOrg, orderBy, null);
	}

	public GetOrgListByParametersV2Request(int pageNo, int pageSize, String orgName, boolean isSubOrg)
	{
		this(pageNo, pageSize, orgName, isSubOrg, "", null);
	}

	public GetOrgListByParametersV2Request(int pageNo, int pageSize, String orgName)
	{
		this(pageNo, pageSize, orgName, false, "", null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public GetOrgListByParametersV2Request(int pageNo, int pageSize, string orgName, bool isSubOrg = false, string orderBy = "", System.Nullable<bool> isAsc = null)
	public GetOrgListByParametersV2Request(int pageNo, int pageSize, String orgName, boolean isSubOrg, String orderBy, Boolean isAsc)
	{
		super(pageNo, pageSize);
		OrgName = orgName;
		IsSubOrg = isSubOrg;
		OrderBy = orderBy;

		if (isAsc != null)
		{
			if (tangible.StringHelper.isNullOrWhiteSpace(orderBy))
			{
				throw new NullPointerException("orderBy", "指定排序方式时，排序字段不可为空");
			}
			OrderType = OrderTypeConsts.GetOrderType(isAsc.booleanValue());
		}
	}

	/** 
	 使用组织唯一标识码集合
	 
	 @param orgIndexCodes 组织唯一标识码集合，多个值使用英文逗号分隔，不超过1000个，从获取组织列表接口获取返回参数orgIndexCode
	 @return 
	*/
	public final GetOrgListByParametersV2Request UseOrgIndexCodes(String... orgIndexCodes)
	{
		if (orgIndexCodes == null || orgIndexCodes.length == 0)
		{
			throw new NullPointerException("orgIndexCodes");
		}
		if (orgIndexCodes.length > 1000)
		{
			throw new IndexOutOfBoundsException("orgIndexCodes", "最大1000个");
		}
		setOrgIndexCodes(tangible.StringHelper.join(",", orgIndexCodes));
		return this;
	}

	/** 
	 使用父组织唯一标识集合
	 
	 @param parentOrgIndexCodes 父组织唯一标识集合，多个时使用英文逗号分隔，总数不超过1000个。指定parentOrgIndexCodes时会返回available值为false的父组织信息
	 @return 
	*/
	public final GetOrgListByParametersV2Request UseParentOrgIndexCodes(String... parentOrgIndexCodes)
	{
		if (parentOrgIndexCodes == null || parentOrgIndexCodes.length == 0)
		{
			throw new NullPointerException("parentOrgIndexCodes");
		}
		if (parentOrgIndexCodes.length > 1000)
		{
			throw new IndexOutOfBoundsException("parentOrgIndexCodes", "最大1000个");
		}
		setParentOrgIndexCodes(tangible.StringHelper.join(",", parentOrgIndexCodes));
		return this;
	}

	/** 
	 使用查询表达式
	 
	 @param expressions 查询表达式
	 @return 
	*/
	public final GetOrgListByParametersV2Request UseRequestExpression(RequestExpression... expressions)
	{
		if (expressions == null || expressions.length == 0)
		{
			throw new NullPointerException("expressions");
		}
		//if (expressions.Length > 1000)
		//{
		//    throw new ArgumentOutOfRangeException(nameof(expressions), "最大1000个");
		//}
		setExpressions(expressions);
		return this;
	}
}