package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 删除人脸分组请求
*/
public class FaceGroupBatchDeletionRequest extends BaseRequest
{
	/** 
	 通过indexCode集合查询指定的识别资源集合
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
	 删除人脸分组请求
	*/
	public FaceGroupBatchDeletionRequest()
	{
	}

	/** 
	 删除人脸分组请求
	 
	 @param indexCodes 分组的唯一标识
	*/
	public FaceGroupBatchDeletionRequest(String... indexCodes)
	{
		setIndexCodes(indexCodes);
	}

	/** 
	 
	*/
	@Override
	public void CheckParams()
	{
		if (getIndexCodes() == null)
		{
			throw new NullPointerException("IndexCodes");
		}
		if (getIndexCodes().length == 0)
		{
			throw new IndexOutOfBoundsException("IndexCodes");
		}
		if (getIndexCodes().Any(u -> tangible.StringHelper.isNullOrWhiteSpace(u)))
		{
			throw new NullPointerException("IndexCodes", "分组的唯一标识中有空字符串");
		}
	}


}