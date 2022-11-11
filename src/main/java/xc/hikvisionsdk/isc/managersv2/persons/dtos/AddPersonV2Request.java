package xc.hikvisionsdk.isc.managersv2.persons.dtos;

import xc.hikvisionsdk.enums.*;
import xc.hikvisionsdk.isc.enums.resource.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.persons.*;
import java.time.*;

/** 
 添加人员v2请求
*/
public class AddPersonV2Request extends BaseRequest
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

	/** 
	 人脸信息
	*/
	private FaceDataInfo[] Faces;
	public final FaceDataInfo[] getFaces()
	{
		return Faces;
	}
	private void setFaces(FaceDataInfo[] value)
	{
		Faces = value;
	}

	/** 
	 添加人员v2请求
	 
	 @param personName 姓名<![CDATA[1~32个字符；不能包含 ' / \ : * ? " < >]]></param>
	 @param orgIndexCode 所属组织标识，必须是已存在组织，从获取组织列表接口获取返回参数orgIndexCode
	 @param gender 性别
	 @param personId 人员ID，可以指定人员personId，不允许与其他人员personId重复，包括已删除的人员。 为空时平台自动生成人员ID
	 @param birthday 出生日期
	 @param email 邮箱
	 @exception ArgumentNullException
	 @exception ArgumentOutOfRangeException
	*/

	public AddPersonV2Request(String personName, String orgIndexCode, Gender gender, String personId, java.time.LocalDateTime birthday)
	{
		this(personName, orgIndexCode, gender, personId, birthday, "");
	}

	public AddPersonV2Request(String personName, String orgIndexCode, Gender gender, String personId)
	{
		this(personName, orgIndexCode, gender, personId, null, "");
	}

	public AddPersonV2Request(String personName, String orgIndexCode, Gender gender)
	{
		this(personName, orgIndexCode, gender, "", null, "");
	}

	public AddPersonV2Request(String personName, String orgIndexCode)
	{
		this(personName, orgIndexCode, null, "", null, "");
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public AddPersonV2Request(string personName, string orgIndexCode, System.Nullable<Gender> gender = null, string personId = "", System.Nullable<DateTime> birthday = null, string email = "")
	public AddPersonV2Request(String personName, String orgIndexCode, Gender gender, String personId, LocalDateTime birthday, String email)
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
		if (gender != null)
		{
			setGender(gender);
		}
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
	}

	/** 
	 使用身份证
	 
	 @param certificateType
	 @param certificateNo
	 @return 
	*/
	public final AddPersonV2Request UseCertificate(CertificateType certificateType, String certificateNo)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(certificateNo))
		{
			throw new NullPointerException("certificateNo");
		}

		if (certificateNo.length() > 20)
		{
			throw new IndexOutOfBoundsException("certificateNo", certificateNo, "证件号码，1-20位数字字母");
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
	public final AddPersonV2Request UsePhone(String phone)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(phone))
		{
			throw new NullPointerException("phone");
		}
		if (phone.length() > 20)
		{
			throw new IndexOutOfBoundsException("phone", phone, "手机号，1-20位数字");
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
	public final AddPersonV2Request UseJobNo(String jobNo)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(jobNo))
		{
			throw new NullPointerException("jobNo");
		}
		if (jobNo.length() > 32)
		{
			throw new IndexOutOfBoundsException("jobNo", jobNo, "工号，1-32个字符");
		}
		setJobNo(jobNo);
		return this;
	}

	/** 
	 使用人脸信息
	 
	 @param faceDates 人脸信息
	 @return 
	 @exception ArgumentNullException
	*/
	public final AddPersonV2Request UseFace(FaceDataInfo... faceDates)
	{
		if (faceDates == null || faceDates.length == 0)
		{
			throw new NullPointerException("faceDates");
		}
		setFaces(faceDates);
		return this;
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	*/
	@Override
	public void CheckParams()
	{

		if (tangible.StringHelper.isNullOrWhiteSpace(getJobNo()) && tangible.StringHelper.isNullOrWhiteSpace(getCertificateNo()) && tangible.StringHelper.isNullOrWhiteSpace(getPhoneNo()))
		{
			throw new NullPointerException("JobNo,CertificateNo,PhoneNo", "人员信息实名标识不能都为空");
		}

	}

}