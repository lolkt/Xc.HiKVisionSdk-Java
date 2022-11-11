package xc.hikvisionsdk.dictionaries;

import xc.hikvisionsdk.*;
import java.util.*;

/** 
 网管资源类型
*/
public final class ResourceType
{
	/** 
	 编码设备
	*/
	public static final String EncodeDevice = "encodeDevice";
	/** 
	 监控点
	*/
	public static final String Camera = "camera";
	/** 
	 存储设备
	*/
	public static final String StorageDevice = "storageDevice";
	/** 
	 解码设备
	*/
	public static final String DecodeDevice = "decodeDevice";
	/** 
	 门禁设备
	*/
	public static final String AcsDevice = "acsDevice";
	/** 
	 门禁点
	*/
	public static final String Door = "door";
	/** 
	 读卡器
	*/
	public static final String Reader = "reader";
	/** 
	 梯控主机
	*/
	public static final String LadderController = "ladderController";
	/** 
	 梯控读卡器
	*/
	public static final String LadderCardReader = "ladderCardReader";
	/** 
	 可视对讲设备
	*/
	public static final String VisDevice = "visDevice";

	/** 
	 
	*/
	private static HashMap<String, DictionariesCodeTextItem> _collection = new HashMap<String, DictionariesCodeTextItem>();

	static
	{
		_collection.put(EncodeDevice.toLowerCase(), new DictionariesCodeTextItem(EncodeDevice, "编码设备"));
		_collection.put(Camera.toLowerCase(), new DictionariesCodeTextItem(Camera, "监控点"));
		_collection.put(StorageDevice.toLowerCase(), new DictionariesCodeTextItem(StorageDevice, "存储设备"));
		_collection.put(DecodeDevice.toLowerCase(), new DictionariesCodeTextItem(DecodeDevice, "解码设备"));
		_collection.put(AcsDevice.toLowerCase(), new DictionariesCodeTextItem(AcsDevice, "门禁设备"));
		_collection.put(Door.toLowerCase(), new DictionariesCodeTextItem(Door, "门禁点"));
		_collection.put(Reader.toLowerCase(), new DictionariesCodeTextItem(Reader, "读卡器"));
		_collection.put(LadderController.toLowerCase(), new DictionariesCodeTextItem(LadderController, "梯控主机"));
		_collection.put(LadderCardReader.toLowerCase(), new DictionariesCodeTextItem(LadderCardReader, "梯控读卡器"));
		_collection.put(VisDevice.toLowerCase(), new DictionariesCodeTextItem(VisDevice, "可视对讲设备"));
	}

	public static String GetCode(String key)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(key))
		{
			throw new NullPointerException("resourceType");
		}
		key = key.strip().toLowerCase();

		if (_collection.containsKey(key))
		{
			return _collection.get(key).getCode();
		}
		throw new IndexOutOfBoundsException("resourceType", String.format("%1$s 不是有效的值", key));
	}


}