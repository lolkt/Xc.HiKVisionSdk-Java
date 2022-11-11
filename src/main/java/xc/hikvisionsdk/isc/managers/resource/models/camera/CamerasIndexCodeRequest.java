package xc.hikvisionsdk.isc.managers.resource.models.camera;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 根据编号获取监控点详细信息请求
*/
public class CamerasIndexCodeRequest extends BaseRequest
{
	/** 
	 监控点编号，
	 可通过分页获取监控点资源获取
	*/
	private String CameraIndexCode;
	public final String getCameraIndexCode()
	{
		return CameraIndexCode;
	}
	public final void setCameraIndexCode(String value)
	{
		CameraIndexCode = value;
	}

	/** 
	 根据编号获取监控点详细信息请求
	 
	 @param cameraIndexCode 监控点编号
	*/
	public CamerasIndexCodeRequest(String cameraIndexCode)
	{
		setCameraIndexCode(cameraIndexCode);
	}


	/** 
	 
	 
	 @exception ArgumentNullException
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