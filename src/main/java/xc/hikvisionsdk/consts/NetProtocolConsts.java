package xc.hikvisionsdk.consts;

import xc.hikvisionsdk.*;

/** 
 网络协议
*/
public final class NetProtocolConsts
{
	/** 
	 http
	*/
	public static final String HTTP = "http";

	/** 
	 https
	*/
	public static final String HTTPS = "https";

	/** 
	 获得协议
	 
	 @param useSsl 使用ssl
	 @return 
	*/
	public static String GetNetProtocol(boolean useSsl)
	{
		return useSsl ? HTTPS : HTTP;
	}

	/** 
	 检查协议名称
	 
	 @param netProtocol 协议名
	 @return 
	*/
	public static boolean Check(String netProtocol)
	{
		return HTTP.equals(netProtocol) || HTTPS.equals(netProtocol);
	}
}