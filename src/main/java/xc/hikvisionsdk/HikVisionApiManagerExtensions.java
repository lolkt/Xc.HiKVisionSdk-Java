package xc.hikvisionsdk;

import xc.hikvisionsdk.commons.managers.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.models.responses.*;
import java.math.*;

/** 
 POST扩展
*/
public final class HikVisionApiManagerExtensions
{

	/** 
	 
	 
	 <typeparam name="T"></typeparam>
	 <typeparam name="TResult"></typeparam>
	 @param manager
	 @param url
	 @param body
	 @param ver
	 @return 
	*/
	public static <T extends IBaseRequest, TResult extends HiKVisionResponse> TResult PostAndGet(IHikVisionApiManager manager, String url, T body, BigDecimal ver)
	{
		body.CheckParams();
		String bodyStr = body.toString();
		var result = manager.PostAndGetString(url, bodyStr, ver);

		var output = Newtonsoft.Json.JsonConvert.<TResult>DeserializeObject(result);

		if (output.Status != 0)
		{
			throw new HttpRequestException(result);
		}

		return output;
	}


	/** 
	 
	 
	 <typeparam name="T"></typeparam>
	 <typeparam name="TResult"></typeparam>
	 @param manager
	 @param url
	 @param body
	 @param ver
	 @return 
	*/
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent in Java to the 'async' keyword:
//ORIGINAL LINE: public static async Task<TResult> PostAndGetAsync<T, TResult>(this IHikVisionApiManager manager, string url, T body, decimal ver) where T : class, IBaseRequest where TResult : HiKVisionResponse
	public static <T extends IBaseRequest, TResult extends HiKVisionResponse> Task<TResult> PostAndGetAsync(IHikVisionApiManager manager, String url, T body, BigDecimal ver)
	{
		body.CheckParams();
		//string bodyStr = body?.SerializeByCamelCase();
		String bodyStr = body.toString();
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
		var result = await manager.PostAndGetStringAsync(url, bodyStr, ver);

		var output = Newtonsoft.Json.JsonConvert.<TResult>DeserializeObject(result);

		if (output.Status != 0)
		{
			//output.Code = output.Status.ToString();
			//output
			throw new HttpRequestException(result);
		}
		return output;
	}

	/** 
	 
	 
	 <typeparam name="TResult"></typeparam>
	 @param manager
	 @param url
	 @param ver
	 @return 
	 @exception HttpRequestException
	*/
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent in Java to the 'async' keyword:
//ORIGINAL LINE: public static async Task<TResult> GetAsync<TResult>(this IHikVisionApiManager manager, string url, decimal ver) where TResult : HiKVisionResponse
	public static <TResult extends HiKVisionResponse> Task<TResult> GetAsync(IHikVisionApiManager manager, String url, BigDecimal ver)
	{
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
		var result = await xc.hikvisionsdk.HikVisionApiManagerExtensions.GetAsync(manager, url, ver);

		if (tangible.StringHelper.isNullOrWhiteSpace(result))
		{
			return null;
		}

		var output = Newtonsoft.Json.JsonConvert.<TResult>DeserializeObject(result);

		if (output.Status != 0)
		{
			throw new HttpRequestException(result);
		}

		return output;
	}


//C# TO JAVA CONVERTER TODO TASK: There is no equivalent in Java to the 'async' keyword:
//ORIGINAL LINE: public static async Task<HttpResponseMessage> PostAsync<T>(this IHikVisionApiManager manager, string url, T body, decimal ver) where T : class, IBaseRequest
	public static <T extends IBaseRequest> Task<HttpResponseMessage> PostAsync(IHikVisionApiManager manager, String url, T body, BigDecimal ver)

	{
		body.CheckParams();
		//string bodyStr = body?.SerializeByCamelCase();
		String bodyStr = body.toString();



//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to 'await' in Java:
		return await xc.hikvisionsdk.HikVisionApiManagerExtensions.PostAsync(manager, url, bodyStr, ver);

		//var output = Newtonsoft.Json.JsonConvert.DeserializeObject<TResult>(response);
		//if (response.IsSuccessStatusCode)
		//{


		//}

		//var output = Newtonsoft.Json.JsonConvert.DeserializeObject<TResult>(result);

		//if (output.Status != 0)
		//{
		//    //output.Code = output.Status.ToString();
		//    //output
		//    throw new HttpRequestException(result);
		//}
		//return output;
	}
}