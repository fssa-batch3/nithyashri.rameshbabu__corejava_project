package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int length = sc.nextInt();

       
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int value = sc.nextInt();
            num.add(value);
        }

        System.out.println("Unsorted array: " + num);
        Collections.sort(num);
        System.out.println("Sorted array: " + num);
    }
}