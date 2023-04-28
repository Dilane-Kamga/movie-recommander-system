package com.kamtech.movierecommandersystem.lesson2;

public class ContentBasedFilter implements Filter{

        public String[] getRecommendations(String movie){

            // logic of content based filter
            return new String[]{"movie1", "movie2", "movie3"};
        }

}