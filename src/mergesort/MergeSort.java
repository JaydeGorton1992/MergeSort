/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> UnsortedList = new ArrayList<>();
        
        UnsortedList.add("D");
        UnsortedList.add("G");
        
        UnsortedList.add("H");
        UnsortedList.add("M");
        UnsortedList.add("L");
        UnsortedList.add("K");
        UnsortedList.add("N");
        UnsortedList.add("C");
        UnsortedList.add("B");
        UnsortedList.add("A");
        UnsortedList.add("J");
        UnsortedList.add("I");
        UnsortedList.add("F");
        UnsortedList.add("E");
        
        for (String i : UnsortedList) {
         //   System.out.println(i);
        }
        List<String> mergeSort2 = mergeSort(new ArrayList<>(UnsortedList));
        System.out.println("\n" + mergeSort2 + "Final Array");
    
     
    
    }
    
    private static List<String> mergeSort(List<String> ListToSort) {
        if (ListToSort.size() <= 1) {
         //  System.out.println(ListToSort + "Sorted");
            return ListToSort;
        }
       // System.out.println(ListToSort.toString() + "List to Sort");
        List partA = mergeSort(new ArrayList<>(ListToSort.subList(0, ListToSort.size() / 2)));
        List partB = mergeSort(new ArrayList<>(ListToSort.subList(ListToSort.size() / 2, ListToSort.size())));
        ListToSort = merge(partA, partB);
       // System.out.println(ListToSort + "ReturnSort");
        return ListToSort;
    }
    
    private static List<String> merge(List<String> ListA, List<String> ListB) {
        List<String> result = new ArrayList<>();
        
        if(ListA.size() <= 0 && ListB.size() <= 0)
        {
            return result;
        }       
        System.out.println(ListA + "Part A");
        System.out.println(ListB + "Part B");
        while ((ListA.size() >= 1 || ListB.size() >= 1)) {
            if (ListA.size() >= 1 && ListB.size() >= 1) {
                if (ListA.get(0).compareTo(ListB.get(0)) < 0) {
                    //System.out.println(ListA.get(0) + " < " + ListB.get(0));
                    result.add(ListA.get(0));
                   
                    ListA.remove(0);
                } else {
                    //System.out.println(ListA.get(0) + " > " + ListB.get(0));
                    result.add(ListB.get(0));
                    ListB.remove(0);
                    
                }
            } else if (!ListA.isEmpty()) {
                result.addAll(ListA);
                ListA.removeAll(ListA);
            } else if (!ListB.isEmpty()) {
                result.addAll(ListB);
                ListB.removeAll(ListB);
            }
        }
        System.out.println(result
               + " Sort Result");
        return result;
    }
}
