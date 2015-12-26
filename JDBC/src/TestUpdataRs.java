import java.sql.*;
public class TestUpdataRs {
    public static void main(String args[]){
	
	try{
	    new oracle.jdbc.driver.OracleDriver();
	    String url="jdbc:oracle:thin:@192.168.0.1:1521:SXT";
	    Connection conn=DriverManager.getConnection(url,"scott","tiger");
	    Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	    
	    ResultSet rs=stmt.executeQuery("select * from emp2");
	    
	    rs.next();
	    //更新一行数据
	    rs.updateString("ename","AAAA");
	    rs.updateRow();

	    //插入新行
	    rs.moveToInsertRow();
	    rs.updateInt(1, 9999);
	    rs.updateString("ename","AAAA");
	    rs.updateInt("mgr", 7839);
	    rs.updateDouble("sal", 99.99);
	    rs.insertRow();
	    //将光标移动到新建的行
	    rs.moveToCurrentRow();

	    //删除行
	    rs.absolute(5);
	    rs.deleteRow();

	    //取消更新
	    //rs.cancelRowUpdates();

	  }catch(SQLException e){
	    e.printStackTrace();
	  }
    }
}
