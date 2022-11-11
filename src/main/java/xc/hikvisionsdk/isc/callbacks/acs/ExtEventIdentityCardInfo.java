package xc.hikvisionsdk.isc.callbacks.acs;

import xc.hikvisionsdk.enums.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 人员身份证信息
*/
public class ExtEventIdentityCardInfo
{
	/** 
	 住址
	*/
	private String Address;
	public final String getAddress()
	{
		return Address;
	}
	public final void setAddress(String value)
	{
		Address = value;
	}
	/** 
	 出生日期
	*/
	private String Birth;
	public final String getBirth()
	{
		return Birth;
	}
	public final void setBirth(String value)
	{
		Birth = value;
	}
	/** 
	 有效日期结束时间
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
	 身份证id
	*/
	private String IdNum;
	public final String getIdNum()
	{
		return IdNum;
	}
	public final void setIdNum(String value)
	{
		IdNum = value;
	}
	/** 
	 签发机关
	*/
	private String IssuingAuthority;
	public final String getIssuingAuthority()
	{
		return IssuingAuthority;
	}
	public final void setIssuingAuthority(String value)
	{
		IssuingAuthority = value;
	}
	/** 
	 姓名
	*/
	private String Name;
	public final String getName()
	{
		return Name;
	}
	public final void setName(String value)
	{
		Name = value;
	}
	/** 
	 民族
	*/
	private int Nation;
	public final int getNation()
	{
		return Nation;
	}
	public final void setNation(int value)
	{
		Nation = value;
	}
	/** 
	 性别
	*/
	private Gender Sex = Gender.values()[0];
	public final Gender getSex()
	{
		return Sex;
	}
	public final void setSex(Gender value)
	{
		Sex = value;
	}
	/** 
	 有效日期开始时间
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
	 是否长期有效
	 0-否（有效截止日期有效）
	 1-是（有效截止日期无效）
	*/
	private TermOfValidity TermOfValidity = TermOfValidity.values()[0];
	public final TermOfValidity getTermOfValidity()
	{
		return TermOfValidity;
	}
	public final void setTermOfValidity(TermOfValidity value)
	{
		TermOfValidity = value;
	}
}