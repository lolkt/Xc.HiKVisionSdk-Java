package xc.hikvisionsdk.isc.callbacks;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 回调事件参数
 
 <typeparam name="T"></typeparam>
*/
public class EventCallbackParam<T>
{
	/** 
	 事件从接收者（如设备接入框架）发出的时间，格式 YYYY-mm-dd hh:MM:ss
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
	/** 
	 事件类别，如视频事件、门禁事件
	*/
	private String Ability;
	public final String getAbility()
	{
		return Ability;
	}
	public final void setAbility(String value)
	{
		Ability = value;
	}
	///// <summary>
	/////指定的事件接收用户列表，
	/////用于事件源发起组件指定接收用户，
	/////如指定用户接收手动事件、
	/////在部分应用中可以设置事件到指定用户接收
	///// </summary>
	//public string Uids { get; set; }
	/** 
	事件信息
	*/
	private EventCallbackParamEvent<T>[] Events;
	public final EventCallbackParamEvent<T>[] getEvents()
	{
		return Events;
	}
	public final void setEvents(EventCallbackParamEvent<T>[] value)
	{
		Events = value;
	}
}