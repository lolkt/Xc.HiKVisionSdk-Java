package xc.hikvisionsdk.isc.managers.resource.models.camera;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 根据区域编号获取下级监控点列表
*/
public class RegionIndexCodeCamerasRequest extends PagedRequest
{
	/** 
	 区域编号唯一标识
	*/
	private String RegionIndexCode;
	public final String getRegionIndexCode()
	{
		return RegionIndexCode;
	}
	public final void setRegionIndexCode(String value)
	{
		RegionIndexCode = value;
	}

	/** 
	 根据区域编号获取下级监控点列表
	 
	 @param pageNo
	 @param pageSize
	 @param regionIndexCode 区域编号唯一标识
	*/
	public RegionIndexCodeCamerasRequest(int pageNo, int pageSize, String regionIndexCode)
	{
		super(pageNo, pageSize);
		setRegionIndexCode(regionIndexCode);
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	*/
	@Override
	public void CheckParams()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getRegionIndexCode()))
		{
			throw new NullPointerException("RegionIndexCode");
		}

		super.CheckParams();
	}

}