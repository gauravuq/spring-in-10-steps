package com.gaurav.spring.basics.springin10steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // Since we have two SortAlgorithm beans , this Annotation make it default bean to be injected as dependencies where ever Sort Algorithm is required
@Qualifier("quickSortAlgorithm")
public class QuickSortAlgorithm implements SortAlgorithm {

    public int[] sort (int[] numbers){
        return numbers;
    }
}
