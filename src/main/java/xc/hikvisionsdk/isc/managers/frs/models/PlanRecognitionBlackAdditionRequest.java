package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 重点监控人员添加识别计划请求
*/
public class PlanRecognitionBlackAdditionRequest extends BaseRequest
{
	/** 
	 识别计划名称,1~32个字符；不能包含 ' / \ : * ? " 
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
	 可从按条件查询人脸分组获取
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
	 可通过分页获取监控点资源获取
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
	 可从按条件查询识别资源获取
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
	/** 
	 时间计划模板，不填默认全天候
	*/
	private TimeBlock[] TimeBlockList;
	public final TimeBlock[] getTimeBlockList()
	{
		return TimeBlockList;
	}
	public final void setTimeBlockList(TimeBlock[] value)
	{
		TimeBlockList = value;
	}

	/** 
	 重点监控人员添加识别计划请求
	*/
	public PlanRecognitionBlackAdditionRequest()
	{
	}

	/** 
	 重点监控人员添加识别计划请求
	 
	 @param name 识别计划名称
	 @param recognitionResourceType 识别资源类型，SUPER_BRAIN 超脑，FACE_RECOGNITION_SERVER 脸谱，COMPARISON 深眸
	 @param threshold 识别计划的阈值
	 @param faceGroupIndexCodes 人脸分组唯一标识的集合
	 @param cameraIndexCodes 抓拍点通道唯一标识的集合
	*/
	public PlanRecognitionBlackAdditionRequest(String name, String recognitionResourceType, int threshold, String[] faceGroupIndexCodes, String[] cameraIndexCodes)
	{
		setName(name);
		setRecognitionResourceType(recognitionResourceType);
		setThreshold(threshold);
		setFaceGroupIndexCodes(faceGroupIndexCodes);
		setCameraIndexCodes(cameraIndexCodes);
	}

	/** 
	 
	*/
	@Override
	public void CheckParams()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getName()))
		{
			throw new NullPointerException("Name");
		}
		if (tangible.StringHelper.isNullOrWhiteSpace(getRecognitionResourceType()))
		{
			throw new NullPointerException("RecognitionResourceType");
		}
		if (getThreshold() < 1 || getThreshold() > 99)
		{
			throw new IndexOutOfBoundsException("Threshold", getThreshold(), "在 1 到 99 之间");
		}
		if (getFaceGroupIndexCodes() == null)
		{
			throw new NullPointerException("FaceGroupIndexCodes");
		}
		if (getFaceGroupIndexCodes().length == 0)
		{
			throw new IndexOutOfBoundsException("FaceGroupIndexCodes", getFaceGroupIndexCodes().length, "最少一个人脸资源");
		}
		if (getCameraIndexCodes() == null)
		{
			throw new NullPointerException("CameraIndexCodes");
		}
		if (getCameraIndexCodes().length == 0)
		{
			throw new IndexOutOfBoundsException("CameraIndexCodes", getCameraIndexCodes().length, "最少一个摄像头资源");
		}
	}
}