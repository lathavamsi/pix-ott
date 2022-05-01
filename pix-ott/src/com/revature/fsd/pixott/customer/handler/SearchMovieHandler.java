package com.revature.fsd.pixott.customer.handler;


	import java.util.List;

import com.revature.fsd.pixott.Customerusage.DisplayTrending5;
import com.revature.fsd.pixott.app.App;
import com.revature.fsd.pixott.customer.dao.SearchMovies;
import com.revature.fsd.pixott.customer.model.Trending5Movies;

	public class SearchMovieHandler {
		public static void searchmovie() {
			App.scanner.nextLine();
			System.out.println("find Movie");
			System.out.println("==========");
			String moviename= App.scanner.nextLine();
			SearchMovies.search(moviename);
			DisplayTrending5.menuhandler();
			
		}
		

	}


