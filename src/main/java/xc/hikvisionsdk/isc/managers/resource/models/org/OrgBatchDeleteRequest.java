package xc.hikvisionsdk.isc.managers.resource.models.org;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 批量删除组织
*/
public class OrgBatchDeleteRequest extends BaseRequest
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
	public final void setIndexCodes(String[] value)
	{
		IndexCodes = value;
	}

	/** 
	 批量删除组织
	 
	 @param indexCodes 待删除的组织indexCode列表
	*/
	public OrgBatchDeleteRequest(String... indexCodes)
	{

		setIndexCodes(indexCodes);
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	 @exception ArgumentOutOfRangeException
	*/
	@Override
	public void CheckParams()
	{
		if (getIndexCodes() == null || getIndexCodes().length == 0)
		{
			throw new NullPointerException("IndexCodes");
		}
		if (getIndexCodes().length > 1000)
		{
			throw new IndexOutOfBoundsException("IndexCodes", getIndexCodes().length, "最大1000个");

		}
	}

}