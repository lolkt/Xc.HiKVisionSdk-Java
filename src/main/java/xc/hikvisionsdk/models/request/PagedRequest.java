package xc.hikvisionsdk.models.request;

import xc.hikvisionsdk.*;

/** 
 分页查询
*/
public class PagedRequest extends BaseRequest implements IBaseRequest, IPagedRequest
{
	/** 
	 尺寸
	*/
	private int PageSize = 1;
	public final int getPageSize()
	{
		return PageSize;
	}
	public final void setPageSize(int value)
	{
		PageSize = value;
	}
	/** 
	 页码
	*/
	private int PageNo = 1;
	public final int getPageNo()
	{
		return PageNo;
	}
	public final void setPageNo(int value)
	{
		PageNo = value;
	}

	/** 
	 分页查询
	*/
	public PagedRequest()
	{
	}

	/** 
	 分页查询
	 
	 @param pageNo 当前页码
	 @param pageSize 每页记录总数
	*/
	public PagedRequest(int pageNo, int pageSize)
	{
		if (pageNo < 0)
		{
			setPageNo(1);
		}
		else
		{
			setPageNo(pageNo);
		}

		if (pageSize < 0)
		{
			setPageSize(1);
		}
		else if (pageSize > 1000)
		{
			setPageSize(1000);
		}
		else
		{
			setPageSize(pageSize);
		}
	}


	@Override
	public void CheckParams()
	{
		if (getPageSize() < 1 || getPageSize() > 1000)
		{
			throw new IndexOutOfBoundsException("PageSize", getPageSize(), "不能小于1或者大于1000");
		}

		if (getPageNo() < 1)
		{
			throw new IndexOutOfBoundsException("PageNo", getPageNo(), "不能小于1");
		}
	}
}