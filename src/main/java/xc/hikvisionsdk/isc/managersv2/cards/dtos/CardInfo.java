package xc.hikvisionsdk.isc.managersv2.cards.dtos;

import xc.hikvisionsdk.isc.enums.irds.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.cards.*;

/** 
 卡片信息
*/
public class CardInfo
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
	private UseStatus UseStatus = UseStatus.values()[0];
	public final UseStatus getUseStatus()
	{
		return UseStatus;
	}
	public final void setUseStatus(UseStatus value)
	{
		UseStatus = value;
	}
	/** 
	  生效日期，遵守ISO8601标准，如2018-07-26T21:30:08.000+08:00表示北京时间2017年7月26日21时30分08秒
	*/
	private DateTimeOffset StartDate = null;
	public final DateTimeOffset getStartDate()
	{
		return StartDate;
	}
	public final void setStartDate(DateTimeOffset value)
	{
		StartDate = value;
	}
	/** 
	 失效日期，遵守ISO8601标准，如2018-07-26T21:30:08.000+08:00表示北京时间2017年7月26日21时30分08秒
	*/
	private DateTimeOffset EndDate = null;
	public final DateTimeOffset getEndDate()
	{
		return EndDate;
	}
	public final void setEndDate(DateTimeOffset value)
	{
		EndDate = value;
	}
	/** 
	 挂失时间，遵守ISO8601标准，如2018-07-26T21:30:08.000+08:00表示北京时间2017年7月26日21时30分08秒
	*/
	private DateTimeOffset LossDate = null;
	public final DateTimeOffset getLossDate()
	{
		return LossDate;
	}
	public final void setLossDate(DateTimeOffset value)
	{
		LossDate = value;
	}
	/** 
	 解除挂失时间，遵守ISO8601标准，如2018-07-26T21:30:08.000+08:00表示北京时间2017年7月26日21时30分08秒
	*/
	private DateTimeOffset UnlossDate = null;
	public final DateTimeOffset getUnlossDate()
	{
		return UnlossDate;
	}
	public final void setUnlossDate(DateTimeOffset value)
	{
		UnlossDate = value;
	}

}