package xc.hikvisionsdk.isc.managersv2.persons.dtos;

import xc.hikvisionsdk.enums.*;
import xc.hikvisionsdk.isc.enums.resource.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.persons.*;
import java.time.*;

/** 
 修改人员请求
*/
public class UpdatePersonRequest extends BaseRequest
{
	/** 
	 修改人员请求
	 
	 @param personId 人员id 获取人员列表v2 接口获取返回参数personId
	 @param personName 姓名<![CDATA[1~32个字符；不能包含 ' / \ : * ? " < >]]></param>
	 @param orgIndexCode 所属组织标识，必须是已存在组织，从获取组织列表接口获取返回参数orgIndexCode
	 @param gender 性别
	 @param phoneNo 手机号
	 @param jobNo 工号
	 @param certificateType 证件类型
	 @param certificateNo 证件号码，1-20位数字字母
	 @param email 邮箱
	 @param birthday 出生日期
	 @exception ArgumentNullException
	 @exception ArgumentOutOfRangeException
	*/

	public UpdatePersonRequest(String personId, String personName, String orgIndexCode, Gender gender, String phoneNo, String jobNo, CertificateType certificateType, String certificateNo, String email)
	{
		this(personId, personName, orgIndexCode, gender, phoneNo, jobNo, certificateType, certificateNo, email, null);
	}

	public UpdatePersonRequest(String personId, String personName, String orgIndexCode, Gender gender, String phoneNo, String jobNo, CertificateType certificateType, String certificateNo)
	{
		this(personId, personName, orgIndexCode, gender, phoneNo, jobNo, certificateType, certificateNo, "", null);
	}

	public UpdatePersonRequest(String personId, String personName, String orgIndexCode, Gender gender, String phoneNo, String jobNo, CertificateType certificateType)
	{
		this(personId, personName, orgIndexCode, gender, phoneNo, jobNo, certificateType, "", "", null);
	}

	public UpdatePersonRequest(String personId, String personName, String orgIndexCode, Gender gender, String phoneNo, String jobNo)
	{
		this(personId, personName, orgIndexCode, gender, phoneNo, jobNo, null, "", "", null);
	}

	public UpdatePersonRequest(String personId, String personName, String orgIndexCode, Gender gender, String phoneNo)
	{
		this(personId, personName, orgIndexCode, gender, phoneNo, "", null, "", "", null);
	}

	public UpdatePersonRequest(String personId, String personName, String orgIndexCode, Gender gender)
	{
		this(personId, personName, orgIndexCode, gender, "", "", null, "", "", null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public UpdatePersonRequest(string personId, string personName, string orgIndexCode, System.Nullable<Gender> gender, string phoneNo = "", string jobNo = "", System.Nullable<CertificateType> certificateType = null, string certificateNo = "", string email = "", System.Nullable<DateTime> birthday = null)
	public UpdatePersonRequest(String personId, String personName, String orgIndexCode, Gender gender, String phoneNo, String jobNo, CertificateType certificateType, String certificateNo, String email, LocalDateTime birthday)
	{

		if (tangible.StringHelper.isNullOrWhiteSpace(personId))
		{
			throw new NullPointerException("personId");
		}
		if (!tangible.StringHelper.isNullOrWhiteSpace(personName) && personName.length() > 32)
		{
			throw new IndexOutOfBoundsException("personName", personName, "人员名称，1~32个字符；不能包含 ’ / \\ : * ? \" < > ");
		}

		if (!tangible.StringHelper.isNullOrWhiteSpace(jobNo) && jobNo.length() > 32)
		{
			throw new IndexOutOfBoundsException("jobNo", jobNo, "工号，1-32个字符");
		}
		if (!tangible.StringHelper.isNullOrWhiteSpace(phoneNo) && phoneNo.length() > 20)
		{
			throw new IndexOutOfBoundsException("phoneNo", phoneNo, "手机号，1-20位数字");
		}

		if (tangible.StringHelper.isNullOrWhiteSpace(orgIndexCode))
		{
			throw new NullPointerException("orgIndexCode");
		}

		setPersonId(personId);
		setPersonName(personName);
		if (gender != null)
		{
			setGender(gender);
		}
		setOrgIndexCode(orgIndexCode);
		setPhoneNo(phoneNo);
		setJobNo(jobNo);
		if (certificateType != null)
		{
			setCertificateType(certificateType);
			if (tangible.StringHelper.isNullOrWhiteSpace(certificateNo))
			{
				throw new NullPointerException("certificateNo");
			}
			if (certificateNo.length() > 20)
			{
				throw new IndexOutOfBoundsException("certificateNo", certificateNo, "证件号码，1-20位数字字母");

			}
		}

		setEmail(email);
		if (birthday != null)
		{
			setBirthday(birthday.getValue().toString("yyyy-MM-dd"));
		}
	}

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
	 姓名<![CDATA[1~32个字符；不能包含 ' / \ : * ? " < >]]>
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
}