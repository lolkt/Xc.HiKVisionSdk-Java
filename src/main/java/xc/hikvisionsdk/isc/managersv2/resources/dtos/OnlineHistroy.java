package xc.hikvisionsdk.isc.managersv2.resources.dtos;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.resources.*;

/** 
 在线记录
*/
public class OnlineHistroy
{
	/** 
	 状态采集时间，时间格式为ISO格式
	*/
	private DateTimeOffset CollectTime = null;
	public final DateTimeOffset getCollectTime()
	{
		return CollectTime;
	}
	public final void setCollectTime(DateTimeOffset value)
	{
		CollectTime = value;
	}

	/** 
	 资源在线状态,0: 离线,1: 在线
	*/
	private int Online;
	public final int getOnline()
	{
		return Online;
	}
	public final void setOnline(int value)
	{
		Online = value;
	}

	/** 
	 资源在线
	*/
	public final boolean isOnline()
	{
		return getOnline() == 1;
	}
}