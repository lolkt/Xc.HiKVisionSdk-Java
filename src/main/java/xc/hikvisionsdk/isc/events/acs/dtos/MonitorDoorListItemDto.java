package xc.hikvisionsdk.isc.events.acs.dtos;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 监听门项
*/
public class MonitorDoorListItemDto
{
	/** 
	 唯一id
	*/
	private String Id;
	public final String getId()
	{
		return Id;
	}
	public final void setId(String value)
	{
		Id = value;
	}
	/** 
	 名称
	*/
	private String DoorName;
	public final String getDoorName()
	{
		return DoorName;
	}
	public final void setDoorName(String value)
	{
		DoorName = value;
	}
	/** 
	 备注
	*/
	private String Remark;
	public final String getRemark()
	{
		return Remark;
	}
	public final void setRemark(String value)
	{
		Remark = value;
	}

	/** 
	 取反
	*/
	private boolean IsReverse;
	public final boolean isReverse()
	{
		return IsReverse;
	}
	public final void setReverse(boolean value)
	{
		IsReverse = value;
	}
}