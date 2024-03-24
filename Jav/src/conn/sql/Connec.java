package conn.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connec {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String query=" INSERT INTO bharath.student VALUES (?, ?, ?, ?)";
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("loaded");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=tiger");
			 
			 System.out.println("connection established");
			 pstmt =  con.prepareStatement(query);
			 System.out.println("connected");
			
			 
			 int count=0;
			pstmt.setInt(1, 3);
			pstmt.setString(2, "Ram");
			 
			 pstmt.setString(3, "svce");
			 pstmt.setDouble(4, 80.2);
			 
			 count= count+pstmt.executeUpdate();
			 
			 /*
			 pstmt.setInt(1, 4);
			 pstmt.setString(2, "abc");
			 pstmt.setString(3, "ban");
			 pstmt.setString(4, "svce");
			 pstmt.setDouble(5, 80.2);
			 
			 
			count= count+pstmt.executeUpdate();
			pstmt.setInt(1, 5);
			 pstmt.setString(2, "abc");
			 pstmt.setString(3, "ban");
			 pstmt.setString(4, "svce");
			 pstmt.setDouble(5, 80.2);
			 
			 
			count= count+pstmt.executeUpdate();
			pstmt.setInt(1, 6);
			 pstmt.setString(2, "abc");
			 pstmt.setString(3, "ban");
			 pstmt.setString(4, "svce");
			 pstmt.setDouble(5, 80.2);
			 
			 
			count= count+pstmt.executeUpdate();
			pstmt.setInt(1, 7);
			 pstmt.setString(2, "abc");
			 pstmt.setString(3, "ban");
			 pstmt.setString(4, "svce");
			 pstmt.setDouble(5, 80.2);
			 
			 
			count= count+pstmt.executeUpdate();
			 pstmt.setInt(1, 9);
			 pstmt.setString(2, "abc");
			 pstmt.setString(3, "ban");
			 pstmt.setString(4, "svce");
			 pstmt.setDouble(5, 80.2);
			 int count=0;
			 
			count= count+pstmt.executeUpdate();
			
			boolean i =pstmt.execute();
			
			System.out.println("inserted successfully");
			 rs=pstmt.executeQuery();
			 
			 while(rs.next()) {
			String sid=rs.getString(1);
				 String sname=rs.getString(2);
				 String sloc=rs.getString(3);
				 String sclg=rs.getString(1);
				double sperc=rs.getDouble(1);
				
				System.out.println(sid+"   "+sname+"   "+sloc+"   "+sclg+"   "+sperc);
			 }
				*/
			
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
				if(pstmt!=null) {
					try {
						pstmt.close();
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
					if(rs!=null) {
						try {
							rs.close();
						} catch (SQLException e) {
							
							e.printStackTrace();
						}
			}
		}
			}}}}
      

