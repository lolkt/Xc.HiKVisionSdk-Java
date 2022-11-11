package xc.hikvisionsdk.isc.managers.video.models.cameras;

import xc.hikvisionsdk.isc.enums.video.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.utils.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.video.*;
import java.time.*;

/** 
 获取监控点回放取流URLv2请求
*/
public class CameraPlaybackURLsV2Request extends BaseRequest
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
	 开始查询时间
	*/
	private String BeginTime;
	public final String getBeginTime()
	{
		return BeginTime;
	}
	/** 
	 结束查询时间，开始时间和结束时间相差不超过三天
	*/
	private String EndTime;
	public final String getEndTime()
	{
		return EndTime;
	}

	/** 
	 存储类型,0：中心存储
	 1：设备存储
	 默认为中心存储
	*/
	private RecordLocationTyep RecordLocation = RecordLocationTyep.Center;
	public final RecordLocationTyep getRecordLocation()
	{
		return RecordLocation;
	}
	public final void setRecordLocation(RecordLocationTyep value)
	{
		RecordLocation = value;
	}

	/** 
	取流协议（应用层协议)，
	"hik”:HIK私有协议，使用视频SDK进行播放时，传入此类型；
	"rtsp”:RTSP协议；
	"rtmp”:RTMP协议（RTMP协议只支持海康SDK协议、EHOME协议、ONVIF协议接入的设备；只支持H264视频编码和AAC音频编码；RTMP回放要求录像片段连续，需要在URL后自行拼接<![CDATA[beginTime=20190902T100303&endTime=20190902T100400]]>，其中20190902T100303至20190902T100400为查询出有连续录像的时间段。对于不连续的录像，需要分段查询分段播放）；
	"hls”:HLS协议（HLS协议只支持海康SDK协议、EHOME协议、ONVIF协议接入的设备；只支持H264视频编码和AAC音频编码；hls协议只支持云存储，不支持设备存储，云存储版本要求v2.2.4及以上的2.x版本，或v3.0.5及以上的3.x版本；ISC版本要求v1.2.0版本及以上，需在运管中心-视频联网共享中切换成启动平台外置VOD）,
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
	 默认为TCP，在protocol设置为rtsp或者rtmp时有效
	 注：EHOME设备回放只支持TCP传输
	 GB28181 2011及以前版本只支持UDP传输
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
	 分页查询id，上一次查询返回的uuid，用于继续查询剩余片段，默认为空字符串。当存储类型为设备存储时，该字段生效，中心存储会一次性返回全部片段。
	*/
	private String Uuid;
	public final String getUuid()
	{
		return Uuid;
	}
	private void setUuid(String value)
	{
		Uuid = value;
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
	 查询录像的锁定类型，0-查询全部录像；1-查询未锁定录像；2-查询已锁定录像，不传默认值为0。通过录像锁定与解锁接口来进行录像锁定与解锁。
	*/
	private LockType LockType = LockType.All;
	public final LockType getLockType()
	{
		return LockType;
	}
	private void setLockType(LockType value)
	{
		LockType = value;
	}


	/** 
	 获取监控点回放取流URLv2请求
	 
	 @param cameraIndexCode 监控点唯一标识
	 @param beginTime 开始查询时间
	 @param endTime
	 @param uuid EndTime
	 @param protocol 取流协议（应用层协议）
	 @param expand 标识扩展内容
	*/

	public CameraPlaybackURLsV2Request(String cameraIndexCode, java.time.LocalDateTime beginTime, java.time.LocalDateTime endTime, String uuid, String protocol)
	{
		this(cameraIndexCode, beginTime, endTime, uuid, protocol, "");
	}

	public CameraPlaybackURLsV2Request(String cameraIndexCode, java.time.LocalDateTime beginTime, java.time.LocalDateTime endTime, String uuid)
	{
		this(cameraIndexCode, beginTime, endTime, uuid, "hik", "");
	}

	public CameraPlaybackURLsV2Request(String cameraIndexCode, java.time.LocalDateTime beginTime, java.time.LocalDateTime endTime)
	{
		this(cameraIndexCode, beginTime, endTime, "", "hik", "");
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public CameraPlaybackURLsV2Request(string cameraIndexCode, DateTime beginTime, DateTime endTime, string uuid = "", string protocol = "hik", string expand = "")
	public CameraPlaybackURLsV2Request(String cameraIndexCode, LocalDateTime beginTime, LocalDateTime endTime, String uuid, String protocol, String expand)
	{
		CameraIndexCode = cameraIndexCode;
		setProtocol(protocol.toLowerCase());
		setExpand(expand);
		setUuid(uuid);

		if ((endTime - beginTime).TotalSeconds > 60 * 60 * 24 * 3)
		{
			throw new IndexOutOfBoundsException("endTime");
		}

		BeginTime = DateTimeFormat.ToIOS8601(beginTime);
		EndTime = DateTimeFormat.ToIOS8601(endTime);
	}

	/** 
	 
	 
	 @return 
	*/
	public final CameraPlaybackURLsV2Request UseLockTypeLocked()
	{
		setLockType(LockType.Locked);
		return this;
	}

	/** 
	 
	 
	 @return 
	*/
	public final CameraPlaybackURLsV2Request UseLockTypeUnLocked()
	{

		setLockType(LockType.Unlocked);
		return this;
	}

	/** 
	 使用设备存储
	 
	 @return 
	*/
	public final CameraPlaybackURLsV2Request UseRecordLocationDevice()
	{
		setRecordLocation(RecordLocationTyep.Device);
		return this;
	}

	/** 
	 使用UDP
	 
	 @return 
	*/
	public final CameraPlaybackURLsV2Request UseUdp()
	{
		setTransmode(TransmodeType.UDP);
		return this;
	}

	/** 
	 使用子码
	 
	 @return 
	*/
	public final CameraPlaybackURLsV2Request UseSubStreamType()
	{
		setStreamType(StreamType.Sub);
		return this;
	}

	/** 
	 使用第三码流
	 
	 @return 
	*/
	public final CameraPlaybackURLsV2Request UseOtherStreamType()
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

	public final CameraPlaybackURLsV2Request UseHls(String expand)
	{
		return UseHls(expand, "");
	}

	public final CameraPlaybackURLsV2Request UseHls()
	{
		return UseHls("", "");
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public CameraPlaybackURLsV2Request UseHls(string expand = "", string streamform = "")
	public final CameraPlaybackURLsV2Request UseHls(String expand, String streamform)
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

	public final CameraPlaybackURLsV2Request UseRtsp(String expand)
	{
		return UseRtsp(expand, "");
	}

	public final CameraPlaybackURLsV2Request UseRtsp()
	{
		return UseRtsp("", "");
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public CameraPlaybackURLsV2Request UseRtsp(string expand = "", string streamform = "")
	public final CameraPlaybackURLsV2Request UseRtsp(String expand, String streamform)
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

	public final CameraPlaybackURLsV2Request UseRtmp(String expand)
	{
		return UseRtmp(expand, "");
	}

	public final CameraPlaybackURLsV2Request UseRtmp()
	{
		return UseRtmp("", "");
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public CameraPlaybackURLsV2Request UseRtmp(string expand = "", string streamform = "")
	public final CameraPlaybackURLsV2Request UseRtmp(String expand, String streamform)
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

	public final CameraPlaybackURLsV2Request UseWs(String expand)
	{
		return UseWs(expand, "");
	}

	public final CameraPlaybackURLsV2Request UseWs()
	{
		return UseWs("", "");
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public CameraPlaybackURLsV2Request UseWs(string expand = "", string streamform = "")
	public final CameraPlaybackURLsV2Request UseWs(String expand, String streamform)
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
			throw new IndexOutOfBoundsException("Protocol", "仅支持 hik,rtsp,rtmp,hls,ws");
		}

		if (tangible.StringHelper.isNullOrWhiteSpace(getBeginTime()))
		{
			throw new NullPointerException("BeginTime");
		}

		if (tangible.StringHelper.isNullOrWhiteSpace(getEndTime()))
		{
			throw new NullPointerException("EndTime");

		}

		super.CheckParams();
	}


}