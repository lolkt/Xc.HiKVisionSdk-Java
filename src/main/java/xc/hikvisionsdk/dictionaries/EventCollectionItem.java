package xc.hikvisionsdk.dictionaries;

import xc.hikvisionsdk.*;

/** 
 事件类型项
*/
public class EventCollectionItem
{
	/** 
	 代码
	*/
	private int Id;
	public final int getId()
	{
		return Id;
	}
	public final void setId(int value)
	{
		Id = value;
	}
	/** 
	 名称
	*/
	private String Name;
	public final String getName()
	{
		return Name;
	}
	public final void setName(String value)
	{
		Name = value;
	}
	/** 
	 类型
	*/
	private String Type;
	public final String getType()
	{
		return Type;
	}
	public final void setType(String value)
	{
		Type = value;
	}
	/** 
	 类型名称
	*/
	private String TypeName;
	public final String getTypeName()
	{
		return TypeName;
	}
	public final void setTypeName(String value)
	{
		TypeName = value;
	}
	/** 
	 子类
	*/
	private String Subclass;
	public final String getSubclass()
	{
		return Subclass;
	}
	public final void setSubclass(String value)
	{
		Subclass = value;
	}
	/** 
	 子类名
	*/
	private String SubclassName;
	public final String getSubclassName()
	{
		return SubclassName;
	}
	public final void setSubclassName(String value)
	{
		SubclassName = value;
	}
	/** 
	 已订阅
	*/
	private boolean IsSub;
	public final boolean isSub()
	{
		return IsSub;
	}
	public final void setSub(boolean value)
	{
		IsSub = value;
	}
	/** 
	 回调action
	*/
	private String Action;
	public final String getAction()
	{
		return Action;
	}
	public final void setAction(String value)
	{
		Action = value;
	}
}