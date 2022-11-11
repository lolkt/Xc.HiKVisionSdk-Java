package xc.hikvisionsdk.isc.managersv2.cards.dtos;

import xc.hikvisionsdk.isc.enums.irds.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.cards.*;

/** 
 增量获取卡片
*/
public class TimeRangeCardInfo
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
	private String PersonIndexCode;
	public final String getPersonIndexCode()
	{
		return PersonIndexCode;
	}
	public final void setPersonIndexCode(String value)
	{
		PersonIndexCode = value;
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
	/** 
	 描述
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
	 创建日期
	*/
	private DateTimeOffset CreateTime = new DateTimeOffset();
	public final DateTimeOffset getCreateTime()
	{
		return CreateTime;
	}
	public final void setCreateTime(DateTimeOffset value)
	{
		CreateTime = value;
	}
	/** 
	 更新时间
	*/
	private DateTimeOffset UpdateTime = null;
	public final DateTimeOffset getUpdateTime()
	{
		return UpdateTime;
	}
	public final void setUpdateTime(DateTimeOffset value)
	{
		UpdateTime = value;
	}
	/** 
	 卡类型
	*/
	private int CardType;
	public final int getCardType()
	{
		return CardType;
	}
	public final void setCardType(int value)
	{
		CardType = value;
	}
	/** 
	 所属组织
	*/
	private String OrgIndexCode;
	public final String getOrgIndexCode()
	{
		return OrgIndexCode;
	}
	public final void setOrgIndexCode(String value)
	{
		OrgIndexCode = value;
	}
	/** 
	 是否绑定指纹，1-绑定，2-未绑定
	*/
	private int IsBindFinger;
	public final int isBindFinger()
	{
		return IsBindFinger;
	}
	public final void setBindFinger(int value)
	{
		IsBindFinger = value;
	}
	/** 
	 是否绑定人脸，1-绑定，2-未绑定
	*/
	private int IsBindFace;
	public final int isBindFace()
	{
		return IsBindFace;
	}
	public final void setBindFace(int value)
	{
		IsBindFace = value;
	}

	/** 
	 资源状态，小于0则代表资源已被删除，0代表有效资源
	*/
	private int Status;
	public final int getStatus()
	{
		return Status;
	}
	public final void setStatus(int value)
	{
		Status = value;
	}
}