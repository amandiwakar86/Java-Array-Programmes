
import java.util.Arrays;
import java.util.Scanner;

public class programes {

    //Create an function to solve question number : 8;
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle if k > n
        if (k == 0 || n == 1) {
            return;
        }
        int i = k;//Soze of first block
        int j = n - k;//Size of second block
        while (i != j) {
            if (i < j) { // A is smaller
                swap(arr, k - i, k + j - i, i);
                j -= i;
            } else { // B is smaller
                swap(arr, k - i, k, j);
                i -= j;
            }
        }
        swap(arr, k - i, k, i);// final swap
    }

    public static void swap(int[] arr, int start1, int start2, int size) {
        for (int i = 0; i < size; i++) {
            int temp = arr[start1 + 1];
            arr[start1 + i] = arr[start2 + i];
            arr[start2 + i] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("Arrays Programes!");
        // Qs.1 : Find the smallest number in an array?
        // Qs.2 : Find the largest number in an array?
        // Qs.3 : Find the second smallest and second largest element in an array?
        // Qs.4 : Reverse a given array?
        // Qs.5 : Count the frequency of each element in an array?
        // Qs.6 : Rearrenge the array in decreasing-increasing order?
        // Qs.7 : Calculate the sum of the elements of the array?
        // Qs.8 : Rotate an array by K elements-Block Swap Algorithm?
        // Qs.9 : Find the average of all elements in anarray?
        // Qs.10 : Find the medial of the given array/
        // Qs.11 : Remove duplicates from a sorted array?
        // Qs.12 : Remove the duplicates from a Unsorted array?
        // Qs.13 : Add an element in an array
        // Qs.14 : Find all repeating elements in an array?
        // Qs.15 : Find all non-repeating elements in an array?
        // Qs.16 : Find all symmetric pairs in an array?
        // Qs.17 : Find the maximum product subarray in an array?
        // Qs.18 : Replace each element of the array by its rank in the array?
        // Qs.19 : Sort the elements of an array by frequency?
        // Qs.20 : Rotate the element of an array (left an right)?
        // Qs.21 : Find the equilibrium index of an array?
        // Qs.22 : Find the circular rotating of an array by K positions?
        // Qs.23 : Sort an array according to the order defined by another array?
        // Qs.24 : Search for an element in an array?
        // Qs.25 : Check if an array is a subset of another array or not?
        // Qs.26 : Count the number of occurrence if a particular element X?
        // Qs.27 : Find the last occurrence of an element x in a given array.
        // Qs.28 : Count the number of elements strictly grater than value x.
        // Qs.29 : Count the number of elements strictly grater than value x.
        // Qs.30 : Find the total number of pairs in the Array whose sum is equal to the given value x.
        // Qs.31 : Count the number of triplets whose sum is equal to the given value x.
        // Qs.32 : Find the  unique number in a given Array where all the elements are being repeated twice with one value unique .

        //---------------------------------------------------------------------------------------------------------->
        // Qs.1 : Find the smallest number in an array?
        System.out.println("--------------------------------------->");
        System.out.println("Question-1 : Find the smallest number in an array?");
        int[] array1 = {23, 34, 46, 45}; // Create an array
        int smallestNum = array1[0]; // let the smallest number is ->
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] < smallestNum) {
                smallestNum = array1[i];
            }
        }
        System.err.println("Ans.1 : The Smallest number is : " + smallestNum);
        System.out.println("--------------------------------------->");
        //-------------------------------------------------------------------------->
        // Qs.2 : Find the largest number in an array?
        System.out.println("Question-2 :  Find the largest number in an array?");
        int[] array2 = {23, 435, 65, 75, 32, 4345, 453, 3}; // Create an array
        int largestNum = array2[0]; // let the largest number is->
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] > largestNum) {
                largestNum = array2[i];
            }
        }
        System.err.println("Ans.2 : The Largest number is : " + largestNum);
        System.out.println("--------------------------------------->");
        //-------------------------------------------------------------------------->
        // Qs.3 : Find the second smallest and second largest element in an array?
        System.out.println("Question-3 : Find the second smallest and second largest element in an array?");
        int[] array3 = {5, 4, 3, 2, 1}; // Creating an array
        if (array3.length < 2) {
            System.out.println("Array must contain at least two distinct element.");
            return;
        }
        // Sort an array
        Arrays.sort(array3);
        // Find the second smallest 
        int Smallest = array3[0];
        int SecSmallest = Integer.MAX_VALUE;
        for (int i : array3) {
            if (i > Smallest) {
                SecSmallest = i;
                break;
            }
        }
        // find the second largest
        int Largest = array3[array3.length - 1];
        int SecLargest = Integer.MIN_VALUE;
        for (int i = array3.length - 1; i >= 0; i--) {
            if (array3[i] < Largest) {
                SecLargest = array3[i];
                break;
            }
        }
        if (SecSmallest == Integer.MAX_VALUE || SecLargest == Integer.MIN_VALUE) {
            System.out.println("Array does not have two distinict element!");
        } else {

            System.err.println("Ans.3 : The Second Samllest number is : " + SecSmallest);
            System.err.println("Ans.3 : The Second Largest number is : " + SecLargest);
        }
        System.out.println("--------------------------------------->");

        //-------------------------------------------------------------------------->
        // Qs.4 : Reverse a given array?
        System.out.println("Question-4 : Reverse a given array?");
        int[] array4 = {1, 2, 3, 4, 5};
        System.out.println("Ans-4 : Original array: " + Arrays.toString(array4));
        // Reverse the array
        int start = 0;
        int end = array4.length - 1;
        while (start < end) {
            // swap the elements
            int temp = array4[start];
            array4[start] = array4[end];
            array4[end] = temp;
            // Move the pointer
            start++;
            end--;
        }
        System.out.println("Ans-4 : Reversed array is : " + Arrays.toString(array4));
        System.out.println("--------------------------------------->");

        //-------------------------------------------------------------------------->
        // Qs.5 : Count the frequency of each element in an array?
        System.out.println("Question-5 : Count the frequency of each element in an array?");
        int[] arr5 = {1, 2, 2, 3, 4, 5};
        int n = arr5.length;
        boolean[] isvisited = new boolean[n];
        System.out.print("Ans-5 : Count the frequency of each element in an array : ");
        for (int i = 0; i < n; i++) {
            if (isvisited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr5[i] == arr5[j]) {
                    count++;
                    isvisited[j] = true;
                }
            }
            System.out.print(" " + arr5[i] + " | " + count + " , ");
        }
        System.out.println();
        System.out.println("--------------------------------------->");

        //-------------------------------------------------------------------------->
        // Qs.6 : Rearrenge the array in increasing-decreasing order?
        System.out.println("Question-6 : Rearrenge the array in increasing-decreasing order?");
        int[] arr6 = {5, 2, 8, 7, 3, 6, 4, 1};
        int arr6Length = arr6.length;
        // Sorting the array in assending order;
        for (int i = 0; i < arr6Length - 1; i++) {
            for (int j = i + 1; j < arr6Length; j++) {
                if (arr6[i] == arr6[j]) {
                    int temp = arr6[i];
                    arr6[i] = arr6[j];
                    arr6[j] = temp;
                }
            }
        }

        // find the min
        int mid = arr6Length / 2;
        int k = 0;
        int[] result = new int[arr6Length];
        // for increasing
        for (int i = 0; i < mid; i++) {
            result[k++] = arr6[i];
        }
        // for decreasing
        for (int i = arr6Length - 1; i >= mid; i--) {
            result[k++] = arr6[i];
        }
        // Print the rearenged array
        System.out.print("Ans-6 :The Rearenged (Increasing-Decreasing Order) : ");
        for (int i = 0; i < arr6Length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------------------->");

        //-------------------------------------------------------------------------->
        // Qs.7 : Calculate the sum of the elements of the array?
        System.out.println("Question-7 : Calculate the sum of the elements of the array?");
        int[] arr7 = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr7.length; i++) {
            sum += arr7[i];
        }
        System.out.println("Ans-7 : The sum of all Array Elements is : " + sum);
        System.out.println("--------------------------------------->");

        //-------------------------------------------------------------------------->
        // Qs.8 : Rotate an array by K elements-Block Swap Algorithm?
        System.out.println("Question-8 : Rotate an array by K elements-Block Swap Algorithm?");
        int arr8[] = {1, 2, 3, 4, 5};
        int k1 = 2; // Rotate bt k element
        rotate(arr8, k1);
        System.out.println("Ans-8 : Rotate array : " + Arrays.toString(arr8));

        //-------------------------------------------------------------------------->
        // Qs.9 : Find the average of all elements in anarray?
        System.out.println("Question-9 : Find the average of all elements in anarray?");
        int[] arr9 = {1, 2, 3, 4, 5};
        int sumOfArr9 = 0;
        for (int i = 0; i < arr9.length; i++) {
            sumOfArr9 += arr9[i];
        }
        int avg = sumOfArr9 / arr9.length;
        System.out.println("Ans-9 : The average of all array elements is : " + avg);
        System.out.println("--------------------------------------->");

        //-------------------------------------------------------------------------->
        // Qs.10 : Find the medial of the given array?
        System.out.println("Question-10 :  Find the medial of the given array?");
        int[] arr10 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr10.length; i++) {
            System.out.print(arr10[i] + " ");
        }
        System.out.println();
        int arr10Length = arr10.length;
        int mid10 = arr10Length / 2;
        System.out.println(mid10);
        System.out.println("--------------------------------------->");

        //-------------------------------------------------------------------------->
        // Qs.11 : Remove duplicates from a sorted array?
        System.out.println("Question-11 : Remove duplicates from a sorted array?");
        int[] arr11 = {1, 2, 2, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Ans-11 : Remove duplicates from a sorted array : ");
        for (int i = 0; i < arr11.length - 1; i++) {
            if (arr11[i] == arr11[i + 1]) {
                continue;
            }
            System.out.print(arr11[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------------------->");

        //-------------------------------------------------------------------------->
        // Qs.12 : Remove the duplicates from a Unsorted array?
        System.out.println("Question-12 : Remove the duplicates from a Unsorted array?");
        int[] arr12 = {3, 6, 2, 1, 1, 4, 8, 6, 6};
        System.out.print("Ans-12 : ");
        for (int i = 0; i < arr12.length - 1; i++) {
            if (arr12[i] == arr12[i + 1]) {
                continue;
            }
            System.out.print(arr12[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------------------->");
        //-------------------------------------------------------------------------->
        // Qs.13 : Add an element in an array
        System.out.println("Question-13 : Add an element in an array");
        System.out.println("--------------------------------------->");

        //-------------------------------------------------------------------------->
        // Qs.14 : Find all repeating elements in an array?
        System.out.println("Question-14 : Find all repeating elements in an array?");
        int[] arr14 = {1, 2, 2, 3, 4, 5, 5, 6, 6, 7, 8, 9, 10};
        int[] repeatedElements = new int[arr14.length];
        for (int i = 0; i < arr14.length - 1; i++) {
            if (arr14[i] == arr14[i + 1]) {
                repeatedElements[i] = arr14[i];
            }
            System.out.print(repeatedElements[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------------------->");

        //-------------------------------------------------------------------------->
        // Qs.15 : Find all non-repeating elements in an array?
        System.out.println("Question-15 : Find all non-repeating elements in an array?");
        System.out.println("--------------------------------------->");
        //-------------------------------------------------------------------------->
        // Qs.16 : Find all symmetric pairs in an array?
        System.out.println("Question-16 : Find all symmetric pairs in an array?");
        System.out.println("--------------------------------------->");
        //-------------------------------------------------------------------------->
        // Qs.17 : Find the maximum product subarray in an array?
        System.out.println("Question-17 : Find the maximum product subarray in an array?");
        System.out.println("--------------------------------------->");
        //-------------------------------------------------------------------------->
        // Qs.18 : Replace each element of the array by its rank in the array?
        System.out.println("Question-18 : Replace each element of the array by its rank in the array?");
        System.out.println("--------------------------------------->");
        //-------------------------------------------------------------------------->
        // Qs.19 : Sort the elements of an array by frequency?
        System.out.println("Question-19 :  Sort the elements of an array by frequency?");
        int[] arr19 = {6, 4, 1, 2, 2, 3, 3, 3, 7, 5, 8};
        System.out.print("Ans-19 : Sort an array by frequency :  ");
        for (int i = 0; i < arr19.length - 1; i++) {
            for (int j = i; j < arr19.length - 1; j++) {
                if (arr19[i] >= arr19[j + 1]) {
                    int temp = arr19[i];
                    arr19[i] = arr19[j + 1];
                    arr19[j + 1] = temp;
                }
            }
            System.out.print(arr19[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------------------->");

        //-------------------------------------------------------------------------->
        // Qs.20 : Rotate the element of an array (left an right)?
        System.out.println("Question-20 : Rotate the element of an array (left an right)?");
        System.out.println("--------------------------------------->");
        //-------------------------------------------------------------------------->
        // Qs.21 : Find the equilibrium index of an array?
        System.out.println("Question-21 : Find the equilibrium index of an array?");
        System.out.println("--------------------------------------->");
        //-------------------------------------------------------------------------->
        // Qs.22 : Find the circular rotating of an array by K positions?
        System.out.println("Question-22 :  Find the circular rotating of an array by K positions?");
        System.out.println("--------------------------------------->");
        //-------------------------------------------------------------------------->
        // Qs.23 : Sort an array according to the order defined by another array?
        System.out.println("Question-23 : Sort an array according to the order defined by another array?");
        int[] arr23 = {3, 6, 1, 2, 4, 9, 7, 8, 0, 5};
        int[] anotherArr23 = {5, 4, 3, 2, 1, 0, 9, 8, 7, 6};
        //print the Original array
        System.out.print("The Original array is: ");
        for (int i = 0; i < arr23.length; i++) {
            System.out.print(arr23[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < arr23.length; i++) {
            if (arr23[i] != anotherArr23[i]) {
                int temp = arr23[i];
                arr23[i] = arr23[i - 1];
                arr23[i - 1] = temp;
            }
            System.out.print(arr23[i] + " ");
        }
        System.out.println("--------------------------------------->");
        System.out.println();
        //-------------------------------------------------------------------------->
        // Qs.24 : Search for an element in an array?
        System.out.println("Question-24 : Search for an element in an array?");
        int[] arr24 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean isExist = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ans-24 : Enter the number Which you want to find : ");
        int num = sc.nextInt();
        for (int i = 0; i < arr24.length; i++) {
            if (arr24[i] == num) {
                isExist = true;
            }
        }
        if (isExist) {
            System.out.println("Ans-24 : The number is Exist in this Array.");
        } else {
            System.out.println("Ans-24 : The number is not found.");
        }
        System.out.println("--------------------------------------->");
        //-------------------------------------------------------------------------->
        // Qs.25 : Check if an array is a subset of another array or not?
        System.out.println("Question-25 : Check if an array is a subset of another array or not?");
        System.out.println("--------------------------------------->");

        //-------------------------------------------------------------------------->
        // Qs.26 : Count the number of occurrence if a particular element X?
        System.out.println("Question-26 : Count the number of occurrence if a particular element X.");
        int[] arr26 = {1, 2, 3, 4, 5, 6, 5, 7, 5, 8, 5};
        int x = 2;
        int count = 0;
        for (int i = 0; i < arr26.length; i++) {
            if (arr26[i] == x) {
                count++;
            }
        }
        System.out.println("Number of elements is " + count);
        System.out.println("--------------------------------------->");
        System.out.println();
        //-------------------------------------------------------------------------->
        // Qs.27 : Find the last occurrence of an element x in a given array.
        System.out.println("Question-27 :  Find the last occurrence of an element x in a given array.");
        int[] arr27 = {1, 2, 3, 4, 4, 5, 5, 5, 5, 6, 7, 8, 9};
        int x2 = 5;
        int lastIdx = -1;
        for (int i = 0; i < arr27.length; i++) {
            if (arr27[i] == x2) {
                lastIdx = i;
            }
        }
        System.out.println("The last occurrrence of the element is :  " + lastIdx);
        System.out.println("--------------------------------------->");
        System.out.println();
        //-------------------------------------------------------------------------->
        // Qs.28 : Count the number of elements strictly grater than value x.
        System.out.println("Question-28 : Count the number of elements strictly grater than value x.");
        int[] arr28 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x3 = 1;
        int count3 = 0;
        for (int i = 0; i < arr28.length; i++) {
            if (arr28[i] > x3) {
                count3++;
            }
        }
        System.out.println("The number of elements stricyly greater than value x is : " + count3);
        System.out.println("--------------------------------------->");
        System.out.println();

        //-------------------------------------------------------------------------->
        // Qs.29 : Count the number of elements strictly grater than value x.
        System.out.println("Question-29 : Check if the given array id sorted or not?");
        int[] arr29 = {1, 2, 32, 4, 5};
        boolean isSorted = true;
        for (int i = 1; i < arr29.length; i++) {
            if (arr29[i] < arr29[i - 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted == true) {
            System.out.println("The given array is Sorted.");
        } else {
            System.out.println("The given array is not sortd.");
        }
        System.out.println("--------------------------------------->");
        System.out.println();

        //-------------------------------------------------------------------------->
        // Qs.30 : Find the total number of pairs in the Array whose sum is equal to the given value x.
        System.out.println("Question-30 : Find the total number of pairs in the Array whose sum is equal to the given value x.");
        // Like Array is 4|6|3|5|8|2 , target = 7 ,ans 2 , pairs (4,3) , (5,2);
        int[] arr30 = {4, 6, 3, 5, 8, 2}; // define an array
        int target = 10; // let target is 10
        int ans3 = 0; // ans is 0
        for (int i = 0; i < arr30.length; i++) { // Pick the first number
            for (int j = i + 1; j < arr30.length; j++) { // pick second number
                if (arr30[i] + arr30[j] == target) { // compaire the numbers
                    ans3++; // increase the nuber
                }
            }
        }
        System.out.print("The Answer is : " + ans3);
        System.out.println("--------------------------------------->");
        System.out.println();

        //-------------------------------------------------------------------------->
        // Qs.31 : Count the number of triplets whose sum is equal to the given value x.
        // Like Array is 1|4|5|6|3 , target = 12 ,ans 2 , pairs (1,5,6) , (4,5,3);
        System.out.println("Question-31 Count the number of triplets whose sum is equal to the given value x.");
        int[] arr31 = {1, 4, 5, 6, 3};
        int target7 = 9;
        int ans7 = 0;
        for (int i = 0; i < arr31.length; i++) { // Pick first number
            for (int j = i + 1; j < arr31.length; j++) { // Pick second number
                for (int l = i + 2; l < arr31.length; l++) {// Pic j third number
                    if (arr31[i] + arr31[j] + arr31[l] == target7) {
                        ans7++;
                    }
                }
            }
        }
        System.out.println("The ans is : " + ans7);
        System.out.println("--------------------------------------->");
        System.out.println();
        //-------------------------------------------------------------------------->
        // Qs.32 : Find the  unique number in a given Array where all the elements are being repeated twice with one value unique .
        // Pattern : Array Manipulation
        // Find the  unique number in a given Array where all the elements are being repeated twice with one value unique .
        System.out.println("Question-32 : Find the  unique number in a given Array where all the elements are being repeated twice with one value unique .");
        int[] arr32 = {1, 2, 3, 4, 2, 1, 3};
        int uniQuenumber = 0;
        for (int i = 0; i < arr32.length; i++) {
            for (int j = i + 1; j < arr32.length; j++) {
                if (arr32[i] == arr32[j]) {
                    arr32[i] = -1;
                    arr32[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr32.length; i++) {
            if (arr32[i] > 0) {
                uniQuenumber = arr32[i];
            }
        }
        System.out.println("The Unique number is " + uniQuenumber);
        System.out.println("--------------------------------------->");
        System.out.println();
        //-------------------------------------------------------------------------->
    }
}
