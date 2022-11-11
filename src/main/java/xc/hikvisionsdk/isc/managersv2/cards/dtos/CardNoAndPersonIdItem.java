package xc.hikvisionsdk.isc.managersv2.cards.dtos;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.cards.*;

/** 
 挂失请求项
*/
public class CardNoAndPersonIdItem
{
	/** 
	 挂失请求项
	 
	 @param cardNumber 卡号
	 @param personId 人员唯一标示
	*/

	public CardNoAndPersonIdItem(String cardNumber)
	{
		this(cardNumber, "");
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public CardNoAndPersonIdItem(string cardNumber, string personId = "")
	public CardNoAndPersonIdItem(String cardNumber, String personId)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(cardNumber))
		{
			throw new NullPointerException("cardNumber");
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
	 人员唯一标示
	*/
	private String PersonId;
	public final String getPersonId()
	{
		return PersonId;
	}
}