package xc.hikvisionsdk.models.request;

import xc.hikvisionsdk.*;

/** 
 基础抽象类
*/
public abstract class BaseRequest implements IBaseRequest
{
	/** 
	 验证必选项是否为空
	 
	 @exception NotImplementedException
	*/
	public void CheckParams()
	{
		//throw new NotImplementedException("CheckParams");
	}

	@Override
	public String toString()
	{
		return JsonExtensions.SerializeByCamelCase(this);
	}



}