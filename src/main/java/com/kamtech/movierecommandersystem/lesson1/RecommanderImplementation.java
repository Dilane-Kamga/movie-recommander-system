package com.kamtech.movierecommandersystem.lesson1;

public class RecommanderImplementation {

    public String[] recommendMovies(String movie){

        // use content based filter to get recommendations
        ContentBasedFilter contentBasedFilter = new ContentBasedFilter();
        String[] recommendedMovies = contentBasedFilter.getRecommendations(movie);
        return recommendedMovies;
    }
}
