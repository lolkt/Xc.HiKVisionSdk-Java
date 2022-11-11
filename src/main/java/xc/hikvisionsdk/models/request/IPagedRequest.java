package xc.hikvisionsdk.models.request;

import xc.hikvisionsdk.*;

/** 
 分页
*/
public interface IPagedRequest
{
	/** 
	 页容量
	*/
	int getPageSize();
	void setPageSize(int value);
	/** 
	 页码
	*/
	int getPageNo();
	void setPageNo(int value);
}