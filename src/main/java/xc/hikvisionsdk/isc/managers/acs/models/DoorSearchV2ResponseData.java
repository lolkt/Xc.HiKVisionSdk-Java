package xc.hikvisionsdk.isc.managers.acs.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.acs.*;

/** 
 查询门禁点V2结果数据
*/
public class DoorSearchV2ResponseData
{
	/** 
	 资源唯一编码
	*/
	private String IndexCode;
	public final String getIndexCode()
	{
		return IndexCode;
	}
	public final void setIndexCode(String value)
	{
		IndexCode = value;
	}
	/** 
	 资源类型，详见附录A.2 资源类型
	*/
	private String ResourceType;
	public final String getResourceType()
	{
		return ResourceType;
	}
	public final void setResourceType(String value)
	{
		ResourceType = value;
	}
	/** 
	 资源名称
	*/
	private String Name;
	public final String getName()
	{
		return Name;
	}
	public final void setName(String value)
	{
		Name = value;
	}
	/** 
	 门禁点编号
	*/
	private String DoorNo;
	public final String getDoorNo()
	{
		return DoorNo;
	}
	public final void setDoorNo(String value)
	{
		DoorNo = value;
	}
	/** 
	 通道号
	*/
	private String ChannelNo;
	public final String getChannelNo()
	{
		return ChannelNo;
	}
	public final void setChannelNo(String value)
	{
		ChannelNo = value;
	}
	/** 
	 父级资源编号
	*/
	private String ParentIndexCode;
	public final String getParentIndexCode()
	{
		return ParentIndexCode;
	}
	public final void setParentIndexCode(String value)
	{
		ParentIndexCode = value;
	}
	/** 
	 一级控制器id
	*/
	private String ControlOneId;
	public final String getControlOneId()
	{
		return ControlOneId;
	}
	public final void setControlOneId(String value)
	{
		ControlOneId = value;
	}
	/** 
	 二级控制器id
	*/
	private String ControlTwoId;
	public final String getControlTwoId()
	{
		return ControlTwoId;
	}
	public final void setControlTwoId(String value)
	{
		ControlTwoId = value;
	}
	/** 
	 读卡器1
	*/
	private String ReaderInId;
	public final String getReaderInId()
	{
		return ReaderInId;
	}
	public final void setReaderInId(String value)
	{
		ReaderInId = value;
	}
	/** 
	 读卡器2
	*/
	private String ReaderOutId;
	public final String getReaderOutId()
	{
		return ReaderOutId;
	}
	public final void setReaderOutId(String value)
	{
		ReaderOutId = value;
	}
	/** 
	 接入协议，详见附录A.6 编码设备接入协议
	*/
	private String TreatyType;
	public final String getTreatyType()
	{
		return TreatyType;
	}
	public final void setTreatyType(String value)
	{
		TreatyType = value;
	}
	/** 
	 门序号
	*/
	private Integer DoorSerial = null;
	public final Integer getDoorSerial()
	{
		return DoorSerial;
	}
	public final void setDoorSerial(Integer value)
	{
		DoorSerial = value;
	}
	/** 
	 所属区域
	*/
	private String RegionIndexCode;
	public final String getRegionIndexCode()
	{
		return RegionIndexCode;
	}
	public final void setRegionIndexCode(String value)
	{
		RegionIndexCode = value;
	}
	/** 
	 所属区域路径,以@符号分割，包含本节点
	*/
	private String RegionPath;
	public final String getRegionPath()
	{
		return RegionPath;
	}
	public final void setRegionPath(String value)
	{
		RegionPath = value;
	}
	/** 
	 创建时间
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
	 更新时间
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
	 描述
	*/
	private String Description;
	public final String getDescription()
	{
		return Description;
	}
	public final void setDescription(String value)
	{
		Description = value;
	}
	/** 
	 通道类型，door：门禁点
	*/
	private String ChannelType;
	public final String getChannelType()
	{
		return ChannelType;
	}
	public final void setChannelType(String value)
	{
		ChannelType = value;
	}
	/** 
	 区域名称
	*/
	private String RegionName;
	public final String getRegionName()
	{
		return RegionName;
	}
	public final void setRegionName(String value)
	{
		RegionName = value;
	}
	/** 
	 所属区域路径名，符号"/"进行分隔
	*/
	private String RegionPathName;
	public final String getRegionPathName()
	{
		return RegionPathName;
	}
	public final void setRegionPathName(String value)
	{
		RegionPathName = value;
	}
	/** 
	 安装位置，详见附录附录A.81 安装位置
	*/
	private String InstallLocation;
	public final String getInstallLocation()
	{
		return InstallLocation;
	}
	public final void setInstallLocation(String value)
	{
		InstallLocation = value;
	}


}