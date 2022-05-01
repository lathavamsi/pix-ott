package com.revature.fsd.pixott.customer.dao;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.List;

import com.revature.fsd.pixott.customer.model.Movie;
import com.revature.fsd.pixott.customer.model.WatchList;

	public class WatchListDao {
		public static String result(int id){
			String sql ="select name from movie where id =(?)";
			String name = "";
			try (
					Connection connection = Util.getConnection();
					PreparedStatement stmt = connection.prepareStatement(sql);
				) {
				    stmt.setInt(1,id);
					ResultSet rs = stmt.executeQuery();
					while (rs.next()) {
						name=rs.getString("name");
					}
				} catch (SQLException e) {
					Util.displayMessage(e);
				}
			return name;
			
		}

	}


