package xc.hikvisionsdk.isc.models;

import xc.hikvisionsdk.options.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 配置选项
*/
public class IscSdkOption extends HiKVisionOptions
{
	/** 
	 节点名称
	*/
	public static final String Position = "Hikvision.Isc";

	/** 
	 
	*/
	private boolean DownloadImg;
	public final boolean getDownloadImg()
	{
		return DownloadImg;
	}
	public final void setDownloadImg(boolean value)
	{
		DownloadImg = value;
	}
}