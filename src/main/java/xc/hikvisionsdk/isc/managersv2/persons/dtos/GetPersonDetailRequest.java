package xc.hikvisionsdk.isc.managersv2.persons.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.persons.*;

/** 
 根据人员唯一字段获取人员详细信息请求
*/
public class GetPersonDetailRequest extends BaseRequest
{

	/** 
	 参数名        certificateNo：证件号码，从获取人员列表v2接口返回报文中的certificateNo字段        personId：人员Id，从获取人员列表v2接口返回报文中的personId字段；phoneNo：手机号码，从获取人员列表v2接口返回报文中的phoneNo字段；jobNo：工号，从获取人员列表v2接口返回报文中的jobNo字段。
	*/
	private String ParamName;
	public final String getParamName()
	{
		return ParamName;
	}

	/** 
	 根据入参传对应的值，最大1000个
	*/
	private String[] ParamValue;
	public final String[] getParamValue()
	{
		return ParamValue;
	}

	/** 
	 根据人员唯一字段获取人员详细信息请求
	 
	 @param paramName 参数名  certificateNo：证件号码，从获取人员列表v2接口返回报文中的certificateNo字段        personId：人员Id，从获取人员列表v2接口返回报文中的personId字段；phoneNo：手机号码，从获取人员列表v2接口返回报文中的phoneNo字段；jobNo：工号，从获取人员列表v2接口返回报文中的jobNo字段。
	 @param paramValue 根据入参传对应的值，最大1000个
	 @exception ArgumentNullException
	 @exception ArgumentOutOfRangeException
	*/
	public GetPersonDetailRequest(String paramName, String... paramValue)
	{

		if (tangible.StringHelper.isNullOrWhiteSpace(paramName))
		{
			throw new NullPointerException("paramName");
		}

		paramName = paramName.toLowerCase().strip();

		if (!paramName.equals("certificateNo") && !paramName.equals("personId") && !paramName.equals("phoneNo") && !paramName.equals("jobNo"))
		{
			throw new IndexOutOfBoundsException("paramName", paramName, "只能是 certificateNo,personId,phoneNo,jobNo 之一");
		}

		if (paramValue == null || paramValue.length == 0)
		{
			throw new NullPointerException("paramValue");
		}

		if (paramValue.length > 1000)
		{
			throw new IndexOutOfBoundsException("paramValue", paramValue.length, "最大1000个");
		}


		ParamName = paramName;
		ParamValue = paramValue;
	}

}