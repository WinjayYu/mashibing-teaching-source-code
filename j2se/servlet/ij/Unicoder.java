
package ij;

/**
*本类将字符串转换成unicode或将unicode转换成字符串
*/

public class Unicoder
{
	//源字符串
	String source;
	//构造方法
	public Unicoder()
	{}
	public Unicoder(String str)
	{
		setSource(str);
	}
	public void setSource(String str)
	{
		source=str;
	}
	public String getSource()
	{
		return source;
	}
	/**
	*将字符转换成unicode
	*/
	public static String charToUnicode(char ch)
	{
		String code = "\\u"+Integer.toHexString((int)ch);
   		return code;
	}
	/**
	*将字符串转换成unicode
	*/
	public static String StringToUnicode(String src)
	{
		StringBuffer dest=new StringBuffer();
		if(src!=null){
			int Len=src.length();
			char[] cdest=new char[Len];
    			src.getChars(0,Len,cdest,0);
			for(int i=0;i<Len;i++)    
			{
      				dest.append(charToUnicode(cdest[i]));
			}
		}
		return dest.toString();
	}
	/**
	*将int转换成char
	*/
	public static char intToChar(int codno)
	{
		return (char)codno;
	}
	/**
	*转换
	*/
	public String getUnicode()
	{
		if(getSource()!=null)
		 return StringToUnicode(getSource());
		else return "0";
	}
}