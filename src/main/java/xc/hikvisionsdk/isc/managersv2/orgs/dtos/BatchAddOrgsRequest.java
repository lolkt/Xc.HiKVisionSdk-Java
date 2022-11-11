package xc.hikvisionsdk.isc.managersv2.orgs.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.orgs.*;

/** 
 批量添加人员请求
*/
public class BatchAddOrgsRequest extends BaseRequest
{
	/** 
	 批量添加组织信息
	*/
	private BatchAddOrgsRequestItem[] Items;
	public final BatchAddOrgsRequestItem[] getItems()
	{
		return Items;
	}

	/** 
	 添加添加组织
	 
	 @param items 组织信息
	*/
	public BatchAddOrgsRequest(BatchAddOrgsRequestItem... items)
	{

		if (items == null || items.length == 0)
		{
			throw new NullPointerException("items");
		}
		if (items.length > 1000)
		{
			throw new IndexOutOfBoundsException("items", "最大1000个");
		}

		var clientId = items.Max(u -> u.ClientId);

		for (var item : items.Where(u -> u.ClientId == 0))
		{
			item.SetClientId(++clientId);
		}

		Items = items;
	}

	/** 
	 
	 
	 @return 
	*/
	@Override
	public String toString()
	{
		return getItems().SerializeByCamelCase();
	}

}