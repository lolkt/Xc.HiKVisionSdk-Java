package xc.hikvisionsdk.isc.managers.acs.models;

import xc.hikvisionsdk.enums.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.acs.*;

/** 
 人员信息详情
*/
public class PersonDetail
{
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
	 证件号码
	*/
	private String CertNo;
	public final String getCertNo()
	{
		return CertNo;
	}
	public final void setCertNo(String value)
	{
		CertNo = value;
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
	 楼栋
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
	 学历，参考附录A.12 学历类型
	*/
	private Integer EducationBackground = null;
	public final Integer getEducationBackground()
	{
		return EducationBackground;
	}
	public final void setEducationBackground(Integer value)
	{
		EducationBackground = value;
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
	 行政职务
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
	 用户自定义输入字符串
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
	 是否住校
	*/
	private Integer Lodge = null;
	public final Integer getLodge()
	{
		return Lodge;
	}
	public final void setLodge(Integer value)
	{
		Lodge = value;
	}
	/** 
	 婚姻状况,参考附录A.58 婚姻状况
	*/
	private Integer Marriaged = null;
	public final Integer getMarriaged()
	{
		return Marriaged;
	}
	public final void setMarriaged(Integer value)
	{
		Marriaged = value;
	}
	/** 
	 电话
	*/
	private String Mobile;
	public final String getMobile()
	{
		return Mobile;
	}
	public final void setMobile(String value)
	{
		Mobile = value;
	}
	/** 
	 民族,参考附录A.13 民族类型
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
	 人员所属组织ID
	*/
	private String OrgId;
	public final String getOrgId()
	{
		return OrgId;
	}
	public final void setOrgId(String value)
	{
		OrgId = value;
	}
	/** 
	 人员唯一编码
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
	 人员名称
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
	 岗位类别， 用户自定义输入
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
	 专业
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
	 宗教信仰
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
	 性别
	 0: 未知
	 1: 男
	 2: 女
	*/
	private Gender Sex = null;
	public final Gender getSex()
	{
		return Sex;
	}
	public final void setSex(Gender value)
	{
		Sex = value;
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
	 证件类型:
	 111: 身份证
	 414：护照
	 335: 驾驶证
	 131: 工作证
	 133: 学生证
	 113: 户口簿
	 990: 其他
	*/
	private Integer CertType = null;
	public final Integer getCertType()
	{
		return CertType;
	}
	public final void setCertType(Integer value)
	{
		CertType = value;
	}
}