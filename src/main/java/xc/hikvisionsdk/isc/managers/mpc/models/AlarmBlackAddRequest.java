package xc.hikvisionsdk.isc.managers.mpc.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.mpc.*;

/** 
 批量添加车辆黑名单请求
*/
public class AlarmBlackAddRequest extends BaseRequest
{
	/** 
	 批量添加车辆黑名单详细
	*/
	private AlarmBlackAddRequestData[] Items;
	public final AlarmBlackAddRequestData[] getItems()
	{
		return Items;
	}
	public final void setItems(AlarmBlackAddRequestData[] value)
	{
		Items = value;
	}


	/** 
	 批量添加车辆黑名单请求
	 
	 @param items 批量添加车辆黑名单详细
	*/
	public AlarmBlackAddRequest(AlarmBlackAddRequestData... items)
	{
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

		if (getItems().length > 400)
		{
			throw new IndexOutOfBoundsException("Items", getItems().length, "一次添加最大不超过400个");
		}

		for (var item : getItems())
		{
			item.Check();
		}

	}

}