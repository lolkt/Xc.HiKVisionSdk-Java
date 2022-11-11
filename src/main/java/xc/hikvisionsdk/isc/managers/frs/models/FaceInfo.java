package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 人脸信息对象
*/
public class FaceInfo implements ICheckRequestItem
{
	/** 
	 人脸的名称,1~32个字符；不能包含 ' / \ : * ? " 
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
	/** 
	 人脸的性别信息，
	 1-男性，
	 2-女性，
	 UNKNOWN-未知
	*/
	private String Sex;
	public final String getSex()
	{
		return Sex;
	}
	public final void setSex(String value)
	{
		Sex = value;
	}
	/** 
	 人脸的证件类别，
	 111-身份证，
	 OTHER-其它证件
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
	 人脸的证件号码信。1~20个数字、字母。
	*/
	private String CertificateNum;
	public final String getCertificateNum()
	{
		return CertificateNum;
	}
	public final void setCertificateNum(String value)
	{
		CertificateNum = value;
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	*/
	public final void Check()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getName()))
		{
			throw new NullPointerException("Name");
		}
		if (!tangible.StringHelper.isNullOrWhiteSpace(getSex()))
		{
			if (!getSex().equals("1") || !getSex().equals("2") || !getSex().toUpperCase().equals("UNKNOWN"))
			{
				throw new IndexOutOfBoundsException("Sex", getSex(), "性别可选项为1,2,UNKNOWN");
			}
		}
		if (!tangible.StringHelper.isNullOrWhiteSpace(getCertificateNum()))
		{
			if (getCertificateNum().length() > 20)
			{
				throw new IndexOutOfBoundsException("CertificateNum", getCertificateNum().length(), "长度为1-20个数字、字母");
			}
		}
	}
}