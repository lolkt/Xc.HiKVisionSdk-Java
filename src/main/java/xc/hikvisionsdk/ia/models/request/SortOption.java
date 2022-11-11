package xc.hikvisionsdk.ia.models.request;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.models.*;

/** 
 排序参数
*/
public class SortOption
{
	/** 
	 
	 
	 @param sortField
	 @param sortType
	*/
	public SortOption(String sortField, String sortType)
	{
		setSortField(sortField);
		setSortType(sortType);
	}

	/** 
	 排序字段
	*/
	private String SortField;
	public final String getSortField()
	{
		return SortField;
	}
	public final void setSortField(String value)
	{
		SortField = value;
	}
	/** 
	 排序类型：esc、desc
	*/
	private String SortType;
	public final String getSortType()
	{
		return SortType;
	}
	public final void setSortType(String value)
	{
		SortType = value;
	}
}