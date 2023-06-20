package com.gaurav.spring.basics.springin10steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {


    @Autowired
    @Qualifier("bubbleSortAlgorithm")
    private SortAlgorithm sortAlgorithm;

    // Constructor Injection
   /* public BinarySearchImpl( SortAlgorithm sortAlgorithm) {  // @Qualifier Annotation is to force to choose a specific type of Sorting Algorithm, even though we have @Primary on QuickSortAlgorithm.
        this.sortAlgorithm = sortAlgorithm;
    }*/

    // Setter Injection
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        return 3;
    }

    // Sorting an array
    // Search the array
    // Return the result
}
