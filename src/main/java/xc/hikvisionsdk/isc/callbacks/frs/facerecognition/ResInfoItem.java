package xc.hikvisionsdk.isc.callbacks.frs.facerecognition;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;
import xc.hikvisionsdk.isc.callbacks.frs.*;

/** 
 触发重点人员识别事件的报警的抓拍点的信息
*/
public class ResInfoItem
{
	/** 
	 资源类型
	 重点人员识别事件均为抓拍点报警，例如：camera
	*/
	private String ResourceType;
	public final String getResourceType()
	{
		return ResourceType;
	}
	public final void setResourceType(String value)
	{
		ResourceType = value;
	}
	/** 
	 资源的唯一标识
	*/
	private String IndexCode;
	public final String getIndexCode()
	{
		return IndexCode;
	}
	public final void setIndexCode(String value)
	{
		IndexCode = value;
	}
	/** 
	 资源的名称
	*/
	private String Cn;
	public final String getCn()
	{
		return Cn;
	}
	public final void setCn(String value)
	{
		Cn = value;
	}
}