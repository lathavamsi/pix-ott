package com.revature.fsd.pixott.customer.dao;

import java.util.List;

import com.revature.fsd.pixott.customer.handler.AdminHandler;
import com.revature.fsd.pixott.customer.model.AdminTrendModel;

	public class Admintrending5insertdao {
		public static void Displaymovies() {
			AdminTrending5Dao dao = new AdminTrending5Dao();
			List<AdminTrendModel> res = dao.Top();
			System.out.println("Movies");
			System.out.println();
			res.forEach(System.out::println);
			System.out.println();
			//Adminremovedao.remove();
			AdminHandler.remove();
			
		}

	}


