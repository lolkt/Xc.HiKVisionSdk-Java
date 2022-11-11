package xc.hikvisionsdk.isc.managers.resource.models.acs;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 查询门禁点列表结果数据
*/
public class AcsDoorAdvanceAcsDoorListResponseData
{
	/** 
	 门禁点唯一标识
	*/
	private String DoorIndexCode;
	public final String getDoorIndexCode()
	{
		return DoorIndexCode;
	}
	public final void setDoorIndexCode(String value)
	{
		DoorIndexCode = value;
	}
	/** 
	 门禁点名称
	*/
	private String DoorName;
	public final String getDoorName()
	{
		return DoorName;
	}
	public final void setDoorName(String value)
	{
		DoorName = value;
	}
	/** 
	 门禁点序号
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
	 所属门禁设备唯一标识
	*/
	private String AcsDevIndexCode;
	public final String getAcsDevIndexCode()
	{
		return AcsDevIndexCode;
	}
	public final void setAcsDevIndexCode(String value)
	{
		AcsDevIndexCode = value;
	}
	/** 
	 所属区域唯一标识
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
	 通道类型, 参考附录A.8 门禁设备通道类型
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
	 安装位置
	 communityPerimeter：小区周界
	 communityEntrance：小区出入口
	 fireChannel：消防通道
	 landscapePool：景观池
	 outsideBuilding：住宅楼外
	 parkEntrance：停车场（库）出入口
	 parkArea：停车场区
	 equipmentRoom：设备房（机房、配电房、泵房）
	 monitorCenter：监控中心
	 stopArea：禁停区
	 vault：金库
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
	/** 
	 备注
	*/
	private String Remark;
	public final String getRemark()
	{
		return Remark;
	}
	public final void setRemark(String value)
	{
		Remark = value;
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
}