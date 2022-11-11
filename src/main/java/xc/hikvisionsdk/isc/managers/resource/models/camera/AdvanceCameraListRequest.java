package xc.hikvisionsdk.isc.managers.resource.models.camera;

import xc.hikvisionsdk.isc.enums.resource.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 查询监控点列表请求
*/
public class AdvanceCameraListRequest extends PagedRequest
{
	/** 
	 监控点唯一标识集
	 多个值使用英文逗号分隔，
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
	 监控点名称（最大长度32）支持中英文字符，不能包含 ' / \ : * ? " ，支持模糊搜索
	*/
	private String CameraName;
	public final String getCameraName()
	{
		return CameraName;
	}
	public final void setCameraName(String value)
	{
		CameraName = value;
	}

	/** 
	 所属编码设备唯一标识 （最大长度64）
	 若指定编码设备的值，则只查询本级监控点；
	 可通过获取编码设备列表接口获取
	*/
	private String EncodeDevIndexCode;
	public final String getEncodeDevIndexCode()
	{
		return EncodeDevIndexCode;
	}
	public final void setEncodeDevIndexCode(String value)
	{
		EncodeDevIndexCode = value;
	}

	/** 
	 区域唯一标识；
	 可通过区域信息接口获取
	*/
	private String RegionIndexCode;
	public final String getRegionIndexCode()
	{
		return RegionIndexCode;
	}
	public final void setRegionIndexCode(String value)
	{
		RegionIndexCode = value;
	}
	/** 
	 0：非级联
	 1：级联
	 2：不限（包括级联和非级联）
	 默认取值：2
	*/
	private CascadeType IsCascade = CascadeType.All;
	public final CascadeType isCascade()
	{
		return IsCascade;
	}
	public final void setCascade(CascadeType value)
	{
		IsCascade = value;
	}

	/** 
	 查询监控点列表请求
	*/
	public AdvanceCameraListRequest()
	{
	}

	/** 
	 查询监控点列表请求
	 
	 @param pageNo
	 @param pageSize
	*/
	public AdvanceCameraListRequest(int pageNo, int pageSize)
	{
		super(pageNo, pageSize);
	}
}