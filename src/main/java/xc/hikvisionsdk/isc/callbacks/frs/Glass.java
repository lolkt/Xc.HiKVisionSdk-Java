package xc.hikvisionsdk.isc.callbacks.frs;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 是否戴眼镜，见数据字典设备戴眼镜类别
*/
public class Glass
{
	/** 
	 是否戴眼镜，见数据字典设备戴眼镜类别
	*/
	private String Value;
	public final String getValue()
	{
		return Value;
	}
	public final void setValue(String value)
	{
		Value = value;
	}
}