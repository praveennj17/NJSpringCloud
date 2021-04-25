package com.example.springbootapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
		SimpleCacheManager bean = (SimpleCacheManager) context.getBean("simpleCacheManager");
		
	

//		for (int i = 0; i < 4; i++) {
//			if (i == 2) {
//				bean.clear();
//			}
//			Thread.sleep(1000);
//			bean.getnumbers1();
//			System.out.println("values" + bean.getnumbers1());
//			Thread.sleep(1000);
//		}

	}

}
