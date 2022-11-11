package xc.hikvisionsdk.isc.managers.resource.models.org;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 批量添加人员请求详细
*/
public class OrgBatchAddRequestItem
{
	/** 
	 调用方指定标识，接口执行成功后将服务端生成的标识与此标识绑定后返回
	 所以建议每次接口调用，clientid保持唯一。1~10个字符，只支持数字。
	 注释：ISC不对clientid做校验和存储
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
	 组织唯一标志，不允许与其它组织唯一标志重复，包括已删除的组织，值为空或者不传此字段系统自动生成唯一标志
	*/
	private String OrgIndexCode;
	public final String getOrgIndexCode()
	{
		return OrgIndexCode;
	}
	public final void setOrgIndexCode(String value)
	{
		OrgIndexCode = value;
	}
	/** 
	 组织名称，1~32个字符；不能包含 ' / \ : * ? " 
	*/
	private String OrgName;
	public final String getOrgName()
	{
		return OrgName;
	}
	public final void setOrgName(String value)
	{
		OrgName = value;
	}
	/** 
	 父组织唯一标识码
	*/
	private String ParentIndexCode = "root000000";
	public final String getParentIndexCode()
	{
		return ParentIndexCode;
	}
	public final void setParentIndexCode(String value)
	{
		ParentIndexCode = value;
	}
	/** 
	 组织编码，当添加小区节点时必填，编码使用01101开头的8位数字编码，当添加楼栋单元时必填，编码使用01101开头的20位数字编码，        其它场景下改值无效
	*/
	private String OrgCode;
	public final String getOrgCode()
	{
		return OrgCode;
	}
	public final void setOrgCode(String value)
	{
		OrgCode = value;
	}

	/** 
	 组织名称
	 
	 @param orgName 组织名称，1~32个字符；不能包含 ' / \ : * ? "</param>
	 @param clientId 调用方指定标识，接口执行成功后将服务端生成的标识与此标识绑定后返回
	*/

	public OrgBatchAddRequestItem(String orgName)
	{
		this(orgName, 0);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public OrgBatchAddRequestItem(string orgName, int clientId = 0)
	public OrgBatchAddRequestItem(String orgName, int clientId)
	{
		setOrgName(orgName);
		setClientId(clientId);
	}

	/** 
	 
	 
	 @param orgName 组织名称，1~32个字符；不能包含 ' / \ : * ? "</param>
	 @param orgIndexCode 组织唯一标志，不允许与其它组织唯一标志重复，包括已删除的组织，值为空或者不传此字段系统自动生成唯一标志
	 @param parentIndexCode 父组织唯一标识码
	 @param clientId 调用方指定标识，接口执行成功后将服务端生成的标识与此标识绑定后返回
	 @param orgCode 组织编码，当添加小区节点时必填，编码使用01101开头的8位数字编码，当添加楼栋单元时必填，编码使用01101开头的20位数字编码
	*/

	public OrgBatchAddRequestItem(String orgName, String orgIndexCode, String parentIndexCode, int clientId)
	{
		this(orgName, orgIndexCode, parentIndexCode, clientId, "");
	}

	public OrgBatchAddRequestItem(String orgName, String orgIndexCode, String parentIndexCode)
	{
		this(orgName, orgIndexCode, parentIndexCode, 0, "");
	}

	public OrgBatchAddRequestItem(String orgName, String orgIndexCode)
	{
		this(orgName, orgIndexCode, "root000000", 0, "");
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public OrgBatchAddRequestItem(string orgName, string orgIndexCode, string parentIndexCode = "root000000", int clientId = 0, string orgCode = "")
	public OrgBatchAddRequestItem(String orgName, String orgIndexCode, String parentIndexCode, int clientId, String orgCode)
	{
		this(orgName, clientId);
		setOrgIndexCode(orgIndexCode);
		setParentIndexCode(parentIndexCode);
		setOrgCode(orgCode);
	}


}