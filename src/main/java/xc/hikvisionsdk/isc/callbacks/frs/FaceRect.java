package xc.hikvisionsdk.isc.callbacks.frs;

import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.callbacks.*;

/** 
 人脸坐标
*/
public class FaceRect
{
	/** 
	 高度
	*/
	private double Height;
	public final double getHeight()
	{
		return Height;
	}
	public final void setHeight(double value)
	{
		Height = value;
	}
	/** 
	 宽度
	*/
	private double Width;
	public final double getWidth()
	{
		return Width;
	}
	public final void setWidth(double value)
	{
		Width = value;
	}
	/** 
	 X坐标
	*/
	private double X;
	public final double getX()
	{
		return X;
	}
	public final void setX(double value)
	{
		X = value;
	}
	/** 
	 Y坐标
	*/
	private double Y;
	public final double getY()
	{
		return Y;
	}
	public final void setY(double value)
	{
		Y = value;
	}
}