package xc.hikvisionsdk.commons.managers;

import xc.hikvisionsdk.consts.*;
import xc.hikvisionsdk.options.*;
import xc.hikvisionsdk.utils.*;
import xc.hikvisionsdk.*;
import java.util.*;
import java.time.*;
import java.math.*;

/** 
 
*/
public class HikVisionApiManager implements IHikVisionApiManager
{
	private final HiKVisionOptions _option;
	private final HttpClient _httpClient;

	/** 
	 
	 
	 @param client
	 @param option
	 @param logger
	*/
	public HikVisionApiManager(HttpClient client, HiKVisionOptions option)
	{
		_httpClient = client;
		_option = option;

	}

	/** 
	 
	 
	 @param url
	 @param bodyStr
	 @param ver
	 @return 
	*/
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent in Java to the 'async' keyword:
//ORIGINAL LINE: public async Task<HttpResponseMessage> PostAsync(string url, string bodyStr, decimal ver)
	public final Task<HttpResponseMessage> PostAsync(String url, String bodyStr, BigDecimal ver)
	{
		Check(ver);
		//Logger?.LogDebug($"url:{url}")
		var bodyJson = new StringContent(tangible.StringHelper.isNullOrWhiteSpace(bodyStr) ? "" : bodyStr, Encoding.UTF8, "application/json");
		var header = InitHeaderInfo(String.format("/artemis%1$s", url), true);
		for (String headerKey : header.keySet())
		{
			if (headerKey.contains(SignConsts.XCa))
			{
				bodyJson.Headers.Add(headerKey, header.get(headerKey));
			}
		}

//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
		return await _httpClient.PostAsync(String.format("%1$s/artemis%2$s", _option.getBaseUrl(), url), bodyJson);

	}

	/** 
	 
	 
	 @param url
	 @param bodyStr
	 @param ver
	 @return 
	*/
	public final String PostAndGetString(String url, String bodyStr, BigDecimal ver)
	{
		return PostAndGetStringAsync(url, bodyStr, ver).Result;
	}

	/** 
	 
	 
	 @param url
	 @param bodyStr
	 @param ver
	 @return 
	*/
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent in Java to the 'async' keyword:
//ORIGINAL LINE: public async Task<string> PostAndGetStringAsync(string url, string bodyStr, decimal ver)
	public final Task<String> PostAndGetStringAsync(String url, String bodyStr, BigDecimal ver)
	{
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
		var response = await PostAsync(url, bodyStr, ver);

//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
		return await response.Content.ReadAsStringAsync();
	}

	/** 
	 Task<string> GetAsync(string url, decimal ver)
	 
	 @param url
	 @param ver
	 @return 
	*/
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent in Java to the 'async' keyword:
//ORIGINAL LINE: public async Task<string> GetAsync(string url, decimal ver)
	public final Task<String> GetAsync(String url, BigDecimal ver)
	{
		Check(ver);

		var header = InitHeaderInfo(String.format("/artemis%1$s", url), true);

		try (var requestMessage = new HttpRequestMessage(HttpMethod.Get, String.format("%1$s/artemis%2$s", _option.getBaseUrl(), url)))
		{

			for (String headerKey : header.keySet())
			{
				if (headerKey.contains(SignConsts.XCa))
				{
					requestMessage.Headers.Add(headerKey, header.get(headerKey));
				}
			}

//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
			var response = await _httpClient.SendAsync(requestMessage);
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
			return await response.Content.ReadAsStringAsync();
		}
	}


	/** 
	 
	 
	 @param ver
	 @exception ArgumentNullException
	 @exception ArgumentOutOfRangeException
	*/
	private void Check(BigDecimal ver)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(_option.getBaseUrl()))
		{
			throw new NullPointerException("baseUrl");
		}

		if (tangible.StringHelper.isNullOrWhiteSpace(_option.getAk()))
		{
			throw new NullPointerException("ak");
		}
		if (tangible.StringHelper.isNullOrWhiteSpace(_option.getSk()))
		{
			throw new NullPointerException("sk");
		}



		if (ver.compareTo(_option.getVer()) > 0)
		{
			//throw new ArgumentOutOfRangeException($"调用接口为{ver},设置版本为{_option.Ver}");
			throw new IndexOutOfBoundsException("ver", String.format("接口最低可用版本为%1$s,当前设置版本为%2$s", ver, _option.getVer()));

		}

	}
	/** 
	 
	 
	 @param url
	 @param isPost
	 @return 
	*/

	private java.util.HashMap<String, String> InitHeaderInfo(String url)
	{
		return InitHeaderInfo(url, false);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: private Dictionary<string, string> InitHeaderInfo(string url, bool isPost = false)
	private HashMap<String, String> InitHeaderInfo(String url, boolean isPost)
	{

		HashMap<String, String> header = new HashMap<String, String>(Map.ofEntries(Map.entry(SignConsts.Accept, "application/json"), Map.entry(SignConsts.ContentType, "application/json; charset=utf-8")));

		// x-ca-timestamp
		String timestamp = ((LocalDateTime.now().getTime() - TimeZoneInfo.ConvertTime(LocalDateTime.of(1970, 1, 1, 0, 0, 0, 0), TimeZoneInfo.Local).getTime()) / 1000).toString();
		header.put(SignConsts.XCaTimeStamp, timestamp);

		// x-ca-nonce
		header.put(SignConsts.XCaNonce, System.Guid.NewGuid().toString());

		// x-ca-key
		header.put(SignConsts.XCaKey, _option.getAk());

		// build string to sign
		String strToSign = SignUtils.BuildSignString(isPost ? "POST" : "GET", url, header);

		String signedStr = SignUtils.ComputeForHMACSHA256(strToSign, _option.getSk());

		// x-ca-signature
		header.put(SignConsts.XCaSignature, signedStr);

		return header;
	}


}