package xc.hikvisionsdk.isc.managers.irds.models;

import xc.hikvisionsdk.isc.enums.irds.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.irds.*;

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
	 所属组织路径
	*/
	private String OrgPath;
	public final String getOrgPath()
	{
		return OrgPath;
	}
	public final void setOrgPath(String value)
	{
		OrgPath = value;
	}
	/** 
	 所属组织路径名称
	*/
	private String OrgPathName;
	public final String getOrgPathName()
	{
		return OrgPathName;
	}
	public final void setOrgPathName(String value)
	{
		OrgPathName = value;
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
	 创建时间，要求遵守ISO8601标准，如2018-07-26T21:30:08+08:00        表示北京时间2017年7月26日21时30分08秒
	*/
	private String CreateTime;
	public final String getCreateTime()
	{
		return CreateTime;
	}
	public final void setCreateTime(String value)
	{
		CreateTime = value;
	}
	/** 
	 修改时间，要求遵守ISO8601标准，如2018-07-26T21:30:08+08:00        表示北京时间2017年7月26日21时30分08秒
	*/
	private String UpdateTime;
	public final String getUpdateTime()
	{
		return UpdateTime;
	}
	public final void setUpdateTime(String value)
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