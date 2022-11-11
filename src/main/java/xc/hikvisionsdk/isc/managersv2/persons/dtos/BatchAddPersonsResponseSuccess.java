package xc.hikvisionsdk.isc.managersv2.persons.dtos;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.persons.*;

/** 
 成功信息
*/
public class BatchAddPersonsResponseSuccess
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
	private String PersonId;
	public final String getPersonId()
	{
		return PersonId;
	}
	public final void setPersonId(String value)
	{
		PersonId = value;
	}
}