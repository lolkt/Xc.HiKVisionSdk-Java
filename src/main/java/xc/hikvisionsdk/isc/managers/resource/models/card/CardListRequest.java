package xc.hikvisionsdk.isc.managers.resource.models.card;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 获取卡片列表请求
*/
public class CardListRequest extends PagedRequest
{

	/** 
	 获取卡片列表请求
	*/
	public CardListRequest()
	{
	}

	/** 
	 获取卡片列表请求
	 
	 @param pageNo
	 @param pageSize
	*/
	public CardListRequest(int pageNo, int pageSize)
	{
		super(pageNo, pageSize);
	}
}