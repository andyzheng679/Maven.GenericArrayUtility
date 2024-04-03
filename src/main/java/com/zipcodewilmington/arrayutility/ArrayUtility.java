package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    private T[] array;

    public ArrayUtility(T[] array){
        this.array = array;
    }
    public int countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        List<T> merged = new ArrayList<>();
        merged.addAll(Arrays.asList(this.array));
        merged.addAll(Arrays.asList(arrayToMerge));

        int counter = 0;

        for(int i = 0; i < merged.size(); i++){
            if(merged.get(i).equals(valueToEvaluate)){
                counter++;
            }
        }

        return counter;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        List<T> merged = new ArrayList<>();
        merged.addAll(Arrays.asList(this.array));
        merged.addAll(Arrays.asList(arrayToMerge));

        int maxCount = 0;
        T element = null;

        for(int i = 0; i < merged.size(); i++){
            int count = 0;
            for(int j = 0; j < merged.size(); j++){
                if(merged.get(i).equals(merged.get(j))){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                element = merged.get(i);
            }
        }
        
        return element;
    }

    public int getNumberOfOccurrences(T valueToEvaluate) {
        return  0;
    }

    public T[] removeValue(T valueToRemove) {
        return null;
    }
}
