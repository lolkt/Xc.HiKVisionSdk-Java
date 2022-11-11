package xc.hikvisionsdk.isc.callbacks.frs.compare;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;
import xc.hikvisionsdk.isc.callbacks.frs.*;

/** 
 预留字段
*/
public class ReserveField
{
	/** 
	 出生日期，格式形如20000101
	*/
	private String BornTime;
	public final String getBornTime()
	{
		return BornTime;
	}
	public final void setBornTime(String value)
	{
		BornTime = value;
	}
	/** 
	 证件号码
	*/
	private String CertificateNumber;
	public final String getCertificateNumber()
	{
		return CertificateNumber;
	}
	public final void setCertificateNumber(String value)
	{
		CertificateNumber = value;
	}
	/** 
	 证件类型
	 见数据字典附录A.47 设备证件类型
	*/
	private String CertificateType;
	public final String getCertificateType()
	{
		return CertificateType;
	}
	public final void setCertificateType(String value)
	{
		CertificateType = value;
	}
	/** 
	 性别类型
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
	 人脸姓名
	*/
	private String Name;
	public final String getName()
	{
		return Name;
	}
	public final void setName(String value)
	{
		Name = value;
	}
}