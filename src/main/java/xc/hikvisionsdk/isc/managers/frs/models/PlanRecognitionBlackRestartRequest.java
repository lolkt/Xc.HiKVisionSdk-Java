package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 重新下发重点人员识别计划请求
*/
public class PlanRecognitionBlackRestartRequest extends BaseRequest
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
	 重新下发重点人员识别计划请求
	 
	 @param indexCode 识别计划的唯一标识
	*/
	public PlanRecognitionBlackRestartRequest(String indexCode)
	{
		setIndexCode(indexCode);
	}

}