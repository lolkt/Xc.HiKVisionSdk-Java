package xc.hikvisionsdk.isc.managers.resource.models.person;

import xc.hikvisionsdk.enums.*;
import xc.hikvisionsdk.isc.enums.resource.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 人员信息请求
*/
public abstract class PersonRequestBase extends BaseRequest
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
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Required] public string PersonName {get;set;}
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
	 所属组织唯一标识码
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Required] public string OrgIndexCode {get;set;}
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
	 邮箱
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
	 出生日期
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
	 
	*/
	@Override
	public void CheckParams()
	{
	}
}