package xc.hikvisionsdk.isc.managers;

import xc.hikvisionsdk.commons.managers.*;
import xc.hikvisionsdk.isc.models.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.isc.*;

/** 
 
*/
public class HikVisionIscApiManager extends HikVisionApiManager implements IHikVisionIscApiManager
{
	/** 
	 
	 
	 @param client
	 @param option
	*/
	public HikVisionIscApiManager(HttpClient client, IOptions<IscSdkOption> option)
	{
		super(client, option.Value);

	}

}