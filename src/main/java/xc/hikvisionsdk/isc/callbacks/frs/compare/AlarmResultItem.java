package xc.hikvisionsdk.isc.callbacks.frs.compare;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;
import xc.hikvisionsdk.isc.callbacks.frs.*;

/** 
 比对结果
*/
public class AlarmResultItem
{
	/** 
	 人脸信息
	*/
	private FacesItem[] Faces;
	public final FacesItem[] getFaces()
	{
		return Faces;
	}
	public final void setFaces(FacesItem[] value)
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