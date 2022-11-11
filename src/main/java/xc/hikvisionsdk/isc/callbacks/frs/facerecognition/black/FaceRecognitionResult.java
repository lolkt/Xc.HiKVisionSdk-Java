package xc.hikvisionsdk.isc.callbacks.frs.facerecognition.black;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;
import xc.hikvisionsdk.isc.callbacks.frs.*;
import xc.hikvisionsdk.isc.callbacks.frs.facerecognition.*;

/** 
 识别结果
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
	/** 
	 识别到的目标信息
	*/
	private FaceMatchItem[] FaceMatch;
	public final FaceMatchItem[] getFaceMatch()
	{
		return FaceMatch;
	}
	public final void setFaceMatch(FaceMatchItem[] value)
	{
		FaceMatch = value;
	}
}