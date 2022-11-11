package xc.hikvisionsdk.models.responses;

import xc.hikvisionsdk.*;

/** 
 泛型data返回值
 T Data
 
 <typeparam name="T"></typeparam>
*/
public class HiKVisionDataResponse<T> extends HiKVisionResponse
{
	/** 
	 结果
	*/
	private T Data;
	public final T getData()
	{
		return Data;
	}
	public final void setData(T value)
	{
		Data = value;
	}
}