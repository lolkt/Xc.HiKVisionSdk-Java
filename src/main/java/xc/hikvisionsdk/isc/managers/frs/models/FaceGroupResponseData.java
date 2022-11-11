package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 按条件查询人脸分组结果数据
*/
public class FaceGroupResponseData
{
	/** 
	 人脸分组的唯一标识,由人脸监控应用服务生成
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
	 人脸分组的名称,人脸分组的名称是唯一的
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
	 人脸分组的描述
	*/
	private String Description;
	public final String getDescription()
	{
		return Description;
	}
	public final void setDescription(String value)
	{
		Description = value;
	}
}