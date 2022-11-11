package xc.hikvisionsdk.isc.managers.resource.models.camera;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 
*/
public class CameraSearchV2Request extends PagedRequest
{
	/** 
	 名称，模糊搜索，最大长度32，若包含中文，最大长度指不超过按照指定编码的字节长度，即getBytes("utf-8”).length
	*/
	private String Name;
	public final String getName()
	{
		return Name;
	}
	public final void setName(String value)
	{
		Name = value;
	}
	/** 
	  	区域编号,可以为空;        String[]，支持根据区域批量查询；区域编号个数最大1000个；单个长度最大64Byte；，可从查询区域列表v2接口获取返回参数indexCode
	*/
	private String[] RegionIndexCodes;
	public final String[] getRegionIndexCodes()
	{
		return RegionIndexCodes;
	}
	public final void setRegionIndexCodes(String[] value)
	{
		RegionIndexCodes = value;
	}
	/** 
	  	true时，搜索regionIndexCodes及其子孙区域的资源；        false时，只搜索 regionIndexCodes的资源；isSubRegion不为空，regionIndexCodes也不可为空
	*/
	private boolean IsSubRegion;
	public final boolean isSubRegion()
	{
		return IsSubRegion;
	}
	public final void setSubRegion(boolean value)
	{
		IsSubRegion = value;
	}
	/** 
	 权限码集合，详见附录A.3 资源权限码中的监控点对应的资源权限码
	*/
	private String[] AuthCodes;
	public final String[] getAuthCodes()
	{
		return AuthCodes;
	}
	public final void setAuthCodes(String[] value)
	{
		AuthCodes = value;
	}
	/** 
	  	排序字段,注意：排序字段必须是查询条件，否则返回参数错误
	*/
	private String OrderBy;
	public final String getOrderBy()
	{
		return OrderBy;
	}
	public final void setOrderBy(String value)
	{
		OrderBy = value;
	}
	/** 
	  	降序升序,降序：desc 升序：asc
	*/
	private String OrderType;
	public final String getOrderType()
	{
		return OrderType;
	}
	public final void setOrderType(String value)
	{
		OrderType = value;
	}
	/** 
	 查询表达式
	*/
	private RequestExpression[] Expressions;
	public final RequestExpression[] getExpressions()
	{
		return Expressions;
	}
	public final void setExpressions(RequestExpression[] value)
	{
		Expressions = value;
	}

	/** 
	 查询监控点列表请求
	*/
	public CameraSearchV2Request()
	{
	}
	/** 
	 查询监控点列表请求
	 
	 @param pageNo
	 @param pageSize
	*/
	public CameraSearchV2Request(int pageNo, int pageSize)
	{
		super(pageNo, pageSize);
	}
}