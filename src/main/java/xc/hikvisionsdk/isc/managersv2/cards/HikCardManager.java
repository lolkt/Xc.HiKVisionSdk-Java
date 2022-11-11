package xc.hikvisionsdk.isc.managersv2.cards;

import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managersv2.cards.dtos.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 人员卡片管理
*/
public class HikCardManager implements IHikCardManager
{

	private final IHikVisionIscApiManager _hikVisionApiManager;

	/** 
	 人员卡片接口
	 
	 @param hikVisionApiManager
	*/
	public HikCardManager(IHikVisionIscApiManager hikVisionApiManager)
	{
		_hikVisionApiManager = hikVisionApiManager;
	}

	/** 
	 获取卡片列表
	 
	 @param request
	 @return 
	*/
	public final Task<GetCardListResponse> GetListAsync(GetCardListRequest request)
	{
		return HikVisionApiManagerExtensions.<GetCardListRequest, GetCardListResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/card/cardList", request, VersionConsts.V1_2);
	}


	/** 
	 增量获取卡片数据
	 
	 @param request
	 @return 
	*/
	public final Task<GetCardListByTimeRangeResponse> GetListByTimeRangeAsync(GetCardListByTimeRangeRequest request)
	{
		return HikVisionApiManagerExtensions.<GetCardListByTimeRangeRequest, GetCardListByTimeRangeResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/card/timeRange", request, VersionConsts.V1_4);
	}

	/** 
	 获取单个卡片信息
	 
	 @param request
	 @return 
	*/
	public final Task<GetCardResponse> GetInfoAsync(GetCardRequest request)
	{
		return HikVisionApiManagerExtensions.<GetCardRequest, GetCardResponse>PostAndGetAsync(_hikVisionApiManager, "/api/irds/v1/card/cardInfo", request, VersionConsts.V1_2);
	}



	/** 
	 查询卡片列表
	 
	 @param request
	 @return 
	*/
	public final Task<GetCardListByParametersResponse> GetListByParametersAsync(GetCardListByParametersRequest request)
	{
		return HikVisionApiManagerExtensions.<GetCardListByParametersRequest, GetCardListByParametersResponse>PostAndGetAsync(_hikVisionApiManager, "/api/irds/v1/card/advance/cardList", request, VersionConsts.V1_4);
	}

	/** 
	 生成卡片二维码
	 
	 @param request
	 @return 
	*/
	public final Task<GenerateBarCodeResponse> GenerateBarCodeAsync(GenerateBarCodeRequest request)
	{
		return HikVisionApiManagerExtensions.<GenerateBarCodeRequest, GenerateBarCodeResponse>PostAndGetAsync(_hikVisionApiManager, "/api/cis/v1/card/barCode", request, VersionConsts.V1_4);
	}


	/** 
	 批量开卡
	 
	 @param request
	 @return 
	*/
	public final Task<BindingCardsResponse> BindingAsync(BindingCardsRequest request)
	{
		return HikVisionApiManagerExtensions.<BindingCardsRequest, BindingCardsResponse>PostAndGetAsync(_hikVisionApiManager, "/api/cis/v1/card/bindings", request, VersionConsts.V1_5);
	}

	/** 
	 卡片退卡
	 
	 @param request
	 @return 
	*/
	public final Task<DeletionCardResponse> DeletionAsync(DeletionCardRequest request)
	{
		return HikVisionApiManagerExtensions.<DeletionCardRequest, DeletionCardResponse>PostAndGetAsync(_hikVisionApiManager, "/api/cis/v1/card/deletion", request, VersionConsts.V1_2);
	}

	/** 
	 批量挂失
	 
	 @param request
	 @return 
	*/
	public final Task<AddCardsLossResponse> AddLossAsync(AddCardsLossRequest request)
	{
		return HikVisionApiManagerExtensions.<AddCardsLossRequest, AddCardsLossResponse>PostAndGetAsync(_hikVisionApiManager, "/api/cis/v1/card/batch/loss", request, VersionConsts.V1_4);
	}

	/** 
	 批量解挂
	 
	 @param request
	 @return 
	*/
	public final Task<DeleteCardsLossResponse> DeleteLossAsync(DeleteCardsLossRequest request)
	{
		return HikVisionApiManagerExtensions.<DeleteCardsLossRequest, DeleteCardsLossResponse>PostAndGetAsync(_hikVisionApiManager, "/api/cis/v1/card/batch/unloss", request, VersionConsts.V1_4);
	}
}