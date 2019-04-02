package sqlcoversion;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class Jdbcdemo {

		public static void main(String[] args) throws ClassNotFoundException {
		
			String url="jdbc:sqlserver://172.23.237.11; databaseName=employeeproject1; user=sa;password=P@ssw0rd";
			String query="Select * from user_detail";
			String query1="Select * from skill";
			
			try {
			Connection con=	DriverManager.getConnection(url);
			Statement st= con.createStatement();
			Statement st1= con.createStatement();
			ResultSet rs=st.executeQuery(query); 
			ResultSet rs1=st1.executeQuery(query1);
			System.out.println("Connedted successfully");
	     while(rs.next())
		{
				System.out.println(rs.getInt(1)  +"  " +rs.getString(2) + " " + rs.getString(3) + " "+rs.getString(4)  + " "+ rs.getString(5) + " "
						+ rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+ rs.getString(8) + " "+rs.getString(9)+" ");
				
			}
	     while(rs1.next())
	     {
	    		System.out.println(rs1.getInt(1));
	     }
	     
	     
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		}