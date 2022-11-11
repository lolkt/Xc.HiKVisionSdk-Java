package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 人脸批量添加请求项
*/
public class FaceBatchAdditionRequestItem implements ICheckRequestItem
{
	/** 
	 人脸唯一标识，单次批量添加操作，不允许重复。
	*/
	private String IndexCode;
	public final String getIndexCode()
	{
		return IndexCode;
	}
	public final void setIndexCode(String value)
	{
		IndexCode = value;
	}
	/** 
	 指定人脸添加到的人脸分组的唯一标识,人脸监控应用服务会校验该值的有效性，可从按条件查询人脸分组获取
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
	 人脸批量添加请求项
	*/
	public FaceBatchAdditionRequestItem()
	{
	}

	/** 
	 人脸批量添加请求项
	 
	 @param indexCode 人脸唯一标识
	 @param faceGroupIndexCode 指定人脸添加到的人脸分组的唯一标识
	*/
	public FaceBatchAdditionRequestItem(String indexCode, String faceGroupIndexCode)
	{
		setIndexCode(indexCode);
		setFaceGroupIndexCode(faceGroupIndexCode);
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	*/
	public final void Check()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getIndexCode()))
		{
			throw new NullPointerException("IndexCode");
		}
		if (tangible.StringHelper.isNullOrWhiteSpace(getFaceGroupIndexCode()))
		{
			throw new NullPointerException("FaceGroupIndexCode");
		}
	}
}