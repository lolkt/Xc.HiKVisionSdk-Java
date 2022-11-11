package xc.hikvisionsdk.isc.callbacks.pms;

import xc.hikvisionsdk.isc.enums.pms.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 停车场进出事件
*/
public class ParkingInOrOutEventCallbackData
{
	/** 
	 是否黑名单标识（1-黑名单 0-非黑名单）
	*/
	private InBlackList AlarmCar = null;
	public final InBlackList getAlarmCar()
	{
		return AlarmCar;
	}
	public final void setAlarmCar(InBlackList value)
	{
		AlarmCar = value;
	}
	/** 
	 车辆属性名称
	*/
	private String CarAttributeName;
	public final String getCarAttributeName()
	{
		return CarAttributeName;
	}
	public final void setCarAttributeName(String value)
	{
		CarAttributeName = value;
	}
	/** 
	 卡号
	*/
	private String CardNo;
	public final String getCardNo()
	{
		return CardNo;
	}
	public final void setCardNo(String value)
	{
		CardNo = value;
	}
	/** 
	 事件号
	*/
	private EventCmd EventCmd = EventCmd.values()[0];
	public final EventCmd getEventCmd()
	{
		return EventCmd;
	}
	public final void setEventCmd(EventCmd value)
	{
		EventCmd = value;
	}
	/** 
	 事件编号
	*/
	private String EventIndex;
	public final String getEventIndex()
	{
		return EventIndex;
	}
	public final void setEventIndex(String value)
	{
		EventIndex = value;
	}
	/** 
	 出入口编号
	*/
	private String GateIndex;
	public final String getGateIndex()
	{
		return GateIndex;
	}
	public final void setGateIndex(String value)
	{
		GateIndex = value;
	}
	/** 
	 出入口名称
	*/
	private String GateName;
	public final String getGateName()
	{
		return GateName;
	}
	public final void setGateName(String value)
	{
		GateName = value;
	}
	/** 
	 进出场类型，0：进场，1：出场
	*/
	private InOrOutType InoutType = InOrOutType.values()[0];
	public final InOrOutType getInoutType()
	{
		return InoutType;
	}
	public final void setInoutType(InOrOutType value)
	{
		InoutType = value;
	}
	/** 
	 车辆主品牌
	*/
	private Integer MainLogo = null;
	public final Integer getMainLogo()
	{
		return MainLogo;
	}
	public final void setMainLogo(Integer value)
	{
		MainLogo = value;
	}
	/** 
	 停车库编号
	*/
	private String ParkIndex;
	public final String getParkIndex()
	{
		return ParkIndex;
	}
	public final void setParkIndex(String value)
	{
		ParkIndex = value;
	}
	/** 
	 停车库名称
	*/
	private String ParkName;
	public final String getParkName()
	{
		return ParkName;
	}
	public final void setParkName(String value)
	{
		ParkName = value;
	}
	/** 
	 车牌置信度
	*/
	private int PlateBelieve;
	public final int getPlateBelieve()
	{
		return PlateBelieve;
	}
	public final void setPlateBelieve(int value)
	{
		PlateBelieve = value;
	}
	/** 
	 车牌颜色
	*/
	private PlateColorType PlateColor = PlateColorType.values()[0];
	public final PlateColorType getPlateColor()
	{
		return PlateColor;
	}
	public final void setPlateColor(PlateColorType value)
	{
		PlateColor = value;
	}
	/** 
	 车牌号
	*/
	private String PlateNo;
	public final String getPlateNo()
	{
		return PlateNo;
	}
	public final void setPlateNo(String value)
	{
		PlateNo = value;
	}
	/** 
	 车牌类型
	*/
	private PlateType PlateType = PlateType.values()[0];
	public final PlateType getPlateType()
	{
		return PlateType;
	}
	public final void setPlateType(PlateType value)
	{
		PlateType = value;
	}
	/** 
	 车道编号
	*/
	private String RoadwayIndex;
	public final String getRoadwayIndex()
	{
		return RoadwayIndex;
	}
	public final void setRoadwayIndex(String value)
	{
		RoadwayIndex = value;
	}
	/** 
	 车道名称
	*/
	private String RoadwayName;
	public final String getRoadwayName()
	{
		return RoadwayName;
	}
	public final void setRoadwayName(String value)
	{
		RoadwayName = value;
	}
	/** 
	 车道类型
	*/
	private RoadwayType RoadwayType = RoadwayType.values()[0];
	public final RoadwayType getRoadwayType()
	{
		return RoadwayType;
	}
	public final void setRoadwayType(RoadwayType value)
	{
		RoadwayType = value;
	}
	/** 
	 车辆子品牌
	*/
	private Integer SubLogo = null;
	public final Integer getSubLogo()
	{
		return SubLogo;
	}
	public final void setSubLogo(Integer value)
	{
		SubLogo = value;
	}
	/** 
	 子品牌年款
	*/
	private Integer SubModel = null;
	public final Integer getSubModel()
	{
		return SubModel;
	}
	public final void setSubModel(Integer value)
	{
		SubModel = value;
	}
	/** 
	 时间
	*/
	private String Time;
	public final String getTime()
	{
		return Time;
	}
	public final void setTime(String value)
	{
		Time = value;
	}
	/** 
	 车辆分类信息
	*/
	private int VehicleClass;
	public final int getVehicleClass()
	{
		return VehicleClass;
	}
	public final void setVehicleClass(int value)
	{
		VehicleClass = value;
	}
	/** 
	 车辆颜色
	*/
	private int VehicleColor;
	public final int getVehicleColor()
	{
		return VehicleColor;
	}
	public final void setVehicleColor(int value)
	{
		VehicleColor = value;
	}
	/** 
	 车辆类型
	*/
	private int VehicleType;
	public final int getVehicleType()
	{
		return VehicleType;
	}
	public final void setVehicleType(int value)
	{
		VehicleType = value;
	}

	/** 
	 进场结果
	*/
	private InResult InResult;
	public final InResult getInResult()
	{
		return InResult;
	}
	public final void setInResult(InResult value)
	{
		InResult = value;
	}

	/** 
	 出场结果
	*/
	private OutResult OutResult;
	public final OutResult getOutResult()
	{
		return OutResult;
	}
	public final void setOutResult(OutResult value)
	{
		OutResult = value;
	}
}