package com.revature.fsd.pixott.customer.dao;
import java.util.List;

	import com.revature.fsd.pixott.Admin.Adminlist;
import com.revature.fsd.pixott.Customerusage.ViewTrending5;
import com.revature.fsd.pixott.app.App;
import com.revature.fsd.pixott.customer.model.Trending5;

	public class AdminDropDao {
		public static void remove() {
				ViewTrending5 dao = new ViewTrending5();
				List<Trending5> res = dao.Top();
				System.out.println("Movies");
				System.out.println();
				res.forEach(System.out::println);
				System.out.println();
				Adminlist.menu();
			}	
			

	}


