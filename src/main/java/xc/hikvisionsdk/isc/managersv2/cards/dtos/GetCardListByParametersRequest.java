package xc.hikvisionsdk.isc.managersv2.cards.dtos;

import xc.hikvisionsdk.consts.*;
import xc.hikvisionsdk.isc.enums.irds.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.cards.*;

/** 
 查询卡片列表请求
*/
public class GetCardListByParametersRequest extends PagedRequest
{
	/** 
	 人员姓名,模糊查询
	*/
	private String PersonName;
	public final String getPersonName()
	{
		return PersonName;
	}
	/** 
	 卡号,模糊查询， 根据获取卡片列表接口获取返回参数cardNo
	*/
	private String CardNo;
	public final String getCardNo()
	{
		return CardNo;
	}
	/** 
	 人员ID集，多个值使用英文逗号分隔，不超过1000个， 根据获取人员列表v2接口获取返回参数personId
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
	 使用状态标记，1：正常.
	 2：挂失
	*/
	private UseStatus UseStatus = null;
	public final UseStatus getUseStatus()
	{
		return UseStatus;
	}
	/** 
	 排序字段必须是查询条件，否则返回参数错误
	*/
	private String OrderBy;
	public final String getOrderBy()
	{
		return OrderBy;
	}
	/** 
	 降序：desc.        升序：asc
	*/
	private String OrderType;
	public final String getOrderType()
	{
		return OrderType;
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

	public GetCardListByParametersRequest(int pageNo, int pageSize, String personName, String cardNo, Boolean onlyLoss, String orderBy)
	{
		this(pageNo, pageSize, personName, cardNo, onlyLoss, orderBy, true);
	}

	public GetCardListByParametersRequest(int pageNo, int pageSize, String personName, String cardNo, Boolean onlyLoss)
	{
		this(pageNo, pageSize, personName, cardNo, onlyLoss, "", true);
	}

	public GetCardListByParametersRequest(int pageNo, int pageSize, String personName, String cardNo)
	{
		this(pageNo, pageSize, personName, cardNo, null, "", true);
	}

	public GetCardListByParametersRequest(int pageNo, int pageSize, String personName)
	{
		this(pageNo, pageSize, personName, "", null, "", true);
	}

	public GetCardListByParametersRequest(int pageNo, int pageSize)
	{
		this(pageNo, pageSize, "", "", null, "", true);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public GetCardListByParametersRequest(int pageNo, int pageSize, string personName = "", string cardNo = "", System.Nullable<bool> onlyLoss = null, string orderBy = "", bool isAsc = true)
	public GetCardListByParametersRequest(int pageNo, int pageSize, String personName, String cardNo, Boolean onlyLoss, String orderBy, boolean isAsc)
	{
		super(pageNo, pageSize);
		PersonName = personName;
		CardNo = cardNo;
		OrderBy = orderBy;
		OrderType = OrderTypeConsts.GetOrderType(isAsc);
		if (onlyLoss != null)
		{
			UseStatus = onlyLoss.booleanValue() ? enums.irds.UseStatus.Loss : enums.irds.UseStatus.Normal;
		}
	}

	/** 
	 使用人员ID集查询
	 
	 @param personIds 人员ID集
	 @return 
	*/
	public final GetCardListByParametersRequest UsePersonIds(String... personIds)
	{
		if (personIds == null || personIds.length > 1000)
		{
			throw new IndexOutOfBoundsException("personIds", "人员ID集，不超过1000个");
		}

		setPersonIds(tangible.StringHelper.join(",", personIds));
		return this;
	}


}