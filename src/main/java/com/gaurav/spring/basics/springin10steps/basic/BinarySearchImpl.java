package com.gaurav.spring.basics.springin10steps.basic;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Slf4j
public class BinarySearchImpl {


    @Autowired
    @Qualifier("quickSortAlgorithm")
    private SortAlgorithm sortAlgorithm;

    // Auto-wiring with name
    /* @Autowired
    private SortAlgorithm bubbleSortAlgorithm;*/

    // Constructor Injection
   /* public BinarySearchImpl( SortAlgorithm sortAlgorithm) {  // @Qualifier Annotation is to force to choose a specific type of Sorting Algorithm, even though we have @Primary on QuickSortAlgorithm.
        this.sortAlgorithm = sortAlgorithm;
    }*/

    // Setter Injection
   /* public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.bubbleSortAlgorithm = sortAlgorithm;
    }*/

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println("Which sort algo ? : " + sortAlgorithm.getClass());
        return 3;
    }

    // Sorting an array
    // Search the array
    // Return the result


}
