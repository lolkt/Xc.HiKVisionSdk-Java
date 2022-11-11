package xc.hikvisionsdk.models.request;

import xc.hikvisionsdk.*;

/** 
 操作符
*/
public enum RequestExpressionOperator
{

	/** 
	 等于
	*/
	Equal(0),
	/** 
	 大于等于
	*/
	NotLessThen(1),
	/** 
	 小于等于
	*/
	NotMoreThen(2),
	/** 
	 in
	*/
	In(3),
	/** 
	 not in
	*/
	NotIn(4),
	/** 
	 between
	*/
	Between(5),
	/** 
	 like
	*/
	Like(6),
	/** 
	 pre like
	*/
	PreLike(7),
	/** 
	 suffix like
	*/
	SuffixLike(8);


	public static final int SIZE = java.lang.Integer.SIZE;

	private int intValue;
	private static java.util.HashMap<Integer, RequestExpressionOperator> mappings;
	private static java.util.HashMap<Integer, RequestExpressionOperator> getMappings()
	{
		if (mappings == null)
		{
			synchronized (RequestExpressionOperator.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, RequestExpressionOperator>();
				}
			}
		}
		return mappings;
	}

	private RequestExpressionOperator(int value)
	{
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static RequestExpressionOperator forValue(int value)
	{
		return getMappings().get(value);
	}
}