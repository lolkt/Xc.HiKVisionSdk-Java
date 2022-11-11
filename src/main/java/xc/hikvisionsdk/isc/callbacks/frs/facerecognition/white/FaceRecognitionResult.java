package xc.hikvisionsdk.isc.callbacks.frs.facerecognition.white;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;
import xc.hikvisionsdk.isc.callbacks.frs.*;
import xc.hikvisionsdk.isc.callbacks.frs.facerecognition.*;

/** 
 人脸对比结果
*/
public class FaceRecognitionResult
{
	/** 
	 抓拍信息
	*/
	private Snap Snap;
	public final Snap getSnap()
	{
		return Snap;
	}
	public final void setSnap(Snap value)
	{
		Snap = value;
	}
}