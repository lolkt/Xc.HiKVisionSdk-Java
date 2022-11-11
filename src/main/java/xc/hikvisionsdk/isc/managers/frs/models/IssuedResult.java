package xc.hikvisionsdk.isc.managers.frs.models;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.managers.*;
import xc.hikvisionsdk.isc.managers.frs.*;

/** 
 下发结果
*/
public class IssuedResult
{
	/** 
	 唯一标识
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
	 下发项的类型,
	 FACE-人脸
	 FACE_GROUP-人脸分组
	 CHANNEL-监控点通道
	*/
	private String DataType;
	public final String getDataType()
	{
		return DataType;
	}
	public final void setDataType(String value)
	{
		DataType = value;
	}

	/** 
	 下发项的结果
	*/
	private String ErrorCode;
	public final String getErrorCode()
	{
		return ErrorCode;
	}
	public final void setErrorCode(String value)
	{
		ErrorCode = value;
	}


}