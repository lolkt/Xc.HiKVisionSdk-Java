package xc.hikvisionsdk.isc.callbacks.pms;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 进场放行结果
*/
public class InResult
{
	/** 
	 放行结果
	*/
	private RlsResult RlsResult;
	public final RlsResult getRlsResult()
	{
		return RlsResult;
	}
	public final void setRlsResult(RlsResult value)
	{
		RlsResult = value;
	}
}