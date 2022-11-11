package xc.hikvisionsdk.dictionaries;

import xc.hikvisionsdk.*;

public class DictionariesCodeTextItem
{
	public DictionariesCodeTextItem(String code, String name)
	{
		setCode(code);
		setText(name);
	}

	private String Code;
	public final String getCode()
	{
		return Code;
	}
	public final void setCode(String value)
	{
		Code = value;
	}
	private String Text;
	public final String getText()
	{
		return Text;
	}
	public final void setText(String value)
	{
		Text = value;
	}
}