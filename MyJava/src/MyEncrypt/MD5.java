package MyEncrypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 
{
	public String md5(String encoding)
	{
		byte[] encodeArray = null;
		try
		{
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			byte[] byteArray = encoding.getBytes();
			messageDigest.update(byteArray);
			encodeArray = messageDigest.digest();
			
		}catch(NoSuchAlgorithmException e)
		{
			e.printStackTrace();
		}
		
		return ByteToString(encodeArray);
	}
	
	private String ByteToString(byte[] encode)
	{
		char[] HexArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', 
				'9',  'a', 'b', 'c', 'd', 'e', 'f'};
		char[] encodeString = new char[encode.length * 2];
		
		int index = 0;
		
		for(byte b : encode)
		{
			encodeString[index++] = HexArray[b>>>4 & 0xf];
			encodeString[index++] = HexArray[b & 0xf];
		}
		
		return new String(encodeString);
	}
}
