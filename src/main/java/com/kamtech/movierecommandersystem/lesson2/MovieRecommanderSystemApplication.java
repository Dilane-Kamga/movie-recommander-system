package com.kamtech.movierecommandersystem.lesson2;

import com.kamtech.movierecommandersystem.lesson1.RecommanderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommanderSystemApplication {

	public static void main(String[] args) {

		// call recommander implementation
		RecommenderImplementation recommanderImplementation = new RecommenderImplementation(new CollaborativeFilter());
		String[] recommendedMovies = recommanderImplementation.recommendMovies("Finding Dory");

		// print recommended movies
		System.out.println("Recommended movies: " + Arrays.toString(recommendedMovies));

//		SpringApplication.run(MovieRecommanderSystemApplication.class, args);
	}

}
