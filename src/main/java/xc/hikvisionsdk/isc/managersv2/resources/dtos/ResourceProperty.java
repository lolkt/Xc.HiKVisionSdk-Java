package xc.hikvisionsdk.isc.managersv2.resources.dtos;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managersv2.resources.*;

/** 
 资源属性
*/
public class ResourceProperty
{
	/** 
	  	属性id
	*/
	private String Id;
	public final String getId()
	{
		return Id;
	}
	public final void setId(String value)
	{
		Id = value;
	}
	/** 
	 属性名称
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
	 属性是否必输，0-非必输，1-必输
	*/
	private int Required;
	public final int getRequired()
	{
		return Required;
	}
	public final void setRequired(int value)
	{
		Required = value;
	}
	/** 
	 属性类型
	*/
	private String FieldType;
	public final String getFieldType()
	{
		return FieldType;
	}
	public final void setFieldType(String value)
	{
		FieldType = value;
	}
	/** 
	 属性描述
	*/
	private String Desc;
	public final String getDesc()
	{
		return Desc;
	}
	public final void setDesc(String value)
	{
		Desc = value;
	}
	/** 
	 属性最小长度
	*/
	private int MinLength;
	public final int getMinLength()
	{
		return MinLength;
	}
	public final void setMinLength(int value)
	{
		MinLength = value;
	}
	/** 
	 属性最大长度
	*/
	private int MaxLength;
	public final int getMaxLength()
	{
		return MaxLength;
	}
	public final void setMaxLength(int value)
	{
		MaxLength = value;
	}
	/** 
	 值类型
	*/
	private String ValueType;
	public final String getValueType()
	{
		return ValueType;
	}
	public final void setValueType(String value)
	{
		ValueType = value;
	}
	/** 
	 是否是备选主键
	*/
	private int OptionKey;
	public final int getOptionKey()
	{
		return OptionKey;
	}
	public final void setOptionKey(int value)
	{
		OptionKey = value;
	}
	/** 
	 是否是主键
	*/
	private int Key;
	public final int getKey()
	{
		return Key;
	}
	public final void setKey(int value)
	{
		Key = value;
	}
	/** 
	 属性正则表达式
	*/
	private String Regular;
	public final String getRegular()
	{
		return Regular;
	}
	public final void setRegular(String value)
	{
		Regular = value;
	}
	/** 
	 是否唯一
	*/
	private int Unique;
	public final int getUnique()
	{
		return Unique;
	}
	public final void setUnique(int value)
	{
		Unique = value;
	}
	/** 
	 ldap中属性名称
	*/
	private String LdapName;
	public final String getLdapName()
	{
		return LdapName;
	}
	public final void setLdapName(String value)
	{
		LdapName = value;
	}
	/** 
	 ldap中模型
	*/
	private String ObjectClass;
	public final String getObjectClass()
	{
		return ObjectClass;
	}
	public final void setObjectClass(String value)
	{
		ObjectClass = value;
	}

	/** 
	 属性是否必输
	*/
	public final boolean isRequired()
	{
		return getRequired() != 0;
	}
	/** 
	 是否是备选主键
	*/
	public final boolean isOptionKey()
	{
		return getOptionKey() != 0;
	}
	/** 
	 是否是主键
	*/
	public final boolean isKey()
	{
		return getKey() != 0;
	}
	/** 
	 是否唯一
	*/
	public final boolean isUnique()
	{
		return getUnique() != 0;
	}
}