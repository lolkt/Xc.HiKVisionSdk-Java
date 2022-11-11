package xc.hikvisionsdk.isc.managers.resource.models.person;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 根据手机号码获取单个人员信息
*/
public class PhoneNoPersonInfoRequest extends BaseRequest
{
	/** 
	 电话号码
	*/
	private String PhoneNo;
	public final String getPhoneNo()
	{
		return PhoneNo;
	}
	public final void setPhoneNo(String value)
	{
		PhoneNo = value;
	}

	/** 
	 根据手机号码获取单个人员信息
	 
	 @param phoneNo 电话号码
	*/
	public PhoneNoPersonInfoRequest(String phoneNo)
	{
		setPhoneNo(phoneNo);
	}

	/** 
	 
	 
	 @exception System.ArgumentNullException
	 @exception System.ArgumentOutOfRangeException
	*/
	@Override
	public void CheckParams()
	{

		if (tangible.StringHelper.isNullOrWhiteSpace(getPhoneNo()))
		{
			throw new NullPointerException("PhoneNo");
		}

		if (getPhoneNo().length() != 11)
		{
			throw new IndexOutOfBoundsException("PhoneNo", "手机号长度为 11 位");
		}

	}
}