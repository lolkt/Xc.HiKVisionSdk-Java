package xc.hikvisionsdk.dictionaries;

import xc.hikvisionsdk.*;

/** 
 安装位置
*/
public final class InstallLocation
{


	/** 
	 
	*/
	private static final DictionariesCodeTextCollection _items = new DictionariesCodeTextCollection();

	/** 
	 小区周界
	*/
	public static final String CommunityPerimeter = "communityPerimeter";
	/** 
	 小区出入口
	*/
	public static final String CommunityEntrance = "communityEntrance";
	/** 
	 消防通道
	*/
	public static final String FireChannel = "fireChannel";
	/** 
	 景观池
	*/
	public static final String LandscapePool = "landscapePool";
	/** 
	 住宅楼外
	*/
	public static final String OutsideBuilding = "outsideBuilding";
	/** 
	 停车场（库）出入口
	*/
	public static final String ParkEntrance = "parkEntrance";
	/** 
	 停车场区
	*/
	public static final String ParkArea = "parkArea";
	/** 
	 设备房（机房、配电房、泵房）
	*/
	public static final String EquipmentRoom = "equipmentRoom";
	/** 
	 监控中心
	*/
	public static final String MonitorCenter = "monitorCenter";
	/** 
	 禁停区
	*/
	public static final String StopArea = "stopArea";
	/** 
	 金库
	*/
	public static final String Vault = "vault";



	/** 
	 安装位置
	*/
	static
	{
		_items.Add(CommunityPerimeter, "小区周界");
		_items.Add(CommunityEntrance, "小区出入口");
		_items.Add(FireChannel, "消防通道");
		_items.Add(LandscapePool, "景观池");
		_items.Add(OutsideBuilding, "住宅楼外");
		_items.Add(ParkEntrance, "停车场（库）出入口");
		_items.Add(ParkArea, "停车场区");
		_items.Add(EquipmentRoom, "设备房（机房、配电房、泵房）");
		_items.Add(MonitorCenter, "监控中心");
		_items.Add(StopArea, "禁停区");
		_items.Add(Vault, "金库");
	}


	public static String GetText(String key)
	{
		return _items.Get(key) == null ? null : _items.Get(key).getText();
	}



}