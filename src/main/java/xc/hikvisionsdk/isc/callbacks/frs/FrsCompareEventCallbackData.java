package xc.hikvisionsdk.isc.callbacks.frs;

import xc.hikvisionsdk.isc.callbacks.frs.compare.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 人脸对比事件数据
*/

public class FrsCompareEventCallbackData
{
	/** 
	 比对结果
	*/
	private AlarmResultItem[] AlarmResult;
	public final AlarmResultItem[] getAlarmResult()
	{
		return AlarmResult;
	}
	public final void setAlarmResult(AlarmResultItem[] value)
	{
		AlarmResult = value;
	}
	/** 
	 抓拍这张图片的监控点的通道号
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
	 事件类别，人脸比对的事件类别为faceMatch
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
	 事件来源的地址
	 人脸比对的事件来源为识别资源的地址。
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
	 事件来源的端口
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
}