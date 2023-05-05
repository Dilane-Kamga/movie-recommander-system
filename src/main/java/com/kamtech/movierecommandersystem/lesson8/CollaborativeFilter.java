package com.kamtech.movierecommandersystem.lesson8;

import com.kamtech.movierecommandersystem.lesson7.Filter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("CF")
@Scope("prototype")
public class CollaborativeFilter implements Filter {

            public String[] getRecommendations(String movie) {
                //logic of collaborative filter
                return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
            }

}
