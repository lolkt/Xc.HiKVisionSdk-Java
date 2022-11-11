package xc.hikvisionsdk.isc.callbacks.frs.compare;

import Newtonsoft.Json.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;
import xc.hikvisionsdk.isc.callbacks.frs.*;

/** 
 比对到的目标人脸
*/
public class CandidateItem
{
	/** 
	 比对到的人脸所属人脸分组的唯一标识
	 注意和平台的人脸分组的标识不一定相同
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty("blacklist_id")] public string BlacklistId {get;set;}
	private String BlacklistId;
	public final String getBlacklistId()
	{
		return BlacklistId;
	}
	public final void setBlacklistId(String value)
	{
		BlacklistId = value;
	}
	/** 
	 人员数据
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty("human_data")] public HumanDataItem[] HumanData {get;set;}
	private HumanDataItem[] HumanData;
	public final HumanDataItem[] getHumanData()
	{
		return HumanData;
	}
	public final void setHumanData(HumanDataItem[] value)
	{
		HumanData = value;
	}
	/** 
	 比对到的人脸所属人脸的唯一标识
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty("human_id")] public string HumanId {get;set;}
	private String HumanId;
	public final String getHumanId()
	{
		return HumanId;
	}
	public final void setHumanId(String value)
	{
		HumanId = value;
	}
	/** 
	 预留字段
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty("reserve_field")] public ReserveField ReserveField {get;set;}
	private ReserveField ReserveField;
	public final ReserveField getReserveField()
	{
		return ReserveField;
	}
	public final void setReserveField(ReserveField value)
	{
		ReserveField = value;
	}
	/** 
	 比对到的人脸和抓拍到的人脸之间的相似度
	*/
	private double Similarity;
	public final double getSimilarity()
	{
		return Similarity;
	}
	public final void setSimilarity(double value)
	{
		Similarity = value;
	}
}