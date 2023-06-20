package com.gaurav.spring.basics.springin10steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
// the above annotation automatically searches the package and the sub-packages from the relevant position of this class file.
public class SpringIn10StepsApplication {



	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsApplication.class, args);
		// Spring creates the below two through @Component & @Beans
		//BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		//QuickSortAlgorithm quickSortAlgorithm = new QuickSortAlgorithm();
		//BinarySearchImpl binarySearch = new BinarySearchImpl(bubbleSortAlgorithm);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result  = binarySearch.binarySearch(new int[]{1,3,4,2},3);
		System.out.println("Which Algo ? :" + binarySearch);
		System.out.println("Result :" + result);

	}

}
