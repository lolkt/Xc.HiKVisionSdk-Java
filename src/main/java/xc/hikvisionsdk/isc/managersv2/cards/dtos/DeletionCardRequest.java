package xc.hikvisionsdk.isc.managersv2.cards.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.cards.*;

/** 
 卡片退卡请求
*/
public class DeletionCardRequest extends BaseRequest
{
	/** 
	 卡片退卡请求
	 
	 @param cardNumber 卡号
	 @param personId 人员Id
	*/
	public DeletionCardRequest(String cardNumber, String personId)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(cardNumber))
		{
			throw new NullPointerException("cardNumber");
		}

		if (tangible.StringHelper.isNullOrWhiteSpace(personId))
		{
			throw new NullPointerException("personId");
		}

		CardNumber = cardNumber;
		PersonId = personId;
	}

	/** 
	 卡号
	*/
	private String CardNumber;
	public final String getCardNumber()
	{
		return CardNumber;
	}
	/** 
	 人员Id
	*/
	private String PersonId;
	public final String getPersonId()
	{
		return PersonId;
	}
}