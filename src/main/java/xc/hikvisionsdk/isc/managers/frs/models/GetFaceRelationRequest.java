package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 获取人脸及分组关联关系
*/
public class GetFaceRelationRequest extends BaseRequest
{
	/** 
	 人脸唯一编号数组，，可从按条件批量查询人脸获取
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
	 获取人脸及分组关联关系
	 
	 @param indexCodes 人脸唯一编号数组
	*/
	public GetFaceRelationRequest(String... indexCodes)
	{
		setIndexCodes(indexCodes);
	}

	/** 
	 获取人脸及分组关联关系
	*/
	public GetFaceRelationRequest()
	{
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



	}
}