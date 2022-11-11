package xc.hikvisionsdk.isc.managersv2.persons.dtos;

import xc.hikvisionsdk.enums.*;
import xc.hikvisionsdk.isc.enums.resource.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.persons.*;

/** 
 
*/
public class PersonInfo
{
	/** 
	 人员ID
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
	 姓名
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
	 性别
	*/
	private Gender Gender = Gender.values()[0];
	public final Gender getGender()
	{
		return Gender;
	}
	public final void setGender(Gender value)
	{
		Gender = value;
	}
	/** 
	  	所属组织唯一标识码
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
	  	联系电话
	*/
	private String PhoneNo;
	public final String getPhoneNo()
	{
		return PhoneNo;
	}
	public final void setPhoneNo(String value)
	{
		PhoneNo = value;
	}
	/** 
	 工号
	*/
	private String JobNo;
	public final String getJobNo()
	{
		return JobNo;
	}
	public final void setJobNo(String value)
	{
		JobNo = value;
	}
	/** 
	 证件类型
	*/
	private CertificateType CertificateType = null;
	public final CertificateType getCertificateType()
	{
		return CertificateType;
	}
	public final void setCertificateType(CertificateType value)
	{
		CertificateType = value;
	}
	/** 
	  	证件号码
	*/
	private String CertificateNo;
	public final String getCertificateNo()
	{
		return CertificateNo;
	}
	public final void setCertificateNo(String value)
	{
		CertificateNo = value;
	}
	/** 
	  	创建时间
	*/
	private DateTimeOffset CreateTime = null;
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
	 所属组织名称
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
	 人员图片信息
	*/
	private PersonPhoto PersonPhoto;
	public final PersonPhoto getPersonPhoto()
	{
		return PersonPhoto;
	}
	public final void setPersonPhoto(PersonPhoto value)
	{
		PersonPhoto = value;
	}
}