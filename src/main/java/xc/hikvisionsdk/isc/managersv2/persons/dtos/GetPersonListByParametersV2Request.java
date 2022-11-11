package xc.hikvisionsdk.isc.managersv2.persons.dtos;

import xc.hikvisionsdk.consts.*;
import xc.hikvisionsdk.enums.*;
import xc.hikvisionsdk.isc.enums.resource.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.persons.*;

/** 
 
*/
public class GetPersonListByParametersV2Request extends PagedRequest
{
	/** 
	 人员ID集合        多个值使用英文逗号分隔，不超过1000个        获取人员列表v2 接口获取
	*/
	private String PersonIds;
	public final String getPersonIds()
	{
		return PersonIds;
	}
	private void setPersonIds(String value)
	{
		PersonIds = value;
	}
	/** 
	 <![CDATA[人员姓名 支持中英文字符，不能包含 ' / \ : * ? " < >]]>
	*/
	private String PersonName;
	public final String getPersonName()
	{
		return PersonName;
	}
	/** 
	 性别
	*/
	private Gender Gender = null;
	public final Gender getGender()
	{
		return Gender;
	}
	/** 
	 所属组织唯一标识码集合        多个值使用英文逗号分隔，不超过1000个
	*/
	private String OrgIndexCodes;
	public final String getOrgIndexCodes()
	{
		return OrgIndexCodes;
	}
	private void setOrgIndexCodes(String value)
	{
		OrgIndexCodes = value;
	}
	/** 
	 证件类型
	*/
	private CertificateType CertificateType = null;
	public final CertificateType getCertificateType()
	{
		return CertificateType;
	}
	private void setCertificateType(CertificateType value)
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
	private void setCertificateNo(String value)
	{
		CertificateNo = value;
	}
	/** 
	 是否包含下级组织，true时，搜索orgIndexCodes及其所有子孙组织的人员；        false时，只搜索orgIndexCodes的人员
	*/
	private boolean IsSubOrg;
	public final boolean isSubOrg()
	{
		return IsSubOrg;
	}
	private void setSubOrg(boolean value)
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
	private void setCardNo(String value)
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
	private void setPlateNo(String value)
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
	private void setOrderBy(String value)
	{
		OrderBy = value;
	}
	/** 
	 降序：desc        升序：asc
	*/
	private String OrderType;
	public final String getOrderType()
	{
		return OrderType;
	}
	private void setOrderType(String value)
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
	private void setExpressions(RequestExpression[] value)
	{
		Expressions = value;
	}

	/**
	*/

	public GetPersonListByParametersV2Request(int pageNo, int pageSize, String personName, Gender gender, CertificateType certificateType, String certificateNo, String cardNo, String plateNo, boolean isSubOrg, String orderBy)
	{
		this(pageNo, pageSize, personName, gender, certificateType, certificateNo, cardNo, plateNo, isSubOrg, orderBy, null);
	}

	public GetPersonListByParametersV2Request(int pageNo, int pageSize, String personName, Gender gender, CertificateType certificateType, String certificateNo, String cardNo, String plateNo, boolean isSubOrg)
	{
		this(pageNo, pageSize, personName, gender, certificateType, certificateNo, cardNo, plateNo, isSubOrg, "", null);
	}

	public GetPersonListByParametersV2Request(int pageNo, int pageSize, String personName, Gender gender, CertificateType certificateType, String certificateNo, String cardNo, String plateNo)
	{
		this(pageNo, pageSize, personName, gender, certificateType, certificateNo, cardNo, plateNo, false, "", null);
	}

	public GetPersonListByParametersV2Request(int pageNo, int pageSize, String personName, Gender gender, CertificateType certificateType, String certificateNo, String cardNo)
	{
		this(pageNo, pageSize, personName, gender, certificateType, certificateNo, cardNo, "", false, "", null);
	}

	public GetPersonListByParametersV2Request(int pageNo, int pageSize, String personName, Gender gender, CertificateType certificateType, String certificateNo)
	{
		this(pageNo, pageSize, personName, gender, certificateType, certificateNo, "", "", false, "", null);
	}

	public GetPersonListByParametersV2Request(int pageNo, int pageSize, String personName, Gender gender, CertificateType certificateType)
	{
		this(pageNo, pageSize, personName, gender, certificateType, "", "", "", false, "", null);
	}

	public GetPersonListByParametersV2Request(int pageNo, int pageSize, String personName, Gender gender)
	{
		this(pageNo, pageSize, personName, gender, null, "", "", "", false, "", null);
	}

	public GetPersonListByParametersV2Request(int pageNo, int pageSize, String personName)
	{
		this(pageNo, pageSize, personName, null, null, "", "", "", false, "", null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public GetPersonListByParametersV2Request(int pageNo, int pageSize, string personName, System.Nullable<Gender> gender = null, System.Nullable<CertificateType> certificateType = null, string certificateNo = "", string cardNo = "", string plateNo = "", bool isSubOrg = false, string orderBy = "", System.Nullable<bool> isAsc = null)
	public GetPersonListByParametersV2Request(int pageNo, int pageSize, String personName, Gender gender, CertificateType certificateType, String certificateNo, String cardNo, String plateNo, boolean isSubOrg, String orderBy, Boolean isAsc)
	{
		super(pageNo, pageSize);
		PersonName = personName;
		setSubOrg(isSubOrg);
		setOrderBy(orderBy);

		if (isAsc != null)
		{
			if (tangible.StringHelper.isNullOrWhiteSpace(orderBy))
			{
				throw new NullPointerException("orderBy", "指定排序方式时，排序字段不可为空");
			}
			setOrderType(OrderTypeConsts.GetOrderType(isAsc.booleanValue()));
		}
		Gender = gender;
		setCertificateType(certificateType);
		setCertificateNo(certificateNo);
		setCardNo(cardNo);
		setPlateNo(plateNo);
	}

	/** 
	 使用组织唯一标识码集合
	 
	 @param orgIndexCodes 组织唯一标识码集合，多个值使用英文逗号分隔，不超过1000个，从获取组织列表接口获取返回参数orgIndexCode
	 @return 
	*/
	public final GetPersonListByParametersV2Request UseOrgIndexCodes(String... orgIndexCodes)
	{
		if (orgIndexCodes == null || orgIndexCodes.length == 0)
		{
			throw new NullPointerException("orgIndexCodes");
		}
		if (orgIndexCodes.length > 1000)
		{
			throw new IndexOutOfBoundsException("orgIndexCodes", "最大1000个");
		}
		setOrgIndexCodes(tangible.StringHelper.join(",", orgIndexCodes));
		return this;
	}

	/** 
	 使用人员ID集合
	 
	 @param personIds 人员ID集合        多个值使用英文逗号分隔，不超过1000个        获取人员列表v2 接口获取
	 @return 
	*/
	public final GetPersonListByParametersV2Request UseParentOrgIndexCodes(String... personIds)
	{
		if (personIds == null || personIds.length == 0)
		{
			throw new NullPointerException("personIds");
		}
		if (personIds.length > 1000)
		{
			throw new IndexOutOfBoundsException("personIds", "最大1000个");
		}
		setPersonIds(tangible.StringHelper.join(",", personIds));
		return this;
	}

	/** 
	 使用查询表达式
	 
	 @param expressions 查询表达式
	 @return 
	*/
	public final GetPersonListByParametersV2Request UseRequestExpression(RequestExpression... expressions)
	{
		if (expressions == null || expressions.length == 0)
		{
			throw new NullPointerException("expressions");
		}
		//if (expressions.Length > 1000)
		//{
		//    throw new ArgumentOutOfRangeException(nameof(expressions), "最大1000个");
		//}
		setExpressions(expressions);
		return this;
	}
}