package xc.hikvisionsdk.isc.managers.resource.models.org;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 根据组织编号获取组织详细信息
*/
public class OrgInfoRequest extends BaseRequest
{
	/** 
	 组织编号数组,从获取组织列表接口获取返回参数orgIndexCode，最大1000个
	*/
	private String[] OrgIndexCodes;
	public final String[] getOrgIndexCodes()
	{
		return OrgIndexCodes;
	}
	public final void setOrgIndexCodes(String[] value)
	{
		OrgIndexCodes = value;
	}


	/** 
	 根据组织编号获取组织详细信息
	 
	 @param orgIndexCodes 组织编号数组
	*/
	public OrgInfoRequest(String... orgIndexCodes)
	{

		setOrgIndexCodes(orgIndexCodes);
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	 @exception ArgumentOutOfRangeException
	*/
	@Override
	public void CheckParams()
	{
		if (getOrgIndexCodes() == null || getOrgIndexCodes().length == 0)
		{
			throw new NullPointerException("OrgIndexCodes");
		}
		if (getOrgIndexCodes().length > 1000)
		{
			throw new IndexOutOfBoundsException("OrgIndexCodes", getOrgIndexCodes().length, "最大1000个");

		}
	}
}