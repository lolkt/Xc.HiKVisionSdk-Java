package xc.hikvisionsdk.ia.models.request;

import xc.hikvisionsdk.ia.utils.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.models.*;

/** 
 查询参数
*/
public class FieldOption
{
	/** 
	 
	 
	 @param fieldName 查询字段名称
	 @param fieldValue 查询字段值
	 @param type 查询类型
	*/
	public FieldOption(String fieldName, String fieldValue, String type)
	{
		if (tangible.StringHelper.isNullOrEmpty(fieldName))
		{
			throw new NullPointerException("fieldName");
		}

		if (tangible.StringHelper.isNullOrEmpty(fieldValue))
		{
			throw new NullPointerException("fieldName");
		}

		FieldTypeValidator.Vaild(type);

		FieldName = fieldName;
		FieldValue = fieldValue;
		Type = type;
	}

	/** 
	 查询字段名称
	*/
	private String FieldName;
	public final String getFieldName()
	{
		return FieldName;
	}

	/** 
	 查询字段值
	*/
	private String FieldValue;
	public final String getFieldValue()
	{
		return FieldValue;
	}

	/** 
	 查询类型:
	 eq相等,like相似，lt小于，gt大于,lte小于等于，gte大于等于，in范围（不超过32767个），isNull为空，notNull不为空，neq不等于，notIn不在范围。
	 注：时间类型时，以下几种时间格式均支持：2020-11-10 11:00:00、2020-11-10T05:50:26Z
	*/
	private String Type;
	public final String getType()
	{
		return Type;
	}


}