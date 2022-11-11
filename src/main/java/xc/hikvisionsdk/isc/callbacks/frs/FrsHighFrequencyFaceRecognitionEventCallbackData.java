package xc.hikvisionsdk.isc.callbacks.frs;

import xc.hikvisionsdk.isc.callbacks.frs.facerecognition.highfrequency.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 高频人员识别数据
*/
public class FrsHighFrequencyFaceRecognitionEventCallbackData
{
	/** 
	 图片url认证方式
	 digest-摘要认证（这个针对设备本地存储返回URL的方式，设备例如NVR/DVR）
	*/
	private String URLCertificationType;
	public final String getURLCertificationType()
	{
		return URLCertificationType;
	}
	public final void setURLCertificationType(String value)
	{
		URLCertificationType = value;
	}
	/** 
	 事件触发次数
	*/
	private int ActivePostCount;
	public final int getActivePostCount()
	{
		return ActivePostCount;
	}
	public final void setActivePostCount(int value)
	{
		ActivePostCount = value;
	}
	/** 
	 设备通道号
	 设备通道号，默认1开始
	*/
	private int ChannelID;
	public final int getChannelID()
	{
		return ChannelID;
	}
	public final void setChannelID(int value)
	{
		ChannelID = value;
	}
	/** 
	 数据模型标识
	 由IAC添加
	*/
	private String DataType;
	public final String getDataType()
	{
		return DataType;
	}
	public final void setDataType(String value)
	{
		DataType = value;
	}
	/** 
	 数据触发时间
	 由设备产生
	*/
	private String DateTime;
	public final String getDateTime()
	{
		return DateTime;
	}
	public final void setDateTime(String value)
	{
		DateTime = value;
	}
	/** 
	 事件描述
	*/
	private String EventDescription;
	public final String getEventDescription()
	{
		return EventDescription;
	}
	public final void setEventDescription(String value)
	{
		EventDescription = value;
	}
	/** 
	 事件状态
	*/
	private String EventState;
	public final String getEventState()
	{
		return EventState;
	}
	public final void setEventState(String value)
	{
		EventState = value;
	}
	/** 
	 事件类型
	*/
	private String EventType;
	public final String getEventType()
	{
		return EventType;
	}
	public final void setEventType(String value)
	{
		EventType = value;
	}
	/** 
	 识别结果
	*/
	private FaceCapture[] FaceCapture;
	public final FaceCapture[] getFaceCapture()
	{
		return FaceCapture;
	}
	public final void setFaceCapture(FaceCapture[] value)
	{
		FaceCapture = value;
	}
	/** 
	 设备的IP地址
	*/
	private String IpAddress;
	public final String getIpAddress()
	{
		return IpAddress;
	}
	public final void setIpAddress(String value)
	{
		IpAddress = value;
	}
	/** 
	 Mac地址
	*/
	private String MacAddress;
	public final String getMacAddress()
	{
		return MacAddress;
	}
	public final void setMacAddress(String value)
	{
		MacAddress = value;
	}
	/** 
	 设备端口号
	*/
	private int PortNo;
	public final int getPortNo()
	{
		return PortNo;
	}
	public final void setPortNo(int value)
	{
		PortNo = value;
	}
	/** 
	 协议类型
	*/
	private String Protocol;
	public final String getProtocol()
	{
		return Protocol;
	}
	public final void setProtocol(String value)
	{
		Protocol = value;
	}
	/** 
	 数据接收时间
	 由IAC添加
	*/
	private String RecvTime;
	public final String getRecvTime()
	{
		return RecvTime;
	}
	public final void setRecvTime(String value)
	{
		RecvTime = value;
	}
	/** 
	 数据发送时间
	 由IAC添加
	*/
	private String SendTime;
	public final String getSendTime()
	{
		return SendTime;
	}
	public final void setSendTime(String value)
	{
		SendTime = value;
	}

}