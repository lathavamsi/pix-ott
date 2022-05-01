package com.revature.fsd.pixott.Customerusage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.fsd.pixott.customer.dao.Util;
import com.revature.fsd.pixott.customer.model.Trending5;
import com.revature.fsd.pixott.customer.model.Trending5Movies;

public class ViewTrending5 {
	public  List<Trending5> Top() {
		String sql = "select * from trend5 ;";
		List<Trending5> res = new ArrayList();
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					Trending5 review = new Trending5();
					review.setName(rs.getString("name"));
					review.setRid(rs.getInt("rid"));
					res.add(review);
				}
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
			return res;
		
		
	}
}	
