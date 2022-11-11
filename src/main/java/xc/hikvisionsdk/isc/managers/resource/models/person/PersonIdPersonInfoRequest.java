package xc.hikvisionsdk.isc.managers.resource.models.person;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 根据人员编号获取单个人员信息请求
*/
public class PersonIdPersonInfoRequest extends BaseRequest
{
	/** 
	 人员ID, 获取人员列表v2 接口获取
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
	 根据人员编号获取单个人员信息请求
	 
	 @param personId 人员ID
	*/
	public PersonIdPersonInfoRequest(String personId)
	{
		setPersonId(personId);
	}

	/** 
	 
	 
	 @exception System.ArgumentNullException
	*/
	@Override
	public void CheckParams()
	{

		if (tangible.StringHelper.isNullOrWhiteSpace(getPersonId()))
		{
			throw new NullPointerException("PersonId");
		}
	}
}