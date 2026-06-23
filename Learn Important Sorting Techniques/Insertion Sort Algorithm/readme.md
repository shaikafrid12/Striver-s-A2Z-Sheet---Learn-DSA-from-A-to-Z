Problem Statement: Given an array of integers called nums, sort the array in non-decreasing order using the insertion sort algorithm and return the sorted array.

A sorted array in non-decreasing order is an array where each element is greater than or equal to all preceding elements in the array.

Examples
Example 1:
Input:
  nums = [7, 4, 1, 5, 3]  
Output:
  [1, 3, 4, 5, 7]  
Explanation:
  The array is sorted in non-decreasing order: 1 ≤ 3 ≤ 4 ≤ 5 ≤ 7.

Example 2:
Input:
  nums = [5, 4, 4, 1, 1]  
Output:
  [1, 1, 4, 4, 5]  
Explanation:
  The array is sorted in non-decreasing order: 1 ≤ 1 ≤ 4 ≤ 4 ≤ 5.   


  Algorithm
  
  1. Iterate through the array from the second element to the last element.
  2. For each element, compare it with the previous elements and find the correct position to insert it.
  3. Shift the elements greater than the current element to the right to make space for the current element.
  4. Insert the current element into the correct position.
  5. Repeat until the array is sorted.


  Time Complexity
  - **Worst & Average Case**: $O(N^2)$ when the array is reverse sorted or unsorted.
  - **Best Case**: $O(N)$ when the array is already sorted (runs only 1 pass of the outer loop).
  - **Space Complexity**: $O(1)$ auxiliary space.