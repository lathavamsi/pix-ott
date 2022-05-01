package com.revature.fsd.pixott.Admin;


	import com.revature.fsd.pixott.app.App;
import com.revature.fsd.pixott.customer.dao.Admintrending5insertdao;
import com.revature.fsd.pixott.customer.handler.AdminModifyHandler;
import com.revature.fsd.pixott.customer.handler.LoginHandler;
import com.revature.fsd.pixott.customer.handler.MainMenuHandler;

	public class Adminlist {
		public static void menu() {
			System.out.println("Menu");
			System.out.println("=====");
			System.out.println("1)   Change Top 5 Movies");
			System.out.println("2)   Mark Movies Unavailable");
			System.out.println("3)   Modify Movie Details");
			System.out.println("4)   Logout");
			int ops = App.scanner.nextInt();
			if(ops==1) {
				System.out.println("Current Top 5 Movies");
				System.out.println("====================");
				Admintrending5insertdao.Displaymovies();	
			}
			else if(ops==3) {
				AdminModifyHandler.modify();
			}
			else if(ops==4) {
				System.out.println("You have been Logged out");
				System.out.println(LoginHandler.idofcustomername);
				MainMenuHandler.dis();
			}
			else {
				System.out.println("Wrong Selection check the Number");
				Adminlist.menu();
			}
		}

	}


