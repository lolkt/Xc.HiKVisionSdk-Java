package xc.hikvisionsdk.isc.managersv2.persons.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.persons.*;

/** 
 获取组织下人员列表v2请求
*/
public class GetPersonListByOrgV2Request extends PagedRequest
{
	/** 
	 组织唯一标识码， 获取组织列表 接口获取
	*/
	private String OrgIndexCode;
	public final String getOrgIndexCode()
	{
		return OrgIndexCode;
	}

	/** 
	 获取组织下人员列表v2请求
	 
	 @param pageNo
	 @param pageSize
	 @param orgIndexCode 组织唯一标识码， 获取组织列表 接口获取
	 @exception ArgumentNullException
	*/
	public GetPersonListByOrgV2Request(int pageNo, int pageSize, String orgIndexCode)
	{
		super(pageNo, pageSize);
		if (tangible.StringHelper.isNullOrWhiteSpace(orgIndexCode))
		{
			throw new NullPointerException("orgIndexCode");
		}

		OrgIndexCode = orgIndexCode;
	}
}