package xc.hikvisionsdk.isc.managersv2.faces;

import xc.hikvisionsdk.isc.managersv2.faces.dtos.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 人脸管理
 <list type="bullet">
 <item>
 <term>AddAsync</term>
 <description>添加人脸</description>
 </item>
 <item>
 <term>UpdateAsync</term>
 <description>修改人脸</description>
 </item>
 <item>
 <term>DeleteAsync</term>
 <description>删除人脸</description>
 </item>
 </list>
*/
public interface IHikFaceManager
{
	/** 
	 添加人脸
	 
	 @param request 请求
	 @return 
	 添加人脸信息。
	*/
	Task<AddFaceResponse> AddAsync(AddFaceRequest request);

	/** 
	 修改人脸
	 
	 @param request 请求
	 @return 
	 根据人脸Id修改人脸。
	*/
	Task<UpdateFaceResponse> UpdateAsync(UpdateFaceRequest request);

	/** 
	 删除人脸
	 
	 @param request 请求
	 @return 
	 根据人脸Id删除人脸。
	*/
	Task<DeleteFaceResponse> DeleteAsync(DeleteFaceRequest request);
}