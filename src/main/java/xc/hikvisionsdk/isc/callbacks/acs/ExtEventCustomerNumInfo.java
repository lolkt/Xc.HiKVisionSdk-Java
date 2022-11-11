package xc.hikvisionsdk.isc.callbacks.acs;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 通道事件信息
*/
public class ExtEventCustomerNumInfo
{
	/** 
	 通道号
	*/
	private int AccessChannel;
	public final int getAccessChannel()
	{
		return AccessChannel;
	}
	public final void setAccessChannel(int value)
	{
		AccessChannel = value;
	}
	/** 
	 进人数
	*/
	private int EntryTimes;
	public final int getEntryTimes()
	{
		return EntryTimes;
	}
	public final void setEntryTimes(int value)
	{
		EntryTimes = value;
	}
	/** 
	 出人数
	*/
	private int ExitTimes;
	public final int getExitTimes()
	{
		return ExitTimes;
	}
	public final void setExitTimes(int value)
	{
		ExitTimes = value;
	}
	/** 
	 总通行人数
	*/
	private int TotalTimes;
	public final int getTotalTimes()
	{
		return TotalTimes;
	}
	public final void setTotalTimes(int value)
	{
		TotalTimes = value;
	}
}