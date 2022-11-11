package xc.hikvisionsdk.isc.managers.acs.models;

import xc.hikvisionsdk.isc.enums.acs.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.acs.*;

/** 
 查询门禁点事件V2结果数据
*/
public class DoorEventsV2ResponseData
{

	/** 
	 事件ID，唯一标识这个事件
	*/
	private String EventId;
	public final String getEventId()
	{
		return EventId;
	}
	public final void setEventId(String value)
	{
		EventId = value;
	}
	/** 
	 事件名称
	*/
	private String EventName;
	public final String getEventName()
	{
		return EventName;
	}
	public final void setEventName(String value)
	{
		EventName = value;
	}
	/** 
	 事件产生时间，参考附录B ISO8601时间格式说明
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
	/** 
	 人员唯一编码
	*/
	private String PersonId;
	public final String getPersonId()
	{
		return PersonId;
	}
	public final void setPersonId(String value)
	{
		PersonId = value;
	}
	/** 
	 卡号
	*/
	private String CardNo;
	public final String getCardNo()
	{
		return CardNo;
	}
	public final void setCardNo(String value)
	{
		CardNo = value;
	}
	/** 
	 人员名称
	*/
	private String PersonName;
	public final String getPersonName()
	{
		return PersonName;
	}
	public final void setPersonName(String value)
	{
		PersonName = value;
	}
	/** 
	 人员所属组织编码
	*/
	private String OrgIndexCode;
	public final String getOrgIndexCode()
	{
		return OrgIndexCode;
	}
	public final void setOrgIndexCode(String value)
	{
		OrgIndexCode = value;
	}
	/** 
	 人员所属组织名称
	*/
	private String OrgName;
	public final String getOrgName()
	{
		return OrgName;
	}
	public final void setOrgName(String value)
	{
		OrgName = value;
	}
	/** 
	 门禁点名称
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
	 门禁点编码
	*/
	private String DoorIndexCode;
	public final String getDoorIndexCode()
	{
		return DoorIndexCode;
	}
	public final void setDoorIndexCode(String value)
	{
		DoorIndexCode = value;
	}
	/** 
	 门禁点所在区域编码
	*/
	private String DoorRegionIndexCode;
	public final String getDoorRegionIndexCode()
	{
		return DoorRegionIndexCode;
	}
	public final void setDoorRegionIndexCode(String value)
	{
		DoorRegionIndexCode = value;
	}
	/** 
	 抓拍图片地址，通过接口获取门禁事件的图片接口获取门禁事件的图片数据
	*/
	private String PicUri;
	public final String getPicUri()
	{
		return PicUri;
	}
	public final void setPicUri(String value)
	{
		PicUri = value;
	}
	/** 
	 图片存储服务的唯一标识
	*/
	private String SvrIndexCode;
	public final String getSvrIndexCode()
	{
		return SvrIndexCode;
	}
	public final void setSvrIndexCode(String value)
	{
		SvrIndexCode = value;
	}
	/** 
	 事件类型，参考附录D2.1 门禁事件
	*/
	private int EventType;
	public final int getEventType()
	{
		return EventType;
	}
	public final void setEventType(int value)
	{
		EventType = value;
	}
	/** 
	 进出类型(1：进
	 0：出
	 -1:未知
	 要求：进门读卡器拨码设置为1，出门读卡器拨码设置为2)
	*/
	private InAndOutType InAndOutType = InAndOutType.values()[0];
	public final InAndOutType getInAndOutType()
	{
		return InAndOutType;
	}
	public final void setInAndOutType(InAndOutType value)
	{
		InAndOutType = value;
	}
	/** 
	 读卡器IndexCode
	*/
	private String ReaderDevIndexCode;
	public final String getReaderDevIndexCode()
	{
		return ReaderDevIndexCode;
	}
	public final void setReaderDevIndexCode(String value)
	{
		ReaderDevIndexCode = value;
	}
	/** 
	 读卡器名称
	*/
	private String ReaderDevName;
	public final String getReaderDevName()
	{
		return ReaderDevName;
	}
	public final void setReaderDevName(String value)
	{
		ReaderDevName = value;
	}
	/** 
	 控制器设备IndexCode
	*/
	private String DevIndexCode;
	public final String getDevIndexCode()
	{
		return DevIndexCode;
	}
	public final void setDevIndexCode(String value)
	{
		DevIndexCode = value;
	}
	/** 
	 控制器名称
	*/
	private String DevName;
	public final String getDevName()
	{
		return DevName;
	}
	public final void setDevName(String value)
	{
		DevName = value;
	}
	/** 
	 身份证图片uri，它是一个相对地址，可以通过获取门禁事件的图片接口，获取到图片的数据
	*/
	private String IdentityCardUri;
	public final String getIdentityCardUri()
	{
		return IdentityCardUri;
	}
	public final void setIdentityCardUri(String value)
	{
		IdentityCardUri = value;
	}
	/** 
	 事件入库时间，参考附录B ISO8601时间格式说明
	*/
	private String ReceiveTime;
	public final String getReceiveTime()
	{
		return ReceiveTime;
	}
	public final void setReceiveTime(String value)
	{
		ReceiveTime = value;
	}
	/** 
	 工号
	*/
	private String JobNo;
	public final String getJobNo()
	{
		return JobNo;
	}
	public final void setJobNo(String value)
	{
		JobNo = value;
	}
	/** 
	 学号
	*/
	private String StudentId;
	public final String getStudentId()
	{
		return StudentId;
	}
	public final void setStudentId(String value)
	{
		StudentId = value;
	}
	/** 
	 证件号码
	*/
	private String CertNo;
	public final String getCertNo()
	{
		return CertNo;
	}
	public final void setCertNo(String value)
	{
		CertNo = value;
	}
}