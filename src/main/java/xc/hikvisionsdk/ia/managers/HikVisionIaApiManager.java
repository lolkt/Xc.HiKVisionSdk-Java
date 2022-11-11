package xc.hikvisionsdk.ia.managers;

import xc.hikvisionsdk.commons.managers.*;
import xc.hikvisionsdk.ia.models.*;
import xc.hikvisionsdk.*;
import xc.hikvisionsdk.ia.*;

/** 
 
*/
public class HikVisionIaApiManager extends HikVisionApiManager implements IHikVisionIaApiManager
{
	/** 
	 
	 
	 @param client
	 @param option
	*/
	public HikVisionIaApiManager(HttpClient client, IOptions<IaSdkOption> option)
	{
		super(client, option.Value);
	}

}