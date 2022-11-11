package xc.hikvisionsdk.isc.managers.resource.models.person;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 批量添加人员请求
*/
public class PersonBatchAddRequest extends BaseRequest
{
	/** 
	 批量添加人员信息
	*/
	private PersonBatchAddRequestItem[] Items;
	public final PersonBatchAddRequestItem[] getItems()
	{
		return Items;
	}
	public final void setItems(PersonBatchAddRequestItem[] value)
	{
		Items = value;
	}

	/** 
	 
	 
	 @param items
	*/
	public PersonBatchAddRequest(PersonBatchAddRequestItem... items)
	{
		setItems(items);
	}

	/** 
	 
	 
	 @exception System.ArgumentNullException
	 @exception System.ArgumentOutOfRangeException
	*/
	@Override
	public void CheckParams()
	{
		if (getItems() == null)
		{
			throw new NullPointerException("Items");
		}
		if (getItems().length > 1000 || getItems().length == 0)
		{
			throw new IndexOutOfBoundsException("Items", getItems().length, "单次操作上限为1000条");
		}
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