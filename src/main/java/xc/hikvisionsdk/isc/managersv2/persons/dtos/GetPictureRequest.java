package xc.hikvisionsdk.isc.managersv2.persons.dtos;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.persons.*;

/** 
 提取人员图片
*/
public class GetPictureRequest extends BaseRequest
{


	/** 
	 图片相对URI        通过获取人员列表v2接口返回"picUri”字段
	*/
	private String PicUri;
	public final String getPicUri()
	{
		return PicUri;
	}
	/** 
	 图片服务器唯一标识        通过获取人员列表v2接口返回"serverIndexCode”字段
	*/
	private String ServerIndexCode;
	public final String getServerIndexCode()
	{
		return ServerIndexCode;
	}

	/** 
	 提取人员图片
	 
	 @param picUri 图片相对URI        通过获取人员列表v2接口返回"picUri”字段</param>
	 @param serverIndexCode 图片服务器唯一标识        通过获取人员列表v2接口返回"serverIndexCode”字段</param>
	 @exception System.ArgumentOutOfRangeException
	*/
	public GetPictureRequest(String picUri, String serverIndexCode)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(picUri))
		{
			throw new NullPointerException("picUri");
		}
		if (tangible.StringHelper.isNullOrWhiteSpace(serverIndexCode))
		{
			throw new NullPointerException("serverIndexCode");
		}
		PicUri = picUri;
		ServerIndexCode = serverIndexCode;
	}
}