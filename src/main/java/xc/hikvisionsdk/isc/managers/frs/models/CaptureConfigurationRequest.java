package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 抓拍计划配置
*/
public class CaptureConfigurationRequest extends BaseRequest
{
	/** 
	 开启或者关闭平台的抓拍计划:
	 true:开启,
	 false:关闭
	*/
	private boolean EventSwitch;
	public final boolean getEventSwitch()
	{
		return EventSwitch;
	}
	public final void setEventSwitch(boolean value)
	{
		EventSwitch = value;
	}

	/** 
	 抓拍计划配置
	 
	 @param eventSwitch 开启或者关闭平台的抓拍计划
	 true:开启,
	 false:关闭
	*/

	public CaptureConfigurationRequest()
	{
		this(true);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public CaptureConfigurationRequest(bool eventSwitch = true)
	public CaptureConfigurationRequest(boolean eventSwitch)
	{
		setEventSwitch(eventSwitch);
	}

	/** 
	 
	*/
	@Override
	public void CheckParams()
	{
	}
}