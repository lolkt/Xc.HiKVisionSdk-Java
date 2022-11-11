package xc.hikvisionsdk.commons.managers;

import xc.hikvisionsdk.consts.*;
import xc.hikvisionsdk.*;
import java.util.*;

/** 
 请求建造者
*/
public class HttpRequestBuilder
{
	private final String _address;
	private int _timeout = 3000;
	private HashMap<String, String> _header;
	private String _method = SignConsts.Get;
	private boolean _keepAlive = false;

	/** 
	 
	 
	 @param address
	*/
	public HttpRequestBuilder(String address)
	{
		_address = address;
	}

	/** 
	 超时
	 
	 @param timeout
	 @return 
	*/
	public final HttpRequestBuilder WithTimeOut(int timeout)
	{
		_timeout = timeout;
		return this;
	}

	/** 
	 头
	 
	 @param header
	 @return 
	*/
	public final HttpRequestBuilder WithHeader(HashMap<String, String> header)
	{
		_header = header;
		return this;
	}

	/** 
	 是post
	 
	 @return 
	*/
	public final HttpRequestBuilder IsPost()
	{
		_method = SignConsts.Post;
		return this;
	}

	/** 
	 长连接
	 
	 @return 
	*/
	public final HttpRequestBuilder IsKeepAlive()
	{
		_keepAlive = true;
		return this;
	}


	/** 
	 构造请求
	 
	 @return 
	*/
	public final HttpWebRequest Build()
	{
		// 创建POST请求
		HttpWebRequest req = (HttpWebRequest)WebRequest.Create(String.format("%1$s", _address));
		req.KeepAlive = _keepAlive;
		req.ProtocolVersion = HttpVersion.Version11;
		req.AllowAutoRedirect = false; // 不允许自动重定向
		req.Method = _method;
		req.Timeout = _timeout; // 传入是秒，需要转换成毫秒
		if (_header != null)
		{
			req.Accept = _header.get(SignConsts.Accept);
			req.ContentType = _header.get(SignConsts.ContentType);

			for (String headerKey : _header.keySet())
			{
				if (headerKey.contains(SignConsts.XCa))
				{
					req.Headers.Add(headerKey + ":" + _header.get(headerKey));
				}
			}
		}
		return req;
	}

}