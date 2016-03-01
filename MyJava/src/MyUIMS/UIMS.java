package MyUIMS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import MyEncrypt.MD5;

interface Parameter
{
	final String uims_CheckURL = "http://uims.jlu.edu.cn/ntms/j_spring_security_check";
	final String uims_SnatchURL = "";	// I do not know the web page at now
	final String uims_ViweSource = "http://uims.jlu.edu.cn/ntms/service/res.do";
	final String uims_ViweMailBox = "http://uims.jlu.edu.cn/ntms/siteMessages/get-message-in-box.do";
	final String uims_StudentInfo = "http://uims.jlu.edu.cn/ntms/action/getCurrentUserInfo.do";
}

public class UIMS implements Parameter
{
	private MD5 M;
	private String UserName;
	private String Password;
	private String Param;
	private String Cookies;
	
	public UIMS(String UserName, String Password)
	{
		M = new MD5();
		this.UserName = UserName;
		this.Password =	M.md5("UIMS" + UserName + Password); 
	}
	
	private boolean loginUims()
	{
		boolean isLogin = false;
		Param = "j_username=" + UserName + "&j_password=" + Password;
		
		try
		{
			URL checkURL = new URL(uims_CheckURL);
			HttpURLConnection httpCheckURL = (HttpURLConnection)checkURL.openConnection();
			httpCheckURL.setDoOutput(true);
			httpCheckURL.setDoInput(true);
			httpCheckURL.setInstanceFollowRedirects(false);
			httpCheckURL.setUseCaches(false);
			httpCheckURL.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			httpCheckURL.setRequestProperty("Connection", "keep-alive");
			httpCheckURL.setRequestProperty("Content-Length", Integer.toString(Param.length()));
			
			PrintWriter out = new PrintWriter(httpCheckURL.getOutputStream());
			out.print(Param);
			out.flush();
			out.close();
			
			Cookies = httpCheckURL.getHeaderField("Set-Cookie");
			
			URL infoURL = new URL(uims_StudentInfo);
			HttpURLConnection httpInfoURL = (HttpURLConnection) infoURL.openConnection();
			if(Cookies != null)
			{
				httpInfoURL.setRequestProperty("Cookie", Cookies);
			}
			httpInfoURL.connect();
			
			BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(httpInfoURL.getInputStream()));
			String buffer = "";
			String line;
			while((line = bufferedReader.readLine()) != null)
			{
				buffer += line;
			}
			
			if(buffer.contains("userId"))
			{
				isLogin = true;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			return isLogin;
		}
	}
	
}