package xc.hikvisionsdk.isc.events.acs.dtos;

import xc.hikvisionsdk.isc.enums.events.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 监听门改变事件传输模型
*/
public class MonitorDoorListChangedEventDto
{
	/** 
	 事件类型
	*/
	private EventType Type = EventType.values()[0];
	public final EventType getType()
	{
		return Type;
	}
	public final void setType(EventType value)
	{
		Type = value;
	}
	/** 
	 具体值
	*/
	private MonitorDoorListItemDto[] Items;
	public final MonitorDoorListItemDto[] getItems()
	{
		return Items;
	}
	public final void setItems(MonitorDoorListItemDto[] value)
	{
		Items = value;
	}
}