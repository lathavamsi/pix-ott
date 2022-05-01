package com.revature.fsd.pixott.customer.dao;
import com.revature.fsd.pixott.app.App;

public class AdminDao {
	
		public static void modify() 
		{
			App.scanner.nextLine();
			System.out.println("Search a Movie with Keyword");
			String moviename = App.scanner.nextLine();
			SearchMovies.search(moviename);
			System.out.println("Select a Movie to Update Enter [ID]");
			int select = App.scanner.nextInt();
			System.out.println("what is the Updated name for Movie with Id"+select+"?");
			App.scanner.nextLine();
			String updated = App.scanner.nextLine();
			String name=MovieNames.method(select);
			UpdateidMovieDao.update(updated, select);	
		}


}
