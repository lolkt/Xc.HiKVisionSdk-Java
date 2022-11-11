package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 单个修改重点人员识别计划请求
*/
public class PlanRecognitionBlackUpdateRequest extends BaseRequest
{


	/** 
	 识别计划唯一标识，可从查询重点人员识别计划获取
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
	 单个修改重点人员识别计划请求
	 
	 @param indexCode 识别计划唯一标识
	 @param name 识别计划名称
	 @param recognitionResourceIndexCodes 识别资源唯一标识的集合
	 @param threshold 阈值
	 @param faceGroupIndexCodes 人脸分组唯一标识的集合
	 @param cameraIndexCodes 抓拍点通道唯一标识的集合
	*/
	public PlanRecognitionBlackUpdateRequest(String indexCode, String name, String[] recognitionResourceIndexCodes, int threshold, String[] faceGroupIndexCodes, String[] cameraIndexCodes)
	{
		setIndexCode(indexCode);
		setName(name);
		setFaceGroupIndexCodes(faceGroupIndexCodes);
		setCameraIndexCodes(cameraIndexCodes);
		setRecognitionResourceIndexCodes(recognitionResourceIndexCodes);
		setThreshold(threshold);
	}


	/** 
	 
	 
	 @exception ArgumentNullException
	 @exception ArgumentOutOfRangeException
	*/
	@Override
	public void CheckParams()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getName()))
		{
			throw new NullPointerException("Name");
		}


		if (getThreshold() < 1 || getThreshold() > 99)
		{
			throw new IndexOutOfBoundsException("Threshold", getThreshold(), "在 1 到 99 之间");
		}

		if (getRecognitionResourceIndexCodes() == null)
		{
			throw new NullPointerException("RecognitionResourceIndexCodes");
		}
		if (getRecognitionResourceIndexCodes().length == 0)
		{
			throw new IndexOutOfBoundsException("RecognitionResourceIndexCodes", "最少一个计划");
		}

		if (getFaceGroupIndexCodes() == null)
		{
			throw new NullPointerException("FaceGroupIndexCodes");
		}
		if (getFaceGroupIndexCodes().length == 0)
		{
			throw new IndexOutOfBoundsException("FaceGroupIndexCodes", "最少一个人脸资源");
		}
		if (getCameraIndexCodes() == null)
		{
			throw new NullPointerException("CameraIndexCodes");
		}
		if (getCameraIndexCodes().length == 0)
		{
			throw new IndexOutOfBoundsException("CameraIndexCodes", "最少一个摄像头资源");
		}
	}

}