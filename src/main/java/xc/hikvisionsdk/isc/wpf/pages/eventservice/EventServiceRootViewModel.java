package xc.hikvisionsdk.isc.wpf.pages.eventservice;

import Stylet.*;
import StyletIoC.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.wpf.*;
import xc.hikvisionsdk.isc.wpf.pages.*;

public class EventServiceRootViewModel extends Conductor<IScreen>.Collection.OneActive
{

	public EventServiceRootViewModel(IContainer container)
	{
		Items.Add(container.<EventServiceViewModel>Get());

		ActiveItem = Items.FirstOrDefault();

		DisplayName = "事件服务";
	}
}