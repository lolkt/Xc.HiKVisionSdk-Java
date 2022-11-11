package xc.hikvisionsdk.isc.callbacks.frs.capture;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;
import xc.hikvisionsdk.isc.callbacks.frs.*;

/** 
 抓拍结果
*/
public class CaptureResult
{
	/** 
	 人脸信息
	*/
	private FaceInfo[] Faces;
	public final FaceInfo[] getFaces()
	{
		return Faces;
	}
	public final void setFaces(FaceInfo[] value)
	{
		Faces = value;
	}
	/** 
	 目标属性
	*/
	private TargetAttr TargetAttrs;
	public final TargetAttr getTargetAttrs()
	{
		return TargetAttrs;
	}
	public final void setTargetAttrs(TargetAttr value)
	{
		TargetAttrs = value;
	}
}