package com.kamtech.movierecommandersystem.lesson4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommanderSystemApplication {

	public static void main(String[] args) {

		// application context manages the beans and dependencies
		ApplicationContext applicationContext = SpringApplication.run(MovieRecommanderSystemApplication.class, args);

		// use application context to find which filter is being used
		RecommenderImplementation recommenderImplementation = applicationContext.getBean(RecommenderImplementation.class);

		// call method to get recommended movies
		String[] recommendedMovies = recommenderImplementation.recommendMovies("Finding Dory");

		// print recommended movies
		System.out.println("Recommended movies: " + Arrays.toString(recommendedMovies));

	}

}
