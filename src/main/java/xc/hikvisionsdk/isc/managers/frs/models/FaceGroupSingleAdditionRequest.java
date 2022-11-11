package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 人脸分组新增请求
*/
public class FaceGroupSingleAdditionRequest extends BaseRequest
{
	/** 
	 人脸分组的名称，1~32个字符；不能包含 ' / \ : * ? " 
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
	 分组的描述，1~128个字符
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
	 人脸分组新增请求
	*/
	public FaceGroupSingleAdditionRequest()
	{
	}

	/** 
	 人脸分组新增请求
	 
	 @param name 人脸分组的名称
	 @param description 分组的描述
	*/
	public FaceGroupSingleAdditionRequest(String name, String description)
	{
		setName(name);
		setDescription(description);
	}

	/** 
	 
	 
	 @exception ArgumentNullException
	 @exception ArgumentOutOfRangeException
	*/
	@Override
	public void CheckParams()
	{

		if (tangible.StringHelper.isNullOrWhiteSpace(getName()))
		{
			throw new NullPointerException("Name");
		}
		if (getName().length() > 32)
		{
			throw new IndexOutOfBoundsException("Name", getName().length(), "长度不能超过32个字符");

		}
		if (tangible.StringHelper.isNullOrWhiteSpace(getDescription()))
		{
			throw new NullPointerException("Description");
		}
		if (getDescription().length() > 128)
		{
			throw new IndexOutOfBoundsException("Description", getDescription().length(), "长度不能超过128个字符");
		}
	}
}