package xc.hikvisionsdk.isc.managersv2.persons;

import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managersv2.persons.dtos.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 人员及照片管理
*/
public class HikPersonManager implements IHikPersonManager
{
	private final IHikVisionIscApiManager _hikVisionApiManager;

	/** 
	 人员及照片管理
	 
	 @param hikVisionApiManager
	*/
	public HikPersonManager(IHikVisionIscApiManager hikVisionApiManager)
	{
		_hikVisionApiManager = hikVisionApiManager;
	}

	/** 
	 添加人员v2
	 
	 @param request
	 @return 
	*/
	public final Task<AddPersonV2Response> AddV2Async(AddPersonV2Request request)
	{
		//TODO： 扩展
		return HikVisionApiManagerExtensions.<AddPersonV2Request, AddPersonV2Response>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v2/person/single/add", request, VersionConsts.V1_5);
	}

	/** 
	 批量添加人员
	 
	 @param request
	 @return 
	*/
	public final Task<BatchAddPersonsResponse> BatchAddAsync(BatchAddPersonsRequest request)
	{
		//TODO： 扩展
		return HikVisionApiManagerExtensions.<BatchAddPersonsRequest, BatchAddPersonsResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/person/batch/add", request, VersionConsts.V1_3);
	}

	/** 
	 修改人员
	 
	 @param request
	 @return 
	*/
	public final Task<UpdatePersonResponse> UpdateAsync(UpdatePersonRequest request)
	{
		//TODO： 扩展
		return HikVisionApiManagerExtensions.<UpdatePersonRequest, UpdatePersonResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/person/single/update", request, VersionConsts.V1_3);
	}

	/** 
	 批量删除人员
	 
	 @param request
	 @return 
	*/
	public final Task<BatchDeletePersonsResponse> BatchDeleteAsync(BatchDeletePersonsRequest request)
	{
		return HikVisionApiManagerExtensions.<BatchDeletePersonsRequest, BatchDeletePersonsResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/person/batch/delete", request, VersionConsts.V1_3);
	}

	/** 
	 获取组织下人员列表v2
	 
	 @param request
	 @return 
	*/
	public final Task<GetPersonListByOrgV2Response> GetListByOrgV2Async(GetPersonListByOrgV2Request request)
	{
		//TODO: 扩展
		return HikVisionApiManagerExtensions.<GetPersonListByOrgV2Request, GetPersonListByOrgV2Response>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v2/person/orgIndexCode/personList", request, VersionConsts.V1_3);
	}

	/** 
	 获取人员列表v2
	 
	 @param request
	 @return 
	*/
	public final Task<GetPersonListV2Response> GetListV2Async(GetPersonListV2Request request)
	{
		//TODO: 扩展
		return HikVisionApiManagerExtensions.<GetPersonListV2Request, GetPersonListV2Response>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v2/person/personList", request, VersionConsts.V1_3);
	}

	/** 
	 查询人员列表v2
	 
	 @param request
	 @return 
	*/
	public final Task<GetPersonListByParametersV2Response> GetListByParametersV2Async(GetPersonListByParametersV2Request request)
	{
		//TODO: 扩展
		return HikVisionApiManagerExtensions.<GetPersonListByParametersV2Request, GetPersonListByParametersV2Response>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v2/person/advance/personList", request, VersionConsts.V1_3);
	}

	/** 
	 根据人员唯一字段获取人员详细信息
	 
	 @param request
	 @return 
	*/
	public final Task<GetPersonDetailResponse> GetDetailListAsync(GetPersonDetailRequest request)
	{
		return HikVisionApiManagerExtensions.<GetPersonDetailRequest, GetPersonDetailResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/person/condition/personInfo", request, VersionConsts.V1_4);
	}

	/** 
	 增量获取人员数据
	 
	 @param request
	 @return 
	*/
	public final Task<GetPersonListByTimeRangeResponse> GetListByTimeRangeAsync(GetPersonListByTimeRangeRequest request)
	{
		return HikVisionApiManagerExtensions.<GetPersonListByTimeRangeRequest, GetPersonListByTimeRangeResponse>PostAndGetAsync(_hikVisionApiManager, "/api/resource/v1/person/personList/timeRange", request, VersionConsts.V1_4);
	}


	/** 
	 提取人员图片
	 
	 @param request
	 @return 
	 @exception HttpRequestException
	*/
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent in Java to the 'async' keyword:
//ORIGINAL LINE: public async Task<GetPictureResponse> GetPictureAsync(GetPictureRequest request)
	public final Task<GetPictureResponse> GetPictureAsync(GetPictureRequest request)
	{
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
		var response = await HikVisionApiManagerExtensions.PostAsync(_hikVisionApiManager, "/api/resource/v1/person/picture", request, VersionConsts.V1);
		if (response.IsSuccessStatusCode)
		{
			GetPictureResponse tempVar = new GetPictureResponse();
			tempVar.setCode("0");
			tempVar.setData(response.Headers.GetValues("Location").First());
			tempVar.setMsg("SUCCESS");
			return tempVar;
		}
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
		String result = await response.Content.ReadAsStringAsync();
		var output = Newtonsoft.Json.JsonConvert.<GetPictureResponse>DeserializeObject(result);
		if (output.Status != 0)
		{
			//output.Code = output.Status.ToString();
			//output
			throw new HttpRequestException(result);
		}
		return output;
	}
}