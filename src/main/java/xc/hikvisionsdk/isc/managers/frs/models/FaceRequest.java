package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 按条件批量查询人脸
*/
public class FaceRequest extends PagedRequest
{
	/** 
	 通过人脸的唯一标识集合查询指定的人脸集合
	*/
	private String[] IndexCodes;
	public final String[] getIndexCodes()
	{
		return IndexCodes;
	}
	public final void setIndexCodes(String[] value)
	{
		IndexCodes = value;
	}
	/** 
	 根据人脸所属的分组搜索该分组下符合条件的人脸
	*/
	private String FaceGroupIndexCode;
	public final String getFaceGroupIndexCode()
	{
		return FaceGroupIndexCode;
	}
	public final void setFaceGroupIndexCode(String value)
	{
		FaceGroupIndexCode = value;
	}

	/** 
	 人脸名称模糊查询
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
	 人脸的证件号码模糊查询
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
	 按条件批量查询人脸
	*/
	public FaceRequest()
	{
	}

	/** 
	 按条件批量查询人脸
	 
	 @param pageNo 页码
	 @param pageSize 页尺
	*/
	public FaceRequest(int pageNo, int pageSize)
	{
		super(pageNo, pageSize);
	}

}