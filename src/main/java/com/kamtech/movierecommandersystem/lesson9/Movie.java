package com.kamtech.movierecommandersystem.lesson9;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode= ScopedProxyMode.TARGET_CLASS) // this will create new instance of Movie class for every request
public class Movie {

    // for keeping track of created instances
    private static int count = 0;

    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie(){
        count++;
        System.out.println("Movie object created");
    }

    public static int getCount(){
        return count;
    }

}
