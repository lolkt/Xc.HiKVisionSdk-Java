package xc.hikvisionsdk.isc.callbacks.frs.capture;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;
import xc.hikvisionsdk.isc.callbacks.frs.*;

/** 
 人脸评分参数
*/
public class FaceScore
{
	/** 
	 是否开启功能
	*/
	private String Enable;
	public final String getEnable()
	{
		return Enable;
	}
	public final void setEnable(String value)
	{
		Enable = value;
	}
	/** 
	 人脸评分
	 人脸总评分：
	 综合所有评分项得到人脸总评分
	 数值越大
	 人脸质量越高
	 float类型[0, 1]
	*/
	private double TotalScore;
	public final double getTotalScore()
	{
		return TotalScore;
	}
	public final void setTotalScore(double value)
	{
		TotalScore = value;
	}
	/** 
	 过滤类型
	 0-全部类型 
	 1-人脸抓拍图片过滤 
	 2-黑名单库 
	 3-白名单库
	*/
	private FaceScoreType Type = FaceScoreType.values()[0];
	public final FaceScoreType getType()
	{
		return Type;
	}
	public final void setType(FaceScoreType value)
	{
		Type = value;
	}
}