package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 查询重点人员识别计划请求
*/
public class PlanRecognitionBlackRequest extends BaseRequest
{
	/** 
	 根据识别计划描述模糊搜索
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

	/** 
	 根据人脸分组唯一标识集合搜索
	*/
	private String[] FaceGroupIndexCodes;
	public final String[] getFaceGroupIndexCodes()
	{
		return FaceGroupIndexCodes;
	}
	public final void setFaceGroupIndexCodes(String[] value)
	{
		FaceGroupIndexCodes = value;
	}

	/** 
	 根据识别计划名称模糊搜索
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
	 根据下发状态搜索，参考附录A.33
	*/
	private String Status;
	public final String getStatus()
	{
		return Status;
	}
	public final void setStatus(String value)
	{
		Status = value;
	}

}