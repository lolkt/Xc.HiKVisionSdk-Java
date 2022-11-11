package xc.hikvisionsdk.isc.managers.pms.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.pms.*;

/** 
 车位剩余结果数据
*/
public class ParkRemainSpaceNumResponseData
{
	/** 
	 停车库唯一标识码
	*/
	private String ParkSyscode;
	public final String getParkSyscode()
	{
		return ParkSyscode;
	}
	public final void setParkSyscode(String value)
	{
		ParkSyscode = value;
	}
	/** 
	 停车库名称
	*/
	private String ParkName;
	public final String getParkName()
	{
		return ParkName;
	}
	public final void setParkName(String value)
	{
		ParkName = value;
	}
	/** 
	 父停车库唯一标识
	*/
	private String ParentParkSyscode;
	public final String getParentParkSyscode()
	{
		return ParentParkSyscode;
	}
	public final void setParentParkSyscode(String value)
	{
		ParentParkSyscode = value;
	}
	/** 
	 停车库车位总数
	*/
	private int TotalPlace;
	public final int getTotalPlace()
	{
		return TotalPlace;
	}
	public final void setTotalPlace(int value)
	{
		TotalPlace = value;
	}
	/** 
	 停车库固定车位总数
	*/
	private int TotalPermPlace;
	public final int getTotalPermPlace()
	{
		return TotalPermPlace;
	}
	public final void setTotalPermPlace(int value)
	{
		TotalPermPlace = value;
	}
	/** 
	 停车库预约车位总数
	*/
	private int TotalReservePlace;
	public final int getTotalReservePlace()
	{
		return TotalReservePlace;
	}
	public final void setTotalReservePlace(int value)
	{
		TotalReservePlace = value;
	}
	/** 
	 停车库车位剩余数
	*/
	private int LeftPlace;
	public final int getLeftPlace()
	{
		return LeftPlace;
	}
	public final void setLeftPlace(int value)
	{
		LeftPlace = value;
	}
	/** 
	 停车库固定车位剩余数
	*/
	private int LeftPermPlace;
	public final int getLeftPermPlace()
	{
		return LeftPermPlace;
	}
	public final void setLeftPermPlace(int value)
	{
		LeftPermPlace = value;
	}
	/** 
	 停车库预约车位剩余数
	*/
	private int LeftReservePlace;
	public final int getLeftReservePlace()
	{
		return LeftReservePlace;
	}
	public final void setLeftReservePlace(int value)
	{
		LeftReservePlace = value;
	}
}