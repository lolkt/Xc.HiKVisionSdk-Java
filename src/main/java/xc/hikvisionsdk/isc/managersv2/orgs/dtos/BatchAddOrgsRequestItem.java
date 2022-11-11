package xc.hikvisionsdk.isc.managersv2.orgs.dtos;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.orgs.*;

/** 
 批量添加人员请求详细
*/
public class BatchAddOrgsRequestItem
{
	//TODO: 扩展参数
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
	private void setClientId(int value)
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
	/** 
	 组织名称，1~32个字符；不能包含<![CDATA[ ' / \ : * ? " < >]]>
	*/
	private String OrgName;
	public final String getOrgName()
	{
		return OrgName;
	}
	/** 
	 父组织唯一标识码
	*/
	private String ParentIndexCode = "root000000";
	public final String getParentIndexCode()
	{
		return ParentIndexCode;
	}
	/** 
	 组织编码，当添加小区节点时必填，编码使用01101开头的8位数字编码，当添加楼栋单元时必填，编码使用01101开头的20位数字编码，其它场景下改值无效
	*/
	private String OrgCode;
	public final String getOrgCode()
	{
		return OrgCode;
	}

	/** 
	 批量添加人员请求详细
	 
	 @param orgName 组织名称，1~32个字符；不能包含<![CDATA[ ' / \ : * ? " < >]]> </param>
	 @param parentIndexCode 父组织唯一标识码
	 @param orgIndexCode 组织唯一标志，不允许与其它组织唯一标志重复，包括已删除的组织，值为空或者不传此字段系统自动生成唯一标志
	 @param orgCode 组织编码，当添加小区节点时必填，编码使用01101开头的8位数字编码，当添加楼栋单元时必填，编码使用01101开头的20位数字编码
	 @param clientId 调用方指定标识，接口执行成功后将服务端生成的标识与此标识绑定后返回
	*/

	public BatchAddOrgsRequestItem(String orgName, String parentIndexCode, String orgIndexCode, String orgCode)
	{
		this(orgName, parentIndexCode, orgIndexCode, orgCode, 0);
	}

	public BatchAddOrgsRequestItem(String orgName, String parentIndexCode, String orgIndexCode)
	{
		this(orgName, parentIndexCode, orgIndexCode, "", 0);
	}

	public BatchAddOrgsRequestItem(String orgName, String parentIndexCode)
	{
		this(orgName, parentIndexCode, "", "", 0);
	}

	public BatchAddOrgsRequestItem(String orgName)
	{
		this(orgName, "root000000", "", "", 0);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public BatchAddOrgsRequestItem(string orgName, string parentIndexCode = "root000000", string orgIndexCode = "", string orgCode = "", int clientId = 0)
	public BatchAddOrgsRequestItem(String orgName, String parentIndexCode, String orgIndexCode, String orgCode, int clientId)
	{
		OrgIndexCode = orgIndexCode;
		ParentIndexCode = parentIndexCode;
		OrgCode = orgCode;
		OrgName = orgName;
		setClientId(clientId);
	}

	/** 
	 设置ClientId
	 
	 @param clientId
	*/
	public final void SetClientId(int clientId)
	{
		setClientId(clientId);
	}

}