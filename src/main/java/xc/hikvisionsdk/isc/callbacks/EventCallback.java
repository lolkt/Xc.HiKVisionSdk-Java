package xc.hikvisionsdk.isc.callbacks;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 回调事件
 
 <typeparam name="T"></typeparam>
*/
public abstract class EventCallback<T>
{
	/** 
	 方法名，用于标识报文用途
	 事件固定OnEventNotify
	*/
	private String Method;
	public final String getMethod()
	{
		return Method;
	}
	public final void setMethod(String value)
	{
		Method = value;
	}
	/** 
	 事件参数信息
	*/
	private EventCallbackParam<T> Params;
	public final EventCallbackParam<T> getParams()
	{
		return Params;
	}
	public final void setParams(EventCallbackParam<T> value)
	{
		Params = value;
	}
}