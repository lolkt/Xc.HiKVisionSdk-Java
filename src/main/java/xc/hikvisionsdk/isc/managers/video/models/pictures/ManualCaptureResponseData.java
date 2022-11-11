package xc.hikvisionsdk.isc.managers.video.models.pictures;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.video.*;

/** 
 手动抓图结果数据
*/
public class ManualCaptureResponseData
{
	/** 
	 图片url信息
	*/
	private String PicUrl;
	public final String getPicUrl()
	{
		return PicUrl;
	}
	public final void setPicUrl(String value)
	{
		PicUrl = value;
	}
}