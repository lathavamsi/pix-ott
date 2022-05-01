package com.revature.fsd.pixott.Customerusage;


	import java.util.List;

import com.revature.fsd.pixott.app.App;
import com.revature.fsd.pixott.customer.dao.HistoryListInsertDao;
import com.revature.fsd.pixott.customer.dao.WatchListDao;
import com.revature.fsd.pixott.customer.dao.WatchListInsertDao;
import com.revature.fsd.pixott.customer.handler.CustomerMenu;
import com.revature.fsd.pixott.customer.handler.LoginHandler;
import com.revature.fsd.pixott.customer.model.Trending5;
	public class DisplayTrending5 {
		public static void Displaymovies() {
			ViewTrending5 dao = new ViewTrending5();
			List<Trending5> res = dao.Top();
			System.out.println("Movies");
			System.out.println();
			res.forEach(System.out::println);
			System.out.println();
			menuhandler();
		}	
			
			
			public static void menuhandler() {
				
			
			System.out.println("select A Movie enter Id");
			int id =App.scanner.nextInt();
			System.out.println("1)  Add to watchList");
			System.out.println("2)  Play Movie");
			int ans = App.scanner.nextInt();
			
			if(ans==1) {
				String moviename = WatchListDao.result(id);
				WatchListInsertDao.insert(moviename);
				int a=LoginHandler.idofcustomername;
				WatchListInsertDao.insertid(a,moviename);
				CustomerMenu.menu();
				
				
				
			}
			else if (ans==2) {
				System.out.println("Playing the Movie");
				System.out.println("Movie Ended");
				String adder=WatchListDao.result(id);
				HistoryListInsertDao.insert(adder);
				int b = LoginHandler.idofcustomername;
				HistoryListInsertDao.insertid(adder,b);
				CustomerMenu.menu();
				
				
				
			}
			}
	}		
			


