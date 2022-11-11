package xc.hikvisionsdk.isc.callbacks;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 回调事件参数项
 
 <typeparam name="T"></typeparam>
*/
public class EventCallbackParamEvent<T>
{
	/** 
	 事件Id，
	 唯一标识事件的一次发生，
	 同一事件发送多次需要ID相同
	*/
	private String EventId;
	public final String getEventId()
	{
		return EventId;
	}
	public final void setEventId(String value)
	{
		EventId = value;
	}
	/** 
	 事件源编号，物理设备是资源编号
	*/
	private int EventType;
	public final int getEventType()
	{
		return EventType;
	}
	public final void setEventType(int value)
	{
		EventType = value;
	}
	/** 
	 事件发生时间
	*/
	private String HappenTime;
	public final String getHappenTime()
	{
		return HappenTime;
	}
	public final void setHappenTime(String value)
	{
		HappenTime = value;
	}
	/** 
	 事件源编号，
	 物理设备是资源编号
	*/
	private String SrcIndex;
	public final String getSrcIndex()
	{
		return SrcIndex;
	}
	public final void setSrcIndex(String value)
	{
		SrcIndex = value;
	}
	/** 
	 事件源名称，utf8
	*/
	private String SrcName;
	public final String getSrcName()
	{
		return SrcName;
	}
	public final void setSrcName(String value)
	{
		SrcName = value;
	}
	/** 
	 事件发生的事件源父设备，无-空字符串
	*/
	private String SrcParentIndex;
	public final String getSrcParentIndex()
	{
		return SrcParentIndex;
	}
	public final void setSrcParentIndex(String value)
	{
		SrcParentIndex = value;
	}
	/** 
	 事件源类型
	*/
	private String SrcType;
	public final String getSrcType()
	{
		return SrcType;
	}
	public final void setSrcType(String value)
	{
		SrcType = value;
	}
	/** 
	 事件状态, 0-瞬时 1-开始 2-停止 3-事件脉冲 4-事件联动结果更新 5-异步图片上传
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
	/** 
	 事件等级：0-未配置 1-低 2-中 3-高，注意，此处事件等级是指在事件联动中配置的等级
	*/
	private int EventLvl;
	public final int getEventLvl()
	{
		return EventLvl;
	}
	public final void setEventLvl(int value)
	{
		EventLvl = value;
	}
	/** 
	 脉冲超时时间，一个持续性的事件，上报的间隔
	*/
	private int Timeout;
	public final int getTimeout()
	{
		return Timeout;
	}
	public final void setTimeout(int value)
	{
		Timeout = value;
	}
	/** 
	 事件其它扩展信息
	*/
	private T Data;
	public final T getData()
	{
		return Data;
	}
	public final void setData(T value)
	{
		Data = value;
	}
}