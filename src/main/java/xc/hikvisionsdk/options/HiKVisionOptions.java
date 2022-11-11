package xc.hikvisionsdk.options;

import xc.hikvisionsdk.*;
import java.math.*;

/** 
 
*/
public class HiKVisionOptions
{
	/** 
	 ak
	*/
	private String Ak;
	public final String getAk()
	{
		return Ak;
	}
	public final void setAk(String value)
	{
		Ak = value;
	}
	/** 
	 sk
	*/
	private String Sk;
	public final String getSk()
	{
		return Sk;
	}
	public final void setSk(String value)
	{
		Sk = value;
	}
	/** 
	 海康平台地址
	*/
	private String BaseUrl;
	public final String getBaseUrl()
	{
		return BaseUrl;
	}
	public final void setBaseUrl(String value)
	{
		BaseUrl = value;
	}
	/** 
	 平台版本号
	*/
	private BigDecimal Ver = 999.9;
	public final BigDecimal getVer()
	{
		return Ver;
	}
	public final void setVer(BigDecimal value)
	{
		Ver = value;
	}



}