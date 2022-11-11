package xc.hikvisionsdk.isc.managers.resource.models.org;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 组织请求数据
*/
public class OrgInfo
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
	private String OrgNo;
	public final String getOrgNo()
	{
		return OrgNo;
	}
	public final void setOrgNo(String value)
	{
		OrgNo = value;
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
	 父组织名称
	*/
	private String ParentOrgName;
	public final String getParentOrgName()
	{
		return ParentOrgName;
	}
	public final void setParentOrgName(String value)
	{
		ParentOrgName = value;
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


}