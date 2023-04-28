package com.kamtech.movierecommandersystem.lesson2;

public class RecommenderImplementation {

    // use filter interface to select filter
    Filter filter;

    public RecommenderImplementation(Filter filter){
        super();
        this.filter = filter;
    }

    // use filter to get recommendations
    public String[] recommendMovies(String movie){

        // print the name of the interface impelementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");


        // use content based filter to get recommendations
        String[] recommendedMovies = filter.getRecommendations(movie);
        return recommendedMovies;
    }
}
