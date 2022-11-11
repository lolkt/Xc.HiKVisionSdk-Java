package xc.hikvisionsdk.models.responses;

import xc.hikvisionsdk.*;

/** 
 泛型data数组返回值
 T[] Data
 
 <typeparam name="T"></typeparam>
*/
public class HiKVisionDataArrayResponse<T> extends HiKVisionResponse
{
	/** 
	 结果
	*/
	private T[] Data;
	public final T[] getData()
	{
		return Data;
	}
	public final void setData(T[] value)
	{
		Data = value;
	}
}