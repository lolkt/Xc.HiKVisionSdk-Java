package xc.hikvisionsdk.models.responses;

import xc.hikvisionsdk.*;

/** 
 基础返回值,仅包含code和msg
*/
public abstract class HiKVisionResponse implements IResponseModel
{
	private String msg;

	/** 
	 是否成功
	*/
	public final boolean isSuccess()
	{
		return getCode().equals("0");
	}
	/** 
	 状态码
	*/
	private String Code;
	public final String getCode()
	{
		return Code;
	}
	public final void setCode(String value)
	{
		Code = value;
	}
	/** 
	 消息
	*/
	public final String getMsg()
	{
		return msg;
	}
	public final void setMsg(String value)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(value))
		{
			return;
		}
		msg = value;
	}

	/** 
	 异常时间戳
	*/
	private long Timestamp;
	public final long getTimestamp()
	{
		return Timestamp;
	}
	public final void setTimestamp(long value)
	{
		Timestamp = value;
	}
	/** 
	 异常状态
	*/
	private int Status;
	public final int getStatus()
	{
		return Status;
	}
	public final void setStatus(int value)
	{
		Status = value;
	}
	/** 
	 异常错误
	*/
	private String Error;
	public final String getError()
	{
		return Error;
	}
	public final void setError(String value)
	{
		Error = value;
	}
	/** 
	 异常消息
	*/
	public final String getMessage()
	{
		return msg;
	}
	public final void setMessage(String value)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(value))
		{
			return;
		}
		msg = value;
	}
	/** 
	 异常请求路径
	*/
	private String Path;
	public final String getPath()
	{
		return Path;
	}
	public final void setPath(String value)
	{
		Path = value;
	}
}