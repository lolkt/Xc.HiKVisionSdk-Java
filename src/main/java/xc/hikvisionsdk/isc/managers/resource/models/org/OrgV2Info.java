package xc.hikvisionsdk.isc.managers.resource.models.org;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
  组织请求数据V2
*/
public class OrgV2Info
{
	/** 
	 组织唯一标识码
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
	 组织编号
	*/
	private String OrganizationCode;
	public final String getOrganizationCode()
	{
		return OrganizationCode;
	}
	public final void setOrganizationCode(String value)
	{
		OrganizationCode = value;
	}
	/** 
	 组织名称，如默认部门
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
	 组织路径，例如：默认部门/综合安防/开发小组
	*/
	private String OrgPath;
	public final String getOrgPath()
	{
		return OrgPath;
	}
	public final void setOrgPath(String value)
	{
		OrgPath = value;
	}
	/** 
	 父组织唯一标识码
	*/
	private String ParentOrgIndexCode;
	public final String getParentOrgIndexCode()
	{
		return ParentOrgIndexCode;
	}
	public final void setParentOrgIndexCode(String value)
	{
		ParentOrgIndexCode = value;
	}

	/** 
	 更新时间 要求遵守ISO8601标准
	 如2018-07-26T21:30:08.000+08:00 表示北京时间2017年7月26日21时30分08秒
	*/
	private String UpdateTime;
	public final String getUpdateTime()
	{
		return UpdateTime;
	}
	public final void setUpdateTime(String value)
	{
		UpdateTime = value;
	}


	/** 
	 用于标识组织节点是否有权限操作，true：有权限，false：无权限
	*/
	private boolean Available;
	public final boolean getAvailable()
	{
		return Available;
	}
	public final void setAvailable(boolean value)
	{
		Available = value;
	}
	/** 
	 标识组织节点是否叶子节点，true：为叶子结点，false：非叶子结点
	*/
	private boolean Leaf;
	public final boolean getLeaf()
	{
		return Leaf;
	}
	public final void setLeaf(boolean value)
	{
		Leaf = value;
	}
	/** 
	 同级区域顺序，数据展示按照sort正序排列
	*/
	private int Sort;
	public final int getSort()
	{
		return Sort;
	}
	public final void setSort(int value)
	{
		Sort = value;
	}
	/** 
	 创建时间，IOS8601格式
	*/
	private String CreateTime;
	public final String getCreateTime()
	{
		return CreateTime;
	}
	public final void setCreateTime(String value)
	{
		CreateTime = value;
	}
	/** 
	 资源状态，小于0则代表资源已被删除，0代表有效资源
	*/
	private int Status;
	public final int getStatus()
	{
		return Status;
	}
	public final void setStatus(int value)
	{
		Status = value;
	}


}