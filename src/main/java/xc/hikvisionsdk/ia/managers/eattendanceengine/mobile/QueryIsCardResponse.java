package xc.hikvisionsdk.ia.managers.eattendanceengine.mobile;

import xc.hikvisionsdk.models.responses.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.managers.*;
import xc.hikvisionsdk.ia.managers.eattendanceengine.*;

/** 
 查询是否是指定打卡地点结果
*/
public class QueryIsCardResponse extends HiKVisionNullDataResponse
{
	/** 
	 是否是指定地点
	*/
	public final boolean isOk()
	{
		return !tangible.StringHelper.isNullOrEmpty(getData());
	}
}