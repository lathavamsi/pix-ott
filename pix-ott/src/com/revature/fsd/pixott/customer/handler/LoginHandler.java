package com.revature.fsd.pixott.customer.handler;


	import com.revature.fsd.pixott.Admin.Adminlist;
import com.revature.fsd.pixott.empty.SearchId;
import com.revature.fsd.pixott.app.App;
import com.revature.fsd.pixott.customer.dao.LoginDao;

	public class LoginHandler {

		public static int idofcustomername;

		public static void customers() {
			App.scanner.nextLine();
			System.out.println("Number");
			String diff = App.scanner.nextLine();
			System.out.println("Password");
			String pass = App.scanner.nextLine();
			String adminpass = "pass";
			boolean result = LoginDao.resultcheck(diff,pass);
			String gem = LoginDao.nameuser(diff);
			if(diff.contains("99999") && pass.equals(adminpass)) {
				System.out.println("welcome Admin");
				System.out.println();
				Adminlist.menu();
				
				
			}
			else if(result) {
				System.out.println("You have succesfully Logged in");
				System.out.println("welcome Back "+ gem);
				System.out.println();
				System.out.println();
				idofcustomername=SearchId.id(diff);
				CustomerMenu.menu();
				 
				
				
			}
			else {
				System.out.println("Invalid Username / Password");
				System.out.println();
				MainMenuHandler.dis();
			}
			
		}

	}


