package xc.hikvisionsdk.isc.managers.resource.models.person;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 修改人员请求
*/
public class PersonSingleUpdateRequest extends PersonRequestBase
{

	/** 
	 修改人员请求
	*/
	public PersonSingleUpdateRequest()
	{

	}

	/** 
	 修改人员请求
	 
	 @param personId 人员id
	*/
	public PersonSingleUpdateRequest(String personId)
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