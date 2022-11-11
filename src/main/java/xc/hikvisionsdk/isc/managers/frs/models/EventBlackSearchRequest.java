package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;
import java.time.*;

/** 
 按条件查询重点人员事件请求
*/
public class EventBlackSearchRequest extends IOSTimeRangeWithPagedRequest
{
	/** 
	 监控点唯一标志集合，若不指定，则查询所有的监控点
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
	 指定查询的最小相似度, 最小为1，最大为100
	*/
	private int Similarity = 50;
	public final int getSimilarity()
	{
		return Similarity;
	}
	public final void setSimilarity(int value)
	{
		Similarity = value;
	}
	/** 
	 指定查询的人员姓名
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
	 指定查询的证件类型，ID-身份证，otherId-其他证件
	*/
	private String CertificateType;
	public final String getCertificateType()
	{
		return CertificateType;
	}
	public final void setCertificateType(String value)
	{
		CertificateType = value;
	}
	/** 
	 指定查询的证件号码
	*/
	private String CertificateNumber;
	public final String getCertificateNumber()
	{
		return CertificateNumber;
	}
	public final void setCertificateNumber(String value)
	{
		CertificateNumber = value;
	}
	/** 
	 指定查询的年龄段，
	 kid-儿童，
	 child-少年，
	 teenager-青少年，
	 young-青年，
	 prime-壮年，
	 middle-中年，
	 middleAged-中老年，
	 old-老年
	*/
	private String[] Age;
	public final String[] getAge()
	{
		return Age;
	}
	public final void setAge(String[] value)
	{
		Age = value;
	}
	/** 
	 定查询的性别，male-男，female-女
	*/
	private String Gender;
	public final String getGender()
	{
		return Gender;
	}
	public final void setGender(String value)
	{
		Gender = value;
	}
	/** 
	 指定查询是否戴眼镜，
	 yes是，
	 no否
	*/
	private String Glass;
	public final String getGlass()
	{
		return Glass;
	}
	public final void setGlass(String value)
	{
		Glass = value;
	}
	/** 
	 指定查询的所属人脸分组集合，不指定则查询所有的人脸分组
	*/
	private String[] FaceGroupIndexcodes;
	public final String[] getFaceGroupIndexcodes()
	{
		return FaceGroupIndexcodes;
	}
	public final void setFaceGroupIndexcodes(String[] value)
	{
		FaceGroupIndexcodes = value;
	}
	/** 
	 排序字段。结果查询排序字段，0时间，1相似度，排序支持倒序排序，默认按照时间倒叙排序
	*/
	private String OrderType;
	public final String getOrderType()
	{
		return OrderType;
	}
	public final void setOrderType(String value)
	{
		OrderType = value;
	}

	/** 
	 按条件查询重点人员事件请求
	*/
	public EventBlackSearchRequest()
	{
	}

	/** 
	 按条件查询重点人员事件请求
	 
	 @param similarity 指定查询的最小相似度, 最小为1，最大为100
	 @param pageNo 当前页码
	 @param pageSize 每页记录总数
	 @param startTime 开始时间
	 @param endTime 结束时间
	*/
	public EventBlackSearchRequest(int similarity, int pageNo, int pageSize, LocalDateTime startTime, LocalDateTime endTime)
	{
		super(pageNo, pageSize, startTime, endTime);
		setSimilarity(similarity);
	}
}