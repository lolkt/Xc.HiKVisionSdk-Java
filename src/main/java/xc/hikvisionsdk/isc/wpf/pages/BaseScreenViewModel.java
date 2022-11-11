package xc.hikvisionsdk.isc.wpf.pages;

import Stylet.*;
import StyletIoC.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.wpf.*;

public class BaseScreenViewModel extends Screen
{

	protected final IWindowManager WindowManager;
	protected final IContainer Container;

	public BaseScreenViewModel(IWindowManager windowManager, IContainer container)
	{
		WindowManager = windowManager;
		Container = container;
	}
}