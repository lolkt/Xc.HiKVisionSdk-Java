package xc.hikvisionsdk.isc.managers.resource.models.person;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 批量删除人员结果数据
*/
public class PersonBatchDeleteResponseData
{
	/** 
	 人员标志
	*/
	private String PersonId;
	public final String getPersonId()
	{
		return PersonId;
	}
	public final void setPersonId(String value)
	{
		PersonId = value;
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