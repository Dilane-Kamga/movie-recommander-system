package com.kamtech.movierecommandersystem.lesson8;


import com.kamtech.movierecommandersystem.lesson7.Filter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {

        public String[] getRecommendations(String movie) {
            //logic of content based filter
            return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
        }
}
