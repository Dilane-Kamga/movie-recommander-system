package com.kamtech.movierecommandersystem.lesson8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommanderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(MovieRecommanderSystemApplication.class, args);


		// retrieve singleton bean from application context thrice
		ContentBasedFilter cbf1 = applicationContext.getBean(ContentBasedFilter.class);
		ContentBasedFilter cbf2 = applicationContext.getBean(ContentBasedFilter.class);
		ContentBasedFilter cbf3 = applicationContext.getBean(ContentBasedFilter.class);

		System.out.println(cbf1);
		System.out.println(cbf2);
		System.out.println(cbf3);

		System.out.println("=====================================");

		// retrieve prototype bean from application context thrice
		CollaborativeFilter cf1 = applicationContext.getBean(CollaborativeFilter.class);
		CollaborativeFilter cf2 = applicationContext.getBean(CollaborativeFilter.class);
		CollaborativeFilter cf3 = applicationContext.getBean(CollaborativeFilter.class);


		System.out.println(cf1);
		System.out.println(cf2);
		System.out.println(cf3);
	}

}
