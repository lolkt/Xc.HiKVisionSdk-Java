package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 按条件查询重点人员事件结果数据
*/
public class EventBlackSearchResponseData
{
	/** 
	 重点人员事件抓拍信息
	*/
	private SnapInfo SnapInfo;
	public final SnapInfo getSnapInfo()
	{
		return SnapInfo;
	}
	public final void setSnapInfo(SnapInfo value)
	{
		SnapInfo = value;
	}
	/** 
	 重点人员事件目标图信息集
	*/
	private TargetInfo[] TargetInfoList;
	public final TargetInfo[] getTargetInfoList()
	{
		return TargetInfoList;
	}
	public final void setTargetInfoList(TargetInfo[] value)
	{
		TargetInfoList = value;
	}
}