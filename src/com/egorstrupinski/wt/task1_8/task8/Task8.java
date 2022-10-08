package com.egorstrupinski.wt.task1_8.task8;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public Object[] calculate(int[] arr1, int[] arr2) {
        List<Integer> ansList = new ArrayList<>();
        int iterator = 0;
        for (int i = 0; i < arr1.length; i++) {
            if((iterator != arr2.length) && arr2[iterator] < arr1[i]){
                ansList.add(i);
                iterator++;
            }
        }
        System.out.println(ansList.toString());
        return ansList.toArray();
    }
}
