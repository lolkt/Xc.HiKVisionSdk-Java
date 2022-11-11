package xc.hikvisionsdk.isc.managersv2.cards.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.cards.*;

/** 
 挂失请求
*/
public class AddCardsLossRequest extends BaseRequest
{
	/** 
	 人卡关联结合数组(批量挂失数量不能超过200个)
	*/
	private CardNoAndPersonIdItem[] CardList;
	public final CardNoAndPersonIdItem[] getCardList()
	{
		return CardList;
	}

	/** 
	 挂失请求
	 
	 @param cardList 人卡关联结合数组
	*/
	public AddCardsLossRequest(CardNoAndPersonIdItem... cardList)
	{
		if (cardList == null)
		{
			throw new NullPointerException("cardList");
		}
		if (cardList.length > 200)
		{
			throw new IndexOutOfBoundsException("cardList", cardList.length, "批量挂失数量不能超过200个");
		}
		CardList = cardList;
	}
}