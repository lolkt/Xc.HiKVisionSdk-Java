package xc.hikvisionsdk.isc.managers.resource.models.person;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 批量添加人员请求详细
*/
public class PersonBatchAddRequestItem extends PersonRequestBase implements ICheckRequestItem
{
	/** 
	 人员临时标志，
	 当调用方未指定personId时，clientId作为人员标志，在返回值中标志每个人员的添加结果。
	 所以每次接口调用，每个人员的clientid需保持唯一，1~10个字符，只支持数字。
	 注：clientid只对本次调用有效
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
	 
	 
	 @exception System.ArgumentNullException
	 @exception System.ArgumentOutOfRangeException
	*/
	public final void Check()
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