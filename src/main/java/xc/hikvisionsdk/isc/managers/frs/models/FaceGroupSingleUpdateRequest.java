package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 单个修改人脸分组请求
*/
public class FaceGroupSingleUpdateRequest extends BaseRequest
{
	/** 
	 人脸分组的唯一标识,可从按条件查询人脸分组获取
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
	 人脸分组的名称,1~32个字符；不能包含 ' / \ : * ? " 
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
	 人脸分组的描述，1~128个字符
	*/
	private String Description;
	public final String getDescription()
	{
		return Description;
	}
	public final void setDescription(String value)
	{
		Description = value;
	}

	/** 
	 单个修改人脸分组请求
	*/
	public FaceGroupSingleUpdateRequest()
	{
	}

	/** 
	 单个修改人脸分组请求
	 
	 @param indexCode 人脸分组的唯一标识
	 @param name 人脸分组的名称
	 @param description 人脸分组的描述
	*/
	public FaceGroupSingleUpdateRequest(String indexCode, String name, String description)
	{
		setIndexCode(indexCode);
		setName(name);
		setDescription(description);
	}


	/** 
	 
	*/
	@Override
	public void CheckParams()
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(getIndexCode()))
		{
			throw new NullPointerException("IndexCode");
		}
		if (tangible.StringHelper.isNullOrWhiteSpace(getName()))
		{
			throw new NullPointerException("Name");
		}
		if (tangible.StringHelper.isNullOrWhiteSpace(getDescription()))
		{
			throw new NullPointerException("Description");
		}
		if (getName().length() > 32)
		{
			throw new IndexOutOfBoundsException("Name", getName().length(), "长度超过32个字符");

		}
		if (getDescription().length() > 128)
		{
			throw new IndexOutOfBoundsException("Description", getDescription().length(), "长度超过128个字符");
		}
	}
}