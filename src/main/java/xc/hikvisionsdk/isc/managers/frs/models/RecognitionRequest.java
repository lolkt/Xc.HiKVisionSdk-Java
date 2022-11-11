package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.isc.models.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 按条件查询识别资源请求
*/
public class RecognitionRequest extends BaseRequest
{
	/** 
	 通过indexCode集合查询指定的识别资源集合
	*/
	private String[] IndexCodes;
	public final String[] getIndexCodes()
	{
		return IndexCodes;
	}
	public final void setIndexCodes(String[] value)
	{
		IndexCodes = value;
	}
	/** 
	 识别资源名称模糊查询
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

	/** 
	 
	*/
	public RecognitionRequest()
	{
	}

	/** 
	 识别资源名称模糊查询
	 
	 @param name
	*/
	public RecognitionRequest(String name)
	{
		setName(name);
	}

	/** 
	  通过indexCode集合查询指定的识别资源集合
	 
	 @param indexCodes
	*/
	public RecognitionRequest(String... indexCodes)
	{
		setIndexCodes(indexCodes);
	}


	/** 
	 
	*/
	@Override
	public void CheckParams()
	{
	}

}