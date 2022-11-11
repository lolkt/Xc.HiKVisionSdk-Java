package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 时间计划模板，不填默认全天候
*/
public class TimeBlock
{
	/** 
	 星期几，1-7分别表示周一至周七
	*/
	private String DayOfWeek;
	public final String getDayOfWeek()
	{
		return DayOfWeek;
	}
	public final void setDayOfWeek(String value)
	{
		DayOfWeek = value;
	}

	/** 
	 时间段数组，一天可以有多个时间段
	*/
	private TimeRange[] TimeRange;
	public final TimeRange[] getTimeRange()
	{
		return TimeRange;
	}
	public final void setTimeRange(TimeRange[] value)
	{
		TimeRange = value;
	}
}