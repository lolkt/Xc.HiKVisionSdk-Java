package xc.hikvisionsdk.isc.callbacks.frs.compare;

import Newtonsoft.Json.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;
import xc.hikvisionsdk.isc.callbacks.frs.*;

/** 
 人员数据
*/
public class HumanDataItem
{
	/** 
	 比对到的人脸的图片URL
	 可能位于设备或ASW服务上，调用人脸服务图片下载 获取图片数据
	*/

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty("face_picurl")] public string PicUrl {get;set;}
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