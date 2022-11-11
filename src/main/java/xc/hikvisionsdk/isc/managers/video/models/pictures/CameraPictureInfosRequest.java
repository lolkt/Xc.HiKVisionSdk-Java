package xc.hikvisionsdk.isc.managers.video.models.pictures;

import xc.hikvisionsdk.consts.*;
import xc.hikvisionsdk.isc.enums.video.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.video.*;
import java.time.*;

/** 
 平台抓拍计划图片获取请求
*/
public class CameraPictureInfosRequest extends IOSTimeRangeWithPagedRequest
{
	/** 
	 监控点编号集合，一次性最多传入5个监控点编号进行查询。与captureId取交集，两个参数都不传时返回所有配置了抓图计划的监控点的图片信息。
	*/
	private String[] CameraIndexCodes;
	public final String[] getCameraIndexCodes()
	{
		return CameraIndexCodes;
	}
	private void setCameraIndexCodes(String[] value)
	{
		CameraIndexCodes = value;
	}
	/** 
	 图片唯一标识，与cameraIndexCodes取交集，主要用于本接口全量查询后通过获取的图片唯一标识查询单张图片信息。
	*/
	private String CaptureId;
	public final String getCaptureId()
	{
		return CaptureId;
	}
	private void setCaptureId(String value)
	{
		CaptureId = value;
	}
	/** 
	 网络协议。"http”:HTTP协议、“https”:HTTPS协议。参数不填，优先返回https协议
	*/
	private String NetProtocol;
	public final String getNetProtocol()
	{
		return NetProtocol;
	}
	/** 
	 图片排序方式。0-按监控点排序，根据监控点名称ASCII码顺序排序。同一监控点的图片按照时间倒序排序；1-按时间排序，根据抓图时间倒序排序，
	 最新的图片排在最前边。相同时间按监控点名称顺序排序。参数不填，默认按0-监控点排序。
	*/
	private CameraPictureInfoSortType Sort = CameraPictureInfoSortType.values()[0];
	public final CameraPictureInfoSortType getSort()
	{
		return Sort;
	}
	private void setSort(CameraPictureInfoSortType value)
	{
		Sort = value;
	}
	/** 
	 图片质量压缩比。标识返回缩略图的图片质量压缩比。通过修改图片压缩比来改变图片大小（图片占用字节数），不会改变图片尺寸。取值范围为0-99，不传时默认为50，取值越小，表示压缩更多，图片失真越严重。
	*/
	private int CompressRatio;
	public final int getCompressRatio()
	{
		return CompressRatio;
	}
	private void setCompressRatio(int value)
	{
		CompressRatio = value;
	}

	/** 
	 平台抓拍计划图片获取请求
	 
	 @param pageNo
	 @param pageSize
	 @param start
	 @param end
	 @param compressRatio 图片质量压缩比
	 @param useSsl 使用https
	 @param captureId 图片唯一标识
	*/

	public CameraPictureInfosRequest(int pageNo, int pageSize, java.time.LocalDateTime start, java.time.LocalDateTime end, int compressRatio, boolean useSsl)
	{
		this(pageNo, pageSize, start, end, compressRatio, useSsl, "");
	}

	public CameraPictureInfosRequest(int pageNo, int pageSize, java.time.LocalDateTime start, java.time.LocalDateTime end, int compressRatio)
	{
		this(pageNo, pageSize, start, end, compressRatio, true, "");
	}

	public CameraPictureInfosRequest(int pageNo, int pageSize, java.time.LocalDateTime start, java.time.LocalDateTime end)
	{
		this(pageNo, pageSize, start, end, 50, true, "");
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public CameraPictureInfosRequest(int pageNo, int pageSize, DateTime start, DateTime end, int compressRatio = 50, bool useSsl = true, string captureId = "")
	public CameraPictureInfosRequest(int pageNo, int pageSize, LocalDateTime start, LocalDateTime end, int compressRatio, boolean useSsl, String captureId)
	{
		super(pageNo, pageSize, start, end, true);
		NetProtocol = NetProtocolConsts.GetNetProtocol(useSsl);
		setCompressRatio(compressRatio);
		setCaptureId(captureId);
	}

	/** 
	 传入监控点编号集合
	 
	 @param cameraIndexCodes
	 @return 
	*/
	public final CameraPictureInfosRequest UseCameras(String... cameraIndexCodes)
	{
		setCameraIndexCodes(cameraIndexCodes);
		return this;
	}

	/** 
	 按时间排序图片
	 
	 @return 
	*/
	public final CameraPictureInfosRequest UseOrderByTime()
	{
		setSort(CameraPictureInfoSortType.OrderByTime);
		return this;
	}


	/** 
	 
	 
	 @exception System.ArgumentOutOfRangeException
	*/
	@Override
	public void CheckParams()
	{
		if (getCameraIndexCodes() != null && getCameraIndexCodes().length > 5)
		{
			throw new IndexOutOfBoundsException("CameraIndexCodes", "一次性最多传入5个监控点编号");
		}

		if (getCompressRatio() < 0 || getCompressRatio() > 99)
		{
			throw new IndexOutOfBoundsException("CompressRatio", "取值范围为0-99 ");
		}
		if (!NetProtocolConsts.Check(getNetProtocol()))
		{
			throw new IndexOutOfBoundsException("NetProtocol", "只能使用 http 或 https");
		}
		super.CheckParams();
	}

}