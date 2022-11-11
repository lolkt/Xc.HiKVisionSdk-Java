package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 批量删除人脸请求
*/
public class FaceBatchDeletionRequest extends BaseRequest
{


	/** 
	 人脸的唯一标识集合，可从按条件批量查询人脸获取
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
	 人脸分组的唯一标识，可从按条件查询人脸分组获取
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
	 批量删除人脸请求
	*/
	public FaceBatchDeletionRequest()
	{
	}

	/** 
	 批量删除人脸请求
	 
	 @param faceGroupIndexCode 人脸分组的唯一标识
	 @param indexCodes 人脸的唯一标识集合
	*/
	public FaceBatchDeletionRequest(String faceGroupIndexCode, String... indexCodes)
	{
		setIndexCodes(indexCodes);
		setFaceGroupIndexCode(faceGroupIndexCode);
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	 @exception ArgumentOutOfRangeException
	*/
	@Override
	public void CheckParams()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getFaceGroupIndexCode()))
		{
			throw new NullPointerException("FaceGroupIndexCode");
		}
		if (getIndexCodes() == null)
		{
			throw new NullPointerException("IndexCodes");

		}
		if (getIndexCodes().length == 0 || getIndexCodes().length > 1000)
		{
			throw new IndexOutOfBoundsException("IndexCodes", getIndexCodes().length, "一次性最多从一个分组内删除1000个人脸");
		}
	}
}