package xc.hikvisionsdk.ia.utils;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import java.util.*;

public final class FieldTypeValidator
{
	private static final HashMap<String, String> types = new HashMap<String, String>(Map.ofEntries(Map.entry("eq", "相等"), Map.entry("like", "相似"), Map.entry("lt", "小于"), Map.entry("gt", "大于"), Map.entry("lte", "小于等于"), Map.entry("gte", "大于相等"), Map.entry("in", "范围"), Map.entry("isNull", "为空"), Map.entry("notNull", "不为空"), Map.entry("neq", "不等于"), Map.entry("notIn", "不在范围")));
	public static void Vaild(String type)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(type))
		{
			throw new NullPointerException("type");
		}
		if (!types.containsKey(type))
		{
			throw new IndexOutOfBoundsException(type);
		}
	}
}