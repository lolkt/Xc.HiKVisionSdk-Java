package xc.hikvisionsdk.isc.managersv2.cards.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.cards.*;
import java.time.*;

/** 
 批量开卡请求
*/
public class BindingCardsRequest extends BaseRequest
{
	/** 
	 卡片最大截止有效时间
	*/
	private static final LocalDateTime maxEndDate = LocalDateTime.of(2037, 12, 31);

	/** 
	 卡片开始有效时间，时间格式：yyyy-MM-dd
	*/
	private String StartDate;
	public final String getStartDate()
	{
		return StartDate;
	}
	/** 
	 卡片截止有效时间,时间格式：yyyy-MM-dd。        不能大于2037年12月31日
	*/
	private String EndDate;
	public final String getEndDate()
	{
		return EndDate;
	}
	/** 
	 待开卡列表,最大支持50张卡
	*/
	private BindingCardsRequestItem[] CardList;
	public final BindingCardsRequestItem[] getCardList()
	{
		return CardList;
	}

	/** 
	 批量开卡请求
	 
	 @param startDate 卡片开始有效时间
	 @param endDate 卡片截止有效时间,不能大于2037年12月31日
	 @param cardList 待开卡列表,最大支持50张卡
	 @exception ArgumentOutOfRangeException
	*/
	public BindingCardsRequest(LocalDateTime startDate, LocalDateTime endDate, BindingCardsRequestItem... cardList)
	{
		if (endDate.compareTo(maxEndDate) > 0)
		{
			throw new IndexOutOfBoundsException("endDate", "卡片截止有效时间,不能大于2037年12月31日");
		}
		if (cardList == null)
		{
			throw new NullPointerException("cardList");
		}
		if (cardList.length > 50)
		{
			throw new IndexOutOfBoundsException("cardList", "待开卡列表,最大支持50张卡");

		}
		StartDate = startDate.toString("yyyy-MM-dd");
		EndDate = endDate.toString("yyyy-MM-dd");
		CardList = cardList;
	}

}