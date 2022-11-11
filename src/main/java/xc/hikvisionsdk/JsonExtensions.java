package xc.hikvisionsdk;

import Newtonsoft.Json.*;
import Newtonsoft.Json.Serialization.*;

/** 
 json扩展
*/
public final class JsonExtensions
{
	/** 
	 反序列化
	 
	 <typeparam name="T"></typeparam>
	 @param str
	 @return 
	*/
	public static <T> T DeserializeObject(String str)
	{
		return JsonConvert.<T>DeserializeObject(str);
	}

	/** 
	 序列化
	 
	 <typeparam name="T"></typeparam>
	 @param entity
	 @return 
	*/
	public static <T> String Serialize(T entity)
	{
		return JsonConvert.SerializeObject(entity);
	}


	/** 
	 基于驼峰序列化
	 
	 <typeparam name="T"></typeparam>
	 @param entity
	 @return 
	*/
	public static <T> String SerializeByCamelCase(T entity)
	{
		JsonSerializerSettings tempVar = new JsonSerializerSettings();
		tempVar.ContractResolver = new CamelCasePropertyNamesContractResolver();
		return JsonConvert.SerializeObject(entity, Formatting.Indented, tempVar);

	}
}