import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDML2 {

	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("Parameter Error! Please Input Again!");
			System.exit(-1);
		}
		
		int deptno = 0;
		
		try {
			deptno = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.out.println("Parameter Error! Deptno should be Number Format!");
			System.exit(-1);
		}
		
		String dname = args[1];
		String loc = args[2];
		
		Statement stmt = null;
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//new oracle.jdbc.driver.OracleDriver();
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.1:1521:SXT", "scott", "tiger");
			stmt = conn.createStatement();
			String sql = "insert into dept2 values (" + deptno + ",'" + dname + "','" + loc + "')";
System.out.println(sql);
			stmt.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) {
					stmt.close();
					stmt = null;
				}
				if(conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
