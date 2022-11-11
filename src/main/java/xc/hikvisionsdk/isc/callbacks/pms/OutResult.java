package xc.hikvisionsdk.isc.callbacks.pms;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 事件出场结果
*/
public class OutResult
{
	/** 
	 账单编号
	*/
	private String ChargeIndex;
	public final String getChargeIndex()
	{
		return ChargeIndex;
	}
	public final void setChargeIndex(String value)
	{
		ChargeIndex = value;
	}
	/** 
	 出场实收金额
	*/
	private int RealCost;
	public final int getRealCost()
	{
		return RealCost;
	}
	public final void setRealCost(int value)
	{
		RealCost = value;
	}
	/** 
	 放行结果信息
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
	/** 
	 收费员ID
	*/
	private String TollerId;
	public final String getTollerId()
	{
		return TollerId;
	}
	public final void setTollerId(String value)
	{
		TollerId = value;
	}
	/** 
	 出场应收金额
	*/
	private int TotalCost;
	public final int getTotalCost()
	{
		return TotalCost;
	}
	public final void setTotalCost(int value)
	{
		TotalCost = value;
	}
}