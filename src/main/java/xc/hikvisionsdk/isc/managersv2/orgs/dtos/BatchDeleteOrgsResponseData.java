package xc.hikvisionsdk.isc.managersv2.orgs.dtos;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.orgs.*;

/** 
 批量删除组织结果数据
*/
public class BatchDeleteOrgsResponseData
{
	/** 
	 组织标志
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
	 错误码
	*/
	private String Code;
	public final String getCode()
	{
		return Code;
	}
	public final void setCode(String value)
	{
		Code = value;
	}
	/** 
	 错误消息
	*/
	private String Msg;
	public final String getMsg()
	{
		return Msg;
	}
	public final void setMsg(String value)
	{
		Msg = value;
	}
}