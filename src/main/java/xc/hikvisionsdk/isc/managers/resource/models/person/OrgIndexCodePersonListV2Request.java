package xc.hikvisionsdk.isc.managers.resource.models.person;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 获取组织下人员列表v2请求
*/
public class OrgIndexCodePersonListV2Request extends PagedRequest
{
	/** 
	 组织唯一标识码， 获取组织列表 接口获取
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
	 获取组织下人员列表v2请求
	 
	 @param pageNo
	 @param pageSize
	 @param orgIndexCode 组织唯一标识码
	*/
	public OrgIndexCodePersonListV2Request(int pageNo, int pageSize, String orgIndexCode)
	{
		super(pageNo, pageSize);
		setOrgIndexCode(orgIndexCode);
	}

	/** 
	 
	 
	 @exception System.ArgumentNullException
	*/
	@Override
	public void CheckParams()
	{
		if (tangible.StringHelper.isNullOrEmpty(getOrgIndexCode()))
		{
			throw new NullPointerException("OrgIndexCode");
		}

		super.CheckParams();
	}

}