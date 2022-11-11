package xc.hikvisionsdk.isc.managersv2.orgs.dtos;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.orgs.*;

/** 
 批量新增组织结果数据
*/
public class BatchAddOrgsResponseData
{
	/** 
	 批量添加成功的记录
	*/
	private BatchAddOrgsResponseSuccess[] Successes;
	public final BatchAddOrgsResponseSuccess[] getSuccesses()
	{
		return Successes;
	}
	public final void setSuccesses(BatchAddOrgsResponseSuccess[] value)
	{
		Successes = value;
	}
	/** 
	 批量添加失败的记录
	*/
	private BatchAddOrgsResponseFailures[] Failures;
	public final BatchAddOrgsResponseFailures[] getFailures()
	{
		return Failures;
	}
	public final void setFailures(BatchAddOrgsResponseFailures[] value)
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