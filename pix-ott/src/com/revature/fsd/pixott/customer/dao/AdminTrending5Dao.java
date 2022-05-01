package com.revature.fsd.pixott.customer.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.fsd.pixott.customer.model.AdminTrendModel;

	public class AdminTrending5Dao {
		public  List<AdminTrendModel> Top() {
			String sql = "select * from trending5 t left join movie m on t.name=m.name;";
			List<AdminTrendModel> res = new ArrayList();
			try (
					Connection connection = Util.getConnection();
					PreparedStatement stmt = connection.prepareStatement(sql);
				) {
					ResultSet rs = stmt.executeQuery();
					while (rs.next()) {
						AdminTrendModel review = new AdminTrendModel();
						review.setName(rs.getString("name"));
						review.setId(rs.getInt("id"));
						res.add(review);
					}
				} catch (SQLException e) {
					Util.displayMessage(e);
				}
				return res;

	}
	}


