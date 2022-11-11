package xc.hikvisionsdk.isc.managersv2.cards.dtos;

import xc.hikvisionsdk.isc.enums.resource.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.cards.*;

/** 
 生成卡片二维码请求
*/
public class GenerateBarCodeRequest extends BaseRequest
{


	/** 
	 人员ID，cardNo存在的情况下 人员ID可不填，根据获取人员列表v2接口获取返回参数personId
	*/
	private String PersonId;
	public final String getPersonId()
	{
		return PersonId;
	}
	/** 
	 卡号
	*/
	private String CardNo;
	public final String getCardNo()
	{
		return CardNo;
	}
	/** 
	 证件类型，当人员唯一标示是证件类型+证件号码时必填，111:身份证,414:护照,113:户口簿,335:驾驶证,131:工作证,133:学生证,990:其他
	*/
	private CertificateType CertType = null;
	public final CertificateType getCertType()
	{
		return CertType;
	}
	/** 
	 证件号码，当人员唯一标示是证件类型+证件号码时必填，根据获取人员列表v2接口获取返回参数certificateNo
	*/
	private String CertNum;
	public final String getCertNum()
	{
		return CertNum;
	}
	/** 
	 手机号码，当人员唯一标示是手机号码时必填根据获取人员列表v2接口获取返回参数phoneNo
	*/
	private String Phone;
	public final String getPhone()
	{
		return Phone;
	}
	/** 
	 职工号，当人员唯一标示是工号时必填，根据获取人员列表v2接口获取返回参数jobNo
	*/
	private String EmployeeId;
	public final String getEmployeeId()
	{
		return EmployeeId;
	}
	/** 
	 人员卡片二维码有效期时长，非必填字段，单位为分钟，范围为[5~7*24*60]分钟，不传默认为24*60分钟
	*/
	private int Duration;
	public final int getDuration()
	{
		return Duration;
	}
	/** 
	 最大开锁次数，其中针对同一台设备最大开锁次数不超过指定的次数，不传默认最大开锁次数为4次
	*/
	private int MaxLock;
	public final int getMaxLock()
	{
		return MaxLock;
	}

	/** 
	 生成卡片二维码请求
	 
	 @param personId 人员ID，cardNo存在的情况下 人员ID可不填，根据获取人员列表v2接口获取返回参数personId
	 @param cardNo 卡号
	 @param certType 证件类型，当人员唯一标示是证件类型+证件号码时必填，111:身份证,414:护照,113:户口簿,335:驾驶证,131:工作证,133:学生证,990:其他
	 @param certNum 证件号码，当人员唯一标示是证件类型+证件号码时必填，根据获取人员列表v2接口获取返回参数certificateNo
	 @param phone 手机号码，当人员唯一标示是手机号码时必填根据获取人员列表v2接口获取返回参数phoneNo
	 @param employeeId 职工号，当人员唯一标示是工号时必填，根据获取人员列表v2接口获取返回参数jobNo
	 @param duration 人员卡片二维码有效期时长，非必填字段，单位为分钟，范围为[5~7*24*60]分钟，不传默认为24*60分钟
	 @param maxLock 最大开锁次数，其中针对同一台设备最大开锁次数不超过指定的次数，不传默认最大开锁次数为4次
	*/

	protected GenerateBarCodeRequest(String personId, String cardNo, CertificateType certType, String certNum, String phone, String employeeId, int duration)
	{
		this(personId, cardNo, certType, certNum, phone, employeeId, duration, 4);
	}

	protected GenerateBarCodeRequest(String personId, String cardNo, CertificateType certType, String certNum, String phone, String employeeId)
	{
		this(personId, cardNo, certType, certNum, phone, employeeId, 1440, 4);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: protected GenerateBarCodeRequest(string personId, string cardNo, System.Nullable<CertificateType> certType, string certNum, string phone, string employeeId, int duration = 1440, int maxLock = 4)
	protected GenerateBarCodeRequest(String personId, String cardNo, CertificateType certType, String certNum, String phone, String employeeId, int duration, int maxLock)
	{
		PersonId = personId;
		CardNo = cardNo;
		CertType = certType;
		CertNum = certNum;
		Phone = phone;
		EmployeeId = employeeId;
		Duration = duration;
		MaxLock = maxLock;
	}

	/** 
	 使用人员ID创建
	 
	 @param personId 人员ID，cardNo存在的情况下 人员ID可不填，根据获取人员列表v2接口获取返回参数personId
	 @param duration 人员卡片二维码有效期时长，非必填字段，单位为分钟，范围为[5~7*24*60]分钟，不传默认为24*60分钟
	 @param maxLock 最大开锁次数，其中针对同一台设备最大开锁次数不超过指定的次数，不传默认最大开锁次数为4次
	*/

	public static GenerateBarCodeRequest NewByPersonId(String personId, int duration)
	{
		return NewByPersonId(personId, duration, 4);
	}

	public static GenerateBarCodeRequest NewByPersonId(String personId)
	{
		return NewByPersonId(personId, 1440, 4);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static GenerateBarCodeRequest NewByPersonId(string personId, int duration = 1440, int maxLock = 4)
	public static GenerateBarCodeRequest NewByPersonId(String personId, int duration, int maxLock)
	{
		if (tangible.StringHelper.isNullOrEmpty(personId))
		{
			throw new NullPointerException("personId");
		}
		return new GenerateBarCodeRequest(personId, "", null, "", "", "", duration, maxLock);
	}

	/** 
	 使用证件创建
	 
	 @param certType 证件类型，当人员唯一标示是证件类型+证件号码时必填，111:身份证,414:护照,113:户口簿,335:驾驶证,131:工作证,133:学生证,990:其他
	 @param certNum 证件号码，当人员唯一标示是证件类型+证件号码时必填，根据获取人员列表v2接口获取返回参数certificateNo
	 @param duration 人员卡片二维码有效期时长，非必填字段，单位为分钟，范围为[5~7*24*60]分钟，不传默认为24*60分钟
	 @param maxLock 最大开锁次数，其中针对同一台设备最大开锁次数不超过指定的次数，不传默认最大开锁次数为4次
	*/

	public static GenerateBarCodeRequest NewByCert(CertificateType certType, String certNum, int duration)
	{
		return NewByCert(certType, certNum, duration, 4);
	}

	public static GenerateBarCodeRequest NewByCert(CertificateType certType, String certNum)
	{
		return NewByCert(certType, certNum, 1440, 4);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static GenerateBarCodeRequest NewByCert(CertificateType certType, string certNum, int duration = 1440, int maxLock = 4)
	public static GenerateBarCodeRequest NewByCert(CertificateType certType, String certNum, int duration, int maxLock)
	{
		if (tangible.StringHelper.isNullOrEmpty(certNum))
		{
			throw new NullPointerException("certNum");
		}
		return new GenerateBarCodeRequest("", "", certType, certNum, "", "", duration, maxLock);
	}

	/** 
	 使用卡号创建
	 
	 @param cardNo 卡号
	 @param duration 人员卡片二维码有效期时长，非必填字段，单位为分钟，范围为[5~7*24*60]分钟，不传默认为24*60分钟
	 @param maxLock 最大开锁次数，其中针对同一台设备最大开锁次数不超过指定的次数，不传默认最大开锁次数为4次
	 @return 
	*/

	public static GenerateBarCodeRequest NewByCardNo(String cardNo, int duration)
	{
		return NewByCardNo(cardNo, duration, 4);
	}

	public static GenerateBarCodeRequest NewByCardNo(String cardNo)
	{
		return NewByCardNo(cardNo, 1440, 4);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static GenerateBarCodeRequest NewByCardNo(string cardNo, int duration = 1440, int maxLock = 4)
	public static GenerateBarCodeRequest NewByCardNo(String cardNo, int duration, int maxLock)
	{
		if (tangible.StringHelper.isNullOrEmpty(cardNo))
		{
			throw new NullPointerException("cardNo");
		}
		return new GenerateBarCodeRequest("", cardNo, null, "", "", "", duration, maxLock);
	}

	/** 
	 使用手机号创建
	 
	 @param phone 手机号码，当人员唯一标示是手机号码时必填根据获取人员列表v2接口获取返回参数phoneNo
	 @param duration 人员卡片二维码有效期时长，非必填字段，单位为分钟，范围为[5~7*24*60]分钟，不传默认为24*60分钟
	 @param maxLock 最大开锁次数，其中针对同一台设备最大开锁次数不超过指定的次数，不传默认最大开锁次数为4次
	 @return 
	*/

	public static GenerateBarCodeRequest NewByPhone(String phone, int duration)
	{
		return NewByPhone(phone, duration, 4);
	}

	public static GenerateBarCodeRequest NewByPhone(String phone)
	{
		return NewByPhone(phone, 1440, 4);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static GenerateBarCodeRequest NewByPhone(string phone, int duration = 1440, int maxLock = 4)
	public static GenerateBarCodeRequest NewByPhone(String phone, int duration, int maxLock)
	{
		if (tangible.StringHelper.isNullOrEmpty(phone))
		{
			throw new NullPointerException("phone");
		}
		return new GenerateBarCodeRequest("", "", null, "", phone, "", duration, maxLock);
	}

	/** 
	 使用职工号创建
	 
	 @param employeeId 职工号，当人员唯一标示是工号时必填，根据获取人员列表v2接口获取返回参数jobNo
	 @param duration 人员卡片二维码有效期时长，非必填字段，单位为分钟，范围为[5~7*24*60]分钟，不传默认为24*60分钟
	 @param maxLock 最大开锁次数，其中针对同一台设备最大开锁次数不超过指定的次数，不传默认最大开锁次数为4次
	 @return 
	*/

	public static GenerateBarCodeRequest NewByEmployeeId(String employeeId, int duration)
	{
		return NewByEmployeeId(employeeId, duration, 4);
	}

	public static GenerateBarCodeRequest NewByEmployeeId(String employeeId)
	{
		return NewByEmployeeId(employeeId, 1440, 4);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public static GenerateBarCodeRequest NewByEmployeeId(string employeeId, int duration = 1440, int maxLock = 4)
	public static GenerateBarCodeRequest NewByEmployeeId(String employeeId, int duration, int maxLock)
	{
		if (tangible.StringHelper.isNullOrEmpty(employeeId))
		{
			throw new NullPointerException("employeeId");
		}
		return new GenerateBarCodeRequest("", "", null, "", "", employeeId, duration, maxLock);
	}
}