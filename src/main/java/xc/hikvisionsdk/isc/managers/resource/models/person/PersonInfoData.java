package xc.hikvisionsdk.isc.managers.resource.models.person;

import xc.hikvisionsdk.enums.*;
import xc.hikvisionsdk.isc.enums.resource.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 基本人员信息
*/
public class PersonInfoData
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
	 1：男
	 2：女
	 0：未知
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
	 所属组织路径，@进行分割，例如 @root000000@
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
	 所属组织名称，@进行分割，如@默认部门@
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
	 证件类型
	 111:身份证
	 414:护照
	 113:户口簿
	 335:驾驶证
	 131:工作证
	 133:学生证
	 990:其他
	*/
	private CertificateType CertificateType = CertificateType.values()[0];
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
	 一串数字字符串
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
	 更新时间        
	 要求遵守ISO8601标准，如2018-07-26T21:30:08.000+08:00
	 表示北京时间2017年7月26日21时30分08秒
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
	  	出生日期
	  	格式：yyyy-MM-dd HH:mm:ss
	*/
	private String Birthday;
	public final String getBirthday()
	{
		return Birthday;
	}
	public final void setBirthday(String value)
	{
		Birthday = value;
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
	 联系地址
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
	 邮件
	*/
	private String Email;
	public final String getEmail()
	{
		return Email;
	}
	public final void setEmail(String value)
	{
		Email = value;
	}
	/** 
	 学历
	*/
	private String Education;
	public final String getEducation()
	{
		return Education;
	}
	public final void setEducation(String value)
	{
		Education = value;
	}
	/** 
	 民族
	*/
	private String Nation;
	public final String getNation()
	{
		return Nation;
	}
	public final void setNation(String value)
	{
		Nation = value;
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