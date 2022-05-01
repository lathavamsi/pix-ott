package com.revature.fsd.pixott.customer.dao;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class WishListDao {
		public static void wish(int a ) {
			//String sql = "select * from watchlist";
			String sql="select movies from watchlist w join customername c on w.login_id=u.id where id=(?)";
			try (
					Connection connection = Util.getConnection();
					PreparedStatement stmt = connection.prepareStatement(sql);
				) {
				  stmt.setInt(1,a);
				  ResultSet rs =stmt.executeQuery();
				  while(rs.next()) {
					  System.out.println("=======>   "+rs.getString("Movies"));
				  }
				 
		
				} catch (SQLException e) {
					Util.displayMessage(e);
				}
			
			
		}


}
