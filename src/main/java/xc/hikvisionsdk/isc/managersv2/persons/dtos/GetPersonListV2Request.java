package xc.hikvisionsdk.isc.managersv2.persons.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.persons.*;

/** 
 获取人员列表v2
*/
public class GetPersonListV2Request extends PagedRequest
{
	/** 
	 获取人员列表v2
	 
	 @param pageNo
	 @param pageSize
	*/
	public GetPersonListV2Request(int pageNo, int pageSize)
	{
		super(pageNo, pageSize);
	}
}