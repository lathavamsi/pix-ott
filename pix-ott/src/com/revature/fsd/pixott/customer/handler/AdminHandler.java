package com.revature.fsd.pixott.customer.handler;


	import com.revature.fsd.pixott.Customerusage.DisplayTrending5;
import com.revature.fsd.pixott.app.App;
import com.revature.fsd.pixott.customer.dao.AdminDropDao;
import com.revature.fsd.pixott.customer.dao.MovieNames;
import com.revature.fsd.pixott.customer.dao.SearchMovies;
import com.revature.fsd.pixott.customer.dao.UpdateMovieDao;
import com.revature.fsd.pixott.customer.dao.UpdateidMovieDao;

	public class AdminHandler {
		public static void remove() {
			System.out.println("Select a Movie to Remove from Trending5 (EnterId) :");
			int idofmovie=App.scanner.nextInt();
			System.out.println("Search a Movie with Keyword");
			App.scanner.nextLine();
			String original = App.scanner.nextLine();
			SearchMovies.search(original);
			System.out.println("Select a Movie to Add to trend 5 (Enter Id)");
			int changemovie = App.scanner.nextInt();
			String name=MovieNames.method(changemovie);
			UpdateMovieDao.update(idofmovie,name);
			int total=UpdateidMovieDao.updateid(name);
			UpdateidMovieDao.insertid(total, name);
			System.out.println();
			System.out.println("Top 5 Movies After Changes");
			System.out.println("============================");
			AdminDropDao.remove();
			
			
			
			
		}

	}


