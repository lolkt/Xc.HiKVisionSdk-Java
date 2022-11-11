package xc.hikvisionsdk.isc.managers.resource.models.card;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 获取卡片列表结果数据
*/
public class CardListResponseData
{

	/** 
	 卡片ID
	*/
	private String CardId;
	public final String getCardId()
	{
		return CardId;
	}
	public final void setCardId(String value)
	{
		CardId = value;
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
	 持卡人员id
	*/
	private String PersonId;
	public final String getPersonId()
	{
		return PersonId;
	}
	public final void setPersonId(String value)
	{
		PersonId = value;
	}
	/** 
	 持卡人名称
	*/
	private String PersonName;
	public final String getPersonName()
	{
		return PersonName;
	}
	public final void setPersonName(String value)
	{
		PersonName = value;
	}
	/** 
	 使用状态标记
	*/
	private int UseStatus;
	public final int getUseStatus()
	{
		return UseStatus;
	}
	public final void setUseStatus(int value)
	{
		UseStatus = value;
	}
	/** 
	  	生效日期，遵守ISO8601标准，如2018-07-26T21:30:08.000+08:00表示北京时间2017年7月26日21时30分08秒
	*/
	private String StartDate;
	public final String getStartDate()
	{
		return StartDate;
	}
	public final void setStartDate(String value)
	{
		StartDate = value;
	}
	/** 
	 失效日期，遵守ISO8601标准，如2018-07-26T21:30:08.000+08:00表示北京时间2017年7月26日21时30分08秒
	*/
	private String EndDate;
	public final String getEndDate()
	{
		return EndDate;
	}
	public final void setEndDate(String value)
	{
		EndDate = value;
	}
	/** 
	 挂失时间，遵守ISO8601标准，如2018-07-26T21:30:08.000+08:00表示北京时间2017年7月26日21时30分08秒
	*/
	private String LossDate;
	public final String getLossDate()
	{
		return LossDate;
	}
	public final void setLossDate(String value)
	{
		LossDate = value;
	}
	/** 
	  	解除挂失时间，遵守ISO8601标准，如2018-07-26T21:30:08.000+08:00表示北京时间2017年7月26日21时30分08秒
	*/
	private String UnlossDate;
	public final String getUnlossDate()
	{
		return UnlossDate;
	}
	public final void setUnlossDate(String value)
	{
		UnlossDate = value;
	}

}