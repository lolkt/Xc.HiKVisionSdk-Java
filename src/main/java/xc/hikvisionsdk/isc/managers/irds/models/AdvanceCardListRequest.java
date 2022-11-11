package xc.hikvisionsdk.isc.managers.irds.models;

import xc.hikvisionsdk.consts.*;
import xc.hikvisionsdk.isc.enums.irds.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.irds.*;

/** 
 查询卡片列表请求
*/
public class AdvanceCardListRequest extends PagedRequest
{
	/** 
	 人员姓名,模糊查询
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
	 卡号,模糊查询， 根据获取卡片列表接口获取返回参数cardNo
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
	 人员ID集，多个值使用英文逗号分隔，不超过1000个， 根据获取人员列表v2接口获取返回参数personId
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
	 使用状态标记，1：正常.
	 2：挂失
	*/
	private UseStatus UseStatus = UseStatus.values()[0];
	public final UseStatus getUseStatus()
	{
		return UseStatus;
	}
	public final void setUseStatus(UseStatus value)
	{
		UseStatus = value;
	}
	/** 
	 排序字段必须是查询条件，否则返回参数错误
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
	 降序：desc.        升序：asc
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
	 查询卡片列表请求
	 
	 @param pageNo
	 @param pageSize
	 @param personName 人员姓名
	 @param cardNo 卡号
	 @param onlyLoss 只看挂失
	 @param orderBy 排序字段必须是查询条件
	 @param isAsc 使用升序
	*/

	public AdvanceCardListRequest(int pageNo, int pageSize, String personName, String cardNo, boolean onlyLoss, String orderBy)
	{
		this(pageNo, pageSize, personName, cardNo, onlyLoss, orderBy, true);
	}

	public AdvanceCardListRequest(int pageNo, int pageSize, String personName, String cardNo, boolean onlyLoss)
	{
		this(pageNo, pageSize, personName, cardNo, onlyLoss, "", true);
	}

	public AdvanceCardListRequest(int pageNo, int pageSize, String personName, String cardNo)
	{
		this(pageNo, pageSize, personName, cardNo, false, "", true);
	}

	public AdvanceCardListRequest(int pageNo, int pageSize, String personName)
	{
		this(pageNo, pageSize, personName, "", false, "", true);
	}

	public AdvanceCardListRequest(int pageNo, int pageSize)
	{
		this(pageNo, pageSize, "", "", false, "", true);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public AdvanceCardListRequest(int pageNo, int pageSize, string personName = "", string cardNo = "", bool onlyLoss = false, string orderBy = "", bool isAsc = true)
	public AdvanceCardListRequest(int pageNo, int pageSize, String personName, String cardNo, boolean onlyLoss, String orderBy, boolean isAsc)
	{
		super(pageNo, pageSize);
		setPersonName(personName);
		setCardNo(cardNo);
		setUseStatus(onlyLoss ? UseStatus.Loss : UseStatus.Normal);
		setOrderBy(orderBy);
		setOrderType(OrderTypeConsts.GetOrderType(isAsc));
	}

	/** 
	 使用人员ID集
	 
	 @param personIds
	 @return 
	*/
	public final AdvanceCardListRequest UsePersonIds(String... personIds)
	{
		if (personIds == null)
		{
			throw new NullPointerException("personIds");

		}

		if (personIds.length > 1000)
		{
			throw new IndexOutOfBoundsException("personIds", personIds.length, "人员ID集，不超过1000个");
		}

		setPersonIds(tangible.StringHelper.join(",", personIds));
		return this;
	}


}