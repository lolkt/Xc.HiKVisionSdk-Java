package xc.hikvisionsdk.dictionaries;

import xc.hikvisionsdk.*;

/** 
 
*/
public final class DoorEventSort
{
	/** 
	 姓名
	*/
	public static final String PersonName = "personName";
	/** 
	 设备名
	*/
	public static final String DoorName = "doorName";
	/** 
	 事件时间
	*/
	public static final String EventTime = "eventTime";


	private static final DictionariesCodeTextCollection _items = new DictionariesCodeTextCollection();

	static
	{
		_items.Add(PersonName, "姓名");
		_items.Add(DoorName, "设备名");
		_items.Add(EventTime, "事件时间", true);
	}

	public static String GetCode(String key)
	{
		return _items.GetOrDefault(key).getCode();
	}


}