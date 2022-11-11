package xc.hikvisionsdk.models.responses;

import xc.hikvisionsdk.*;

/** 
 分页信息,切勿直接继承
 
 <typeparam name="T"></typeparam>
*/
public final class HiKVisionPagedDataResponseData<T>
{
	/** 
	 总数
	*/
	private int Total;
	public int getTotal()
	{
		return Total;
	}
	public void setTotal(int value)
	{
		Total = value;
	}
	/** 
	 页码
	*/
	private int PageNo;
	public int getPageNo()
	{
		return PageNo;
	}
	public void setPageNo(int value)
	{
		PageNo = value;
	}
	/** 
	 尺寸
	*/
	private int PageSize;
	public int getPageSize()
	{
		return PageSize;
	}
	public void setPageSize(int value)
	{
		PageSize = value;
	}

	/** 
	 总页数
	*/
	private Integer TotalPage = null;
	public Integer getTotalPage()
	{
		return TotalPage;
	}
	public void setTotalPage(Integer value)
	{
		TotalPage = value;
	}
	/** 
	 具体数据
	*/
	private T[] List;
	public T[] getList()
	{
		return List;
	}
	public void setList(T[] value)
	{
		List = value;
	}
}