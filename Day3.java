
/*Problem : Find the Duplicate Number
You are given an array arr containing n+1 integers, where each integer is in the range [1, n] inclusive. There is exactly one duplicate number in the array, but it may appear more than once. Your task is to find the duplicate number without modifying the array and using constant extra space.

Input :
An integer array arr of size n+1, where each element is an integer in the range [1, n].
Example : arr = [3, 1, 3, 4, 2]

Output :
Return the duplicate integer present in the array.
Example: Duplicate number: 3
 */

import java.util.HashSet;

public class Day3{
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,3};
        System.out.println("Duplicate number is : " + duplicateNumber(arr));

        // -> Test Cases :
        // int[] arr2 = {1, 3, 4, 2, 2};
        // int[] arr3 = {3, 1, 3, 4, 2};
        // System.out.println("Duplicate number is : " + duplicateNumber(arr2));
        // System.out.println("Duplicate number is : " + duplicateNumber(arr3));
    }

    public static int duplicateNumber(int[] arr){
        //set implementation to store unique elements
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return arr[i];
            }
            set.add(arr[i]);
        }
        return -1;
    }
}