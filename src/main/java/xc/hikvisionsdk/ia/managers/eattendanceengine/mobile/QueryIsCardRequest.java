package xc.hikvisionsdk.ia.managers.eattendanceengine.mobile;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.managers.*;
import xc.hikvisionsdk.ia.managers.eattendanceengine.*;
import java.time.*;

/** 
 查询是否是指定打卡地点请求
*/
public class QueryIsCardRequest extends BaseRequest
{
	/** 
	 查询是否是指定打卡地点请求
	 
	 @param id 人员标识
	 @param date 日期
	*/
	public QueryIsCardRequest(String id, LocalDateTime date)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(id))
		{
			throw new NullPointerException("id");
		}

		Id = id;
		Date = date.toString("yyyy-MM-dd HH:mm:ss");
	}

	/** 
	 人员标识
	*/
	private String Id;
	public final String getId()
	{
		return Id;
	}
	/** 
	 日期
	*/
	private String Date;
	public final String getDate()
	{
		return Date;
	}

	/** 
	 
	*/
	@Override
	public void CheckParams()
	{
	}
}