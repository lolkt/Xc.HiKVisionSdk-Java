package xc.hikvisionsdk.isc.managers.pms.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.pms.*;

/** 
 取消车辆布控
*/
public class AlarmCarDeletionRequest extends BaseRequest
{
	/** 
	 布控车辆唯一标识集合(编号间用','分隔)
	*/
	private String AlarmSyscodes;
	public final String getAlarmSyscodes()
	{
		return AlarmSyscodes;
	}
	public final void setAlarmSyscodes(String value)
	{
		AlarmSyscodes = value;
	}

	/** 
	 取消车辆布控
	*/
	public AlarmCarDeletionRequest()
	{
	}

	/** 
	 取消车辆布控
	 
	 @param codes 布控车辆唯一标识集合
	*/
	public AlarmCarDeletionRequest(String... codes)
	{
		setAlarmSyscodes(tangible.StringHelper.join(",", codes));
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	*/
	@Override
	public void CheckParams()
	{
		if (tangible.StringHelper.isNullOrEmpty(getAlarmSyscodes()))
		{
			throw new NullPointerException("AlarmSyscodes");
		}
	}
}