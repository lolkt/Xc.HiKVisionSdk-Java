package xc.hikvisionsdk.isc.managers.resource.models.org;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 添加添加组织
*/
public class OrgBatchAddRequest extends BaseRequest
{
	/** 
	 批量添加组织信息
	*/
	private OrgBatchAddRequestItem[] Items;
	public final OrgBatchAddRequestItem[] getItems()
	{
		return Items;
	}
	public final void setItems(OrgBatchAddRequestItem[] value)
	{
		Items = value;
	}

	/** 
	 添加添加组织
	 
	 @param items 组织信息
	*/
	public OrgBatchAddRequest(OrgBatchAddRequestItem... items)
	{
		var clientId = items.Max(u -> u.ClientId);

		for (var item : items.Where(u -> u.ClientId == 0))
		{
			item.ClientId = clientId++;
		}

		setItems(items);
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	 @exception ArgumentOutOfRangeException
	*/
	@Override
	public void CheckParams()
	{
		if (getItems() == null || getItems().length == 0)
		{
			throw new NullPointerException("Items");
		}
		if (getItems().length > 1000)
		{
			throw new IndexOutOfBoundsException("Items", getItems().length, "最大1000个");
		}
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