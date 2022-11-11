package xc.hikvisionsdk.dictionaries;

import xc.hikvisionsdk.*;
import java.util.*;

/** 
 事件集合
*/
public class EventCollection
{
	/** 
	 已同步
	*/
	private boolean IsLoadState;
	public final boolean isLoadState()
	{
		return IsLoadState;
	}
	public final void setLoadState(boolean value)
	{
		IsLoadState = value;
	}

	/** 
	 项
	*/
	private HashMap<Integer, EventCollectionItem> Items = new HashMap<Integer, EventCollectionItem> ();
	public final HashMap<Integer, EventCollectionItem> getItems()
	{
		return Items;
	}

	/** 
	 获得事件类型
	 
	 @return 
	*/
	public final Map.Entry<String, String>[] GetEventTypes()
	{
		return new Map.Entry<String, String>[]
		{
			new Map.Entry<String, String>("SmartCard","一卡通"),
			new Map.Entry<String, String>("Vehicle","车辆管理"),
			new Map.Entry<String, String>("Face","人脸监控")
		};
	}

	/** 
	 子类型
	 
	 @param type
	 @return 
	*/
	public final Map.Entry<String, String>[] GetEventSubclasses(String type)
	{
		switch (type)
		{
			case "SmartCard":
				return new Map.Entry<String, String>[] {new Map.Entry<String, String>("Acs", "门禁")};
			case "Vehicle":
				return new Map.Entry<String, String>[] {new Map.Entry<String, String>("Pms", "停车场")};
			case "Face":
				return new Map.Entry<String, String>[] {new Map.Entry<String, String>("Face", "人脸监控")};
			default:
				return new Map.Entry<String, String>[0];
		}

	}

	/** 
	 索引器
	 
	 @param code
	 @return 
	*/
	public final EventCollectionItem get(int code)
	{
		if (getItems().containsKey(code))
		{
			return getItems().get(code);
		}
		EventCollectionItem tempVar = new EventCollectionItem();
		tempVar.setName("未定义");
		tempVar.setId(code);
		return tempVar;
	}

	/** 
	 
	*/
	public EventCollection()
	{
		InitAcs();

		InitPms();
		InitFace();
	}



	/** 
	 
	*/
	private void InitAcs()
	{

		EventCollectionItem tempVar = new EventCollectionItem();
		tempVar.setId(198914);
		tempVar.setName("合法卡比对通过");
		tempVar.setType("SmartCard");
		tempVar.setTypeName("一卡通");
		tempVar.setSubclass("Acs");
		tempVar.setSubclassName("门禁");
		tempVar.setAction("acs");
		getItems().put(198914, tempVar);


		EventCollectionItem tempVar2 = new EventCollectionItem();
		tempVar2.setId(196893);
		tempVar2.setName("人脸认证通过");
		tempVar2.setType("SmartCard");
		tempVar2.setTypeName("一卡通");
		tempVar2.setSubclass("Acs");
		tempVar2.setSubclassName("门禁");
		tempVar2.setAction("acs");
		getItems().put(196893, tempVar2);


		EventCollectionItem tempVar3 = new EventCollectionItem();
		tempVar3.setId(197162);
		tempVar3.setName("人证比对通过");
		tempVar3.setType("SmartCard");
		tempVar3.setTypeName("一卡通");
		tempVar3.setSubclass("Acs");
		tempVar3.setSubclassName("门禁");
		tempVar3.setAction("acs");
		getItems().put(197162, tempVar3);
	}
	/** 
	 
	*/
	public final void InitPms()
	{

		EventCollectionItem tempVar = new EventCollectionItem();
		tempVar.setId(771756034);
		tempVar.setName("黑名单");
		tempVar.setType("Vehicle");
		tempVar.setTypeName("车辆管理");
		tempVar.setSubclass("Pms");
		tempVar.setSubclassName("停车场");
		tempVar.setAction("ParkingInOrOut");
		getItems().put(771756034, tempVar);


		EventCollectionItem tempVar2 = new EventCollectionItem();
		tempVar2.setId(771760131);
		tempVar2.setName("入场放行");
		tempVar2.setType("Vehicle");
		tempVar2.setTypeName("车辆管理");
		tempVar2.setSubclass("Pms");
		tempVar2.setSubclassName("停车场");
		tempVar2.setAction("ParkingInOrOut");
		getItems().put(771760131, tempVar2);

		EventCollectionItem tempVar3 = new EventCollectionItem();
		tempVar3.setId(771760134);
		tempVar3.setName("出场放行");
		tempVar3.setType("Vehicle");
		tempVar3.setTypeName("车辆管理");
		tempVar3.setSubclass("Pms");
		tempVar3.setSubclassName("停车场");
		tempVar3.setAction("ParkingInOrOut");
		getItems().put(771760134, tempVar3);

	}
	/** 
	 
	*/
	public final void InitFace()
	{
		EventCollectionItem tempVar = new EventCollectionItem();
		tempVar.setId(1644175361);
		tempVar.setName("重点人员识别事件");
		tempVar.setType("Face");
		tempVar.setTypeName("人脸监控");
		tempVar.setSubclass("Face");
		tempVar.setSubclassName("人脸监控");
		tempVar.setAction("FrsBlack");
		getItems().put(1644175361, tempVar);
	}
}