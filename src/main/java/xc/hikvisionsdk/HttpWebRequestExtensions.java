package xc.hikvisionsdk;

import java.io.*;

/** 
 HttpWebRequestExtensions
*/
public final class HttpWebRequestExtensions
{

	/** 
	 发送request
	 
	 @param req
	 @param body
	 @return 
	*/
	public static boolean WriteBody(HttpWebRequest req, String body)
	{
		if (tangible.StringHelper.isNullOrWhiteSpace(body))
		{
			return true;

		}
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: byte[] postBytes = Encoding.UTF8.GetBytes(body);
		byte[] postBytes = body.getBytes(java.nio.charset.StandardCharsets.UTF_8);
		req.ContentLength = postBytes.length;
		OutputStream reqStream = null;

		try
		{
			reqStream = req.GetRequestStream();
			reqStream.write(postBytes, 0, postBytes.length);
			reqStream.close();
		}
		catch (RuntimeException ex)
		{
			if (reqStream != null)
			{
				reqStream.close();
			}

			throw ex;
		}
		return true;

	}

	/** 
	 获得response
	 
	 @param req
	 @return 
	*/
	public static String ReadAsString(HttpWebRequest req)
	{
		HttpWebResponse rsp = null;

		try
		{
			rsp = (HttpWebResponse)req.GetResponse();
			if (HttpStatusCode.OK == rsp.StatusCode)
			{
				InputStream rspStream = rsp.GetResponseStream();
				InputStreamReader sr = new InputStreamReader(rspStream);
				return sr.ReadToEnd();
			}
			else if (HttpStatusCode.Found == rsp.StatusCode || HttpStatusCode.Moved == rsp.StatusCode) // 302/301 redirect
			{
				return rsp.Headers["Location"].toString();
			}
		}
		catch (RuntimeException ex)
		{
			throw ex;
		}
		finally
		{
			if (rsp != null)
			{
				rsp.Close();
			}
			if (req != null)
			{
				req.Abort();
			}
		}
		return "";
	}

	/** 
	 作为byte读取
	 
	 @param req
	 @return 
	*/
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: internal static byte[] ReadAsBytes(this HttpWebRequest req)
	public static byte[] ReadAsBytes(HttpWebRequest req)
	{
		HttpWebResponse rsp = null;
		try
		{
			rsp = (HttpWebResponse)req.GetResponse();
			InputStream rspStream = rsp.GetResponseStream();
			long streamLength = rsp.ContentLength;
			int offset = 0;
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: byte[] response = new byte[streamLength];
			byte[] response = new byte[streamLength];
			while (streamLength > 0)
			{
				int n = rspStream.read(response, offset, (int)streamLength);
				if (0 == n)
				{
					break;
				}

				offset += n;
				streamLength -= n;
			}
			return response;
		}
		catch (RuntimeException ex)
		{
			throw ex;
		}
		finally
		{
			if (rsp != null)
			{
				rsp.Close();
			}
			if (req != null)
			{
				req.Abort();
			}
		}

	}
}