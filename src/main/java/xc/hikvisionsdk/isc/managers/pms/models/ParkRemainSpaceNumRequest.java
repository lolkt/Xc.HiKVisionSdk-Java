package xc.hikvisionsdk.isc.managers.pms.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.pms.*;

/** 
 查询停车库剩余车位数请求
*/
public class ParkRemainSpaceNumRequest extends BaseRequest
{
	/** 
	 停车库唯一标识码（最大长度64）
	 为空时获取全部停车库的车位剩余情况，可通过获取停车库列表接口获取
	*/
	private String ParkSyscode;
	public final String getParkSyscode()
	{
		return ParkSyscode;
	}
	public final void setParkSyscode(String value)
	{
		ParkSyscode = value;
	}

	/** 
	 查询停车库剩余车位数请求
	 
	 @param parkSyscode 停车库唯一标识码,为空时获取全部停车库的车位剩余情况
	*/

	public ParkRemainSpaceNumRequest()
	{
		this(null);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public ParkRemainSpaceNumRequest(string parkSyscode = null)
	public ParkRemainSpaceNumRequest(String parkSyscode)
	{
		setParkSyscode(parkSyscode);
	}



	/** 
	 
	*/
	@Override
	public void CheckParams()
	{
		if (!tangible.StringHelper.isNullOrWhiteSpace(getParkSyscode()) && getParkSyscode().length() > 64)
		{
			throw new IndexOutOfBoundsException("ParkSyscode", getParkSyscode().length(), "最大长度 64 位");
		}
	}
}