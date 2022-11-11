package xc.hikvisionsdk.isc.wpf.pages.frs;

import Stylet.*;
import StyletIoC.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;
import xc.hikvisionsdk.isc.wpf.*;
import xc.hikvisionsdk.isc.wpf.pages.*;

public class FrsRootViewModel extends Conductor<IScreen>.Collection.OneActive
{

	public FrsRootViewModel(IContainer container)
	{
		Items.Add(container.<FaceGroupViewModel>Get());
		Items.Add(container.<FaceViewModel>Get());
		Items.Add(container.<BlackViewModel>Get());

		ActiveItem = Items.FirstOrDefault();

		DisplayName = "人脸应用";
	}
}