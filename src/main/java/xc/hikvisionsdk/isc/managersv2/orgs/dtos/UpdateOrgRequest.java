package xc.hikvisionsdk.isc.managersv2.orgs.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.orgs.*;
import java.util.*;

/** 
 修改组织请求
*/
public class UpdateOrgRequest extends BaseRequest
{

	private final HashMap<String, String> _parameters;

	/** 
	 组织标识，必须保证已存在，        从获取组织列表 接口获取返回参数orgIndexCode。
	*/
	private String OrgIndexCode;
	public final String getOrgIndexCode()
	{
		return OrgIndexCode;
	}

	/** 
	 组织名称，1~32个字符；不能包含<![CDATA[' / \ : * ? " < >]]>
	*/
	private String OrgName;
	public final String getOrgName()
	{
		return OrgName;
	}


	/** 
	 修改组织请求
	 
	 @param orgIndexCode 组织标识，必须保证已存在，        从获取组织列表 接口获取返回参数orgIndexCode。
	 @param orgName 组织名称，1~32个字符；不能包含<![CDATA[' / \ : * ? " < >]]></param>
	 @param parameters 其他扩展属性，键值对的方式
	*/

	public UpdateOrgRequest(String orgIndexCode, String orgName)
	{
		this(orgIndexCode, orgName, null);
	}

	public UpdateOrgRequest(String orgIndexCode)
	{
		this(orgIndexCode, "", null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public UpdateOrgRequest(string orgIndexCode, string orgName = "", Dictionary<string, string> parameters = null)
	public UpdateOrgRequest(String orgIndexCode, String orgName, HashMap<String, String> parameters)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(orgIndexCode))
		{
			throw new NullPointerException("orgIndexCode");
		}
		OrgIndexCode = orgIndexCode;
		OrgName = orgName;
		_parameters = parameters;
	}

	/** 
	 
	 
	 @return 
	*/
	@Override
	public String toString()
	{
		String para = "";

		if (_parameters != null && !_parameters.isEmpty())
		{
			StringBuilder sb = new StringBuilder();

			for (var key : _parameters.keySet())
			{
				if (tangible.StringHelper.isNullOrWhiteSpace(key))
				{
					throw new NullPointerException("", "扩展属性键不能为空");
				}
				if (key.Length > 1)
				{
					sb.append(String.format(",\"%1$s%2$s\":\"%3$s\"", key.First().toString().toLowerCase(), key.Substring(1), _parameters.get(key)));
				}
				else
				{
					sb.append(String.format(",\"%1$s\":\"%2$s\"", key.ToLower(), _parameters.get(key)));
				}
			}

			para = sb.toString();
		}


		return String.format("{\"orgIndexCode\":\"%1$s\",\"orgName\":\"%2$s\"%3$s", getOrgIndexCode(), getOrgName(), para}});
	}

}