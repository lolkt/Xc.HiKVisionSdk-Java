package company.wpfapplication1.pages;

import Stylet.*;
import StyletIoC.*;
import xc.hikvisionsdk.ia.models.*;
import xc.hikvisionsdk.isc.models.*;
import xc.hikvisionsdk.isc.wpf.*;
import xc.hikvisionsdk.isc.wpf.pages.eventservice.*;
import xc.hikvisionsdk.isc.wpf.pages.frs.*;
import xc.hikvisionsdk.isc.wpf.pages.omnipotentcard.*;
import xc.hikvisionsdk.isc.wpf.pages.resource.*;
import xc.hikvisionsdk.isc.wpf.pages.vehicle.*;
import company.wpfapplication1.*;
import java.io.*;
import java.nio.file.*;
import java.math.*;

public class ShellViewModel extends Conductor<IScreen>.Collection.OneActive
{

	public final String getTitle()
	{
		return String.format("海康安防平台接口测试工具") + AppConst.Version;
	}
	public final String getAddress()
	{
		return getIscSdkOption().getBaseUrl();
	}

	public final void setAddress(String value)
	{
		getIscSdkOption().setBaseUrl(value);
		SaveConfig();
	}

	public final String getAk()
	{
		return getIscSdkOption().getAk();
	}

	public final void setAk(String value)
	{
		getIscSdkOption().setAk(value);
		SaveConfig();
	}
	public final String getSk()
	{
		return getIscSdkOption().getSk();
	}

	public final void setSk(String value)
	{
		getIscSdkOption().setSk(value);
		SaveConfig();
	}
	public final BigDecimal getSelectedVer()
	{
		return getIscSdkOption().getVer();
	}
	public final void setSelectedVer(BigDecimal value)
	{
		getIscSdkOption().setVer(value);
		SaveConfig();
	}

	public final BigDecimal[] getVersions()
	{
		return new int[] {1, 1.1, 1.2, 1.3, 1.4, 1.41};
	}

	private boolean IsRun;
	public final boolean isRun()
	{
		return IsRun;
	}
	public final void setRun(boolean value)
	{
		IsRun = value;
	}

	private final String _filePath = Paths.get(Directory.GetCurrentDirectory()).resolve(AppConst.JsonName).toString();

	private final IWindowManager _windowManager;
	private final IContainer _container;

	private SdkOption getIscSdkOption()
	{
		return (SdkOption)_container.<IOptions<IscSdkOption>>Get();
	}
	private IaOption getIaSdkOption()
	{
		return (IaOption)_container.<IOptions<IaSdkOption>>Get();
	}
	public ShellViewModel(IWindowManager windowManager, IContainer container)
	{
		_windowManager = windowManager;
		_container = container;
		DisplayName = "海康接口测试";
		LoadOrInitConfig();

		Items.Add(container.<ResourceRootViewModel>Get());
		Items.Add(container.<VehicleRootViewModel>Get());
		Items.Add(container.<OmnipotentCardRootViewModel>Get());
		Items.Add(container.<FrsRootViewModel>Get());
		Items.Add(container.<EventServiceRootViewModel>Get());

		ActiveItem = Items.FirstOrDefault();


	}


	private void LoadOrInitConfig()
	{
		if ((new File(_filePath)).isFile())
		{
			var str = Files.readString(_filePath);
			if (tangible.StringHelper.isNullOrEmpty(str))
			{
				return;
			}
			var temp = Newtonsoft.Json.JsonConvert.<IscSdkOption>DeserializeObject(str);
			if (temp != null)
			{
				getIscSdkOption().setAk(temp.Ak);
				getIscSdkOption().setSk(temp.Sk);
				getIscSdkOption().setBaseUrl(temp.BaseUrl);
				getIscSdkOption().setVer(temp.Ver);

				getIaSdkOption().setAk(temp.Ak);
				getIaSdkOption().setSk(temp.Sk);
				getIaSdkOption().setBaseUrl(temp.BaseUrl);
				getIaSdkOption().setVer(temp.Ver);



			}
		}

	}
	private void SaveConfig()
	{
		Files.writeString(_filePath, Newtonsoft.Json.JsonConvert.SerializeObject(getIscSdkOption()));

	}





}