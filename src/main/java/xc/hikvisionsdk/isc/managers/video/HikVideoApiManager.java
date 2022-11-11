package xc.hikvisionsdk.isc.managers.video;

import xc.hikvisionsdk.isc.managers.video.models.cameras.*;
import xc.hikvisionsdk.isc.managers.video.models.pictures.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;

/** 
 视频api
*/
public class HikVideoApiManager implements IHikVideoApiManager
{



	/** 
	 获取监控点预览取流URLv2
	 
	 @param request 请求
	 @return 
	*/
	public final Task<CameraPreviewURLsV2Response> CameraPreviewURLsV2Async(CameraPreviewURLsV2Request request)
	{
		return HikVisionApiManagerExtensions.<CameraPreviewURLsV2Request, CameraPreviewURLsV2Response>PostAndGetAsync(_hikVisionApiManager, "/api/video/v2/cameras/previewURLs", request, VersionConsts.V1_4);
	}


	/** 
	 获取监控点回放取流URLv2
	 
	 @param request 请求
	 @return 
	*/
	public final Task<CameraPlaybackURLsV2Response> CameraPlaybackURLsV2Async(CameraPlaybackURLsV2Request request)
	{
		return HikVisionApiManagerExtensions.<CameraPlaybackURLsV2Request, CameraPlaybackURLsV2Response>PostAndGetAsync(_hikVisionApiManager, "/api/video/v2/cameras/playbackURLs", request, VersionConsts.V1_4);
	}

	/** 
	 视频图片查询
	 
	 @param request
	 @return 
	*/
	public final Task<CameraEventsPictureResponse> CameraEventsPictureAsync(CameraEventsPictureRequest request)
	{
		return HikVisionApiManagerExtensions.<CameraEventsPictureRequest, CameraEventsPictureResponse>PostAndGetAsync(_hikVisionApiManager, "/api/video/v1/events/picture", request, VersionConsts.V1_3);
	}

	/** 
	 平台抓拍计划图片获取
	 
	 @param request
	 @return 
	*/
	public final Task<CameraPictureInfosResponse> CameraPictureInfosAsync(CameraPictureInfosRequest request)
	{
		return HikVisionApiManagerExtensions.<CameraPictureInfosRequest, CameraPictureInfosResponse>PostAndGetAsync(_hikVisionApiManager, "/api/video/v1/pictureInfos", request, VersionConsts.V1_4);
	}

	/** 
	 手动抓图
	 
	 @param request
	 @return 
	*/
	public final Task<ManualCaptureResponse> ManualCaptureResponse(ManualCaptureRequest request)
	{
		return HikVisionApiManagerExtensions.<ManualCaptureRequest, ManualCaptureResponse>PostAndGetAsync(_hikVisionApiManager, "/api/video/v1/manualCapture", request, VersionConsts.V1_2);
	}


	private final IHikVisionIscApiManager _hikVisionApiManager;

	/** 
	 
	 
	 @param hikVisionApiManager
	*/
	public HikVideoApiManager(IHikVisionIscApiManager hikVisionApiManager)
	{
		_hikVisionApiManager = hikVisionApiManager;
	}





}