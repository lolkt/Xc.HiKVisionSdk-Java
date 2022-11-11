package xc.hikvisionsdk.isc.managers.resource.models.person;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 批量添加人员结果数据
*/
public class PersonBatchAddResponseData
{
	/** 
	 批量添加成功的记录
	*/
	private PersonBatchAddResponseSuccess[] Successes;
	public final PersonBatchAddResponseSuccess[] getSuccesses()
	{
		return Successes;
	}
	public final void setSuccesses(PersonBatchAddResponseSuccess[] value)
	{
		Successes = value;
	}
	/** 
	 批量添加失败的记录
	*/
	private PersonBatchAddResponseFailures[] Failures;
	public final PersonBatchAddResponseFailures[] getFailures()
	{
		return Failures;
	}
	public final void setFailures(PersonBatchAddResponseFailures[] value)
	{
		Failures = value;
	}
}