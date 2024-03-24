package second;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

public class own {
	

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Connection con=null;
		
		PreparedStatement pstate=null;
		String query="select * from bharath.student";
		int count=0;
		ResultSet rs=null;
		
		try {
			
		
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("loaded");
			con=DriverManager.getConnection("jdbc:mysql://Localhost:3306?user=root&password=tiger");
			System.out.println("connected");
			con.setSavepoint();
			pstate=con.prepareStatement(query);
			System.out.println("creating statement");
			
			
			/*pstate.setInt(1, 3);
			pstate.setString(2, "loki");
			pstate.setString(3, "tpt");
			pstate.setString(4, "kmm");
			pstate.setDouble(5, 90);
			count=count+pstate.executeUpdate();
			System.out.println(count);*/
			
			rs=pstate.executeQuery();
			while(rs.next()) {
				
				int sid=rs.getInt(1);
				String sname=rs.getString(2);
				String sloc=rs.getString(3);
				String sclg=rs.getString(4);
				boolean sperc=rs.getBoolean(5);
				System.out.println(sid+" "+sname+" "+sloc+" "+sclg+" "+sperc);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		finally {
		if(con!=null) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(pstate!=null) {
			try {
				pstate.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
			
		}
		}
		
	}

	

}
