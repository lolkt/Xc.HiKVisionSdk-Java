package xc.hikvisionsdk.isc.managersv2.persons.dtos;

import xc.hikvisionsdk.enums.*;
import xc.hikvisionsdk.isc.enums.resource.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.persons.*;

/** 
 
*/
public class PersonDetailInfo
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
	 出生日期，例"1990-01-01"
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
	 学历
	*/
	private int Education;
	public final int getEducation()
	{
		return Education;
	}
	public final void setEducation(int value)
	{
		Education = value;
	}
	/** 
	 人员姓氏
	*/
	private String LastName;
	public final String getLastName()
	{
		return LastName;
	}
	public final void setLastName(String value)
	{
		LastName = value;
	}
	/** 
	 人员名称
	*/
	private String GivenName;
	public final String getGivenName()
	{
		return GivenName;
	}
	public final void setGivenName(String value)
	{
		GivenName = value;
	}
	/** 
	 年龄
	*/
	private int Age;
	public final int getAge()
	{
		return Age;
	}
	public final void setAge(int value)
	{
		Age = value;
	}
	/** 
	 职业
	*/
	private String Job;
	public final String getJob()
	{
		return Job;
	}
	public final void setJob(String value)
	{
		Job = value;
	}

	/** 
	 职工性质
	*/
	private String StaffProperty;
	public final String getStaffProperty()
	{
		return StaffProperty;
	}
	public final void setStaffProperty(String value)
	{
		StaffProperty = value;
	}
	/** 
	 工作单位
	*/
	private String Company;
	public final String getCompany()
	{
		return Company;
	}
	public final void setCompany(String value)
	{
		Company = value;
	}
	/** 
	 职位
	*/
	private String EmployeePost;
	public final String getEmployeePost()
	{
		return EmployeePost;
	}
	public final void setEmployeePost(String value)
	{
		EmployeePost = value;
	}
	/** 
	 员工编号
	*/
	private String EmployeeNumber;
	public final String getEmployeeNumber()
	{
		return EmployeeNumber;
	}
	public final void setEmployeeNumber(String value)
	{
		EmployeeNumber = value;
	}
	/** 
	 岗位类别
	*/
	private String PostType;
	public final String getPostType()
	{
		return PostType;
	}
	public final void setPostType(String value)
	{
		PostType = value;
	}
	/** 
	 身份类型
	*/
	private String IdentityType;
	public final String getIdentityType()
	{
		return IdentityType;
	}
	public final void setIdentityType(String value)
	{
		IdentityType = value;
	}
	/** 
	 国籍
	*/
	private String Nationality;
	public final String getNationality()
	{
		return Nationality;
	}
	public final void setNationality(String value)
	{
		Nationality = value;
	}

	/** 
	 
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
	 籍贯
	*/
	private String Birthplace;
	public final String getBirthplace()
	{
		return Birthplace;
	}
	public final void setBirthplace(String value)
	{
		Birthplace = value;
	}
	/** 
	 户籍
	*/
	private String CensusRegister;
	public final String getCensusRegister()
	{
		return CensusRegister;
	}
	public final void setCensusRegister(String value)
	{
		CensusRegister = value;
	}
	/** 
	 婚姻状况
	*/
	private Marriaged Marriaged = null;
	public final Marriaged getMarriaged()
	{
		return Marriaged;
	}
	public final void setMarriaged(Marriaged value)
	{
		Marriaged = value;
	}
	/** 
	 政治面貌
	*/
	private String PoliticalStatus;
	public final String getPoliticalStatus()
	{
		return PoliticalStatus;
	}
	public final void setPoliticalStatus(String value)
	{
		PoliticalStatus = value;
	}
	/** 
	 
	*/
	private String Religion;
	public final String getReligion()
	{
		return Religion;
	}
	public final void setReligion(String value)
	{
		Religion = value;
	}
	/** 
	 房间号
	*/
	private String RoomNum;
	public final String getRoomNum()
	{
		return RoomNum;
	}
	public final void setRoomNum(String value)
	{
		RoomNum = value;
	}
	/** 
	 与户主关系
	*/
	private String HouseHolderRel;
	public final String getHouseHolderRel()
	{
		return HouseHolderRel;
	}
	public final void setHouseHolderRel(String value)
	{
		HouseHolderRel = value;
	}
	/** 
	 学号
	*/
	private String StudentId;
	public final String getStudentId()
	{
		return StudentId;
	}
	public final void setStudentId(String value)
	{
		StudentId = value;
	}
	/** 
	 学生入学时间
	*/
	private DateTimeOffset StuStartTime = null;
	public final DateTimeOffset getStuStartTime()
	{
		return StuStartTime;
	}
	public final void setStuStartTime(DateTimeOffset value)
	{
		StuStartTime = value;
	}
	/** 
	 学生毕业时间
	*/
	private DateTimeOffset StuEndTime = null;
	public final DateTimeOffset getStuEndTime()
	{
		return StuEndTime;
	}
	public final void setStuEndTime(DateTimeOffset value)
	{
		StuEndTime = value;
	}
	/** 
	 年级
	*/
	private String StuGrade;
	public final String getStuGrade()
	{
		return StuGrade;
	}
	public final void setStuGrade(String value)
	{
		StuGrade = value;
	}
	/** 
	 班级
	*/
	private String StuClass;
	public final String getStuClass()
	{
		return StuClass;
	}
	public final void setStuClass(String value)
	{
		StuClass = value;
	}
	/** 
	 学院
	*/
	private String Academy;
	public final String getAcademy()
	{
		return Academy;
	}
	public final void setAcademy(String value)
	{
		Academy = value;
	}
	/** 
	 学生专业
	*/
	private String Profession;
	public final String getProfession()
	{
		return Profession;
	}
	public final void setProfession(String value)
	{
		Profession = value;
	}
	/** 
	 宿舍楼
	*/
	private String Dormitory;
	public final String getDormitory()
	{
		return Dormitory;
	}
	public final void setDormitory(String value)
	{
		Dormitory = value;
	}

	/** 
	 是否住校，1:是；2:否
	*/
	private int Lodge;
	public final int getLodge()
	{
		return Lodge;
	}
	public final void setLodge(int value)
	{
		Lodge = value;
	}
	/** 
	 人员描述
	*/
	private String PersonDesc;
	public final String getPersonDesc()
	{
		return PersonDesc;
	}
	public final void setPersonDesc(String value)
	{
		PersonDesc = value;
	}
	/** 
	 同步标志类型
	*/
	private int SyncFlag;
	public final int getSyncFlag()
	{
		return SyncFlag;
	}
	public final void setSyncFlag(int value)
	{
		SyncFlag = value;
	}
	/** 
	 拼音
	*/
	private String Pinyin;
	public final String getPinyin()
	{
		return Pinyin;
	}
	public final void setPinyin(String value)
	{
		Pinyin = value;
	}
	/** 
	 发证机构
	*/
	private String CertIssuer;
	public final String getCertIssuer()
	{
		return CertIssuer;
	}
	public final void setCertIssuer(String value)
	{
		CertIssuer = value;
	}
	/** 
	 发证地址
	*/
	private String CertAddr;
	public final String getCertAddr()
	{
		return CertAddr;
	}
	public final void setCertAddr(String value)
	{
		CertAddr = value;
	}
	/** 
	 证件有效期
	*/
	private DateTimeOffset CertExpireTime = null;
	public final DateTimeOffset getCertExpireTime()
	{
		return CertExpireTime;
	}
	public final void setCertExpireTime(DateTimeOffset value)
	{
		CertExpireTime = value;
	}
	/** 
	 状态小于0则代表资源已被删除
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
	 已被删除
	*/
	public final boolean isDeleted()
	{
		return getStatus() < 0;
	}
	/** 
	 是否住校
	*/
	public final boolean isLodge()
	{
		return getLodge() == 1;
	}

}