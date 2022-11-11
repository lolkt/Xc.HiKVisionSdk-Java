package xc.hikvisionsdk.isc.managersv2.resources.dtos;

import xc.hikvisionsdk.dictionaries.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.utils.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.resources.*;
import java.time.*;

/** 
 获取资源的历史在线记录
*/
public class GetOnlineHistoryRequest extends PagedRequest
{
	/** 
	 资源编码，从获取资源列表v2接口获取返回报文中的indexCode字段
	*/
	private String IndexCode;
	public final String getIndexCode()
	{
		return IndexCode;
	}
	/** 
	 开始日期，yyyy-MM-dd格式
	*/
	private String StartDate;
	public final String getStartDate()
	{
		return StartDate;
	}
	/** 
	 结束日期，yyyy-MM-dd格式
	*/
	private String EndDate;
	public final String getEndDate()
	{
		return EndDate;
	}
	/** 
	 资源类型,参考附录A.64 网管资源类型
	*/
	private String ResourceType;
	public final String getResourceType()
	{
		return ResourceType;
	}

	/** 
	 获取资源的历史在线记录
	 
	 @param pageNo
	 @param pageSize
	 @param indexCode 资源编码，从获取资源列表v2接口获取返回报文中的indexCode字段
	 @param resourceType 资源类型<see cref="Dictionaries.ResourceType"/>
	 @param start 	开始日期，yyyy-MM-dd格式
	 @param end 结束日期，yyyy-MM-dd格式
	 @exception ArgumentNullException
	 @exception ArgumentOutOfRangeException
	*/

	public GetOnlineHistoryRequest(int pageNo, int pageSize, String indexCode, String resourceType, java.time.LocalDateTime start)
	{
		this(pageNo, pageSize, indexCode, resourceType, start, null);
	}

	public GetOnlineHistoryRequest(int pageNo, int pageSize, String indexCode, String resourceType)
	{
		this(pageNo, pageSize, indexCode, resourceType, null, null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public GetOnlineHistoryRequest(int pageNo, int pageSize, string indexCode, string resourceType, System.Nullable<DateTime> start = null, System.Nullable<DateTime> end = null)
	public GetOnlineHistoryRequest(int pageNo, int pageSize, String indexCode, String resourceType, LocalDateTime start, LocalDateTime end)
	{
		super(pageNo, pageSize);

		if (tangible.StringHelper.isNullOrWhiteSpace(indexCode))
		{
			throw new NullPointerException(indexCode);
		}
		IndexCode = indexCode;
		ResourceType = dictionaries.ResourceType.GetCode(resourceType);
		if (start != null)
		{
			StartDate = DateTimeFormat.ToDate(start.getValue());
		}

		if (end != null)
		{
			EndDate = DateTimeFormat.ToDate(end.getValue());
		}

		if (start != null && end != null && start.getValue().compareTo(end.getValue()) > 0)
		{
			throw new IndexOutOfBoundsException("end", "结束日期不可小于开始日期");
		}

	}


}