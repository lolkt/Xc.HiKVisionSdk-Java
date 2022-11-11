package xc.hikvisionsdk.isc.callbacks.pms;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 放行结果信息
*/
public class RlsResult
{
	/** 
	 放行权限
	*/
	private int ReleaseAuth;
	public final int getReleaseAuth()
	{
		return ReleaseAuth;
	}
	public final void setReleaseAuth(int value)
	{
		ReleaseAuth = value;
	}
	/** 
	 放行结果
	*/
	private int ReleaseResult;
	public final int getReleaseResult()
	{
		return ReleaseResult;
	}
	public final void setReleaseResult(int value)
	{
		ReleaseResult = value;
	}
	/** 
	 新体系放行结果
	*/
	private int ReleaseReason;
	public final int getReleaseReason()
	{
		return ReleaseReason;
	}
	public final void setReleaseReason(int value)
	{
		ReleaseReason = value;
	}
	/** 
	 放行原因
	*/
	private int ReleaseResultEx;
	public final int getReleaseResultEx()
	{
		return ReleaseResultEx;
	}
	public final void setReleaseResultEx(int value)
	{
		ReleaseResultEx = value;
	}
	/** 
	 放行方式
	*/
	private int ReleaseWay;
	public final int getReleaseWay()
	{
		return ReleaseWay;
	}
	public final void setReleaseWay(int value)
	{
		ReleaseWay = value;
	}

}