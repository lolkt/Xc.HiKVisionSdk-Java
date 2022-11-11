package xc.hikvisionsdk.isc.managers.video.models.cameras;

import xc.hikvisionsdk.isc.enums.video.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.video.*;

/** 
 获取监控点预览取流URLv2请求
*/
public class CameraPreviewURLsV2Request extends BaseRequest
{
	/** 
	 监控点唯一标识，分页获取监控点资源接口获取返回参数cameraIndexCode
	*/
	private String CameraIndexCode;
	public final String getCameraIndexCode()
	{
		return CameraIndexCode;
	}

	/** 
	 码流类型，0:主码流
	 1:子码流
	 2:第三码流
	 参数不填，默认为主码流
	*/
	private StreamType StreamType = StreamType.Main;
	public final StreamType getStreamType()
	{
		return StreamType;
	}
	private void setStreamType(StreamType value)
	{
		StreamType = value;
	}
	/** 
	 取流协议（应用层协议），
	 "hik”:HIK私有协议，使用视频SDK进行播放时，传入此类型；
	 "rtsp”:RTSP协议；
	 "rtmp”:RTMP协议（RTMP协议只支持海康SDK协议、EHOME协议、ONVIF协议接入的设备；只支持H264视频编码和AAC音频编码）；
	 "hls”:HLS协议（HLS协议只支持海康SDK协议、EHOME协议、ONVIF协议接入的设备；只支持H264视频编码和AAC音频编码）；
	 "ws”:Websocket协议（一般用于H5视频播放器取流播放）。
	 参数不填，默认为HIK协议
	*/
	private String Protocol = "hik";
	public final String getProtocol()
	{
		return Protocol;
	}
	private void setProtocol(String value)
	{
		Protocol = value;
	}

	/** 
	 传输协议（传输层协议），0:UDP
	 1:TCP
	 默认是TCP
	 注：GB28181 2011及以前版本只支持UDP传输
	*/
	private TransmodeType Transmode = TransmodeType.TCP;
	public final TransmodeType getTransmode()
	{
		return Transmode;
	}
	private void setTransmode(TransmodeType value)
	{
		Transmode = value;
	}
	/** 
	 标识扩展内容，格式：key=value，
	 调用方根据其播放控件支持的解码格式选择相应的封装类型；
	 多个扩展时，以<![CDATA["&"]]>隔开；
	 支持的内容详见附录F expand扩展内容说明
	*/
	private String Expand;
	public final String getExpand()
	{
		return Expand;
	}
	private void setExpand(String value)
	{
		Expand = value;
	}
	/** 
	 输出码流转封装格式，"ps”:PS封装格式、“rtp”:RTP封装协议。当protocol=rtsp时生效，且不传值时默认为RTP封装协议。
	*/
	private String Streamform;
	public final String getStreamform()
	{
		return Streamform;
	}
	private void setStreamform(String value)
	{
		Streamform = value;
	}

	/** 
	 获取监控点预览取流URLv2请求
	 
	 @param cameraIndexCode 监控点唯一标识
	 @param protocol 取流协议（应用层协议）
	 @param expand 标识扩展内容
	*/

	public CameraPreviewURLsV2Request(String cameraIndexCode, String protocol)
	{
		this(cameraIndexCode, protocol, "");
	}

	public CameraPreviewURLsV2Request(String cameraIndexCode)
	{
		this(cameraIndexCode, "hik", "");
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public CameraPreviewURLsV2Request(string cameraIndexCode, string protocol = "hik", string expand = "")
	public CameraPreviewURLsV2Request(String cameraIndexCode, String protocol, String expand)
	{
		CameraIndexCode = cameraIndexCode;
		setProtocol(protocol.toLowerCase());
		setExpand(expand);
	}

	/** 
	 使用UDP
	 
	 @return 
	*/
	public final CameraPreviewURLsV2Request UseUdp()
	{
		setTransmode(TransmodeType.UDP);
		return this;
	}

	/** 
	 使用子码
	 
	 @return 
	*/
	public final CameraPreviewURLsV2Request UseSubStream()
	{
		setStreamType(StreamType.Sub);
		return this;
	}

	/** 
	 使用第三码流
	 
	 @return 
	*/
	public final CameraPreviewURLsV2Request UseOtherStream()
	{
		setStreamType(StreamType.Other);
		return this;
	}

	/** 
	 hls
	 
	 @param expand
	 标识扩展内容，格式：key=value，
	 调用方根据其播放控件支持的解码格式选择相应的封装类型；
	 多个扩展时，以<![CDATA["&"]]>隔开；
	 支持的内容详见附录F expand扩展内容说明
	 
	 @param streamform 输出码流转封装格式
	 @return 
	*/

	public final CameraPreviewURLsV2Request UseHls(String expand)
	{
		return UseHls(expand, "");
	}

	public final CameraPreviewURLsV2Request UseHls()
	{
		return UseHls("", "");
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public CameraPreviewURLsV2Request UseHls(string expand = "", string streamform = "")
	public final CameraPreviewURLsV2Request UseHls(String expand, String streamform)
	{
		setProtocol("hls");
		setExpand(expand);
		setStreamform(streamform);
		return this;
	}

	/** 
	 rtsp
	 
	 @param expand
	 标识扩展内容，格式：key=value，
	 调用方根据其播放控件支持的解码格式选择相应的封装类型；
	 多个扩展时，以<![CDATA["&"]]>隔开；
	 支持的内容详见附录F expand扩展内容说明
	 
	 @param streamform 输出码流转封装格式
	 @return 
	*/

	public final CameraPreviewURLsV2Request UseRtsp(String expand)
	{
		return UseRtsp(expand, "");
	}

	public final CameraPreviewURLsV2Request UseRtsp()
	{
		return UseRtsp("", "");
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public CameraPreviewURLsV2Request UseRtsp(string expand = "", string streamform = "")
	public final CameraPreviewURLsV2Request UseRtsp(String expand, String streamform)
	{
		setProtocol("rtsp");
		setExpand(expand);
		setStreamform(streamform);
		return this;
	}
	/** 
	 rtmp
	 
	 @param expand
	 标识扩展内容，格式：key=value，
	 调用方根据其播放控件支持的解码格式选择相应的封装类型；
	 多个扩展时，以<![CDATA["&"]]>隔开；
	 支持的内容详见附录F expand扩展内容说明
	 
	 @param streamform 输出码流转封装格式
	 @return 
	*/

	public final CameraPreviewURLsV2Request UseRtmp(String expand)
	{
		return UseRtmp(expand, "");
	}

	public final CameraPreviewURLsV2Request UseRtmp()
	{
		return UseRtmp("", "");
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public CameraPreviewURLsV2Request UseRtmp(string expand = "", string streamform = "")
	public final CameraPreviewURLsV2Request UseRtmp(String expand, String streamform)
	{
		setProtocol("rtmp");
		setExpand(expand);
		setStreamform(streamform);
		return this;
	}
	/** 
	 Websocket协议
	 
	 @param expand
	 标识扩展内容，格式：key=value，
	 调用方根据其播放控件支持的解码格式选择相应的封装类型；
	 多个扩展时，以<![CDATA["&"]]>隔开；
	 支持的内容详见附录F expand扩展内容说明
	 
	 @param streamform 输出码流转封装格式
	 @return 
	*/

	public final CameraPreviewURLsV2Request UseWs(String expand)
	{
		return UseWs(expand, "");
	}

	public final CameraPreviewURLsV2Request UseWs()
	{
		return UseWs("", "");
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public CameraPreviewURLsV2Request UseWs(string expand = "", string streamform = "")
	public final CameraPreviewURLsV2Request UseWs(String expand, String streamform)
	{
		setProtocol("ws");
		setExpand(expand);
		setStreamform(streamform);
		return this;
	}

	/** 
	 
	 
	 @exception System.ArgumentOutOfRangeException
	*/
	@Override
	public void CheckParams()
	{
		if (!getProtocol().equals("hik") && !getProtocol().equals("rtsp") && !getProtocol().equals("rtmp") && !getProtocol().equals("hls") && !getProtocol().equals("ws"))
		{
			throw new IndexOutOfBoundsException("Protocol", getProtocol(), "仅支持 hik,rtsp,rtmp,hls,ws");
		}
	}

}