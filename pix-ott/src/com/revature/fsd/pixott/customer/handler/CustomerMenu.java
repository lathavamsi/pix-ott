package com.revature.fsd.pixott.customer.handler;


	import com.revature.fsd.pixott.Customerusage.DisplayTrending5;
import com.revature.fsd.pixott.app.App;
import com.revature.fsd.pixott.customer.dao.HistoryDao;
import com.revature.fsd.pixott.customer.dao.WishListDao;

	public class CustomerMenu {
		public static void menu() {
			System.out.println("Menu");
			System.out.println("====");
			System.out.println("1) View Top 5 Movies");
			System.out.println("2) Search Movies");
			System.out.println("3) Your Wish List");
			System.out.println("4) View History");
			System.out.println("5) Logout");
			int options = App.scanner.nextInt();
			if(options==1) {
				DisplayTrending5.Displaymovies();
			}
			else if(options==2) {
				SearchMovieHandler.searchmovie();
				
			}
			else if(options==3) {
				int a=LoginHandler.idofcustomername;
				WishListDao.wish(a);
				CustomerMenu.menu();
			}
			else if(options==4) {
				int b=LoginHandler.idofcustomername;
				HistoryDao.ans(b);
				CustomerMenu.menu();
				
			}
			else if(options==5) {
				System.out.println("Logged out Succesfully");
				System.out.println("======================");
				MainMenuHandler.dis();
				
			}
			else {
				System.out.println("Invalid Selection");
				System.out.println("==================");
				CustomerMenu.menu();
			
		}

	}

}
