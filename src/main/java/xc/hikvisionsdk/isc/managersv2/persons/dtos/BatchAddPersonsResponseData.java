package xc.hikvisionsdk.isc.managersv2.persons.dtos;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.persons.*;

/** 
 批量添加人员结果数据
*/
public class BatchAddPersonsResponseData
{
	/** 
	 批量添加成功的记录
	*/
	private BatchAddPersonsResponseSuccess[] Successes;
	public final BatchAddPersonsResponseSuccess[] getSuccesses()
	{
		return Successes;
	}
	public final void setSuccesses(BatchAddPersonsResponseSuccess[] value)
	{
		Successes = value;
	}
	/** 
	 批量添加失败的记录
	*/
	private BatchAddPersonsResponseFailures[] Failures;
	public final BatchAddPersonsResponseFailures[] getFailures()
	{
		return Failures;
	}
	public final void setFailures(BatchAddPersonsResponseFailures[] value)
	{
		Failures = value;
	}
}