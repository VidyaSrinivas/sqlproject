package sqlcoversion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Preparedemo {
	public static void main(String[] args)  {
		String query = "Select * from user_detail where  empId=?";
		Connection con = DataBaseCon.getDatBaseConnection();
		PreparedStatement st;
		try {
			
			con.setAutoCommit(false);
			st = con.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the employee id");
			int empId=sc.nextInt();
			st.setInt(1,empId);
			ResultSet rs = st.executeQuery();
		
			while(rs.next())
			{
				System.out.print(rs.getInt(1));
				System.out.println(rs.getString(2));
				
			}
				
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
			System.out.println(e.getNextException());
		}

	}

}

