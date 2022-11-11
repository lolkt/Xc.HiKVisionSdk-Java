package xc.hikvisionsdk.ia.managers.eaas.attendance;

import Newtonsoft.Json.*;
import xc.hikvisionsdk.enums.*;
import xc.hikvisionsdk.ia.enums.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.managers.*;
import xc.hikvisionsdk.ia.managers.eaas.*;
import java.math.*;

/** 
 批量查询员工考勤数据结果数据
*/
public class AttendanceResultListResponseData
{
	/** 
	 数据唯一标识
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "model_data_id")] public string ModelDataId {get;set;}
	private String ModelDataId;
	public final String getModelDataId()
	{
		return ModelDataId;
	}
	public final void setModelDataId(String value)
	{
		ModelDataId = value;
	}


	/** 
	 创建时间
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "create_time")] public string CreateTime {get;set;}
	private String CreateTime;
	public final String getCreateTime()
	{
		return CreateTime;
	}
	public final void setCreateTime(String value)
	{
		CreateTime = value;
	}
	/** 
	 更新时间
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "update_time")] public string UpdateTime {get;set;}
	private String UpdateTime;
	public final String getUpdateTime()
	{
		return UpdateTime;
	}
	public final void setUpdateTime(String value)
	{
		UpdateTime = value;
	}

	/** 
	 人员标识
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "person_id")] public string PersonId {get;set;}
	private String PersonId;
	public final String getPersonId()
	{
		return PersonId;
	}
	public final void setPersonId(String value)
	{
		PersonId = value;
	}

	/** 
	 人员名称
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "person_name")] public string PersonName {get;set;}
	private String PersonName;
	public final String getPersonName()
	{
		return PersonName;
	}
	public final void setPersonName(String value)
	{
		PersonName = value;
	}
	/** 
	 工号
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "job_no")] public string JobNo {get;set;}
	private String JobNo;
	public final String getJobNo()
	{
		return JobNo;
	}
	public final void setJobNo(String value)
	{
		JobNo = value;
	}
	/** 
	 性别
	*/
	private Gender Sex = Gender.values()[0];
	public final Gender getSex()
	{
		return Sex;
	}
	public final void setSex(Gender value)
	{
		Sex = value;
	}
	/** 
	 拼音
	*/
	private String Pinyin;
	public final String getPinyin()
	{
		return Pinyin;
	}
	public final void setPinyin(String value)
	{
		Pinyin = value;
	}
	/** 
	 员工级别
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "emp_level")] public string EmpLevel {get;set;}
	private String EmpLevel;
	public final String getEmpLevel()
	{
		return EmpLevel;
	}
	public final void setEmpLevel(String value)
	{
		EmpLevel = value;
	}

	/** 
	 员工种类
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "emp_type")] public string EmpType {get;set;}
	private String EmpType;
	public final String getEmpType()
	{
		return EmpType;
	}
	public final void setEmpType(String value)
	{
		EmpType = value;
	}
	/** 
	 工作地点
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "work_place")] public string WorkPlace {get;set;}
	private String WorkPlace;
	public final String getWorkPlace()
	{
		return WorkPlace;
	}
	public final void setWorkPlace(String value)
	{
		WorkPlace = value;
	}
	/** 
	 组织id
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "org_id")] public string OrgId {get;set;}
	private String OrgId;
	public final String getOrgId()
	{
		return OrgId;
	}
	public final void setOrgId(String value)
	{
		OrgId = value;
	}
	/** 
	 组织名称
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "org_name")] public string OrgName {get;set;}
	private String OrgName;
	public final String getOrgName()
	{
		return OrgName;
	}
	public final void setOrgName(String value)
	{
		OrgName = value;
	}
	/** 
	 组织名称1
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "org_name1")] public string OrgName1 {get;set;}
	private String OrgName1;
	public final String getOrgName1()
	{
		return OrgName1;
	}
	public final void setOrgName1(String value)
	{
		OrgName1 = value;
	}
	/** 
	 组织名称2
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "org_name2")] public string OrgName2 {get;set;}
	private String OrgName2;
	public final String getOrgName2()
	{
		return OrgName2;
	}
	public final void setOrgName2(String value)
	{
		OrgName2 = value;
	}
	/** 
	 组织名称3
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "org_name3")] public string OrgName3 {get;set;}
	private String OrgName3;
	public final String getOrgName3()
	{
		return OrgName3;
	}
	public final void setOrgName3(String value)
	{
		OrgName3 = value;
	}
	/** 
	 组织名称4
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "org_name4")] public string OrgName4 {get;set;}
	private String OrgName4;
	public final String getOrgName4()
	{
		return OrgName4;
	}
	public final void setOrgName4(String value)
	{
		OrgName4 = value;
	}
	/** 
	 组织名称5
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "org_name5")] public string OrgName5 {get;set;}
	private String OrgName5;
	public final String getOrgName5()
	{
		return OrgName5;
	}
	public final void setOrgName5(String value)
	{
		OrgName5 = value;
	}
	/** 
	 组织名称6
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "org_name6")] public string OrgName6 {get;set;}
	private String OrgName6;
	public final String getOrgName6()
	{
		return OrgName6;
	}
	public final void setOrgName6(String value)
	{
		OrgName6 = value;
	}
	/** 
	 考勤组id
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "time_group_id")] public string TimeGroupId {get;set;}
	private String TimeGroupId;
	public final String getTimeGroupId()
	{
		return TimeGroupId;
	}
	public final void setTimeGroupId(String value)
	{
		TimeGroupId = value;
	}
	/** 
	 考勤组名称
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "group_name")] public string GroupName {get;set;}
	private String GroupName;
	public final String getGroupName()
	{
		return GroupName;
	}
	public final void setGroupName(String value)
	{
		GroupName = value;
	}
	/** 
	 当日日期
	*/
	private String Date;
	public final String getDate()
	{
		return Date;
	}
	public final void setDate(String value)
	{
		Date = value;
	}
	/** 
	 日期类型
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "date_type")] public System.Nullable<DateType> DateType {get;set;}
	private DateType DateType = null;
	public final DateType getDateType()
	{
		return DateType;
	}
	public final void setDateType(DateType value)
	{
		DateType = value;
	}
	/** 
	 是否应出勤
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "is_should_attendance")] public System.Nullable<YesOrNo> IsShouldAttendance {get;set;}
	private YesOrNo IsShouldAttendance = null;
	public final YesOrNo isShouldAttendance()
	{
		return IsShouldAttendance;
	}
	public final void setShouldAttendance(YesOrNo value)
	{
		IsShouldAttendance = value;
	}

	/** 
	是否替班
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "is_alter_schedule")] public System.Nullable<YesOrNo> IsAlterSchedule {get;set;}
	private YesOrNo IsAlterSchedule = null;
	public final YesOrNo isAlterSchedule()
	{
		return IsAlterSchedule;
	}
	public final void setAlterSchedule(YesOrNo value)
	{
		IsAlterSchedule = value;
	}

	/** 
	 是否补签
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "is_supply_clock")] public System.Nullable<YesOrNo> IsSupplyClock {get;set;}
	private YesOrNo IsSupplyClock = null;
	public final YesOrNo isSupplyClock()
	{
		return IsSupplyClock;
	}
	public final void setSupplyClock(YesOrNo value)
	{
		IsSupplyClock = value;
	}

	/** 
	 排班类型
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "schedule_type")] public System.Nullable<int> ScheduleType {get;set;}
	private Integer ScheduleType = null;
	public final Integer getScheduleType()
	{
		return ScheduleType;
	}
	public final void setScheduleType(Integer value)
	{
		ScheduleType = value;
	}

	/** 
	 工作计划id
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "work_plan_id")] public string WorkPlanId {get;set;}
	private String WorkPlanId;
	public final String getWorkPlanId()
	{
		return WorkPlanId;
	}
	public final void setWorkPlanId(String value)
	{
		WorkPlanId = value;
	}

	/** 
	 工作计划名称
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "plan_name")] public string PlanName {get;set;}
	private String PlanName;
	public final String getPlanName()
	{
		return PlanName;
	}
	public final void setPlanName(String value)
	{
		PlanName = value;
	}

	/** 
	 班次id
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "shift_id")] public string ShiftId {get;set;}
	private String ShiftId;
	public final String getShiftId()
	{
		return ShiftId;
	}
	public final void setShiftId(String value)
	{
		ShiftId = value;
	}

	/** 
	 班次名称
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "shift_name")] public string ShiftName {get;set;}
	private String ShiftName;
	public final String getShiftName()
	{
		return ShiftName;
	}
	public final void setShiftName(String value)
	{
		ShiftName = value;
	}

	/** 
	 班次类型
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "shift_type")] public System.Nullable<int> ShiftType {get;set;}
	private Integer ShiftType = null;
	public final Integer getShiftType()
	{
		return ShiftType;
	}
	public final void setShiftType(Integer value)
	{
		ShiftType = value;
	}

	/** 
	 应休息时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "should_rest_time")] public System.Nullable<int> ShouldRestTime {get;set;}
	private Integer ShouldRestTime = null;
	public final Integer getShouldRestTime()
	{
		return ShouldRestTime;
	}
	public final void setShouldRestTime(Integer value)
	{
		ShouldRestTime = value;
	}

	/** 
	 实际休息时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "actual_rest_time")] public System.Nullable<int> ActualRestTime {get;set;}
	private Integer ActualRestTime = null;
	public final Integer getActualRestTime()
	{
		return ActualRestTime;
	}
	public final void setActualRestTime(Integer value)
	{
		ActualRestTime = value;
	}

	/** 
	 应出勤时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "should_attendance_time")] public System.Nullable<decimal> ShouldAttendanceTime {get;set;}
	private BigDecimal ShouldAttendanceTime = null;
	public final BigDecimal getShouldAttendanceTime()
	{
		return ShouldAttendanceTime;
	}
	public final void setShouldAttendanceTime(BigDecimal value)
	{
		ShouldAttendanceTime = value;
	}

	/** 
	 实际出勤时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "actual_attendance_time")] public System.Nullable<decimal> ActualAttendanceTime {get;set;}
	private BigDecimal ActualAttendanceTime = null;
	public final BigDecimal getActualAttendanceTime()
	{
		return ActualAttendanceTime;
	}
	public final void setActualAttendanceTime(BigDecimal value)
	{
		ActualAttendanceTime = value;
	}

	/** 
	 出勤状态
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "attendance_state")] public System.Nullable<AttendanceState> AttendanceState {get;set;}
	private AttendanceState AttendanceState = null;
	public final AttendanceState getAttendanceState()
	{
		return AttendanceState;
	}
	public final void setAttendanceState(AttendanceState value)
	{
		AttendanceState = value;
	}

	/** 
	 是否正常
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "is_normal")] public System.Nullable<YesOrNo> IsNormal {get;set;}
	private YesOrNo IsNormal = null;
	public final YesOrNo isNormal()
	{
		return IsNormal;
	}
	public final void setNormal(YesOrNo value)
	{
		IsNormal = value;
	}

	/** 
	 是否迟到
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "is_late")] public System.Nullable<YesOrNo> IsLate {get;set;}
	private YesOrNo IsLate = null;
	public final YesOrNo isLate()
	{
		return IsLate;
	}
	public final void setLate(YesOrNo value)
	{
		IsLate = value;
	}

	/** 
	 是否旷工
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "is_absent")] public System.Nullable<YesOrNo> IsAbsent {get;set;}
	private YesOrNo IsAbsent = null;
	public final YesOrNo isAbsent()
	{
		return IsAbsent;
	}
	public final void setAbsent(YesOrNo value)
	{
		IsAbsent = value;
	}

	/** 
	 迟到时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "late_time")] public System.Nullable<decimal> LateTime {get;set;}
	private BigDecimal LateTime = null;
	public final BigDecimal getLateTime()
	{
		return LateTime;
	}
	public final void setLateTime(BigDecimal value)
	{
		LateTime = value;
	}

	/** 
	 早退时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "early_time")] public System.Nullable<decimal> EarlyTime {get;set;}
	private BigDecimal EarlyTime = null;
	public final BigDecimal getEarlyTime()
	{
		return EarlyTime;
	}
	public final void setEarlyTime(BigDecimal value)
	{
		EarlyTime = value;
	}

	/** 
	 旷工时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "absent_time")] public System.Nullable<decimal> AbsentTime {get;set;}
	private BigDecimal AbsentTime = null;
	public final BigDecimal getAbsentTime()
	{
		return AbsentTime;
	}
	public final void setAbsentTime(BigDecimal value)
	{
		AbsentTime = value;
	}

	/** 
	 是否加班
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "is_overtime")] public System.Nullable<YesOrNo> IsOvertime {get;set;}
	private YesOrNo IsOvertime = null;
	public final YesOrNo isOvertime()
	{
		return IsOvertime;
	}
	public final void setOvertime(YesOrNo value)
	{
		IsOvertime = value;
	}

	/** 
	 加班时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "overtime_time")] public System.Nullable<decimal> OvertimeTime {get;set;}
	private BigDecimal OvertimeTime = null;
	public final BigDecimal getOvertimeTime()
	{
		return OvertimeTime;
	}
	public final void setOvertimeTime(BigDecimal value)
	{
		OvertimeTime = value;
	}

	/** 
	 是否加班转调休
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "is_turn_off_vacation")] public System.Nullable<YesOrNo> IsTurnOffVacation {get;set;}
	private YesOrNo IsTurnOffVacation = null;
	public final YesOrNo isTurnOffVacation()
	{
		return IsTurnOffVacation;
	}
	public final void setTurnOffVacation(YesOrNo value)
	{
		IsTurnOffVacation = value;
	}

	/** 
	 加班转调休时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "overtime_by_rest_time")] public System.Nullable<decimal> OvertimeByRestTime {get;set;}
	private BigDecimal OvertimeByRestTime = null;
	public final BigDecimal getOvertimeByRestTime()
	{
		return OvertimeByRestTime;
	}
	public final void setOvertimeByRestTime(BigDecimal value)
	{
		OvertimeByRestTime = value;
	}

	/** 
	 是否加班转加班费
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "is_turn_off_money")] public System.Nullable<YesOrNo> IsTurnOffMoney {get;set;}
	private YesOrNo IsTurnOffMoney = null;
	public final YesOrNo isTurnOffMoney()
	{
		return IsTurnOffMoney;
	}
	public final void setTurnOffMoney(YesOrNo value)
	{
		IsTurnOffMoney = value;
	}

	/** 
	 加班费金额
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "overtime_by_money_count")] public System.Nullable<decimal> OvertimeByMoneyCount {get;set;}
	private BigDecimal OvertimeByMoneyCount = null;
	public final BigDecimal getOvertimeByMoneyCount()
	{
		return OvertimeByMoneyCount;
	}
	public final void setOvertimeByMoneyCount(BigDecimal value)
	{
		OvertimeByMoneyCount = value;
	}


	/** 
	 是否餐补
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "is_meal_allowance")] public System.Nullable<YesOrNo> IsMealAllowance {get;set;}
	private YesOrNo IsMealAllowance = null;
	public final YesOrNo isMealAllowance()
	{
		return IsMealAllowance;
	}
	public final void setMealAllowance(YesOrNo value)
	{
		IsMealAllowance = value;
	}

	/** 
	 餐补金额
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "meal_allowance")] public System.Nullable<decimal> MealAllowance {get;set;}
	private BigDecimal MealAllowance = null;
	public final BigDecimal getMealAllowance()
	{
		return MealAllowance;
	}
	public final void setMealAllowance(BigDecimal value)
	{
		MealAllowance = value;
	}


	/** 
	 是否交补
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "is_transportation_allowance")] public System.Nullable<YesOrNo> IsTransportationAllowance {get;set;}
	private YesOrNo IsTransportationAllowance = null;
	public final YesOrNo isTransportationAllowance()
	{
		return IsTransportationAllowance;
	}
	public final void setTransportationAllowance(YesOrNo value)
	{
		IsTransportationAllowance = value;
	}

	/** 
	 交补金额
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "transportation_allowance")] public System.Nullable<decimal> TransportationAllowance {get;set;}
	private BigDecimal TransportationAllowance = null;
	public final BigDecimal getTransportationAllowance()
	{
		return TransportationAllowance;
	}
	public final void setTransportationAllowance(BigDecimal value)
	{
		TransportationAllowance = value;
	}
	/** 
	 是否出差
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "is_special_attendance")] public System.Nullable<YesOrNo> IsSpecialAttendance {get;set;}
	private YesOrNo IsSpecialAttendance = null;
	public final YesOrNo isSpecialAttendance()
	{
		return IsSpecialAttendance;
	}
	public final void setSpecialAttendance(YesOrNo value)
	{
		IsSpecialAttendance = value;
	}
	/** 
	 是否全天出差
	*/

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "is_special_attendance_all_day")] public System.Nullable<YesOrNo> IsSpecialAttendanceAllDay {get;set;}
	private YesOrNo IsSpecialAttendanceAllDay = null;
	public final YesOrNo isSpecialAttendanceAllDay()
	{
		return IsSpecialAttendanceAllDay;
	}
	public final void setSpecialAttendanceAllDay(YesOrNo value)
	{
		IsSpecialAttendanceAllDay = value;
	}
	/** 
	 出差时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "special_attendance_time")] public System.Nullable<decimal> SpecialAttendanceTime {get;set;}
	private BigDecimal SpecialAttendanceTime = null;
	public final BigDecimal getSpecialAttendanceTime()
	{
		return SpecialAttendanceTime;
	}
	public final void setSpecialAttendanceTime(BigDecimal value)
	{
		SpecialAttendanceTime = value;
	}


	/** 
	 是否因公外出
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "is_be_away_on_business")] public System.Nullable<YesOrNo> IsBeAwayOnBusiness {get;set;}
	private YesOrNo IsBeAwayOnBusiness = null;
	public final YesOrNo isBeAwayOnBusiness()
	{
		return IsBeAwayOnBusiness;
	}
	public final void setBeAwayOnBusiness(YesOrNo value)
	{
		IsBeAwayOnBusiness = value;
	}


	/** 
	 是否培训
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "is_trained")] public System.Nullable<YesOrNo> IsTrained {get;set;}
	private YesOrNo IsTrained = null;
	public final YesOrNo isTrained()
	{
		return IsTrained;
	}
	public final void setTrained(YesOrNo value)
	{
		IsTrained = value;
	}
	/** 
	 是否外派
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "is_expatriate")] public System.Nullable<YesOrNo> IsExpatriate {get;set;}
	private YesOrNo IsExpatriate = null;
	public final YesOrNo isExpatriate()
	{
		return IsExpatriate;
	}
	public final void setExpatriate(YesOrNo value)
	{
		IsExpatriate = value;
	}
	/** 
	 是否出差
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "is_business")] public System.Nullable<YesOrNo> IsBusiness {get;set;}
	private YesOrNo IsBusiness = null;
	public final YesOrNo isBusiness()
	{
		return IsBusiness;
	}
	public final void setBusiness(YesOrNo value)
	{
		IsBusiness = value;
	}
	/** 
	 因公外出时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "be_away_on_business_time")] public System.Nullable<decimal> BeAwayOnBusinessTime {get;set;}
	private BigDecimal BeAwayOnBusinessTime = null;
	public final BigDecimal getBeAwayOnBusinessTime()
	{
		return BeAwayOnBusinessTime;
	}
	public final void setBeAwayOnBusinessTime(BigDecimal value)
	{
		BeAwayOnBusinessTime = value;
	}
	/** 
	 培训时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "trained_time")] public System.Nullable<decimal> TrainedTime {get;set;}
	private BigDecimal TrainedTime = null;
	public final BigDecimal getTrainedTime()
	{
		return TrainedTime;
	}
	public final void setTrainedTime(BigDecimal value)
	{
		TrainedTime = value;
	}

	/** 
	 外派时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "expatriate_time")] public System.Nullable<decimal> ExpatriateTime {get;set;}
	private BigDecimal ExpatriateTime = null;
	public final BigDecimal getExpatriateTime()
	{
		return ExpatriateTime;
	}
	public final void setExpatriateTime(BigDecimal value)
	{
		ExpatriateTime = value;
	}


	/** 
	 出差时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "business_time")] public System.Nullable<decimal> BusinessTime {get;set;}
	private BigDecimal BusinessTime = null;
	public final BigDecimal getBusinessTime()
	{
		return BusinessTime;
	}
	public final void setBusinessTime(BigDecimal value)
	{
		BusinessTime = value;
	}
	/** 
	  	是否请假
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "is_leave")] public System.Nullable<YesOrNo> IsLeave {get;set;}
	private YesOrNo IsLeave = null;
	public final YesOrNo isLeave()
	{
		return IsLeave;
	}
	public final void setLeave(YesOrNo value)
	{
		IsLeave = value;
	}

	/** 
	 请假时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "leave_duration")] public System.Nullable<decimal> LeaveDuration {get;set;}
	private BigDecimal LeaveDuration = null;
	public final BigDecimal getLeaveDuration()
	{
		return LeaveDuration;
	}
	public final void setLeaveDuration(BigDecimal value)
	{
		LeaveDuration = value;
	}
	/** 
	 是否全天请假
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "is_leave_all_day")] public System.Nullable<YesOrNo> IsLeaveAllDay {get;set;}
	private YesOrNo IsLeaveAllDay = null;
	public final YesOrNo isLeaveAllDay()
	{
		return IsLeaveAllDay;
	}
	public final void setLeaveAllDay(YesOrNo value)
	{
		IsLeaveAllDay = value;
	}

	/** 
	 调休假时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "time_off_in_lieu")] public System.Nullable<decimal> TimeOffInLieu {get;set;}
	private BigDecimal TimeOffInLieu = null;
	public final BigDecimal getTimeOffInLieu()
	{
		return TimeOffInLieu;
	}
	public final void setTimeOffInLieu(BigDecimal value)
	{
		TimeOffInLieu = value;
	}
	/** 
	 病假时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "sick_leave")] public System.Nullable<decimal> SickLeave {get;set;}
	private BigDecimal SickLeave = null;
	public final BigDecimal getSickLeave()
	{
		return SickLeave;
	}
	public final void setSickLeave(BigDecimal value)
	{
		SickLeave = value;
	}
	/** 
	 事假时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "personal_leave")] public System.Nullable<decimal> PersonalLeave {get;set;}
	private BigDecimal PersonalLeave = null;
	public final BigDecimal getPersonalLeave()
	{
		return PersonalLeave;
	}
	public final void setPersonalLeave(BigDecimal value)
	{
		PersonalLeave = value;
	}
	/** 
	 产假时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "maternity_leave")] public System.Nullable<decimal> MaternityLeave {get;set;}
	private BigDecimal MaternityLeave = null;
	public final BigDecimal getMaternityLeave()
	{
		return MaternityLeave;
	}
	public final void setMaternityLeave(BigDecimal value)
	{
		MaternityLeave = value;
	}
	/** 
	 陪产假时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "paternity_leave")] public System.Nullable<decimal> PaternityLeave {get;set;}
	private BigDecimal PaternityLeave = null;
	public final BigDecimal getPaternityLeave()
	{
		return PaternityLeave;
	}
	public final void setPaternityLeave(BigDecimal value)
	{
		PaternityLeave = value;
	}
	/** 
	 工伤假时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "injury_leave")] public System.Nullable<decimal> InjuryLeave {get;set;}
	private BigDecimal InjuryLeave = null;
	public final BigDecimal getInjuryLeave()
	{
		return InjuryLeave;
	}
	public final void setInjuryLeave(BigDecimal value)
	{
		InjuryLeave = value;
	}
	/** 
	 婚假时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "marriage_leave")] public System.Nullable<decimal> MarriageLeave {get;set;}
	private BigDecimal MarriageLeave = null;
	public final BigDecimal getMarriageLeave()
	{
		return MarriageLeave;
	}
	public final void setMarriageLeave(BigDecimal value)
	{
		MarriageLeave = value;
	}
	/** 
	 丧假时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "funeral_leave")] public System.Nullable<decimal> FuneralLeave {get;set;}
	private BigDecimal FuneralLeave = null;
	public final BigDecimal getFuneralLeave()
	{
		return FuneralLeave;
	}
	public final void setFuneralLeave(BigDecimal value)
	{
		FuneralLeave = value;
	}
	/** 
	 年假时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "annual_leave")] public System.Nullable<decimal> AnnualLeave {get;set;}
	private BigDecimal AnnualLeave = null;
	public final BigDecimal getAnnualLeave()
	{
		return AnnualLeave;
	}
	public final void setAnnualLeave(BigDecimal value)
	{
		AnnualLeave = value;
	}
	/** 
	 哺乳假时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "breastfeeding_leave")] public System.Nullable<decimal> BreastfeedingLeave {get;set;}
	private BigDecimal BreastfeedingLeave = null;
	public final BigDecimal getBreastfeedingLeave()
	{
		return BreastfeedingLeave;
	}
	public final void setBreastfeedingLeave(BigDecimal value)
	{
		BreastfeedingLeave = value;
	}


	/** 
	 产检假时长
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "maternity_check_leave")] public System.Nullable<decimal> MaternityCheckLeave {get;set;}
	private BigDecimal MaternityCheckLeave = null;
	public final BigDecimal getMaternityCheckLeave()
	{
		return MaternityCheckLeave;
	}
	public final void setMaternityCheckLeave(BigDecimal value)
	{
		MaternityCheckLeave = value;
	}

	/** 
	 第一次上班打卡时间
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "first_go_work_clock_time")] public string FirstGoWorkClockTime {get;set;}
	private String FirstGoWorkClockTime;
	public final String getFirstGoWorkClockTime()
	{
		return FirstGoWorkClockTime;
	}
	public final void setFirstGoWorkClockTime(String value)
	{
		FirstGoWorkClockTime = value;
	}

	/** 
	 第一次下班打卡时间
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "first_out_wor_clock_time")] public string FirstOutWorClockTime {get;set;}
	private String FirstOutWorClockTime;
	public final String getFirstOutWorClockTime()
	{
		return FirstOutWorClockTime;
	}
	public final void setFirstOutWorClockTime(String value)
	{
		FirstOutWorClockTime = value;
	}


	/** 
	 第二次上班打卡时间
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "second_go_work_clock_time")] public string SecondGoWorkClockTime {get;set;}
	private String SecondGoWorkClockTime;
	public final String getSecondGoWorkClockTime()
	{
		return SecondGoWorkClockTime;
	}
	public final void setSecondGoWorkClockTime(String value)
	{
		SecondGoWorkClockTime = value;
	}

	/** 
	 第二次下班打卡时间
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "second_out_work_clock_time")] public string SecondOutWorClockTime {get;set;}
	private String SecondOutWorClockTime;
	public final String getSecondOutWorClockTime()
	{
		return SecondOutWorClockTime;
	}
	public final void setSecondOutWorClockTime(String value)
	{
		SecondOutWorClockTime = value;
	}


	/** 
	 最早打卡时间
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "early_clock_time")] public string EarlyClockTime {get;set;}
	private String EarlyClockTime;
	public final String getEarlyClockTime()
	{
		return EarlyClockTime;
	}
	public final void setEarlyClockTime(String value)
	{
		EarlyClockTime = value;
	}

	/** 
	 最晚打卡时间
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "late_clock_time")] public string LateClockTime {get;set;}
	private String LateClockTime;
	public final String getLateClockTime()
	{
		return LateClockTime;
	}
	public final void setLateClockTime(String value)
	{
		LateClockTime = value;
	}

	/** 
	 年
	*/
	private Integer Year = null;
	public final Integer getYear()
	{
		return Year;
	}
	public final void setYear(Integer value)
	{
		Year = value;
	}
	/** 
	 季度
	*/
	private Integer Quarter = null;
	public final Integer getQuarter()
	{
		return Quarter;
	}
	public final void setQuarter(Integer value)
	{
		Quarter = value;
	}
	/** 
	 月
	*/
	private Integer Month = null;
	public final Integer getMonth()
	{
		return Month;
	}
	public final void setMonth(Integer value)
	{
		Month = value;
	}
	/** 
	 周
	*/
	private Integer Week = null;
	public final Integer getWeek()
	{
		return Week;
	}
	public final void setWeek(Integer value)
	{
		Week = value;
	}
	/** 
	 日
	*/
	private Integer Day = null;
	public final Integer getDay()
	{
		return Day;
	}
	public final void setDay(Integer value)
	{
		Day = value;
	}
	/** 
	 证件号码
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "certificate_no")] public string CertificateNo {get;set;}
	private String CertificateNo;
	public final String getCertificateNo()
	{
		return CertificateNo;
	}
	public final void setCertificateNo(String value)
	{
		CertificateNo = value;
	}

	/** 
	 当天几次上下班
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty(PropertyName = "clock_times")] public System.Nullable<int> ClockTimes {get;set;}
	private Integer ClockTimes = null;
	public final Integer getClockTimes()
	{
		return ClockTimes;
	}
	public final void setClockTimes(Integer value)
	{
		ClockTimes = value;
	}



}