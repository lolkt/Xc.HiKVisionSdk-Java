package xc.hikvisionsdk.isc.managers.resource.models.acs;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 查询门禁点列表请求
*/
public class AcsDoorAdvanceAcsDoorListRequest extends PagedRequest
{
	/** 
	 门禁点唯一标识符集 
	 多个值使用英文逗号分隔， 获取门禁设备列表接口可以获取
	*/
	private String DoorIndexCodes;
	public final String getDoorIndexCodes()
	{
		return DoorIndexCodes;
	}
	public final void setDoorIndexCodes(String value)
	{
		DoorIndexCodes = value;
	}

	/** 
	 门禁点名称
	 支持中英文字符，不能包含 ' / \ : * ? "
	 支持模糊搜索，获取门禁设备列表接口可以获取
	*/
	private String DoorName;
	public final String getDoorName()
	{
		return DoorName;
	}
	public final void setDoorName(String value)
	{
		DoorName = value;
	}

	/** 
	 门禁设备唯一标识，获取门禁设备列表接口可以获取
	*/
	private String AcsDevIndexCode;
	public final String getAcsDevIndexCode()
	{
		return AcsDevIndexCode;
	}
	public final void setAcsDevIndexCode(String value)
	{
		AcsDevIndexCode = value;
	}

	/** 
	 所属区域唯一标识，分页获取区域列表
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
	 查询门禁点列表请求
	 
	 @param pageNo
	 @param pageSize
	 @param regionIndexCode 所属区域唯一标识
	 @param acsDevIndexCode 门禁设备唯一标识
	 @param doorName 门禁点名称
	*/

	public AcsDoorAdvanceAcsDoorListRequest(int pageNo, int pageSize, String regionIndexCode, String acsDevIndexCode)
	{
		this(pageNo, pageSize, regionIndexCode, acsDevIndexCode, "");
	}

	public AcsDoorAdvanceAcsDoorListRequest(int pageNo, int pageSize, String regionIndexCode)
	{
		this(pageNo, pageSize, regionIndexCode, "", "");
	}

	public AcsDoorAdvanceAcsDoorListRequest(int pageNo, int pageSize)
	{
		this(pageNo, pageSize, "", "", "");
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public AcsDoorAdvanceAcsDoorListRequest(int pageNo, int pageSize, string regionIndexCode = "", string acsDevIndexCode = "", string doorName = "")
	public AcsDoorAdvanceAcsDoorListRequest(int pageNo, int pageSize, String regionIndexCode, String acsDevIndexCode, String doorName)
	{
		super(pageNo, pageSize);
		setRegionIndexCode(regionIndexCode);
		setAcsDevIndexCode(acsDevIndexCode);
		setDoorName(doorName);
	}

	/** 
	 门禁点唯一标识符集
	 
	 @param doorIndexCodes 门禁点唯一标识符集
	 @return 
	*/
	public final AcsDoorAdvanceAcsDoorListRequest UseDoorIndexCodes(String... doorIndexCodes)
	{
		setDoorIndexCodes(tangible.StringHelper.join(",", doorIndexCodes));
		return this;
	}
}