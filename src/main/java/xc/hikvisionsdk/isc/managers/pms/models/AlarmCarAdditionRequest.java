package xc.hikvisionsdk.isc.managers.pms.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.pms.*;

/** 
 车辆布控请求
*/
public class AlarmCarAdditionRequest extends BaseRequest
{
	/** 
	 车牌号码（车牌、卡号二选一）
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


	/** 
	 车辆布控请求
	 
	 @param content 内容
	 @param isCardNo 是卡片号码还是车牌
	*/

	public AlarmCarAdditionRequest(String content)
	{
		this(content, false);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public AlarmCarAdditionRequest(string content, bool isCardNo = false)
	public AlarmCarAdditionRequest(String content, boolean isCardNo)
	{
		if (isCardNo)
		{
			setCardNo(content);
		}
		else
		{
			setPlateNo(content);
		}
	}


	/** 
	 
	 
	 @exception ArgumentNullException
	*/
	@Override
	public void CheckParams()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getPlateNo()) && tangible.StringHelper.isNullOrWhiteSpace(getCardNo()))
		{
			throw new NullPointerException("PlateNo 或者 CardNo", "车牌、卡号二选一");
		}
	}

}