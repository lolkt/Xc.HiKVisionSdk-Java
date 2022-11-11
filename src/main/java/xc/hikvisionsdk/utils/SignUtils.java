package xc.hikvisionsdk.utils;

import xc.hikvisionsdk.consts.*;
import xc.hikvisionsdk.*;
import java.util.*;

/** 
 工具
*/
public final class SignUtils
{
	/** 
	 生成签名
	 
	 @param strToSign
	 @param sk
	 @return 
	*/
	public static String ComputeForHMACSHA256(String strToSign, String sk)
	{
		var encoder = new UTF8Encoding();
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: byte[] secretBytes = encoder.GetBytes(sk);
		byte[] secretBytes = encoder.GetBytes(sk);
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: byte[] strBytes = encoder.GetBytes(strToSign);
		byte[] strBytes = encoder.GetBytes(strToSign);
		var opertor = new HMACSHA256(secretBytes);
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: byte[] hashbytes = opertor.ComputeHash(strBytes);
		byte[] hashbytes = opertor.ComputeHash(strBytes);
		return Convert.ToBase64String(hashbytes);
	}

	/** 
	 生成body的md5内容
	 
	 @param body
	 @return 
	*/
	public static String ComputeBodyMd5(String body)
	{
		try (var x = MD5.Create())
		{
			var bytes = x.ComputeHash(body.getBytes(java.nio.charset.StandardCharsets.UTF_8));
			return Convert.ToBase64String(bytes);
		}
	}

	/** 
	 计算签名头
	 
	 @param header 请求头
	 @return 签名头
	*/
	public static String BuildSignHeader(HashMap<String, String> header)
	{
		HashMap<String, String> sortedDicHeader = new HashMap<String, String>();
		sortedDicHeader = header;
		//var dic = from objDic in sortedDicHeader orderby objDic.Key ascending select objDic;
		var dic = sortedDicHeader.OrderBy(u -> u.Key);
		StringBuilder sbSignHeader = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, String> kvp : dic.entrySet())
		{
			if (kvp.getKey().replace(" ", "").Contains(SignConsts.XCa))
			{
				sb.append(kvp.getKey() + ":");
				if (!tangible.StringHelper.isNullOrWhiteSpace(kvp.getValue()))
				{
					sb.append(kvp.getValue());
				}
				sb.append("\n");
				if (sbSignHeader.length() > 0)
				{
					sbSignHeader.append(",");
				}
				sbSignHeader.append(kvp.getKey());
			}
		}

		header.put(SignConsts.XCaSignatureHeaders, sbSignHeader.toString());

		return sb.toString();
	}

	/** 
	 生成SignString
	 
	 @param method HTTP请求方法，如"POST”</param>
	 @param url 接口Url，如/artemis/api/resource/v1/org/advance/orgList
	 @param header 请求头
	 @return 签名字符串
	*/
	public static String BuildSignString(String method, String url, HashMap<String, String> header)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(method.toUpperCase()).append("\n");
		if (null != header)
		{
			if (!header.get(SignConsts.Accept).equals(null))
			{
				sb.append(header.get(SignConsts.Accept));
				sb.append("\n");
			}

			if (header.containsKey(SignConsts.ContentMd5) && !header.get(SignConsts.ContentMd5).equals(null))
			{
				sb.append(header.get(SignConsts.ContentMd5));
				sb.append("\n");
			}

			if (!header.get(SignConsts.ContentType).equals(null))
			{
				sb.append(header.get(SignConsts.ContentType));
				sb.append("\n");
			}

			if (header.containsKey(SignConsts.Date) && !header.get(SignConsts.Date).equals(null))
			{
				sb.append(header.get(SignConsts.Date));
				sb.append("\n");
			}
		}

		// build and add header to sign
		String signHeader = BuildSignHeader(header);
		sb.append(signHeader);
		sb.append(url);
		return sb.toString();
	}

}