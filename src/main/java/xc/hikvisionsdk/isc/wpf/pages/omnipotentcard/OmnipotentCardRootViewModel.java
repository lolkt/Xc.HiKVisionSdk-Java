package xc.hikvisionsdk.isc.wpf.pages.omnipotentcard;

import Stylet.*;
import StyletIoC.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.wpf.*;
import xc.hikvisionsdk.isc.wpf.pages.*;

public class OmnipotentCardRootViewModel extends Conductor<IScreen>.Collection.OneActive
{

	public OmnipotentCardRootViewModel(IContainer container)
	{
		Items.Add(container.<AcsViewModel>Get());

		ActiveItem = Items.FirstOrDefault();

		DisplayName = "一卡通";
	}
}