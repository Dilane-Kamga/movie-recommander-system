package com.kamtech.movierecommandersystem.lesson9;


import com.kamtech.movierecommandersystem.lesson7.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {

    private static int count = 0;

    @Autowired
    Movie movie;

    public ContentBasedFilter() {
        count++;
        System.out.println("ContentBasedFilter object created");
    }

    public Movie getMovie() {
        return movie;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String[] getRecommendations(String movie) {
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
