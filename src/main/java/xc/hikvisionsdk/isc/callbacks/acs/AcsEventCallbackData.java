package xc.hikvisionsdk.isc.callbacks.acs;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 门禁事件回调数据
*/
public class AcsEventCallbackData
{
	/** 
	 人员通道号
	*/
	private int ExtAccessChannel;
	public final int getExtAccessChannel()
	{
		return ExtAccessChannel;
	}
	public final void setExtAccessChannel(int value)
	{
		ExtAccessChannel = value;
	}
	/** 
	 报警输入/防区通道
	*/
	private int ExtEventAlarmInID;
	public final int getExtEventAlarmInID()
	{
		return ExtEventAlarmInID;
	}
	public final void setExtEventAlarmInID(int value)
	{
		ExtEventAlarmInID = value;
	}
	/** 
	 报警输出通道
	*/
	private int ExtEventAlarmOutID;
	public final int getExtEventAlarmOutID()
	{
		return ExtEventAlarmOutID;
	}
	public final void setExtEventAlarmOutID(int value)
	{
		ExtEventAlarmOutID = value;
	}
	/** 
	 卡号
	*/
	private String ExtEventCardNo;
	public final String getExtEventCardNo()
	{
		return ExtEventCardNo;
	}
	public final void setExtEventCardNo(String value)
	{
		ExtEventCardNo = value;
	}
	/** 
	 事件输入通道
	*/
	private int ExtEventCaseID;
	public final int getExtEventCaseID()
	{
		return ExtEventCaseID;
	}
	public final void setExtEventCaseID(int value)
	{
		ExtEventCaseID = value;
	}
	/** 
	  	事件类型代码
	*/
	private int ExtEventCode;
	public final int getExtEventCode()
	{
		return ExtEventCode;
	}
	public final void setExtEventCode(int value)
	{
		ExtEventCode = value;
	}
	/** 
	 通道事件信息
	*/
	private ExtEventCustomerNumInfo ExtEventCustomerNumInfo;
	public final ExtEventCustomerNumInfo getExtEventCustomerNumInfo()
	{
		return ExtEventCustomerNumInfo;
	}
	public final void setExtEventCustomerNumInfo(ExtEventCustomerNumInfo value)
	{
		ExtEventCustomerNumInfo = value;
	}
	/** 
	 门编号
	*/
	private int ExtEventDoorID;
	public final int getExtEventDoorID()
	{
		return ExtEventDoorID;
	}
	public final void setExtEventDoorID(int value)
	{
		ExtEventDoorID = value;
	}
	/** 
	 身份证图片地址
	*/
	private String ExtEventIDCardPictureURL;
	public final String getExtEventIDCardPictureURL()
	{
		return ExtEventIDCardPictureURL;
	}
	public final void setExtEventIDCardPictureURL(String value)
	{
		ExtEventIDCardPictureURL = value;
	}
	/** 
	 人员身份证信息
	*/
	private ExtEventIdentityCardInfo ExtEventIdentityCardInfo;
	public final ExtEventIdentityCardInfo getExtEventIdentityCardInfo()
	{
		return ExtEventIdentityCardInfo;
	}
	public final void setExtEventIdentityCardInfo(ExtEventIdentityCardInfo value)
	{
		ExtEventIdentityCardInfo = value;
	}
	/** 
	 进出方向
	*/
	private int ExtEventInOut;
	public final int getExtEventInOut()
	{
		return ExtEventInOut;
	}
	public final void setExtEventInOut(int value)
	{
		ExtEventInOut = value;
	}
	/** 
	 就地控制器id
	*/
	private int ExtEventLocalControllerID;
	public final int getExtEventLocalControllerID()
	{
		return ExtEventLocalControllerID;
	}
	public final void setExtEventLocalControllerID(int value)
	{
		ExtEventLocalControllerID = value;
	}
	/** 
	 主设备拨码
	*/
	private int ExtEventMainDevID;
	public final int getExtEventMainDevID()
	{
		return ExtEventMainDevID;
	}
	public final void setExtEventMainDevID(int value)
	{
		ExtEventMainDevID = value;
	}
	/** 
	 人员编号
	*/
	private String ExtEventPersonNo;
	public final String getExtEventPersonNo()
	{
		return ExtEventPersonNo;
	}
	public final void setExtEventPersonNo(String value)
	{
		ExtEventPersonNo = value;
	}
	/** 
	 图片的url
	*/
	private String ExtEventPictureURL;
	public final String getExtEventPictureURL()
	{
		return ExtEventPictureURL;
	}
	public final void setExtEventPictureURL(String value)
	{
		ExtEventPictureURL = value;
	}
	/** 
	 读卡器id
	*/
	private int ExtEventReaderID;
	public final int getExtEventReaderID()
	{
		return ExtEventReaderID;
	}
	public final void setExtEventReaderID(int value)
	{
		ExtEventReaderID = value;
	}
	/** 
	 读卡器类别
	 0-无效
	 1-IC读卡器
	 2-身份证读卡器
	 3-二维码读卡器
	 4-指纹头
	*/
	private ExtEventReaderKind ExtEventReaderKind = ExtEventReaderKind.values()[0];
	public final ExtEventReaderKind getExtEventReaderKind()
	{
		return ExtEventReaderKind;
	}
	public final void setExtEventReaderKind(ExtEventReaderKind value)
	{
		ExtEventReaderKind = value;
	}
	/** 
	 报告上传通道
	 1-布防上传
	 2-中心组1上传
	 3-中心组2上传
	 为0无效
	*/
	private int ExtEventReportChannel;
	public final int getExtEventReportChannel()
	{
		return ExtEventReportChannel;
	}
	public final void setExtEventReportChannel(int value)
	{
		ExtEventReportChannel = value;
	}
	/** 
	 群组编号
	*/
	private int ExtEventRoleID;
	public final int getExtEventRoleID()
	{
		return ExtEventRoleID;
	}
	public final void setExtEventRoleID(int value)
	{
		ExtEventRoleID = value;
	}
	/** 
	 分控制器硬件ID
	*/
	private int ExtEventSubDevID;
	public final int getExtEventSubDevID()
	{
		return ExtEventSubDevID;
	}
	public final void setExtEventSubDevID(int value)
	{
		ExtEventSubDevID = value;
	}
	/** 
	 刷卡次数
	*/
	private int ExtEventSwipNum;
	public final int getExtEventSwipNum()
	{
		return ExtEventSwipNum;
	}
	public final void setExtEventSwipNum(int value)
	{
		ExtEventSwipNum = value;
	}
	/** 
	 事件类型
	 事件类型，如普通门禁事件为0,身份证信息事件为1，客流量统计为2
	*/
	private int ExtEventType;
	public final int getExtEventType()
	{
		return ExtEventType;
	}
	public final void setExtEventType(int value)
	{
		ExtEventType = value;
	}
	/** 
	 多重认证序号
	*/
	private int ExtEventVerifyID;
	public final int getExtEventVerifyID()
	{
		return ExtEventVerifyID;
	}
	public final void setExtEventVerifyID(int value)
	{
		ExtEventVerifyID = value;
	}
	/** 
	 白名单单号,1-8，为0无效
	*/
	private int ExtEventWhiteListNo;
	public final int getExtEventWhiteListNo()
	{
		return ExtEventWhiteListNo;
	}
	public final void setExtEventWhiteListNo(int value)
	{
		ExtEventWhiteListNo = value;
	}
	/** 
	 接收时间戳
	*/
	private String ExtReceiveTime;
	public final String getExtReceiveTime()
	{
		return ExtReceiveTime;
	}
	public final void setExtReceiveTime(String value)
	{
		ExtReceiveTime = value;
	}
	/** 
	 序列
	*/
	private int Seq;
	public final int getSeq()
	{
		return Seq;
	}
	public final void setSeq(int value)
	{
		Seq = value;
	}
	/** 
	 用户类
	*/
	private UserType UserType = UserType.values()[0];
	public final UserType getUserType()
	{
		return UserType;
	}
	public final void setUserType(UserType value)
	{
		UserType = value;
	}
	/** 
	  	String 图片服务器唯一编码
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
}