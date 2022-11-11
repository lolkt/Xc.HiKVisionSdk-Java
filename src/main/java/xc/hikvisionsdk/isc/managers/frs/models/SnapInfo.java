package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 重点人员事件抓拍信息
*/
public class SnapInfo
{
	/** 
	 抓拍背景图
	*/
	private String BkgUrl;
	public final String getBkgUrl()
	{
		return BkgUrl;
	}
	public final void setBkgUrl(String value)
	{
		BkgUrl = value;
	}
	/** 
	 抓拍小图
	*/
	private String SnapUrl;
	public final String getSnapUrl()
	{
		return SnapUrl;
	}
	public final void setSnapUrl(String value)
	{
		SnapUrl = value;
	}
	/** 
	 设备唯一标识
	*/
	private String DeviceIndexcode;
	public final String getDeviceIndexcode()
	{
		return DeviceIndexcode;
	}
	public final void setDeviceIndexcode(String value)
	{
		DeviceIndexcode = value;
	}
	/** 
	 设备名称
	*/
	private String DeviceName;
	public final String getDeviceName()
	{
		return DeviceName;
	}
	public final void setDeviceName(String value)
	{
		DeviceName = value;
	}
	/** 
	 监控点唯一标识
	*/
	private String CameraIndexcode;
	public final String getCameraIndexcode()
	{
		return CameraIndexcode;
	}
	public final void setCameraIndexcode(String value)
	{
		CameraIndexcode = value;
	}
	/** 
	 监控点名称
	*/
	private String CameraName;
	public final String getCameraName()
	{
		return CameraName;
	}
	public final void setCameraName(String value)
	{
		CameraName = value;
	}
	/** 
	 性别，male-男，female-女
	*/
	private String Gender;
	public final String getGender()
	{
		return Gender;
	}
	public final void setGender(String value)
	{
		Gender = value;
	}
	/** 
	 年龄段，
	 UNKNOWN-未知，
	 INFANT-婴幼儿，
	 KID-儿童，
	 CHILD-少年，
	 TEENAGER-青少年，
	 YOUNG-青年，
	 PRIME-壮年，
	 MIDDLE-中年，
	 MIDDLEAGED-中老年，
	 OLD-老年
	*/
	private String Age;
	public final String getAge()
	{
		return Age;
	}
	public final void setAge(String value)
	{
		Age = value;
	}
	/** 
	 指定查询是否戴眼镜， yes 是， no 否
	*/
	private String Glass;
	public final String getGlass()
	{
		return Glass;
	}
	public final void setGlass(String value)
	{
		Glass = value;
	}
	/** 
	 事件时间
	*/
	private String EventTime;
	public final String getEventTime()
	{
		return EventTime;
	}
	public final void setEventTime(String value)
	{
		EventTime = value;
	}
}