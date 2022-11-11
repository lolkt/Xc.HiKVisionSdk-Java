package xc.hikvisionsdk.isc.wpf.pages.resource;

import Stylet.*;
import StyletIoC.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.wpf.*;
import xc.hikvisionsdk.isc.wpf.pages.*;

public class ResourceRootViewModel extends Conductor<IScreen>.Collection.OneActive
{

	public ResourceRootViewModel(IContainer container)
	{
		Items.Add(container.<PersonViewModel>Get());

		ActiveItem = Items.FirstOrDefault();

		DisplayName = "资源目录";
	}
}