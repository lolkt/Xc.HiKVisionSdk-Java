package xc.hikvisionsdk.isc.managers.mpc.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.utils.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.mpc.*;
import java.time.*;

/** 
 批量添加车辆黑名单请求详细
*/
public class AlarmBlackAddRequestData implements ICheckRequestItem
{

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
	/** 
	 布控开始时间（格式：yyyy-MM-ddTHH:mm:ss.sss+当前时区）
	*/
	private String BeginTime;
	public final String getBeginTime()
	{
		return BeginTime;
	}
	public final void setBeginTime(String value)
	{
		BeginTime = value;
	}
	/** 
	 布控结束时间（格式：yyyy-MM-ddTHH:mm:ss.sss+当前时区）
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
	 车主姓名
	*/
	private String OwnerName;
	public final String getOwnerName()
	{
		return OwnerName;
	}
	public final void setOwnerName(String value)
	{
		OwnerName = value;
	}
	/** 
	 手机号码
	*/
	private String Phone;
	public final String getPhone()
	{
		return Phone;
	}
	public final void setPhone(String value)
	{
		Phone = value;
	}
	/** 
	 布控原因,1（被盗车），2（被抢车），3（嫌疑车），4（交通违法车），5（紧急查控车）
	*/
	private int Reason;
	public final int getReason()
	{
		return Reason;
	}
	public final void setReason(int value)
	{
		Reason = value;
	}
	/** 
	 描述信息
	*/
	private String Description;
	public final String getDescription()
	{
		return Description;
	}
	public final void setDescription(String value)
	{
		Description = value;
	}

	/** 
	 批量添加车辆黑名单请求详细
	 
	 @param plateNo 车牌号
	 @param reason 布控原因,1（被盗车），2（被抢车），3（嫌疑车），4（交通违法车），5（紧急查控车）
	 @param end 布控结束时间
	*/
	public AlarmBlackAddRequestData(String plateNo, int reason, LocalDateTime end)
	{
		setPlateNo(plateNo);
		setReason(reason);
		setEndTime(DateTimeFormat.ToIOS8601(end));
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	 @exception ArgumentOutOfRangeException
	*/
	public final void Check()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getPlateNo()))
		{
			throw new NullPointerException("PlateNo");
		}
		if (getReason() < 1)
		{
			throw new IndexOutOfBoundsException("Reason", "最小为 1");
		}
	}
}