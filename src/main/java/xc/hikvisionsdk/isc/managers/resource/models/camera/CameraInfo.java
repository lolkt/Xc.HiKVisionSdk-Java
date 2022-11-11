package xc.hikvisionsdk.isc.managers.resource.models.camera;

import xc.hikvisionsdk.isc.enums.resource.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 查询监控点列表结果数据
*/
public class CameraInfo
{
	/** 
	 海拔
	*/
	private String Altitude;
	public final String getAltitude()
	{
		return Altitude;
	}
	public final void setAltitude(String value)
	{
		Altitude = value;
	}
	/** 
	 监控点唯一标识
	*/
	private String CameraIndexCode;
	public final String getCameraIndexCode()
	{
		return CameraIndexCode;
	}
	public final void setCameraIndexCode(String value)
	{
		CameraIndexCode = value;
	}
	/** 
	 监控点名称
	*/
	private String CameraName;
	public final String getCameraName()
	{
		return CameraName;
	}
	public final void setCameraName(String value)
	{
		CameraName = value;
	}
	/** 
	 摄像机类型
	*/
	private int CameraType;
	public final int getCameraType()
	{
		return CameraType;
	}
	public final void setCameraType(int value)
	{
		CameraType = value;
	}
	/** 
	 监控点类型说明
	*/
	private String CameraTypeName;
	public final String getCameraTypeName()
	{
		return CameraTypeName;
	}
	public final void setCameraTypeName(String value)
	{
		CameraTypeName = value;
	}
	/** 
	 参考附录A.22 能力集
	*/
	private String CapabilitySet;
	public final String getCapabilitySet()
	{
		return CapabilitySet;
	}
	public final void setCapabilitySet(String value)
	{
		CapabilitySet = value;
	}
	/** 
	 能力集说明
	*/
	private String CapabilitySetName;
	public final String getCapabilitySetName()
	{
		return CapabilitySetName;
	}
	public final void setCapabilitySetName(String value)
	{
		CapabilitySetName = value;
	}
	/** 
	  	智能分析能力集，扩展字段，暂不使用
	*/
	private String IntelligentSet;
	public final String getIntelligentSet()
	{
		return IntelligentSet;
	}
	public final void setIntelligentSet(String value)
	{
		IntelligentSet = value;
	}
	/** 
	  	智能分析能力集说明，扩展字段，暂不使用
	*/
	private String IntelligentSetName;
	public final String getIntelligentSetName()
	{
		return IntelligentSetName;
	}
	public final void setIntelligentSetName(String value)
	{
		IntelligentSetName = value;
	}
	/** 
	 通道编号
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
	 通道类型附录A.5 视频通道类型
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
	 通道类型说明
	*/
	private String channelTypeName;
	public final String getChannelTypeName()
	{
		return channelTypeName;
	}
	public final void setChannelTypeName(String value)
	{
		channelTypeName = value;
	}
	/** 
	 创建时间，采用ISO8601标准，如2018-07-26T21:30:08+08:00 表示北京时间2018年7月26日21时30分08秒
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
	 所属编码设备唯一标识
	*/
	private String EncodeDevIndexCode;
	public final String getEncodeDevIndexCode()
	{
		return EncodeDevIndexCode;
	}
	public final void setEncodeDevIndexCode(String value)
	{
		EncodeDevIndexCode = value;
	}
	/** 
	 所属设备类型，扩展字段，暂不使用
	*/
	private String EncodeDevResourceType;
	public final String getEncodeDevResourceType()
	{
		return EncodeDevResourceType;
	}
	public final void setEncodeDevResourceType(String value)
	{
		EncodeDevResourceType = value;
	}
	/** 
	 所属设备类型说明，扩展字段，暂不使用
	*/
	private String EncodeDevResourceTypeName;
	public final String getEncodeDevResourceTypeName()
	{
		return EncodeDevResourceTypeName;
	}
	public final void setEncodeDevResourceTypeName(String value)
	{
		EncodeDevResourceTypeName = value;
	}
	/** 
	 监控点国标编号，即外码编号externalIndexCode
	*/
	private String GbIndexCode;
	public final String getGbIndexCode()
	{
		return GbIndexCode;
	}
	public final void setGbIndexCode(String value)
	{
		GbIndexCode = value;
	}
	/** 
	 安装位置：
	 communityPerimeter：小区周界,communityEntrance：小区出入口,fireChannel：消防通道,andscapePool：景观池,outsideBuilding：住宅楼外,parkEntrance：停车场（库）出入口,parkArea：停车场区,equipmentRoom：设备房（机房、配电房、泵房）,monitorCenter：监控中心,stopArea：禁停区,vault：金库
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
	 键盘控制码
	*/
	private String KeyBoardCode;
	public final String getKeyBoardCode()
	{
		return KeyBoardCode;
	}
	public final void setKeyBoardCode(String value)
	{
		KeyBoardCode = value;
	}
	/** 
	 纬度
	*/
	private String Latitude;
	public final String getLatitude()
	{
		return Latitude;
	}
	public final void setLatitude(String value)
	{
		Latitude = value;
	}
	/** 
	 经度
	*/
	private String Longitude;
	public final String getLongitude()
	{
		return Longitude;
	}
	public final void setLongitude(String value)
	{
		Longitude = value;
	}
	/** 
	 摄像机像素（1-普通像素，2-130万高清，3-200万高清，4-300万高清），扩展字段，暂不使用
	*/
	private String Pixel;
	public final String getPixel()
	{
		return Pixel;
	}
	public final void setPixel(String value)
	{
		Pixel = value;
	}
	/** 
	 云镜类型（1-全方位云台（带转动和变焦），2-只有变焦,不带转动，3-只有转动，不带变焦，4-无云台，无变焦），扩展字段，暂不使用
	*/
	private String Ptz;
	public final String getPtz()
	{
		return Ptz;
	}
	public final void setPtz(String value)
	{
		Ptz = value;
	}
	/** 
	 云镜类型说明，扩展字段，暂不使用
	*/
	private String PtzName;
	public final String getPtzName()
	{
		return PtzName;
	}
	public final void setPtzName(String value)
	{
		PtzName = value;
	}
	/** 
	  	云台控制(1-DVR，2-模拟矩阵，3-MU4000，4-NC600)，扩展字段，暂不使用
	*/
	private String PtzController;
	public final String getPtzController()
	{
		return PtzController;
	}
	public final void setPtzController(String value)
	{
		PtzController = value;
	}
	/** 
	  	云台控制说明，扩展字段，暂不使用
	*/
	private String PtzControllerName;
	public final String getPtzControllerName()
	{
		return PtzControllerName;
	}
	public final void setPtzControllerName(String value)
	{
		PtzControllerName = value;
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
	 录像存储位置说明
	*/
	private String RecordLocationName;
	public final String getRecordLocationName()
	{
		return RecordLocationName;
	}
	public final void setRecordLocationName(String value)
	{
		RecordLocationName = value;
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
	 是否被删除
	*/
	private String Status;
	public final String getStatus()
	{
		return Status;
	}
	public final void setStatus(String value)
	{
		Status = value;
	}
	/** 
	 状态说明
	*/
	private String StatusName;
	public final String getStatusName()
	{
		return StatusName;
	}
	public final void setStatusName(String value)
	{
		StatusName = value;
	}
	/** 
	 传输协议，参考附录A.40 传输协议
	*/
	private TransType TransType = TransType.values()[0];
	public final TransType getTransType()
	{
		return TransType;
	}
	public final void setTransType(TransType value)
	{
		TransType = value;
	}
	/** 
	  	传输协议类型说明
	*/
	private String TransTypeName;
	public final String getTransTypeName()
	{
		return TransTypeName;
	}
	public final void setTransTypeName(String value)
	{
		TransTypeName = value;
	}
	/** 
	  	接入协议，参考附录A.6 编码设备接入协议
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
	 接入协议类型说明
	*/
	private String TreatyTypeName;
	public final String getTreatyTypeName()
	{
		return TreatyTypeName;
	}
	public final void setTreatyTypeName(String value)
	{
		TreatyTypeName = value;
	}
	/** 
	  	可视域相关（JSON格式），扩展字段，暂不使用
	*/
	private String Viewshed;
	public final String getViewshed()
	{
		return Viewshed;
	}
	public final void setViewshed(String value)
	{
		Viewshed = value;
	}
	/** 
	 更新时间 
	 采用ISO8601标准，如2018-07-26T21:30:08+08:00 
	 表示北京时间2017年7月26日21时30分08秒
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
	 数据在界面上显示的顺序
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
}