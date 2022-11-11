package xc.hikvisionsdk.isc.enums.resource;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 证件类型
*/
public enum CertificateType
{
	/** 
	 无
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Description("无")] None = 0,
	None(0),
	/** 
	 身份证
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Description("身份证")] IdentityCard = 111,
	IdentityCard(111),
	/** 
	 护照
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Description("护照")] Passport = 414,
	Passport(414),
	/** 
	 户口簿
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Description("户口簿")] ResidenceBooklet = 113,
	ResidenceBooklet(113),
	/** 
	 驾驶证
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Description("驾驶证")] DriversLicense = 335,
	DriversLicense(335),
	/** 
	 工作证
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Description("工作证")] EmployeeCard = 131,
	EmployeeCard(131),
	/** 
	 学生证
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Description("学生证")] StudentIDCard = 133,
	StudentIDCard(133),
	/** 
	 其他
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Description("其他")] Other = 990
	Other(990);

	public static final int SIZE = java.lang.Integer.SIZE;

	private int intValue;
	private static java.util.HashMap<Integer, CertificateType> mappings;
	private static java.util.HashMap<Integer, CertificateType> getMappings()
	{
		if (mappings == null)
		{
			synchronized (CertificateType.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, CertificateType>();
				}
			}
		}
		return mappings;
	}

	private CertificateType(int value)
	{
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static CertificateType forValue(int value)
	{
		return getMappings().get(value);
	}
}