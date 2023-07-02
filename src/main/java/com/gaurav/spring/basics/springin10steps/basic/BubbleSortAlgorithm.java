package com.gaurav.spring.basics.springin10steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubbleSortAlgorithm")
public class BubbleSortAlgorithm implements SortAlgorithm{


    public int[] sort (int[] numbers){
        return numbers;
    }

}
