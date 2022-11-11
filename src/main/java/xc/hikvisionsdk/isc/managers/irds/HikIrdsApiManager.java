package xc.hikvisionsdk.isc.managers.irds;

import xc.hikvisionsdk.isc.managers.irds.models.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;

/** 
 
*/
public class HikIrdsApiManager implements IHikIrdsApiManager
{
	private final IHikVisionIscApiManager _hikVisionApiManager;
	/** 
	 
	 
	 @param hikVisionApiManager
	*/
	public HikIrdsApiManager(IHikVisionIscApiManager hikVisionApiManager)
	{
		_hikVisionApiManager = hikVisionApiManager;
	}

	/** 
	 
	 
	 @param request
	 @return 
	*/
	public final Task<CardInfoResponse> CardInfoAsync(CardInfoRequest request)
	{
		return HikVisionApiManagerExtensions.<CardInfoRequest, CardInfoResponse>PostAndGetAsync(_hikVisionApiManager, "/api/irds/v1/card/cardInfo", request, VersionConsts.V1_2);
	}



	/** 
	 
	 
	 @param request
	 @return 
	*/
	public final Task<AdvanceCardListResponse> AdvanceCardListAsync(AdvanceCardListRequest request)
	{
		return HikVisionApiManagerExtensions.<AdvanceCardListRequest, AdvanceCardListResponse>PostAndGetAsync(_hikVisionApiManager, "/api/irds/v1/card/advance/cardList", request, VersionConsts.V1_4);
	}



}