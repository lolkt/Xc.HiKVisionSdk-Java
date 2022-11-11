package xc.hikvisionsdk.isc.managers.video.models.pictures;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.video.*;

/** 
 手动抓图请求
*/
public class ManualCaptureRequest extends BaseRequest
{
	/** 
	 监控点唯一标识，        可通过分页获取监控点资源获取
	*/
	private String CameraIndexCode;
	public final String getCameraIndexCode()
	{
		return CameraIndexCode;
	}

	/** 
	 手动抓图请求
	 
	 @param cameraIndexCode 监控点唯一标识，        可通过分页获取监控点资源获取
	*/
	public ManualCaptureRequest(String cameraIndexCode)
	{
		CameraIndexCode = cameraIndexCode;
	}

	/** 
	 
	 
	 @exception System.ArgumentNullException
	*/
	@Override
	public void CheckParams()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getCameraIndexCode()))
		{
			throw new NullPointerException("CameraIndexCode");
		}
	}
}