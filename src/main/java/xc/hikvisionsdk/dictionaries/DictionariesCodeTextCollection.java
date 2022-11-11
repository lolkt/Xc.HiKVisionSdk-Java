package xc.hikvisionsdk.dictionaries;

import xc.hikvisionsdk.*;
import java.util.*;

public class DictionariesCodeTextCollection
{
	private static HashMap<String, DictionariesCodeTextItem> _collection = new HashMap<String, DictionariesCodeTextItem>();
	private static String defaultKey;


	public final void Add(String code, String text)
	{
		Add(code, text, false);
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: internal void Add(string code, string text, bool isDefault = false)
	public final void Add(String code, String text, boolean isDefault)
	{
		_collection.put(code.toLowerCase(), new DictionariesCodeTextItem(code, text));
		if (isDefault)
		{
			defaultKey = code.toLowerCase();
		}
	}

	public final DictionariesCodeTextItem Get(String key)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(key))
		{
			return null;
		}
		key = key.toLowerCase();


		if (_collection.containsKey(key))
		{
			return _collection.get(key);
		}
		return null;
	}

	/** 
	 
	 
	 @param key
	 @return 
	 @exception System.ArgumentOutOfRangeException
	*/
	public final DictionariesCodeTextItem GetOrDefault(String key)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(key))
		{
			if (!tangible.StringHelper.isNullOrWhiteSpace(defaultKey))
			{
				return _collection.get(defaultKey);
			}
			return null;
		}
		key = key.toLowerCase();

		if (_collection.containsKey(key))
		{
			return _collection.get(key);
		}
		if (!tangible.StringHelper.isNullOrWhiteSpace(defaultKey))
		{
			return _collection.get(defaultKey);
		}
		throw new IndexOutOfBoundsException(key);

	}
}