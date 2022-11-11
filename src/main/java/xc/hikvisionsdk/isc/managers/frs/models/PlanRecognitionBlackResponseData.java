package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 查询重点人员识别计划结果数据
*/
public class PlanRecognitionBlackResponseData
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
	 人脸分组唯一标识的集合，非空，人脸监控应用服务会校验标识的有效性，
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
	 抓拍点通道唯一标识的集合，非空，人脸监控应用服务会校验抓拍点标识的有效性，
	*/
	private String[] CameraIndexCodes;
	public final String[] getCameraIndexCodes()
	{
		return CameraIndexCodes;
	}
	public final void setCameraIndexCodes(String[] value)
	{
		CameraIndexCodes = value;
	}

	/** 
	 识别资源唯一标识的集合。人脸监控应用服务会校验识别资源标识的有效性，若有重复、无效的标识，校验不通过。识别资源类型为深眸时，可以为空。
	*/
	private String[] RecognitionResourceIndexCodes;
	public final String[] getRecognitionResourceIndexCodes()
	{
		return RecognitionResourceIndexCodes;
	}
	public final void setRecognitionResourceIndexCodes(String[] value)
	{
		RecognitionResourceIndexCodes = value;
	}

	/** 
	 识别资源类型，
	 SUPER_BRAIN 超脑，
	 FACE_RECOGNITION_SERVER 脸谱，
	 COMPARISON 深眸
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
	 识别计划描述，1~128个字符
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
	 识别计划的状态,参考附录A.33
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

	/** 
	 是否启用,true:启用,false:禁用
	*/
	private boolean Available;
	public final boolean getAvailable()
	{
		return Available;
	}
	public final void setAvailable(boolean value)
	{
		Available = value;
	}

	/** 
	 识别计划开始下发的时间
	*/
	private String StartTime;
	public final String getStartTime()
	{
		return StartTime;
	}
	public final void setStartTime(String value)
	{
		StartTime = value;
	}

	/** 
	 识别计划下发已经用的时间
	*/
	private String UsingTime;
	public final String getUsingTime()
	{
		return UsingTime;
	}
	public final void setUsingTime(String value)
	{
		UsingTime = value;
	}

	/** 
	 识别计划的阈值，重点人员是指相似度超过该值时报警，范围[1, 100)
	*/
	private int Threshold;
	public final int getThreshold()
	{
		return Threshold;
	}
	public final void setThreshold(int value)
	{
		Threshold = value;
	}
}