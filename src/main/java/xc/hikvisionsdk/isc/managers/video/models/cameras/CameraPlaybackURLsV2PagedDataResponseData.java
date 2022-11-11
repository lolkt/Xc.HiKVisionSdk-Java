package xc.hikvisionsdk.isc.managers.video.models.cameras;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.video.*;

/** 
 
*/
public class CameraPlaybackURLsV2PagedDataResponseData
{
	/** 
	 分页标记        标记本次查询的全部标识符，用于查询分片时的多次查询
	*/
	private String Uuid;
	public final String getUuid()
	{
		return Uuid;
	}
	public final void setUuid(String value)
	{
		Uuid = value;
	}

	/** 
	 取流短url，注：rtsp的回放url后面要指定?playBackMode=1 在vlc上才能播放
	*/
	private String Url;
	public final String getUrl()
	{
		return Url;
	}
	public final void setUrl(String value)
	{
		Url = value;
	}
	/** 
	 具体数据
	*/
	private CameraPlaybackURLsV2ResponseData[] List;
	public final CameraPlaybackURLsV2ResponseData[] getList()
	{
		return List;
	}
	public final void setList(CameraPlaybackURLsV2ResponseData[] value)
	{
		List = value;
	}

}