package xc.hikvisionsdk.isc.managersv2.cards.dtos;

import xc.hikvisionsdk.isc.enums.resource.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.cards.*;

/** 
 批量开卡请求项
*/
public class BindingCardsRequestItem
{
	/** 
	 批量开卡请求项
	 
	 @param cardNo 卡号,8~20个字符，支持数字和大写字母
	 @param personId 人员ID
	 @param cardType 卡片类型
	 @param orgIndexCode 人员所属组织IndexCode，不传默认使用根组织
	*/

	public BindingCardsRequestItem(String cardNo, String personId, CardType cardType)
	{
		this(cardNo, personId, cardType, null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public BindingCardsRequestItem(string cardNo, string personId, CardType cardType, string orgIndexCode = null)
	public BindingCardsRequestItem(String cardNo, String personId, CardType cardType, String orgIndexCode)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(cardNo))
		{
			throw new NullPointerException("cardNo");
		}

		if (cardNo.length() < 8 || cardNo.length() > 20)
		{
			throw new IndexOutOfBoundsException("cardNo", "卡号,8~20个字符");
		}

		if (tangible.StringHelper.isNullOrWhiteSpace(personId))
		{
			throw new NullPointerException("personId");
		}

		CardNo = cardNo;
		PersonId = personId;
		OrgIndexCode = orgIndexCode;
		CardType = cardType;
	}
	/** 
	 卡号,8~20个字符，支持数字和大写字母
	*/
	private String CardNo;
	public final String getCardNo()
	{
		return CardNo;
	}
	/** 
	 人员ID
	*/
	private String PersonId;
	public final String getPersonId()
	{
		return PersonId;
	}
	/** 
	 人员所属组织IndexCode，不传默认使用根组织
	*/
	private String OrgIndexCode;
	public final String getOrgIndexCode()
	{
		return OrgIndexCode;
	}
	/** 
	 卡片类型
	*/
	private CardType CardType = CardType.values()[0];
	public final CardType getCardType()
	{
		return CardType;
	}


}