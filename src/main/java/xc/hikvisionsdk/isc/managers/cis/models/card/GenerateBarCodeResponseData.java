package xc.hikvisionsdk.isc.managers.cis.models.card;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;

/** 
 生成卡片二维码结果数据
*/
public class GenerateBarCodeResponseData
{
	/** 
	 二维码，将访客二维码内容转成二维码图片即可使用。二维码图片的生成采用QRCode编码、纠错等级为L，版本大于等于5
	*/
	private String BarCode;
	public final String getBarCode()
	{
		return BarCode;
	}
	public final void setBarCode(String value)
	{
		BarCode = value;
	}

	/** 
	 卡号
	*/
	private String CardNo;
	public final String getCardNo()
	{
		return CardNo;
	}
	public final void setCardNo(String value)
	{
		CardNo = value;
	}
}