package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 人脸批量拷贝
*/
public class FaceBatchCopyRequest extends BaseRequest
{
	/** 
	 待拷贝的若干人脸唯一标识集合，，可从按条件批量查询人脸获取
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
	 目标人脸分组的唯一标识集合，，可从按条件查询人脸分组获取
	*/
	private String[] FaceGroupIndexCodes;
	public final String[] getFaceGroupIndexCodes()
	{
		return FaceGroupIndexCodes;
	}
	public final void setFaceGroupIndexCodes(String[] value)
	{
		FaceGroupIndexCodes = value;
	}

	/** 
	 人脸批量拷贝
	*/
	public FaceBatchCopyRequest()
	{
	}

	/** 
	 人脸批量拷贝
	 
	 @param indexCodes 待拷贝的若干人脸唯一标识集合
	 @param faceGroupIndexCodes 目标人脸分组的唯一标识集合
	*/
	public FaceBatchCopyRequest(String[] indexCodes, String[] faceGroupIndexCodes)
	{
		setIndexCodes(indexCodes);
		setFaceGroupIndexCodes(faceGroupIndexCodes);
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	 @exception ArgumentOutOfRangeException
	*/
	@Override
	public void CheckParams()
	{
		if (getIndexCodes() == null)
		{
			throw new NullPointerException("IndexCodes");
		}
		if (getFaceGroupIndexCodes() == null)
		{
			throw new NullPointerException("FaceGroupIndexCodes");
		}

		if (getIndexCodes().length > 1000 || getIndexCodes().length == 0)
		{
			throw new IndexOutOfBoundsException("IndexCodes", getIndexCodes().length, "1 到 1000张图片");
		}

		if (getFaceGroupIndexCodes().length > 16 || getFaceGroupIndexCodes().length == 0)
		{
			throw new IndexOutOfBoundsException("IndexCodes", getFaceGroupIndexCodes().length, "1 到 16 个分组");
		}
	}
}