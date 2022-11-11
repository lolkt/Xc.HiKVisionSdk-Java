package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 按条件查询识别资源结果数据
*/
public class RecognitionResponseData
{
	/** 
	 识别计划的唯一标识
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
	 识别计划的名称
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
	 根据识别资源的类型搜索，SUPER_BRAIN 超脑，FACE_RECOGNITION_SERVER 脸谱，COMPARISON 深眸
	*/
	private String RecognitionResourceType;
	public final String getRecognitionResourceType()
	{
		return RecognitionResourceType;
	}
	public final void setRecognitionResourceType(String value)
	{
		RecognitionResourceType = value;
	}
}