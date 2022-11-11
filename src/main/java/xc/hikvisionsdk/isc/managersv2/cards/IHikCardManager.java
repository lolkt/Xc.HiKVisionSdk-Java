package xc.hikvisionsdk.isc.managersv2.cards;

import xc.hikvisionsdk.isc.managersv2.cards.dtos.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 人员卡片接口
 <list type="bullet">
 <item>
 <term>GetListAsync</term>
 <description>获取卡片列表</description>
 </item>
 <item>
 <term>GetListByTimeRangeAsync</term>
 <description>增量获取卡片数据</description>
 </item>
 <item>
 <term>GetInfoAsync</term>
 <description>获取单个卡片信息</description>
 </item>
 <item>
 <term>GetListByParametersAsync</term>
 <description>查询卡片列表</description>
 </item>
 <item>
 <term>GenerateBarCodeAsync</term>
 <description>生成卡片二维码</description>
 </item>
 <item>
 <term>BindingAsync</term>
 <description>批量开卡</description>
 </item>
 <item>
 <term>DeletionAsync</term>
 <description>卡片退卡</description>
 </item>
 <item>
 <term>AddLossAsync</term>
 <description>批量挂失</description>
 </item>
 <item>
 <term>DeleteLossAsync</term>
 <description>批量解挂</description>
 </item>
 </list>
*/
public interface IHikCardManager
{


	/** 
	 获取卡片列表
	 
	 @param request 请求
	 @return 
	 获取卡片列表接口可用来全量同步卡片信息，返回结果分页展示，不作权限过滤。
	*/
	Task<GetCardListResponse> GetListAsync(GetCardListRequest request);


	/** 
	 增量获取卡片数据
	 
	 @param request 请求
	 @return 
	 
	 根据查询条件查询卡片列表信息，主要根据时间段分页获取卡片信息，包含已删除数据。其中开始日期与结束日期的时间差必须在48小时内。
	 
	*/
	Task<GetCardListByTimeRangeResponse> GetListByTimeRangeAsync(GetCardListByTimeRangeRequest request);

	/** 
	 获取单个卡片信息
	 
	 @param request 请求
	 @return 
	 获取卡片列表接口可用来全量同步卡片信息，返回结果分页展示，不作权限过滤。
	 注：卡号为精确查找
	*/
	Task<GetCardResponse> GetInfoAsync(GetCardRequest request);

	/** 
	 查询卡片列表
	 
	 @param request 请求
	 @return 
	 
	 查询卡片列表接口可以根据卡片号码、人员姓名、卡片状态、人员ID集合等查询条件来进行高级查询；若不指定查询条件，即全量获取所有的卡片信息。返回结果分页展示。
	 注：若指定多个查询条件，表示将这些查询条件进行"与”的组合后进行查询。
	 "人员名称personName”条件查询为模糊查询。
	 "卡片号码cardNo”条件查询为模糊查询。
	 
	*/
	Task<GetCardListByParametersResponse> GetListByParametersAsync(GetCardListByParametersRequest request);

	/** 
	 生成卡片二维码
	 
	 @param request 请求
	 @return 
	 用于生产卡片二维码，二维码默认有效期为24*60分钟，默认最大开锁次数4次.
	*/
	Task<GenerateBarCodeResponse> GenerateBarCodeAsync(GenerateBarCodeRequest request);

	/** 
	 批量开卡
	 
	 @param request 请求
	 @return 
	 该接口主要是应用于对多个人同时开卡的场景，输入卡片开始有效日期、卡片截止有效日期以及对应的人员、卡片关联列表，实现对多个人员同时开卡的功能，开卡成功后，可以到相应子系统开启卡片的权限，例如到门禁子系统开启人员门禁权限。
	*/
	Task<BindingCardsResponse> BindingAsync(BindingCardsRequest request);

	/** 
	 卡片退卡
	 
	 @param request 请求
	 @return 
	 该接口主要是应用于对人员下卡片进行退卡，输入卡号以及所属人员id，实现卡片退卡的功能。退卡成功后，相应子系统的卡片权限清除，例如所属卡片在门禁子系统的门禁权限全部清除。
	*/
	Task<DeletionCardResponse> DeletionAsync(DeletionCardRequest request);

	/** 
	 批量挂失
	 
	 @param request 请求
	 @return 
	 用于卡片批量挂失，批量挂失数量不能超过200个。
	*/
	Task<AddCardsLossResponse> AddLossAsync(AddCardsLossRequest request);

	/** 
	 批量解挂
	 
	 @param request 请求
	 @return 
	 用于卡片批量解挂，批量解挂数量不能超过200个
	*/
	Task<DeleteCardsLossResponse> DeleteLossAsync(DeleteCardsLossRequest request);

}