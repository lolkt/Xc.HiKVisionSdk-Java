package xc.hikvisionsdk.isc.managers.video.models.pictures;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.video.*;

/** 
 视频图片查询结果数据
*/
public class CameraEventsPictureResponseData
{
	/** 
	 图片url ,有效期24小时
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