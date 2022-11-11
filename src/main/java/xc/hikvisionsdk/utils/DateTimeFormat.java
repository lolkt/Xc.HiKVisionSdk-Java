package xc.hikvisionsdk.utils;

import xc.hikvisionsdk.*;
import java.time.*;

/** 
 时间格式转换
*/
public final class DateTimeFormat
{
	/** 
	 datetime转ios8601
	 
	 @param dt
	 @return 
	*/
	public static String ToIOS8601(LocalDateTime dt)
	{
//C# TO JAVA CONVERTER TODO TASK: The '0:yyyy-MM-ddTHH:mm:ss' format specifier is not converted to Java:
		return String.format("{0:yyyy-MM-ddTHH:mm:ss}.000+08:00:00", dt);
	}

	/** 
	 datetime转yyyy-MM-dd
	 
	 @param dt
	 @return 
	*/
	public static String ToDate(LocalDateTime dt)
	{
		return dt.toString("yyyy-MM-dd");
	}

	/** 
	 ios8601转datetime
	 
	 @param date
	 @return 
	*/
	public static LocalDateTime ToDateTime(String date)
	{
		return LocalDateTime.parse(date.split("[+]", -1)[0]);
	}

	//public static DateTime TryToDateTime(string date, out DateTime dt)
	//{

	//}
}