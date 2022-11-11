package xc.hikvisionsdk.isc.managers.acs;

import xc.hikvisionsdk.isc.managers.acs.models.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;

/** 
 门禁api
*/
public class HikAcsApiManager implements IHikAcsApiManager
{
	private final IHikVisionIscApiManager _hikVisionApiManager;
	/** 
	 
	 
	 @param hikVisionApiManager
	*/
	public HikAcsApiManager(IHikVisionIscApiManager hikVisionApiManager)
	{
		_hikVisionApiManager = hikVisionApiManager;
	}

	/** 
	 
	 
	 @param model
	 @return 
	*/
	public final Task<DoorEventsResponse> DoorEventsAsync(DoorEventsRequest model)
	{
		return HikVisionApiManagerExtensions.<DoorEventsRequest, DoorEventsResponse>PostAndGetAsync(_hikVisionApiManager, "/api/acs/v1/door/events", model, VersionConsts.V1);
	}
	/** 
	 
	 
	 @param model
	 @return 
	*/
	public final Task<DoorEventsV2Response> DoorEventsV2Async(DoorEventsV2Request model)
	{
		return HikVisionApiManagerExtensions.<DoorEventsV2Request, DoorEventsV2Response>PostAndGetAsync(_hikVisionApiManager, "/api/acs/v2/door/events", model, VersionConsts.V1_41);
	}
	/** 
	 
	 
	 @param model
	 @return 
	*/
	public final Task<DoorSearchV2Response> DoorSearchV2Async(DoorSearchV2Request model)
	{
		return HikVisionApiManagerExtensions.<DoorSearchV2Request, DoorSearchV2Response>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v2/door/search", model, VersionConsts.V1_4);
	}


}