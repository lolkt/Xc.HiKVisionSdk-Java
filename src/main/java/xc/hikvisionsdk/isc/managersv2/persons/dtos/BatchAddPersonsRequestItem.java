package xc.hikvisionsdk.isc.managersv2.persons.dtos;

import xc.hikvisionsdk.enums.*;
import xc.hikvisionsdk.isc.enums.resource.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.persons.*;
import java.time.*;

/** 
 批量添加人员请求详细
*/
public class BatchAddPersonsRequestItem implements ICheckRequestItem
{
	/** 
	 人员ID
	*/
	private String PersonId;
	public final String getPersonId()
	{
		return PersonId;
	}
	private void setPersonId(String value)
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
	private void setPersonName(String value)
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
	private void setGender(Gender value)
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
	private void setOrgIndexCode(String value)
	{
		OrgIndexCode = value;
	}
	/** 
	 出生日期
	*/
	private String Birthday;
	public final String getBirthday()
	{
		return Birthday;
	}
	private void setBirthday(String value)
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
	private void setPhoneNo(String value)
	{
		PhoneNo = value;
	}
	/** 
	 邮箱
	*/
	private String Email;
	public final String getEmail()
	{
		return Email;
	}
	private void setEmail(String value)
	{
		Email = value;
	}
	/** 
	 工号
	*/
	private String JobNo;
	public final String getJobNo()
	{
		return JobNo;
	}
	private void setJobNo(String value)
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
	private void setCertificateType(CertificateType value)
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
	private void setCertificateNo(String value)
	{
		CertificateNo = value;
	}
	/** 
	 人员临时标志，
	 当调用方未指定personId时，clientId作为人员标志，在返回值中标志每个人员的添加结果。
	 所以每次接口调用，每个人员的clientid需保持唯一，1~10个字符，只支持数字。
	 注：clientid只对本次调用有效
	*/
	private int ClientId;
	public final int getClientId()
	{
		return ClientId;
	}
	private void setClientId(int value)
	{
		ClientId = value;
	}


	/** 
	 添加人员v2请求
	 
	 @param personName 姓名<![CDATA[1~32个字符；不能包含 ' / \ : * ? " < >]]></param>
	 @param gender 性别
	 @param orgIndexCode 所属组织标识，必须是已存在组织，从获取组织列表接口获取返回参数orgIndexCode
	 @param clientId 人员临时标志，当调用方未指定personId时，clientId作为人员标志，在返回值中标志每个人员的添加结果。        所以每次接口调用，每个人员的clientid需保持唯一，1~10个字符，只支持数字。注：clientid只对本次调用有效
	 @param personId 人员ID，可以指定人员personId，不允许与其他人员personId重复，包括已删除的人员。 为空时平台自动生成人员ID
	 @param birthday 出生日期
	 @param email 邮箱
	 @exception ArgumentNullException
	 @exception ArgumentOutOfRangeException
	*/

	public BatchAddPersonsRequestItem(String personName, Gender gender, String orgIndexCode, Integer clientId, String personId, java.time.LocalDateTime birthday)
	{
		this(personName, gender, orgIndexCode, clientId, personId, birthday, "");
	}

	public BatchAddPersonsRequestItem(String personName, Gender gender, String orgIndexCode, Integer clientId, String personId)
	{
		this(personName, gender, orgIndexCode, clientId, personId, null, "");
	}

	public BatchAddPersonsRequestItem(String personName, Gender gender, String orgIndexCode, Integer clientId)
	{
		this(personName, gender, orgIndexCode, clientId, "", null, "");
	}

	public BatchAddPersonsRequestItem(String personName, Gender gender, String orgIndexCode)
	{
		this(personName, gender, orgIndexCode, null, "", null, "");
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public BatchAddPersonsRequestItem(string personName, Gender gender, string orgIndexCode, System.Nullable<int> clientId = null, string personId = "", System.Nullable<DateTime> birthday = null, string email = "")
	public BatchAddPersonsRequestItem(String personName, Gender gender, String orgIndexCode, Integer clientId, String personId, LocalDateTime birthday, String email)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(personName))
		{
			throw new NullPointerException("personName");
		}
		if (personName.length() > 32)
		{
			throw new IndexOutOfBoundsException("personName", personName, "人员名称，1~32个字符；不能包含 ’ / \\ : * ? \" < > ");

		}
		setPersonName(personName);
		setGender(gender);
		if (tangible.StringHelper.isNullOrWhiteSpace(orgIndexCode))
		{
			throw new NullPointerException("orgIndexCode");
		}
		setOrgIndexCode(orgIndexCode);
		setPersonId(personId);
		if (birthday != null)
		{
			setBirthday(birthday.getValue().toString("yyyy-MM-dd"));
		}
		setEmail(email);
		if (clientId != null)
		{
			setClientId(clientId.intValue());
		}
	}

	/** 
	 使用身份证
	 
	 @param certificateType
	 @param certificateNo
	 @return 
	*/
	public final BatchAddPersonsRequestItem UseCertificate(CertificateType certificateType, String certificateNo)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(certificateNo))
		{
			throw new NullPointerException("certificateNo");
		}
		setCertificateType(certificateType);
		setCertificateNo(certificateNo);
		return this;
	}

	/** 
	 使用手机号
	 
	 @param phone 手机号
	 @return 
	 @exception ArgumentNullException
	*/
	public final BatchAddPersonsRequestItem UsePhone(String phone)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(phone))
		{
			throw new NullPointerException("phone");
		}
		if (phone.length() > 20)
		{
			throw new IndexOutOfBoundsException("phone");
		}
		setPhoneNo(phone);
		return this;
	}


	/** 
	 使用工号
	 
	 @param jobNo 工号
	 @return 
	 @exception ArgumentNullException
	*/
	public final BatchAddPersonsRequestItem UseJobNo(String jobNo)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(jobNo))
		{
			throw new NullPointerException("jobNo");
		}
		setJobNo(jobNo);
		return this;
	}

	/** 
	 
	 
	 @exception System.ArgumentNullException
	 @exception System.ArgumentOutOfRangeException
	*/
	public final void Check()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getPersonName()))
		{
			throw new NullPointerException("PersonName");
		}
		if (getPersonName().length() > 32)
		{
			throw new IndexOutOfBoundsException("PersonName", getPersonName(), "1~32个字符；不能包含 ’ / \\ : * ? \" < > ");
		}

		if (tangible.StringHelper.isNullOrWhiteSpace(getOrgIndexCode()))
		{
			throw new NullPointerException("OrgIndexCode");
		}
	}
}