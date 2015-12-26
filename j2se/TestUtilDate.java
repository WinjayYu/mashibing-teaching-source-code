import java.util.Date;

public class TestUtilDate {

  public static void main(String[] args){
     
    Date date = new Date();
    System.out.println(date);
    String temp = date.toString();
    String t = temp.substring(11,temp.indexOf('C'));
    t = t.trim();
    System.out.println(t);
    String[] time = t.split(":");
    if(time.length==3){
    	String s1 = null;
    	String s2 = null;
    	String s3 = null;
    	if(time[0].charAt(0) == '0') {
    		s1 = time[0].substring(1);
    	} else {
    		s1 = time[0];
    	}
    	
    	if(time[1].charAt(0) == '0') {
    		s2 = time[1].substring(1);
    	} else {
    		s2 = time[1];
    	}
    	
    	if(time[2].charAt(0) == '0') {
    		s3 = time[2].substring(1);
    	} else {
    		s3 = time[2];
    	}
    	
      System.out.println
         ("现在是"+ s1 +"点"+ Integer.parseInt(time[1]) +"分"+ s3 +"秒");
  	}

	}
	
}