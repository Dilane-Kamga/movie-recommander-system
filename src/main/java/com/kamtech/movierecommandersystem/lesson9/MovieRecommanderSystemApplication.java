package com.kamtech.movierecommandersystem.lesson9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommanderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(MovieRecommanderSystemApplication.class, args);


		// retrieve singleton bean from application context
		ContentBasedFilter filter = applicationContext.getBean(ContentBasedFilter.class);
		System.out.println("\nContentBasedFilter bean with singleton scope");
		System.out.println(filter);



		// retrieve prototype bean from application context thrice
		Movie movie1 = filter.getMovie();
		Movie movie2 = filter.getMovie();
		Movie movie3 = filter.getMovie();

		System.out.println("\nMovie bean with prototype scope");
		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println(movie3);


		// print count of created instances of Movie class
		System.out.println("\nCount of created instances of Movie class: "+ Movie.getCount());
		System.out.println("\nCount of created instances of ContentBasedFilter class: "+ ContentBasedFilter.getCount());
	}

}
