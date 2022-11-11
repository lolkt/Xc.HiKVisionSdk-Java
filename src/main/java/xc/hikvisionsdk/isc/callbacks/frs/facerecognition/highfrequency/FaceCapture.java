package xc.hikvisionsdk.isc.callbacks.frs.facerecognition.highfrequency;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;
import xc.hikvisionsdk.isc.callbacks.frs.*;
import xc.hikvisionsdk.isc.callbacks.frs.facerecognition.*;

/** 
 识别结果
*/
public class FaceCapture
{
	/** 
	 
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
	 
	*/
	private String RecordDataIndex;
	public final String getRecordDataIndex()
	{
		return RecordDataIndex;
	}
	public final void setRecordDataIndex(String value)
	{
		RecordDataIndex = value;
	}
	/** 
	 
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