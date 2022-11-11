package xc.hikvisionsdk.isc.managersv2.cards.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.cards.*;

/** 
 获取单个卡片信息请求
*/
public class GetCardRequest extends BaseRequest
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

	/** 
	 卡号ID，卡片号码和卡片ID两者同时只能传一种参数
	 获取卡片列表接口获取返回参数cardId
	*/
	private String CardId;
	public final String getCardId()
	{
		return CardId;
	}

	/** 
	 获取单个卡片信息请求
	 
	 @param content 请求内容
	 @param isCardId 是卡片ID还是卡片号码
	*/

	public GetCardRequest(String content)
	{
		this(content, false);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public GetCardRequest(string content, bool isCardId = false)
	public GetCardRequest(String content, boolean isCardId)
	{
		if (isCardId)
		{
			CardId = content;
		}
		else
		{
			CardNo = content;
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