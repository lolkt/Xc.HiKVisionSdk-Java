package xc.hikvisionsdk.isc.managers.resource.models.org;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 批量新增组织结果数据
*/
public class OrgBatchAddResponseData
{
	/** 
	 批量添加成功的记录
	*/
	private OrgBatchAddResponseSuccess[] Successes;
	public final OrgBatchAddResponseSuccess[] getSuccesses()
	{
		return Successes;
	}
	public final void setSuccesses(OrgBatchAddResponseSuccess[] value)
	{
		Successes = value;
	}
	/** 
	 批量添加失败的记录
	*/
	private OrgBatchAddResponseFailures[] Failures;
	public final OrgBatchAddResponseFailures[] getFailures()
	{
		return Failures;
	}
	public final void setFailures(OrgBatchAddResponseFailures[] value)
	{
		Failures = value;
	}

	/** 
	 有失败记录
	*/
	public final boolean getHasFailed()
	{
		return getFailures() != null && getFailures().length > 0;
	}
}