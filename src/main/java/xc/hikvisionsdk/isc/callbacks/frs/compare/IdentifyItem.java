package xc.hikvisionsdk.isc.callbacks.frs.compare;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;
import xc.hikvisionsdk.isc.callbacks.frs.*;

/** 
 识别信息
*/
public class IdentifyItem
{
	/** 
	 比对到的目标人脸
	 有几个对象代表比对到了几张人脸
	*/
	private CandidateItem[] Candidate;
	public final CandidateItem[] getCandidate()
	{
		return Candidate;
	}
	public final void setCandidate(CandidateItem[] value)
	{
		Candidate = value;
	}

	/** 
	 比对到的所有人脸和抓拍到的人脸相似度最高的那个值
	*/
	private double Maxsimilarity;
	public final double getMaxsimilarity()
	{
		return Maxsimilarity;
	}
	public final void setMaxsimilarity(double value)
	{
		Maxsimilarity = value;
	}
}