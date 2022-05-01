package com.revature.fsd.pixott.customer.dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class UpdateMovieDao {
		public static void update(int idofmovie,String name) {
			String sql="update trending5 set name=(?) where rid=(?)";
			try (
					Connection connection = Util.getConnection();
					PreparedStatement stmt = connection.prepareStatement(sql);
				) {
				  stmt.setString(1,name);
				  stmt.setInt(2,idofmovie);
				  stmt.executeUpdate();
				  System.out.println("Top5 Movies Updated Successfully");
				} catch (SQLException e) {
					Util.displayMessage(e);
				}
		}

	}


