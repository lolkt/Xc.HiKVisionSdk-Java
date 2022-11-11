package xc.hikvisionsdk.consts;

import xc.hikvisionsdk.*;

/** 
 排序方式
*/
public final class OrderTypeConsts
{
	/** 
	 升序
	*/
	public static final String ASC = "asc";

	/** 
	 降序
	*/
	public static final String DESC = "desc";

	/** 
	 获得排序方式
	 
	 @param isAsc 是升序
	 @return 升序或降序
	*/
	public static String GetOrderType(boolean isAsc)
	{
		return isAsc ? ASC : DESC;
	}

}