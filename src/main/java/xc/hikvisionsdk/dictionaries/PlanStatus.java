package xc.hikvisionsdk.dictionaries;

import xc.hikvisionsdk.*;

/** 
 识别计划状态类型
*/
public final class PlanStatus
{

	public static String Get(String key)
	{
		switch (key.toUpperCase())
		{
			case "RUNNING":
				return "正在下发";
			case "SUCCESS":
				return "下发成功";
			case "PART_FAIL":
				return "部分失败";
			case "FAIL":
				return "下发失败";
			case "WAITING":
				return "等待下发";
			case "PAUSE":
				return "暂停";
			default:
				return key;
		}

	}
}