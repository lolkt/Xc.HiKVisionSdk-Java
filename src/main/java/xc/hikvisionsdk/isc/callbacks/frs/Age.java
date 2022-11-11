package xc.hikvisionsdk.isc.callbacks.frs;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 年龄段
*/
public class Age
{
	/** 
	  	年龄段，见附录附录A.34 设备年龄段类型
	*/
	private String AgeGroup;
	public final String getAgeGroup()
	{
		return AgeGroup;
	}
	public final void setAgeGroup(String value)
	{
		AgeGroup = value;
	}
}