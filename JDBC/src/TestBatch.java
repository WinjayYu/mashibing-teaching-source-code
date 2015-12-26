import java.sql.*;
public class TestBatch {


	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.1:1521:SXT", "scott", "tiger");
		/*
		Statement stmt = conn.createStatement();
		stmt.addBatch("insert into dept2 values (51, '500', 'haha')");
		stmt.addBatch("insert into dept2 values (52, '500', 'haha')");
		stmt.addBatch("insert into dept2 values (53, '500', 'haha')");
		stmt.executeBatch();
		stmt.close();
		*/
		
		PreparedStatement ps = conn.prepareStatement("insert into dept2 values (?, ?, ?)");
		ps.setInt(1, 61);
		ps.setString(2, "haha");
		ps.setString(3, "bj");
		ps.addBatch();
		
		ps.setInt(1, 62);
		ps.setString(2, "haha");
		ps.setString(3, "bj");
		ps.addBatch();
		
		ps.setInt(1, 63);
		ps.setString(2, "haha");
		ps.setString(3, "bj");
		ps.addBatch();
		
		ps.executeBatch();
		ps.close();
		
		conn.close();

	}

}
