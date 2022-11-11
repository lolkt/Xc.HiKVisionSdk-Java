package xc.hikvisionsdk.isc.managers.pms.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.pms.*;

/** 
 车辆布控结果数据
*/
public class AlarmCarAdditionResponseData
{
	/** 
	 布控车辆唯一标识
	*/
	private String AlarmSyscode;
	public final String getAlarmSyscode()
	{
		return AlarmSyscode;
	}
	public final void setAlarmSyscode(String value)
	{
		AlarmSyscode = value;
	}

	/** 
	 车牌号码
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

	/** 
	 卡号
	*/
	private String CardNo;
	public final String getCardNo()
	{
		return CardNo;
	}
	public final void setCardNo(String value)
	{
		CardNo = value;
	}
}