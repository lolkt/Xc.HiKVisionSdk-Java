package xc.hikvisionsdk.models.responses;

import xc.hikvisionsdk.*;

/** 
 包含分页的泛型返回值
 HiKVisionPagedDataResponseData Data
 
 <typeparam name="T"></typeparam>
*/
public class HiKVisionPagedDataResponse<T> extends HiKVisionResponse
{
	/** 
	 分页结果
	*/
	private HiKVisionPagedDataResponseData<T> Data;
	public final HiKVisionPagedDataResponseData<T> getData()
	{
		return Data;
	}
	public final void setData(HiKVisionPagedDataResponseData<T> value)
	{
		Data = value;
	}
}