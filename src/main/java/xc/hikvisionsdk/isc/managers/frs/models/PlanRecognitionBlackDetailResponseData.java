package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 单个查询重点人员识别计划详情结果数据
*/
public class PlanRecognitionBlackDetailResponseData
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
	 识别计划的类型，
	 BLACK_LIST-重点人员识别计划
	 WHITE_LIST-陌生人识别计划
	*/
	private String RecognitionPlanType;
	public final String getRecognitionPlanType()
	{
		return RecognitionPlanType;
	}
	public final void setRecognitionPlanType(String value)
	{
		RecognitionPlanType = value;
	}

	/** 
	 识别计划开始下发的时间,遵循ISO8601的时间格式
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
	 识别计划下发已经用的时间,单位:秒
	*/
	private int UsingTime;
	public final int getUsingTime()
	{
		return UsingTime;
	}
	public final void setUsingTime(int value)
	{
		UsingTime = value;
	}

	/** 
	 识别计划的状态,，参考附录A.33
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
	 每个人脸分组的下发结果集合
	*/
	private IssuedResult[] FaceGroupIssuedResults;
	public final IssuedResult[] getFaceGroupIssuedResults()
	{
		return FaceGroupIssuedResults;
	}
	public final void setFaceGroupIssuedResults(IssuedResult[] value)
	{
		FaceGroupIssuedResults = value;
	}

	/** 
	 每个通道的布控结果集合
	*/
	private IssuedResult[] CameraControlResults;
	public final IssuedResult[] getCameraControlResults()
	{
		return CameraControlResults;
	}
	public final void setCameraControlResults(IssuedResult[] value)
	{
		CameraControlResults = value;
	}

	/** 
	 每张人脸的下发情况分页结果
	*/
	private FaceIssuedResultPage FaceIssuedResultPage;
	public final FaceIssuedResultPage getFaceIssuedResultPage()
	{
		return FaceIssuedResultPage;
	}
	public final void setFaceIssuedResultPage(FaceIssuedResultPage value)
	{
		FaceIssuedResultPage = value;
	}
}