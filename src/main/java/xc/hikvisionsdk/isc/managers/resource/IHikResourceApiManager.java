package xc.hikvisionsdk.isc.managers.resource;

import xc.hikvisionsdk.isc.managers.resource.models.acs.*;
import xc.hikvisionsdk.isc.managers.video.models.cameras.*;
import xc.hikvisionsdk.isc.managers.resource.models.camera.*;
import xc.hikvisionsdk.isc.managers.resource.models.card.*;
import xc.hikvisionsdk.isc.managers.resource.models.org.*;
import xc.hikvisionsdk.isc.managers.resource.models.person.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;

/** 
 资源api
*/
 组织api
public interface IHikResourceApiManager
{

	/** 
	 查询门禁点列表
	 
	 @param model
	 @return 
	 查询门禁点列表接口可以根据门禁点唯一标识集、门禁点名称、门禁设备唯一标识、所属区域唯一标识这些查询条件来进行高级查询；若不指定查询条件，即全量获取所有的门禁点信息。返回结果分页展示。
	 注：若指定多个查询条件，表示将这些查询条件进行"与”的组合后进行精确查询。
	 根据"门禁点名称doorName”查询为模糊查询。</remarks>
	*/
	Task<AcsDoorAdvanceAcsDoorListResponse> AcsDoorAdvanceAcsDoorListAsync(AcsDoorAdvanceAcsDoorListRequest model);




	/** 
	 查询监控点列表
	 
	 @param model
	 @return 
	 查询监控点列表接口可以根据监控点唯一标识集、监控点名称、编码设备唯一标识、区域唯一标识、是否级联这些查询条件来进行高级查询；若不指定查询条件，即全量获取所有的监控点信息。返回结果分页展示。
	 注：若指定多个查询条件，表示将这些查询条件进行"与”的组合后进行精确查询。
	 根据"监控点名称cameraName”查询为模糊查询。</remarks>
	*/
	Task<AdvanceCameraListResponse> AdvanceCameraListAsync(AdvanceCameraListRequest model);

	/** 
	 查询监控点列表v2
	 
	 @param model
	 @return 
	 根据条件查询目录下有权限的监控点列表。        当返回字段对应的值为空时，该字段不返回。
	*/
	Task<CameraSearchV2Response> CamerSearchV2Async(CameraSearchV2Request model);


	/** 
	 分页获取监控点资源
	 
	 @param model
	 @return 
	 获取监控点列表接口可用来全量同步监控点信息，返回结果分页展示。
	*/
	Task<CamerasResponse> CamerasAsync(CamerasRequest model);

	/** 
	 根据编号获取监控点详细信息
	 
	 @param model
	 @return 
	 获取单个监控点信息是指根据监控点唯一标识来获取指定的监控点信息。
	*/
	Task<CamerasIndexCodeResponse> CamerasIndexCodeAsync(CamerasIndexCodeRequest model);

	/** 
	 根据区域编号获取下级监控点列表
	 
	 @param model
	 @return 
	 根据指定的区域编号获取该区域下的监控点列表信息，返回结果分页展示。        注：返回的监控点不包括下级区域的。
	*/
	Task<RegionIndexCodeCamerasResponse> RegionIndexCodeCamerasAsync(RegionIndexCodeCamerasRequest model);

	///// <summary>
	///// 增量获取监控点数据
	///// </summary>
	///// <param name="request">请求</param>
	///// <returns></returns>
	///// <remarks>根据资源类型、时间段增量获取资源，包含已删除数据。其中开始日期与结束日期的时间差必须在1-48小时内。        当返回字段对应的值为空时，该字段不返回。</remarks>
	//Task<CameraTimeRangeResponse> CameraTimeRangeAsync(CameraTimeRangeRequest request);


	/** 
	 获取卡片列表
	 
	 @param request
	 @return 
	 获取卡片列表接口可用来全量同步卡片信息，返回结果分页展示，不作权限过滤。
	*/
	Task<CardListResponse> CardListAsync(CardListRequest request);

	/** 
	 增量获取卡片数据
	 
	 @param request
	 @return 
	 
	 根据查询条件查询卡片列表信息，主要根据时间段分页获取卡片信息，包含已删除数据。其中开始日期与结束日期的时间差必须在48小时内。
	 
	*/
	Task<CardTimeRangeResponse> CardTimeRangeAsync(CardTimeRangeRequest request);







	/** 
	 获取组织列表
	 
	 
	 根据该接口全量同步组织信息,不作权限过滤，返回结果分页展示。
	 
	 @param model
	 @return 
	*/
	Task<OrgListResponse> OrgListAsync(OrgListRequest model);

	/** 
	 获取根组织
	 
	 @param model
	 @return 
	 获取根组织接口用来获取组织的根节点
	*/
	Task<RootOrgResponse> RootOrgAsync(RootOrgRequest model);



	/** 
	 修改组织
	 
	 @param request
	 @return 
	 根据组织编号修改组织信息。其它扩展属性按照定义以 key：value 上传即可，根据获取资源属性接口查询平台已配置的资源属性
	*/
	Task<OrgSingleUpdateResponse> OrgSingleUpdateAsync(OrgSingleUpdateRequest request);


	/** 
	 批量删除组织
	 
	 @param request
	 @return 
	 仅支持删除无子结点且组织下不存在人员的组织。
	*/
	Task<OrgBatchDeleteResponse> OrgBatchDeleteAsync(OrgBatchDeleteRequest request);

	/** 
	 批量添加组织
	 
	 @param request
	 @return 
	 支持三方指定组织唯一标识， 也支持ISC独立生成组织唯一标识。        其它扩展属性按照定义以 key：value 上传即可，根据获取资源属性接口查询平台已配置的资源属性
	*/
	Task<OrgBatchAddResponse> OrgBatchAddAsync(OrgBatchAddRequest request);

	/** 
	 查询组织列表v2
	 
	 @param model
	 @return 
	 根据不同的组织属性分页查询组织信息。        
	 查询组织列表接口可以根据组织唯一标识集、组织名称、组织状态等查询条件来进行高级查询。
	*/
	Task<AdvanceOrgListV2Response> AdvanceOrgListV2Async(AdvanceOrgListV2Request model);


	/** 
	 查询组织列表
	 
	 @param model
	 @return 
	 
	 根据不同的组织属性分页查询组织信息。
	 查询组织列表接口可以根据组织唯一标识集、组织名称、组织状态这些查询条件来进行高级查询；若不指定查询条件，即全量获取所有的组织信息。返回结果分页展示。
	 注：若指定多个查询条件，表示将这些查询条件进行"与”的组合后进行精确查询。
	 根据"组织名称orgName”查询为模糊查询。
	 
	*/
	Task<AdvanceOrgListResponse> AdvanceOrgListAsync(AdvanceOrgListRequest model);

	/** 
	 根据父组织编号获取下级组织列表
	 
	 @param model
	 @return 
	 根据父组织编号获取下级组织列表，主要用于逐层获取父组织的下级组织信息，返回结果分页展示
	*/
	Task<SubOrgListResponse> SubOrgListAsync(SubOrgListRequest model);

	/** 
	 增量获取组织数据
	 
	 @param model
	 @return 
	 根据查询条件查询组织列表信息，主要根据时间段分页获取组织数据，包含已删除数据。其中开始日期与结束日期的时间差必须在1-48小时内。
	*/
	Task<OrgTimeRangeResponse> OrgTimeRangeAsync(OrgTimeRangeRequest model);

	/** 
	 根据组织编号获取组织详细信息
	 
	 @param model
	 @return 
	 根据组织编号orgIndexCode列表获取指定的组织信息，如存在多组织则返回总条数及多组织信息
	*/
	Task<OrgInfoResponse> OrgInfoAsync(OrgInfoRequest model);



	/** 
	 获取组织下人员列表v2
	 
	 @param model
	 @return 
	 根据组织编号获取组织下的人员信息列表，返回结果分页展示。
	 本接口支持自定义属性的返回， 通过获取资源属性接口获取平台已支持人员属性的说明。
	*/
	Task<OrgIndexCodePersonListV2Response> OrgIndexCodePersonListV2Async(OrgIndexCodePersonListV2Request model);

	/** 
	 根据手机号码获取单个人员信息
	 
	 @param model
	 @return 
	 根据手机号码获取指定人员的信息。此接口不支持自定义属性
	*/
	Task<PhoneNoPersonInfoResponse> PhoneNoPersonInfoAsync(PhoneNoPersonInfoRequest model);

	/** 
	 根据证件号码获取单个人员信息
	 
	 @param model
	 @return 
	 根据证件类型、证件号码获取指定人员的信息。此接口不支持自定义属性
	*/
	Task<CertificateNoPersonInfoResponse> CertificateNoPersonInfoAsync(CertificateNoPersonInfoRequest model);

	/** 
	 根据人员编号获取单个人员信息
	 
	 @param model
	 @return 
	 根据人员ID获取指定人员的信息。此接口不支持自定义属性
	*/
	Task<PersonIdPersonInfoResponse> PersonIdPersonInfoAsync(PersonIdPersonInfoRequest model);

	/** 
	 获取人员列表v2
	 
	 获取人员列表接口可用来全量同步人员信息，返回结果分页展示。
	 本接口支持自定义属性的返回， 通过获取资源属性接口获取平台已支持人员属性的说明。
	 @param model
	 @return 
	*/
	Task<PersonListV2Response> PersonListV2Async(PersonListV2Request model);

	/** 
	 查询人员列表v2
	 
	 @param model
	 @return 
	 查询人员列表接口可以根据人员ID集、人员姓名、人员性别、所属组织、证件类型、证件号码、人员状态这些查询条件来进行高级查询；若不指定查询条件，即全量获取所有的人员信息。返回结果分页展示。
	 注：若指定多个查询条件，表示将这些查询条件进行"与”的组合后进行精确查询。
	 根据"人员名称personName”查询为模糊查询。
	 本接口支持自定义属性的返回，及自定义属性进行查找， 通过获取资源属性接口获取平台已支持人员属性的说明。
	*/
	Task<AdvancePersonListV2Response> AdvancePersonListV2Async(AdvancePersonListV2Request model);

	/** 
	 添加人员
	 
	 添加人员信息接口，注意，在安保基础数据配置的必选字段必须都包括在入参中。
	 人员添加的时候，可以指定人员personId，不允许与其他人员personId重复，包括已删除的人员。
	 本接口支持人员信息的扩展字段，按照属性定义key:value上传即可， 可通过获取资源属性接口，获取平台已启用的人员属性信息。
	 @param model
	 @return 
	*/
	Task<PersonSingleAddResponse> PersonSingleAddAsync(PersonSingleAddRequest model);

	/** 
	 批量添加人员
	 
	 
	 添加人员信息接口，注意，在安保基础数据配置的必选字段必须都包括在入参中。
	 批量添加仅支持人员基础属性。
	 人员批量添加的时候，可以指定人员personId，不允许与其他人员personId重复，包括已删除的人员。
	 如果用户不想指定personId，那么需要指定clientId，请求内的每一条数据的clientid必须唯一， 返回值会将平台生成的personid与clientid做绑定。
	 若personId和clientId都不指定，则无法准确判断哪部分人员添加成功。
	 本接口支持人员信息的扩展字段，按照属性定义key:value上传即可， 可通过获取资源属性接口，获取平台已启用的人员属性信息。
	 
	 @param model
	 @return 
	*/
	Task<PersonBatchAddResponse> PersonBatchAddAsync(PersonBatchAddRequest model);
	/** 
	 修改人员
	 
	 根据人员编号修改人员信息。
	 本接口支持人员信息的扩展字段，按照属性定义key:value上传即可， 可通过获取资源属性接口，获取平台已启用的人员属性信息。
	 @param model
	 @return 
	*/
	Task<PersonSingleUpdateResponse> PersonSingleUpdateAsync(PersonSingleUpdateRequest model);
	/** 
	 批量删除人员
	 
	 根据编号删除人员，人员删除是软删除，可以在安保基础数据查询已删除人员。支持批量删除人员。删除人员将会同时删除人员关联的指纹和人脸信息。
	 @param model
	 @return 
	*/
	Task<PersonBatchDeleteResponse> PersonBatchDeleteAsync(PersonBatchDeleteRequest model);



}