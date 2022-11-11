package company.wpfapplication1;

import xc.hikvisionsdk.ia.models.*;
import xc.hikvisionsdk.isc.models.*;
import java.math.*;

public class IaOption implements IOptions<IaSdkOption>
{

	public final IaSdkOption getValue()
	{
		IaSdkOption tempVar = new IaSdkOption();
		tempVar.setAk(this.getAk());
		tempVar.setBaseUrl(this.getBaseUrl());
		tempVar.setDownloadImg(this.getDownloadImg());
		tempVar.setSk(this.getSk());
		tempVar.setVer(this.getVer());
		return tempVar;
	}

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
	private BigDecimal Ver = 1;
	public final BigDecimal getVer()
	{
		return Ver;
	}
	public final void setVer(BigDecimal value)
	{
		Ver = value;
	}
	/** 
	 
	*/
	private boolean DownloadImg;
	public final boolean getDownloadImg()
	{
		return DownloadImg;
	}
	public final void setDownloadImg(boolean value)
	{
		DownloadImg = value;
	}
}