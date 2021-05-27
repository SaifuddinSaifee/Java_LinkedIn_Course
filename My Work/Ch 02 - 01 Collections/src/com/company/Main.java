package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> list1 = Arrays.asList(1,1,2,3,5,8,13,21,34,55);
        System.out.println("Position Of Number 21: " + Collections.binarySearch(list1,21));
    }
}
