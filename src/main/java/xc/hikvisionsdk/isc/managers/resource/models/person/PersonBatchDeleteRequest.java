package xc.hikvisionsdk.isc.managers.resource.models.person;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 批量删除人员请求
*/
public class PersonBatchDeleteRequest extends BaseRequest
{
	/** 
	 人员Id，单次操作上限为1000条。
	 获取人员列表v2 接口获取返回参数personId
	*/
	private String[] PersonIds;
	public final String[] getPersonIds()
	{
		return PersonIds;
	}
	public final void setPersonIds(String[] value)
	{
		PersonIds = value;
	}

	/** 
	 批量删除人员请求
	 
	 @param personIds 人员Id，单次操作上限为1000条
	*/
	public PersonBatchDeleteRequest(String... personIds)
	{
		setPersonIds(personIds);
	}

	/** 
	 
	 
	 @exception System.ArgumentNullException
	 @exception System.ArgumentOutOfRangeException
	*/
	@Override
	public void CheckParams()
	{
		if (getPersonIds() == null)
		{
			throw new NullPointerException("PersonIds");
		}
		if (getPersonIds().length == 0 || getPersonIds().length > 1000)
		{
			throw new IndexOutOfBoundsException("PersonIds", "单次操作上限为1000条");

		}
	}
}