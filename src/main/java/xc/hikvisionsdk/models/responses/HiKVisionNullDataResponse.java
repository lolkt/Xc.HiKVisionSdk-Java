package xc.hikvisionsdk.models.responses;

import xc.hikvisionsdk.*;

/** 
 空data返回值
*/
public class HiKVisionNullDataResponse extends HiKVisionResponse
{
	/** 
	 结果
	*/
	private String Data;
	public final String getData()
	{
		return Data;
	}
	public final void setData(String value)
	{
		Data = value;
	}
}