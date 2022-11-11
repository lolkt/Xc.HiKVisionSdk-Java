package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 单个查询重点人员识别计划详情请求
*/
public class PlanRecognitionBlackDetailRequest extends PagedRequest
{
	/** 
	 识别计划的唯一标识，可从查询重点人员识别计划获取
	*/
	private String IndexCode;
	public final String getIndexCode()
	{
		return IndexCode;
	}
	public final void setIndexCode(String value)
	{
		IndexCode = value;
	}

	/** 
	 单个查询重点人员识别计划详情请求
	 
	 @param pageNo
	 @param pageSize
	 @param indexCode
	*/
	public PlanRecognitionBlackDetailRequest(int pageNo, int pageSize, String indexCode)
	{
		super(pageNo, pageSize);
		setIndexCode(indexCode);
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	*/
	@Override
	public void CheckParams()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getIndexCode()))
		{
			throw new NullPointerException("IndexCode");
		}

		super.CheckParams();
	}

}