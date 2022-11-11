package xc.hikvisionsdk.ia.managers.eattendanceengine.mobile;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.managers.*;
import xc.hikvisionsdk.ia.managers.eattendanceengine.*;

/** 
 获取移动考勤有效打卡地点结果数据
*/
public class QueryMobileCardResponseData
{
	/** 
	 规则标识
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
	 规则名称
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
	 打卡范围
	*/
	private String CardPlaceRange;
	public final String getCardPlaceRange()
	{
		return CardPlaceRange;
	}
	public final void setCardPlaceRange(String value)
	{
		CardPlaceRange = value;
	}
	/** 
	 中心点
	*/
	private String CenterRange;
	public final String getCenterRange()
	{
		return CenterRange;
	}
	public final void setCenterRange(String value)
	{
		CenterRange = value;
	}
	/** 
	 创建时间
	*/
	private String CreateTime;
	public final String getCreateTime()
	{
		return CreateTime;
	}
	public final void setCreateTime(String value)
	{
		CreateTime = value;
	}
	/** 
	 更新时间
	*/
	private String UpdateTime;
	public final String getUpdateTime()
	{
		return UpdateTime;
	}
	public final void setUpdateTime(String value)
	{
		UpdateTime = value;
	}

}