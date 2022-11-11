package xc.hikvisionsdk.isc.managers.resource.models.person;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 获取人员列表v2请求
*/
public class PersonListV2Request extends PagedRequest
{
	/** 
	 获取人员列表v2请求
	 
	 @param pageNo
	 @param pageSize
	*/
	public PersonListV2Request(int pageNo, int pageSize)
	{
		super(pageNo, pageSize);
	}
}