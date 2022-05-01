package com.revature.fsd.pixott.customer.handler;
import java.util.List;

import com.revature.fsd.pixott.customer.dao.MovieDao;
import com.revature.fsd.pixott.customer.model.Movie;

public class MovieHandler {
	public static void displayMovie() {
		MovieDao dao = new MovieDao();
		List<Movie> movies = dao.findAll();
		System.out.println("movies");
		System.out.println();
		System.out.printf("%4s %-40s\n", "Id", "Name");
		System.out.printf("%4s %-40s\n", "==", "====");
		movies.forEach(System.out::println);
		System.out.println();
		MainMenuHandler.dis();
	}

}
