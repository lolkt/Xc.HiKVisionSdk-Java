package xc.hikvisionsdk.isc.managersv2.orgs.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.orgs.*;

/** 
 根据组织编号获取组织详细信息
*/
public class GetOrgListByIndexCodesRequest extends BaseRequest
{
	/** 
	 组织编号数组,从获取组织列表接口获取返回参数orgIndexCode，最大1000个
	*/
	private String[] OrgIndexCodes;
	public final String[] getOrgIndexCodes()
	{
		return OrgIndexCodes;
	}


	/** 
	 根据组织编号获取组织详细信息
	 
	 @param orgIndexCodes 组织编号数组
	*/
	public GetOrgListByIndexCodesRequest(String... orgIndexCodes)
	{
		if (orgIndexCodes == null || orgIndexCodes.length == 0)
		{
			throw new NullPointerException("orgIndexCodes");
		}
		if (orgIndexCodes.length > 1000)
		{
			throw new IndexOutOfBoundsException("orgIndexCodes", "最大1000个");

		}
		OrgIndexCodes = orgIndexCodes;
	}


}