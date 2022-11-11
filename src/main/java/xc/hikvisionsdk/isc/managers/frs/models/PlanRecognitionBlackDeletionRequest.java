package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 删除重点人员识别计划请求
*/
public class PlanRecognitionBlackDeletionRequest extends BaseRequest
{
	/** 
	 操作的计划的唯一标识集合，操作可能是删除等，可从查询重点人员识别计划获取
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
	 删除重点人员识别计划请求
	 
	 @param indexCodes 操作的计划的唯一标识集合
	*/
	public PlanRecognitionBlackDeletionRequest(String... indexCodes)
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
		if (getIndexCodes() == null)
		{
			throw new NullPointerException("IndexCodes");
		}
		if (getIndexCodes().length == 0)
		{
			throw new IndexOutOfBoundsException("IndexCodes", "最少一个计划");
		}
	}
}