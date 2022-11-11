package xc.hikvisionsdk.isc.managers.resource.models.camera;

import xc.hikvisionsdk.isc.enums.resource.*;
import xc.hikvisionsdk.isc.enums.video.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;
import java.math.*;

/** 
 
*/
public class CameraV2Info
{
	/** 
	 唯一编码
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
	  	资源类型，camera：监控点
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
	 监控点国标编号
	*/
	private String ExternalIndexCode;
	public final String getExternalIndexCode()
	{
		return ExternalIndexCode;
	}
	public final void setExternalIndexCode(String value)
	{
		ExternalIndexCode = value;
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
	 通道号，为级联监控点时，该字段为空；        本级监控点时，该字段非空
	*/
	private int ChanNum;
	public final int getChanNum()
	{
		return ChanNum;
	}
	public final void setChanNum(int value)
	{
		ChanNum = value;
	}
	/** 
	 级联编号
	*/
	private String CascadeCode;
	public final String getCascadeCode()
	{
		return CascadeCode;
	}
	public final void setCascadeCode(String value)
	{
		CascadeCode = value;
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
	 经度，精确到小数点后8位
	*/
	private BigDecimal Longitude = new BigDecimal(0);
	public final BigDecimal getLongitude()
	{
		return Longitude;
	}
	public final void setLongitude(BigDecimal value)
	{
		Longitude = value;
	}
	/** 
	 纬度，精确到小数点后8位
	*/
	private BigDecimal Latitude = new BigDecimal(0);
	public final BigDecimal getLatitude()
	{
		return Latitude;
	}
	public final void setLatitude(BigDecimal value)
	{
		Latitude = value;
	}
	/** 
	 海拔高度，单位：米
	*/
	private String Elevation;
	public final String getElevation()
	{
		return Elevation;
	}
	public final void setElevation(String value)
	{
		Elevation = value;
	}
	/** 
	 监控点类型
	*/
	private CameraType CameraType = CameraType.values()[0];
	public final CameraType getCameraType()
	{
		return CameraType;
	}
	public final void setCameraType(CameraType value)
	{
		CameraType = value;
	}
	/** 
	 能力集
	*/
	private String Capability;
	public final String getCapability()
	{
		return Capability;
	}
	public final void setCapability(String value)
	{
		Capability = value;
	}
	/** 
	 录像存储位置
	*/
	private String RecordLocation;
	public final String getRecordLocation()
	{
		return RecordLocation;
	}
	public final void setRecordLocation(String value)
	{
		RecordLocation = value;
	}
	/** 
	 通道子类型
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
	 传输协议
	*/
	private TransmodeType TransmodeType = TransmodeType.values()[0];
	public final TransmodeType getTransmodeType()
	{
		return TransmodeType;
	}
	public final void setTransmodeType(TransmodeType value)
	{
		TransmodeType = value;
	}
	/** 
	 接入协议
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
	 安装位置
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
	 创建时间
	*/
	private DateTimeOffset CreateTime = null;
	public final DateTimeOffset getCreateTime()
	{
		return CreateTime;
	}
	public final void setCreateTime(DateTimeOffset value)
	{
		CreateTime = value;
	}
	/** 
	 更新时间
	*/
	private DateTimeOffset UpdateTime = null;
	public final DateTimeOffset getUpdateTime()
	{
		return UpdateTime;
	}
	public final void setUpdateTime(DateTimeOffset value)
	{
		UpdateTime = value;
	}
	/** 
	 数据在界面上的显示顺序
	*/
	private int DisOrder;
	public final int getDisOrder()
	{
		return DisOrder;
	}
	public final void setDisOrder(int value)
	{
		DisOrder = value;
	}
	/** 
	 资源唯一编码
	*/
	private String ResourceIndexCode;
	public final String getResourceIndexCode()
	{
		return ResourceIndexCode;
	}
	public final void setResourceIndexCode(String value)
	{
		ResourceIndexCode = value;
	}
	/** 
	 解码模式
	*/
	private String DecodeTag;
	public final String getDecodeTag()
	{
		return DecodeTag;
	}
	public final void setDecodeTag(String value)
	{
		DecodeTag = value;
	}
	/** 
	 监控点关联对讲唯一标志
	*/
	private String CameraRelateTalk;
	public final String getCameraRelateTalk()
	{
		return CameraRelateTalk;
	}
	public final void setCameraRelateTalk(String value)
	{
		CameraRelateTalk = value;
	}
	/** 
	 所属区域路径，由唯一标示组成，最大10级，格式： @根节点@子区域1@子区域2@
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
	 区域路径名称，"/"分隔
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
}