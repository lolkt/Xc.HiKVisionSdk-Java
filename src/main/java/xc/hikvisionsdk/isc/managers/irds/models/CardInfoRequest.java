package xc.hikvisionsdk.isc.managers.irds.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.irds.*;

/** 
 获取单个卡片信息请求
*/
public class CardInfoRequest extends BaseRequest
{
	/** 
	 卡片号码，卡片号码和卡片ID两者同时只能传一种参数
	 获取卡片列表接口获取返回参数cardNo
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
	 卡号ID，卡片号码和卡片ID两者同时只能传一种参数
	 获取卡片列表接口获取返回参数cardId
	*/
	private String CardId;
	public final String getCardId()
	{
		return CardId;
	}
	public final void setCardId(String value)
	{
		CardId = value;
	}

	/** 
	 获取单个卡片信息请求
	 
	 @param content 请求内容
	 @param isCardId 是卡片ID还是卡片号码
	*/

	public CardInfoRequest(String content)
	{
		this(content, false);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public CardInfoRequest(string content, bool isCardId = false)
	public CardInfoRequest(String content, boolean isCardId)
	{
		if (isCardId)
		{
			setCardId(content);
		}
		else
		{
			setCardNo(content);
		}
	}


	/** 
	 
	 
	 @exception ArgumentNullException
	*/
	@Override
	public void CheckParams()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getCardNo()) && tangible.StringHelper.isNullOrWhiteSpace(getCardId()))
		{
			throw new NullPointerException("CardNo 或者 CardId", "卡片号码和卡片ID二选一");
		}

	}

}