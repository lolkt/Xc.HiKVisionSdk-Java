package xc.hikvisionsdk.isc.managers.frs;

import xc.hikvisionsdk.isc.managers.frs.models.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;

/** 
 人脸应用服务
*/
public interface IHikFrsApiManager
{

	/** 
	 单个添加重点人员识别计划
	 
	 
	 a)该接口可以新增一条重点人员识别计划，以实现将若干抓拍点抓拍到的人脸，通过若干识别资源同若干分组内的人脸比较，并将命中结果以事件形式上报。
	 b)配置一条识别计划需要人脸分组集合（通过"按条件查询人脸分组”接口获取），抓拍点集合（通过LDAP服务获取监控点，并通过型号确定抓拍点），识别资源集合（通过”按条件查询识别资源”接口获取）。
	c)一条重点人员识别计划只能配置一种识别资源类别：深眸或脸谱或超脑。
	d)一条重点人员识别计划，可以配置多个超脑作为识别资源或一个脸谱作为识别资源。
	e)一条重点人员识别计划如果配置深眸作为识别资源，则recognitionResourceIndexCodes可以传空。因为深眸的抓拍点就是识别资源本身，人脸监控应用服务会根据抓拍点自动匹配正确的识别资源。
	f)人脸监控应用服务会校验抓拍点的有效性。校验规则如下：超脑作为识别资源时，抓拍点必须是超脑的通道；脸谱作为识别资源时，脸谱作为识别资源时，抓拍点一般为深眸或其他人脸抓拍机通道；深眸作为识别资源时，抓拍点必须是深眸的通道；一个通道是否是深眸/超脑/抓拍机的通道，取决于通道所属设备的型号，详见附录I 人脸监控应用服务支持设备型号列表。
	g)重点人员识别计划配置有以下限制，这些限制会在添加时作为特殊错误返回：超脑的一个通道只能配置一次重点人员识别计划；同一个抓拍点不能同时配置在多个脸谱上；抓拍点或识别资源没有同步到IAC前，无法配置识别计划。
	h)识别计划的配置为异步过程，调用接口成功后，人脸监控应用服务会在后台自动下发人脸分组并执行布控操作，可以通过接口"单个查询重点人员识别计划详情”查询该识别计划的下发结果。
	i) 识别计划支持配置时间计划模板，当时间计划参数不传时，默认全天候。当传入此参数时，时间计划规则如下：按周计划进行配置，每一天的时间段上限为8，每一个时间段的开始时间必须小于结束时间。
	j)同一个深眸支持配置多个识别计划。
	k)若设备上人脸分组达到上限，则有可能导致下发失败。
	 
	 @param model
	 @return 
	*/
	Task<PlanRecognitionBlackAdditionResponse> PlanRecognitionBlackAdditionAsync(PlanRecognitionBlackAdditionRequest model);

	/** 
	 删除重点人员识别计划
	 
	 
	 a)根据重点人员识别计划的唯一标识,删除若干重点人员识别计划，返回的data为布尔类型，true代表操作成功，false代表操作失败。
	 b)删除识别计划后，会异步删除识别计划中下发到设备上的人脸分组、人脸、布控信息。因此调用接口成功的时候，可以观察到识别资源上的分组还是存在的，需要等一段时间后才会删除。
	 c)请勿在识别计划正在下发时，调用删除识别计划的接口。
	 
	 @param model
	 @return 
	*/
	Task<PlanRecognitionBlackDeletionResponse> PlanRecognitionBlackDeletionAsync(PlanRecognitionBlackDeletionRequest model);

	/** 
	 单个修改重点人员识别计划
	 
	 
	 a)修改指定的重点人员识别计划信息，返回的data为布尔类型，true代表操作成功，false代表操作失败。
	 b)修改识别计划时，传入的信息和添加一致，不需要修改的字段也要传过来，但是部分不支持修改的字段不需要传，详情请以入参说明为准。
	 c)修改识别计划的接口校验同添加一致，请见单个添加重点人员识别计划中的接口说明。
	 d)识别计划修改后，会自动重新下发。
	 e)脸谱作为识别资源的识别计划，不支持更换识别资源。深眸、超脑作为识别资源时不支持修改识别资源的类型。
	 f) 识别计划支持配置时间计划模板，当时间计划参数不传时，默认全天候。当传入此参数时，时间计划规则如下：按周计划进行配置，每一天的时间段上限为8，每一个时间段的开始时间必须小于结束时间。
	 @param model
	 @return 
	*/
	Task<PlanRecognitionBlackUpdateResponse> PlanRecognitionBlackUpdateAsync(PlanRecognitionBlackUpdateRequest model);

	/** 
	 单个查询重点人员识别计划详情
	 
	 a)根据重点人员识别计划的唯一标识，查询单个重点人员识别计划的下发状态和结果详情。
	 b)返回的结果中包含了识别计划的所有信息和下发状态。还包含了人脸分组、人脸、通道布控的结果，其中人脸下发结果以分页方式返回。
	 c)通道布控的结果，在超脑作为识别资源的识别计划中才会返回；脸谱和深眸作为识别资源时，该字段为空集合。
	 d)调用方可以通过定时调用该接口，获取识别计划的下发情况和具体每张人脸的下发结果。
	 @param model
	 @return 
	*/
	Task<PlanRecognitionBlackDetailResponse> PlanRecognitionBlackDetailAsync(PlanRecognitionBlackDetailRequest model);

	/** 
	 查询重点人员识别计划
	 
	 a)根据查询条件，查询符合条件的重点人员识别计划的集合。
	 b)查询条件之间的关系为与，即所有条件同时生效，不传任何条件代表查询所有。
	 c)这里的人脸分组集合作为查询条件，如果传多个分组，则识别计划只要包含其中任意一个分组，就会被查询出来。
	 @param model
	 @return 
	*/
	Task<PlanRecognitionBlackResponse> PlanRecognitionBlackAsync(PlanRecognitionBlackRequest model);

	/** 
	 重新下发重点人员识别计划
	 
	 a)重新下发指定的重点人员识别计划，返回的data为布尔类型，true代表操作成功，false代表操作失败。
	 b)重新下发只能针对状态为下发失败的识别计划操作，且重新下发只会下发失败的部分，对于已经成功的部分不会重复下发。
	 c)重新下发的结果可以通过单个查询重点人员识别计划详情查看。
	 @param model
	 @return 
	*/
	Task<PlanRecognitionBlackRestartResponse> PlanRecognitionBlackRestartAsync(PlanRecognitionBlackRestartRequest model);







	/** 
	 按条件查询重点人员事件
	 
	 @param model
	 @return 
	 
	 a)按条件查询重点人员事件。
	 b)检索出来的结果是分页的集合，分页参数由接口参数传入。
	 
	*/
	Task<EventBlackSearchResponse> EventBlackSearchAsync(EventBlackSearchRequest model);



	/** 
	 单个添加人脸
	 
	 
	 a)一次性添加一张人脸，返回结果为添加成功的人脸。
	 b)添加的人脸图片，目前支持URL方式和二进制数据方式。URL方式时，人脸监控应用服务会通过HTTP协议的GET方式下载图片，校验图片，最后重新上传图片；二进制数据是指图片的字节流经过Base64编码后得到的字符串。
	 c)该URL能通过HTTP协议的GET方式能下载获取到即可，若包含认证，由调用方在URL中加上认证信息，保证URL能成功访问。
	 d)人脸监控应用服务会根据图片存储位置配置，将图片上传到图片存储服务器中，返回的URL为图片存储服务器上的相对地址。
	 e)图片大小和格式均有要求，上传大小在10KB到200KB见的图片，上传JPG格式的图片。
	 f)若添加的人脸对应的人脸分组已经配置有识别计划，则新添加的人脸会被一并下发到设备上。
	 g)该接口依赖于图片存储位置已配置完，请确保平台已经配置有人脸图片存储位置，否则添加必定失败。
	 
	 @param model
	 @return 
	*/
	Task<FaceSingleAdditionResponse> FaceSingleAdditionAsync(FaceSingleAdditionRequest model);

	/** 
	 批量添加人脸
	 
	 
	 a)本接口只支持将安保基础数据中人员的人脸图片导入到人脸监控的人脸分组中。
	 b)一次性添加一批人脸，添加结果由接口同步返回成功还是失败。
	 c)一次最多导入1000个人脸。
	 d)若添加的人脸对应的人脸分组已经配置有识别计划，则新添加的人脸会被一并下发到设备上。
	 e)入参和单个添加人脸的接口不相同，批量接口只需要传入安保基础数据人员indexCode和要加入的人脸分组indexCode。
	 
	 @param model
	 @return 
	*/
	Task<FaceBatchAdditionResponse> FaceBatchAdditionAsync(FaceBatchAdditionRequest model);

	/** 
	 批量删除人脸
	 
	 
	 
	 a)根据人脸删除条件删除一批人脸，返回的data为布尔类型，true代表操作成功，false代表操作失败。
	 b)若删除的人脸对应的人脸分组已经配置有识别计划，则删除的人脸会被一并从设备上删除。
	 c)该接口是从指定分组内删除指定人脸。
	 d)人脸分组唯一标识和人脸的唯一标识集合均不能为空。
	 e)一次性最多从一个分组内删除1000个人脸。
	 
	 @param model
	 @return 
	*/
	Task<FaceBatchDeletionResponse> FaceBatchDeletionAsync(FaceBatchDeletionRequest model);

	/** 
	 单个修改人脸
	 
	 
	 
	 a)修改单张人脸信息,返回的data为布尔类型，true代表操作成功，false代表操作失败。
	 b)若修改的人脸对应的人脸分组已经配置有识别计划，则修改后的人脸会被重新下发到设备上。
	 c)修改后的字段信息以修改时传入的字段为准，若不传字段或传入null字段，则该字段会被置为null。
	 d)如果要修改人脸信息，则需要传递faceInfo对象。
	 e)如果要修改人脸图片，则需要传递facePic对象。
	 
	 @param model
	 @return 
	*/
	Task<FaceSingleUpdateResponse> FaceSingleUpdateAsync(FaceSingleUpdateRequest model);

	/** 
	 按条件批量查询人脸
	 
	 
	 
	 a)根据查询条件，批量查询人脸信息，一次性最多查询1000条人脸。
	 b)查询条件之间的关系为与，即所有条件同时生效。
	 c)可以通过传入faceGroupIndexCode，查询指定人脸分组下的人脸。
	 
	 @param model
	 @return 
	*/
	Task<FaceResponse> FaceAsync(FaceRequest model);

	/** 
	 批量拷贝人脸到人脸分组
	 
	 
	 a)批量将若干人脸拷贝到若干分组内。
	 b)这个接口可以实现将平台已经存在的人脸迁移到其它分组内。
	 c)无论如何调用该接口，同一个分组内不会出现两个indexCode相同的人脸。
	 d)若人脸已经在人脸分组内了，重复的迁移操作也会返回成功。
	 e)拷贝一次性最多拷贝1000张图片，最多同时拷贝到16个分组内。
	 
	 @param model
	 @return 
	*/
	Task<FaceBatchCopyResponse> FaceBatchCopyAsync(FaceBatchCopyRequest model);


	/** 
	 单个添加人脸分组
	 
	 
	 一次性添加一个人脸分组，返回结果为添加成功的人脸分组。
	 @param model
	 @return 
	*/
	Task<FaceGroupSingleAdditionResponse> FaceGroupSingleAdditionAsync(FaceGroupSingleAdditionRequest model);

	/** 
	 删除人脸分组
	 
	 
	 a)根据删除条件，删除一批人脸分组,最大1000个，返回的data为布尔类型，true代表操作成功，false代表操作失败。
	 b)已经配置有识别计划的人脸分组，不允许删除，由特定错误码标识。
	 c)根据唯一标识删除时，会校验唯一标识的有效性，若任意分组唯一标识无效，则返回错误。传入的唯一标识重复，做去重处理。
	 @param model
	 @return 
	*/
	Task<FaceGroupBatchDeletionResponse> FaceGroupBatchDeletionAsync(FaceGroupBatchDeletionRequest model);

	/** 
	 单个修改人脸分组
	 
	 
	 a)修改单个人脸分组，返回的data为布尔类型，true代表操作成功，false代表操作失败。
	 b)修改后的字段信息以修改时传入的字段为准，若不传字段或传入null字段，则该字段会被置为null。
	 c)若该人脸分组已经被配置到识别计划中，则修改人脸分组后，会将修改后的信息，一并下发到设备上。
	 @param model
	 @return 
	*/
	Task<FaceGroupSingleUpdateResponse> FaceGroupSingleUpdateAsync(FaceGroupSingleUpdateRequest model);

	/** 
	 按条件查询人脸分组
	
	 
	  a)根据查询条件，查询人脸分组集合。
	 @param model
	 @return 
	*/
	Task<FaceGroupResponse> FaceGroupAsync(FaceGroupRequest model);



	/** 
	 获取人脸及分组关联关系
	 
	 @param model
	 @return 
	 
	 a)已经配置了一条或多条识别计划。
	 b)调用方获取到人脸比对事件后，可通过调用该接口获取关联关系，将人脸比对事件报文中的人脸编号、分组编号和人脸监控应用服务中相对应。
	 c)调用方可在识别计划下发完成后调用该接口获取关联关系。
	 d)严禁在事件接收时调用此接口，避免造成接口性能不佳。
	 
	*/
	Task<GetFaceRelationResponse> GetFaceRelationAsync(GetFaceRelationRequest model);

	/** 
	 抓拍计划配置
	 
	 @param model
	 @return 
	 a)配置平台的抓拍计划，目前支持开启和关闭两种操作。
	 b)当抓拍计划关闭后，也就无法从消息队列中获取到人脸抓拍事件了。
	 c)关闭抓拍计划不会影响到识别计划，因此人脸比对报警、重点人员识别报警、陌生人识别报警，仍旧会上报。
	 d)关闭抓拍计划的接口，是为了在部分场景下，去除无用的抓拍事件。这样可以释放消息队列、事件服务和人脸监控的压力，将性能用在更需要的地方。
	 e)重复的开启或者关闭，接口会返回成功。
	 
	*/
	Task<GetFaceRelationResponse> CaptureConfigurationAsync(CaptureConfigurationRequest model);


	/** 
	 按条件查询识别资源
	 
	 
	 a)根据条件，查询识别资源。
	 b)该接口和识别计划配置有关，识别计划配置时需要选择识别资源，通过该接口查询。
	 c)查询接口之间的关系为与，若不传任何条件，为查询全部的识别资源。
	 @param model
	 @return 
	*/
	Task<RecognitionResponse> ResourceRecognitionAsync(RecognitionRequest model);







}