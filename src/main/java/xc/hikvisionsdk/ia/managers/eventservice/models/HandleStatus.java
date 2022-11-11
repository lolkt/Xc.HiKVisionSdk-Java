package xc.hikvisionsdk.ia.managers.eventservice.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.managers.*;
import xc.hikvisionsdk.ia.managers.eventservice.*;

/** 
 事件处理状态
*/
public enum HandleStatus
{
	/** 
	 未处理
	*/
	UnProcessed,
	/** 
	 已处理
	*/
	Processed;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static HandleStatus forValue(int value)
	{
		return values()[value];
	}
}