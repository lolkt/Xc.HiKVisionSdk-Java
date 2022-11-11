package xc.hikvisionsdk.isc.managers.video.models.cameras;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.video.*;

/** 
 获取监控点预览取流URLv2结果数据
*/
public class CameraPreviewURLsV2ResponseData
{
	/** 
	 取流URL
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
}