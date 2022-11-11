package xc.hikvisionsdk.isc.callbacks.frs;

import xc.hikvisionsdk.isc.callbacks.frs.facerecognition.*;
import xc.hikvisionsdk.isc.callbacks.frs.facerecognition.black.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 重点人员识别数据
*/
public class FrsBlackFaceRecognitionEventCallbackData
{
	/** 
	 识别结果
	*/
	private FaceRecognitionResult FaceRecognitionResult;
	public final FaceRecognitionResult getFaceRecognitionResult()
	{
		return FaceRecognitionResult;
	}
	public final void setFaceRecognitionResult(FaceRecognitionResult value)
	{
		FaceRecognitionResult = value;
	}
	/** 
	 源事件的唯一标识，即转自的人脸比对事件的唯一标识
	*/
	private String SrcEventId;
	public final String getSrcEventId()
	{
		return SrcEventId;
	}
	public final void setSrcEventId(String value)
	{
		SrcEventId = value;
	}
	/** 
	 触发重点人员识别事件的报警的抓拍点的信息
	*/
	private ResInfoItem[] ResInfo;
	public final ResInfoItem[] getResInfo()
	{
		return ResInfo;
	}
	public final void setResInfo(ResInfoItem[] value)
	{
		ResInfo = value;
	}
}