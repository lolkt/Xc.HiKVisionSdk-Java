package xc.hikvisionsdk.isc.callbacks.frs.facerecognition.highfrequency;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;
import xc.hikvisionsdk.isc.callbacks.frs.*;
import xc.hikvisionsdk.isc.callbacks.frs.facerecognition.*;

/** 
 是否带口罩
*/
public class Mask
{
	/** 
	 是否带口罩
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