package xc.hikvisionsdk.isc.wpf.pages.vehicle;

import Stylet.*;
import StyletIoC.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.wpf.*;
import xc.hikvisionsdk.isc.wpf.pages.*;

public class VehicleRootViewModel extends Conductor<IScreen>.Collection.OneActive
{

	public VehicleRootViewModel(IContainer container)
	{
		Items.Add(container.<CarParkViewModel>Get());

		ActiveItem = Items.FirstOrDefault();

		DisplayName = "车辆管控";
	}
}