package xc.hikvisionsdk.isc.managers.mpc.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.mpc.*;

/** 
 批量添加车辆黑名单结果数据
*/
public class AlarmBlackAddResponseData
{
	/** 
	 黑名单唯一编号
	*/
	private String IndexCode;
	public final String getIndexCode()
	{
		return IndexCode;
	}
	public final void setIndexCode(String value)
	{
		IndexCode = value;
	}
	/** 
	 车牌号
	*/
	private String PlateNo;
	public final String getPlateNo()
	{
		return PlateNo;
	}
	public final void setPlateNo(String value)
	{
		PlateNo = value;
	}
}