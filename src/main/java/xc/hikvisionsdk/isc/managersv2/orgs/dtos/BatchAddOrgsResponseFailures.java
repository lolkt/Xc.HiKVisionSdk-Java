package xc.hikvisionsdk.isc.managersv2.orgs.dtos;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.orgs.*;

/** 
 批量添加失败的记录
*/
public class BatchAddOrgsResponseFailures
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
	 错误信息
	*/
	private String Message;
	public final String getMessage()
	{
		return Message;
	}
	public final void setMessage(String value)
	{
		Message = value;
	}
}