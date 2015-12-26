
package ij;

/**
*���ཫ�ַ���ת����unicode��unicodeת�����ַ���
*/

public class Unicoder
{
	//Դ�ַ���
	String source;
	//���췽��
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
	*���ַ�ת����unicode
	*/
	public static String charToUnicode(char ch)
	{
		String code = "\\u"+Integer.toHexString((int)ch);
   		return code;
	}
	/**
	*���ַ���ת����unicode
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
	*��intת����char
	*/
	public static char intToChar(int codno)
	{
		return (char)codno;
	}
	/**
	*ת��
	*/
	public String getUnicode()
	{
		if(getSource()!=null)
		 return StringToUnicode(getSource());
		else return "0";
	}
}