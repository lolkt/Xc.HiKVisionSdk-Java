package xc.hikvisionsdk.isc.managersv2.orgs.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.orgs.*;

/** 
 批量删除组织请求
*/
public class BatchDeleteOrgsRequest extends BaseRequest
{
	/** 
	 待删除的组织indexCode列表，单次提交上限为1000条        
	 从获取组织列表 接口获取返回参数orgIndexCode
	*/
	private String[] IndexCodes;
	public final String[] getIndexCodes()
	{
		return IndexCodes;
	}

	/** 
	 批量删除组织
	 
	 @param indexCodes 待删除的组织indexCode列表
	*/
	public BatchDeleteOrgsRequest(String... indexCodes)
	{
		if (indexCodes == null || indexCodes.length == 0)
		{
			throw new NullPointerException("indexCodes");
		}
		if (indexCodes.length > 1000)
		{
			throw new IndexOutOfBoundsException("indexCodes", "最大1000个");

		}
		IndexCodes = indexCodes;
	}



}