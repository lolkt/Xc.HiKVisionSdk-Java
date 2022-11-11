package xc.hikvisionsdk.isc.managers.resource.models.person;

import xc.hikvisionsdk.enums.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 查询人员列表V2请求
*/
public class AdvancePersonListV2Request extends PagedRequest
{
	/** 
	 人员ID集合
	 多个值使用英文逗号分隔，不超过1000个
	 获取人员列表v2 接口获取
	*/
	private String PersonIds;
	public final String getPersonIds()
	{
		return PersonIds;
	}
	public final void setPersonIds(String value)
	{
		PersonIds = value;
	}
	/** 
	 人员姓名
	 支持中英文字符，不能包含 ' / \ : * ? " 
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
	  	所属组织唯一标识码集合
	  	多个值使用英文逗号分隔，不超过1000个
	*/
	private String OrgIndexCodes;
	public final String getOrgIndexCodes()
	{
		return OrgIndexCodes;
	}
	public final void setOrgIndexCodes(String value)
	{
		OrgIndexCodes = value;
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
	  	平台上人员信息实名标识选择为身份证件时必填
	*/
	private int CertificateType;
	public final int getCertificateType()
	{
		return CertificateType;
	}
	public final void setCertificateType(int value)
	{
		CertificateType = value;
	}
	/** 
	 证件号码(最大长度64)
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
	 是否包含下级组织，true时，搜索orgIndexCodes及其所有子孙组织的人员；
	 false时，只搜索orgIndexCodes的人员
	*/
	private String IsSubOrg;
	public final String isSubOrg()
	{
		return IsSubOrg;
	}
	public final void setSubOrg(String value)
	{
		IsSubOrg = value;
	}
	/** 
	 卡号, 获取卡片列表接口可以获取
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
	 车牌号
	*/
	private String PlateNo;
	public final String getPlateNo()
	{
		return PlateNo;
	}
	public final void setPlateNo(String value)
	{
		PlateNo = value;
	}


	/** 
	 排序字段，注意：排序字段必须是查询条件，否则返回参数错误
	*/
	private String OrderBy;
	public final String getOrderBy()
	{
		return OrderBy;
	}
	public final void setOrderBy(String value)
	{
		OrderBy = value;
	}
	/** 
	 降序：desc
	 升序：asc
	*/
	private String OrderType;
	public final String getOrderType()
	{
		return OrderType;
	}
	public final void setOrderType(String value)
	{
		OrderType = value;
	}
	/** 
	 查询表达式
	*/
	private RequestExpression[] Expressions;
	public final RequestExpression[] getExpressions()
	{
		return Expressions;
	}
	public final void setExpressions(RequestExpression[] value)
	{
		Expressions = value;
	}

	/** 
	 查询人员列表V2请求
	*/
	public AdvancePersonListV2Request()
	{
	}

	/** 
	 查询人员列表V2请求
	 
	 @param pageNo
	 @param pageSize
	*/
	public AdvancePersonListV2Request(int pageNo, int pageSize)
	{
		super(pageNo, pageSize);
	}


}