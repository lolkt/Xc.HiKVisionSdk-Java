package xc.hikvisionsdk.isc.managers.video.models.cameras;

import xc.hikvisionsdk.models.responses.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.video.*;

/** 
 获取监控点回放取流URLv2结果
*/

public class CameraPlaybackURLsV2Response extends HiKVisionResponse
{

	/** 
	 获取监控点回放取流URLv2结果数据
	*/
	private CameraPlaybackURLsV2PagedDataResponseData Data;
	public final CameraPlaybackURLsV2PagedDataResponseData getData()
	{
		return Data;
	}
	public final void setData(CameraPlaybackURLsV2PagedDataResponseData value)
	{
		Data = value;
	}

}