package xc.hikvisionsdk.isc.managers.resource.models.camera;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 分页获取监控点资源请求
*/
public class CamerasRequest extends PagedRequest
{

	/** 
	 分页获取监控点资源请求
	*/
	public CamerasRequest()
	{
	}

	/** 
	 分页获取监控点资源请求
	 
	 @param pageNo
	 @param pageSize
	*/
	public CamerasRequest(int pageNo, int pageSize)
	{
		super(pageNo, pageSize);
	}

}