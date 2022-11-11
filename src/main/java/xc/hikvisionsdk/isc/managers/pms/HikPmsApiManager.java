package xc.hikvisionsdk.isc.managers.pms;

import xc.hikvisionsdk.isc.managers.pms.models.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;

/** 
 停车场api
*/
public class HikPmsApiManager implements IHikPmsApiManager
{
	private final IHikVisionIscApiManager _hikVisionApiManager;
	/** 
	 
	 
	 @param hikVisionApiManager
	*/
	public HikPmsApiManager(IHikVisionIscApiManager hikVisionApiManager)
	{
		_hikVisionApiManager = hikVisionApiManager;
	}

	/** 
	 
	 
	 @param model
	 @return 
	*/
	public final Task<ParkRemainSpaceNumResponse> ParkRemainSpaceNumAsync(ParkRemainSpaceNumRequest model)
	{
		return HikVisionApiManagerExtensions.<ParkRemainSpaceNumRequest, ParkRemainSpaceNumResponse>PostAndGetAsync(_hikVisionApiManager, "/api/pms/v1/park/remainSpaceNum", model, VersionConsts.V1);
	}

	/** 
	 
	 
	 @param model
	 @return 
	*/
	public final Task<AlarmCarAdditionResponse> AlarmCarAdditionAsync(AlarmCarAdditionRequest model)
	{
		return HikVisionApiManagerExtensions.<AlarmCarAdditionRequest, AlarmCarAdditionResponse>PostAndGetAsync(_hikVisionApiManager, "/api/pms/v1/alarmCar/addition", model, VersionConsts.V1_2);
	}

	/** 
	 
	 
	 @param model
	 @return 
	*/
	public final Task<AlarmCarDeletionResponse> AlarmCarDeletionAsync(AlarmCarDeletionRequest model)
	{
		return HikVisionApiManagerExtensions.<AlarmCarDeletionRequest, AlarmCarDeletionResponse>PostAndGetAsync(_hikVisionApiManager, "/api/pms/v1/alarmCar/deletion", model, VersionConsts.V1_2);
	}

	/** 
	 
	 
	 @param model
	 @return 
	*/
	public final Task<AlarmCarPageResponse> AlarmCarPageAsync(AlarmCarPageRequest model)
	{
		return HikVisionApiManagerExtensions.<AlarmCarPageRequest, AlarmCarPageResponse>PostAndGetAsync(_hikVisionApiManager, "/api/pms/v1/alarmCar/page", model, VersionConsts.V1_2);
	}
}