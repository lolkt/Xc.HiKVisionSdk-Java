package xc.hikvisionsdk.isc.managers.resource.models.person;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 添加人员请求
*/
public class PersonSingleAddRequest extends PersonRequestBase
{
	/** 
	 人脸信息
	*/
	private FaceInfo[] Faces;
	public final FaceInfo[] getFaces()
	{
		return Faces;
	}
	public final void setFaces(FaceInfo[] value)
	{
		Faces = value;
	}


	/** 
	 添加人员请求
	*/
	public PersonSingleAddRequest()
	{
	}

	/** 
	 添加人员请求
	 
	 @param personName 人员名称
	 @param orgIndexCode 所属组织标识
	*/
	public PersonSingleAddRequest(String personName, String orgIndexCode)
	{
		setPersonName(personName);
		setOrgIndexCode(orgIndexCode);
	}

	/** 
	 
	 
	 @exception System.ArgumentNullException
	 @exception System.ArgumentOutOfRangeException
	*/
	@Override
	public void CheckParams()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getPersonName()))
		{
			throw new NullPointerException("PersonName");
		}
		if (getPersonName().length() > 32)
		{
			throw new IndexOutOfBoundsException("PersonName", "1~32个字符；不能包含 ’ / \\ : * ? \" < > ");
		}

		if (tangible.StringHelper.isNullOrWhiteSpace(getOrgIndexCode()))
		{
			throw new NullPointerException("OrgIndexCode");
		}
	}

}