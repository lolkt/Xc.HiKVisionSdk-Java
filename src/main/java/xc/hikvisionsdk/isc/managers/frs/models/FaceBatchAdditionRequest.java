package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 人脸批量添加请求
*/
public class FaceBatchAdditionRequest extends BaseRequest
{
	/** 
	 请求内容
	*/
	private FaceBatchAdditionRequestItem[] Items;
	public final FaceBatchAdditionRequestItem[] getItems()
	{
		return Items;
	}
	public final void setItems(FaceBatchAdditionRequestItem[] value)
	{
		Items = value;
	}


	/** 
	 人脸批量添加请求
	 
	 @param items
	*/
	public FaceBatchAdditionRequest(FaceBatchAdditionRequestItem... items)
	{
		setItems(items);
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	*/
	@Override
	public void CheckParams()
	{
		if (getItems() == null)
		{
			throw new NullPointerException("Items");
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