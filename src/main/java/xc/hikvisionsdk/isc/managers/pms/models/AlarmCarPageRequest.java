package xc.hikvisionsdk.isc.managers.pms.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.pms.*;

/** 
 查询布控车辆
*/
public class AlarmCarPageRequest extends PagedRequest
{
	/** 
	 车牌号/卡号
	*/
	private String SearchKey;
	public final String getSearchKey()
	{
		return SearchKey;
	}
	public final void setSearchKey(String value)
	{
		SearchKey = value;
	}
	/** 
	 查询布控车辆
	*/
	public AlarmCarPageRequest()
	{
	}
	/** 
	 查询布控车辆
	 
	 @param pageNo
	 @param pageSize
	*/
	public AlarmCarPageRequest(int pageNo, int pageSize)
	{
		super(pageNo, pageSize);
	}

	/** 
	 查询布控车辆
	 
	 @param searchKey 车牌号/卡号
	 @param pageNo
	 @param pageSize
	*/
	public AlarmCarPageRequest(String searchKey, int pageNo, int pageSize)
	{
		this(pageNo, pageSize);
		setSearchKey(searchKey);
	}
}