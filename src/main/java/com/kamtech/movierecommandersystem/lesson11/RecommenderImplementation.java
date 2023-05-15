package com.kamtech.movierecommandersystem.lesson11;

import com.kamtech.movierecommandersystem.lesson7.Filter;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class RecommenderImplementation {

    private Logger logger = LoggerFactory.getLogger(this.getClass());




    private Filter filter;

    @Autowired
    public void setFilter(@Qualifier("collaborativeFilter") Filter filter){
        this.filter = filter;
        System.out.println("Setter invoked...");
    }
    @Autowired
    public RecommenderImplementation(Filter filter){
        logger.info("Constructor invoked...");
        this.filter = filter;

    }

    public String[] recommendMovies(String movie){
        System.out.println("Name of the filter in use: "+filter);
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
