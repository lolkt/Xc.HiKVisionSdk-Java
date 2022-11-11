package xc.hikvisionsdk.isc.managers.pms.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.pms.*;

/** 
 查询布控车辆结果数据
*/
public class AlarmCarPageResponseData
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
	/** 
	 驾驶员名称
	*/
	private String Driver;
	public final String getDriver()
	{
		return Driver;
	}
	public final void setDriver(String value)
	{
		Driver = value;
	}

	/** 
	 驾驶员电话
	*/
	private String DriverPhone;
	public final String getDriverPhone()
	{
		return DriverPhone;
	}
	public final void setDriverPhone(String value)
	{
		DriverPhone = value;
	}

	/** 
	 备注信息
	*/
	private String Remark;
	public final String getRemark()
	{
		return Remark;
	}
	public final void setRemark(String value)
	{
		Remark = value;
	}

	/** 
	 布控结束时间,ISO8601格式：
	 yyyy-MM-ddTHH:mm:ss+当前时区，例如北京时间：
	 2018-07-26T15:00:00+08:00
	*/
	private String EndTime;
	public final String getEndTime()
	{
		return EndTime;
	}
	public final void setEndTime(String value)
	{
		EndTime = value;
	}
}