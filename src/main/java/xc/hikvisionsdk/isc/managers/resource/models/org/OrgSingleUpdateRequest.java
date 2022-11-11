package xc.hikvisionsdk.isc.managers.resource.models.org;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 修改组织
*/
public class OrgSingleUpdateRequest extends BaseRequest
{


	/** 
	 组织标识，必须保证已存在，        
	 从获取组织列表 接口获取返回参数orgIndexCode。
	*/
	private String OrgIndexCode;
	public final String getOrgIndexCode()
	{
		return OrgIndexCode;
	}
	public final void setOrgIndexCode(String value)
	{
		OrgIndexCode = value;
	}

	/** 
	 组织名称，1~32个字符；不能包含 ' / \ : * ? " 
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
	 修改组织
	 
	 @param orgIndexCode 组织标识
	 @param orgName 组织名称，1~32个字符
	*/
	public OrgSingleUpdateRequest(String orgIndexCode, String orgName)
	{

		setOrgIndexCode(orgIndexCode);
		setOrgName(orgName);
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	*/
	@Override
	public void CheckParams()
	{

		if (tangible.StringHelper.isNullOrEmpty(getOrgIndexCode()))
		{
			throw new NullPointerException("OrgIndexCode");
		}
		if (tangible.StringHelper.isNullOrEmpty(getOrgName()))
		{
			throw new NullPointerException("OrgName");
		}

		super.CheckParams();
	}
}