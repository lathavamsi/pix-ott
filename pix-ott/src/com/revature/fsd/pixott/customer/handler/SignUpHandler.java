package com.revature.fsd.pixott.customer.handler;


	import com.revature.fsd.pixott.app.App;
import com.revature.fsd.pixott.customer.dao.SignUpDao;

	public class SignUpHandler {

		public static void displayresult() {
			App.scanner.nextLine();
			System.out.println("Name");
			String name = App.scanner.nextLine();
			System.out.println("Mobile");
			String number = App.scanner.nextLine();
			System.out.println("Password");
			String password = App.scanner.nextLine();
			System.out.println(SignUpDao.insertdetails(name,number,password));
			
			
			
		}

	}


