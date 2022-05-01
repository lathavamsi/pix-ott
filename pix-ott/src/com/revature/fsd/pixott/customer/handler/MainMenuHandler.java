package com.revature.fsd.pixott.customer.handler;


	import com.revature.fsd.pixott.app.App;

	public class MainMenuHandler {
		public static void dis() {
			System.out.println("PIX OTT APP");
			System.out.println("=============");
			System.out.println("1==>>>>  Signup");
			System.out.println("2==>>>>  Login");
			System.out.println("3==>>>>  Exit");
			System.out.println("=============");
			int ops = App.scanner.nextInt();
			if (ops == 1) {
				SignUpHandler.displayresult();
				MainMenuHandler.dis();
			}
			else if(ops==2) {
				LoginHandler.customers();
				
			}
			else {
				System.out.println("THANK YOU FOR  USING THE APP");
			}
		}

	}


