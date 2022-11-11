package xc.hikvisionsdk.ia.managers.eaas.attendance;

import xc.hikvisionsdk.ia.models.request.*;
import xc.hikvisionsdk.models.request.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;
import xc.hikvisionsdk.ia.managers.*;
import xc.hikvisionsdk.ia.managers.eaas.*;
import java.util.*;

/** 
 考勤结果查询请求
*/
public class AttendanceResultListRequest extends PagedRequest
{
	/** 
	 检索字段名，全部查询为*，多个字段英文逗号分隔，具体属性值可自定义
	*/
	private String Fields;
	public final String getFields()
	{
		return Fields;
	}

	/** 
	 查询参数
	*/
	private ArrayList<FieldOption> FieldOptions;
	public final ArrayList<FieldOption> getFieldOptions()
	{
		return FieldOptions;
	}
	private void setFieldOptions(ArrayList<FieldOption> value)
	{
		FieldOptions = value;
	}

	/** 
	 /排序参数
	*/
	private ArrayList<SortOption> Sorts;
	public final ArrayList<SortOption> getSorts()
	{
		return Sorts;
	}
	private void setSorts(ArrayList<SortOption> value)
	{
		Sorts = value;
	}

	/** 
	 批量查询员工考勤数据请求
	 
	 @param pageNo 当前页
	 @param pageSize 容量
	 @param fields 检索字段名
	*/

	public AttendanceResultListRequest(int pageNo, int pageSize)
	{
		this(pageNo, pageSize, "*");
	}

//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: public AttendanceResultListRequest(int pageNo, int pageSize, string fields = "*")
	public AttendanceResultListRequest(int pageNo, int pageSize, String fields)
	{
		super(pageNo, pageSize);
		Fields = fields;
	}

	/** 
	 添加查询条件
	 
	 @param fieldName 查询字段名称
	 @param fieldValue 查询字段值
	 @param type 查询类型
	*/
	public final AttendanceResultListRequest AddQueryField(String fieldName, String fieldValue, String type)
	{
		if (getFieldOptions() == null)
		{
			setFieldOptions(new ArrayList<FieldOption>());
		}

		getFieldOptions().add(new FieldOption(fieldName, fieldValue, type));
		return this;
	}

	/** 
	 
	 
	 @param sortField
	 @param sortType
	 @return 
	*/
	public final AttendanceResultListRequest AddSort(String sortField, String sortType)
	{
		if (getSorts() == null)
		{
			setSorts(new ArrayList<SortOption>());
		}

		getSorts().add(new SortOption(sortField, sortType));
		return this;
	}
}