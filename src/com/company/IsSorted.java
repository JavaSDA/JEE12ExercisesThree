package com.company;

public class IsSorted {
    public static void main(String[] args) {
//        double[] numbers = new double[]{23.5, 44, 99, 12.3};
        double[] numbers = new double[]{23.5, 44, 99};
        if (isSorted(numbers)) {
            System.out.println("The array is in sorted order");
        } else {
            System.out.println("The array is not in sorted order");
        }
    }
    public static boolean isSorted(double[] numbers) {
        // Set to true to assume that the array is sorted at
        // the beginning.
        boolean sorted = true;

        // Loop through the array. If at any point, the preceding
        // element is not smaller or equal to the subsequent element
        // then the array is not sorted.

        // Be sure to check up to the last item, instead of using just the length
        // since we are using (i + 1).
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
