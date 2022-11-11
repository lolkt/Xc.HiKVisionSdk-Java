package xc.hikvisionsdk.isc.managers.video.models.pictures;

import xc.hikvisionsdk.consts.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.video.*;

/** 
 视频图片查询请求
*/
public class CameraEventsPictureRequest extends BaseRequest
{

	/** 
	 图片存储服务器唯一标识，提供picUri处会提供此字段
	*/
	private String SvrIndexCode;
	public final String getSvrIndexCode()
	{
		return SvrIndexCode;
	}
	/** 
	 图片的相对地址
	*/
	private String PicUri;
	public final String getPicUri()
	{
		return PicUri;
	}

	/** 
	 网络协议：
	 "http”:HTTP协议
	 "https”:HTTPS协议
	 参数不填，优先返回https协议
	*/
	private String NetProtocol;
	public final String getNetProtocol()
	{
		return NetProtocol;
	}

	/** 
	 视频图片查询请求
	 
	 @param svrIndexCode 图片存储服务器唯一标识
	 @param picUri 图片的相对地址
	 @param useSsl 使用https请求
	*/

	public CameraEventsPictureRequest(String svrIndexCode, String picUri)
	{
		this(svrIndexCode, picUri, true);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public CameraEventsPictureRequest(string svrIndexCode, string picUri, bool useSsl = true)
	public CameraEventsPictureRequest(String svrIndexCode, String picUri, boolean useSsl)
	{
		SvrIndexCode = svrIndexCode;
		PicUri = picUri;
		NetProtocol = NetProtocolConsts.GetNetProtocol(useSsl);
	}

	/** 
	 
	 
	 @exception System.ArgumentNullException
	 @exception System.ArgumentOutOfRangeException
	*/
	@Override
	public void CheckParams()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getSvrIndexCode()))
		{
			throw new NullPointerException("SvrIndexCode");
		}

		if (tangible.StringHelper.isNullOrWhiteSpace(getPicUri()))
		{
			throw new NullPointerException("PicUri");
		}
		if (!NetProtocolConsts.Check(getNetProtocol()))
		{
			throw new IndexOutOfBoundsException("NetProtocol", "只能使用 http 或 https");
		}
	}
}