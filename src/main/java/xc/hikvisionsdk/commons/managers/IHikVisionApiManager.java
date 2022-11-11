package xc.hikvisionsdk.commons.managers;

import xc.hikvisionsdk.*;
import java.math.*;

/** 
 
*/
public interface IHikVisionApiManager
{
	/** 
	 
	 
	 @param url
	 @param bodyStr
	 @param ver
	 @return 
	*/
	Task<HttpResponseMessage> PostAsync(String url, String bodyStr, BigDecimal ver);

	/** 
	 post
	 
	 @param url
	 @param bodyStr
	 @param ver
	 @return 
	*/
	String PostAndGetString(String url, String bodyStr, BigDecimal ver);

	/** 
	 异步post
	 
	 @param url
	 @param bodyStr
	 @param ver
	 @return 
	*/
	Task<String> PostAndGetStringAsync(String url, String bodyStr, BigDecimal ver);

	/** 
	 get
	 
	 @param url
	 @param ver
	 @return 
	*/
	Task<String> GetAsync(String url, BigDecimal ver);
}