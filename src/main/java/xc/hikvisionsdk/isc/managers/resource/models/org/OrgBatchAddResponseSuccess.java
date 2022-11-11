package xc.hikvisionsdk.isc.managers.resource.models.org;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 批量添加成功的记录
*/
public class OrgBatchAddResponseSuccess
{
	/** 
	 调用方指定人员临时标志
	*/
	private int ClientId;
	public final int getClientId()
	{
		return ClientId;
	}
	public final void setClientId(int value)
	{
		ClientId = value;
	}
	/** 
	 服务端生成的唯一标识
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
}