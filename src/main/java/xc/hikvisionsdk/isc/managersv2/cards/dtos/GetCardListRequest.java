package xc.hikvisionsdk.isc.managersv2.cards.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.cards.*;

/** 
 获取卡片列表请求
*/
public class GetCardListRequest extends PagedRequest
{
	/** 
	 获取卡片列表请求
	 
	 @param pageNo
	 @param pageSize
	*/
	public GetCardListRequest(int pageNo, int pageSize)
	{
		super(pageNo, pageSize);
	}
}