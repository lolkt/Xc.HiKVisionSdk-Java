package xc.hikvisionsdk.isc.managers.resource.models.person;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.resource.*;

/** 
 根据证件号码获取单个人员信息请求
*/
public class CertificateNoPersonInfoRequest extends BaseRequest
{
	/** 
	 证件号码
	*/
	private String CertificateNo;
	public final String getCertificateNo()
	{
		return CertificateNo;
	}
	public final void setCertificateNo(String value)
	{
		CertificateNo = value;
	}
	/** 
	 证件类型
	 111:身份证
	 414:护照
	 113:户口簿
	 335:驾驶证
	 131:工作证
	 133:学生证
	 990:其他
	 平台上人员信息实名标识选择为身份证件时必填
	*/
	private int CertificateType;
	public final int getCertificateType()
	{
		return CertificateType;
	}
	public final void setCertificateType(int value)
	{
		CertificateType = value;
	}

	/** 
	 根据证件号码获取单个人员信息请求
	 
	 @param certificateNo 证件号码
	 @param certificateType 证件类型
	*/
	public CertificateNoPersonInfoRequest(String certificateNo, int certificateType)
	{
		setCertificateNo(certificateNo);
		setCertificateType(certificateType);
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	*/
	@Override
	public void CheckParams()
	{

		if (tangible.StringHelper.isNullOrWhiteSpace(getCertificateNo()))
		{
			throw new NullPointerException("CertificateNo");
		}

	}

}