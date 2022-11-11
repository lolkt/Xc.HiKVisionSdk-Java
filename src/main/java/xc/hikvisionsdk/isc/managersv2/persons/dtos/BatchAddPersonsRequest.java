package xc.hikvisionsdk.isc.managersv2.persons.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.persons.*;

/** 
 批量添加人员请求
*/
public class BatchAddPersonsRequest extends BaseRequest
{
	/** 
	 批量添加人员信息
	*/
	private BatchAddPersonsRequestItem[] Items;
	public final BatchAddPersonsRequestItem[] getItems()
	{
		return Items;
	}
	public final void setItems(BatchAddPersonsRequestItem[] value)
	{
		Items = value;
	}

	/** 
	 
	 
	 @param items
	*/
	public BatchAddPersonsRequest(BatchAddPersonsRequestItem... items)
	{
		if (items == null)
		{
			throw new NullPointerException("items");
		}
		if (items.length > 1000 || items.length == 0)
		{
			throw new IndexOutOfBoundsException("items", items.length, "单次操作上限为1000条");
		}
		setItems(items);
	}

	/** 
	 
	 
	 @exception System.ArgumentNullException
	 @exception System.ArgumentOutOfRangeException
	*/
	@Override
	public void CheckParams()
	{

		for (var item : getItems())
		{
			item.Check();
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