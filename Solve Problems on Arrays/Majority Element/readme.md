# Find the Majority Element (Occurs > N/2 times)

## Problem Statement
Given an integer array `nums` of size `n`, return the majority element of the array.

The majority element is the element that appears more than `n/2` times in the array. You may assume that the majority element always exists in the array.

## Examples

### Example 1
- **Input:** `nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]`
- **Output:** `7`
- **Explanation:** The number `7` appears 5 times in the 9-sized array, making it the majority element.

### Example 2
- **Input:** `nums = [1, 1, 1, 2, 1, 2]`
- **Output:** `1`
- **Explanation:** The number `1` appears 4 times in the 6-sized array, making it the majority element.

## Algorithms

### 1. Brute Force Approach
Check the frequency of every element in the array using nested loops.

- **Algorithm:**
  1. Loop through the array from `i = 0` to `n - 1`.
  2. For each element `arr[i]`, start a nested loop `j = 0` to `n - 1` to count its occurrences.
  3. If the count of occurrences is greater than `n / 2`, return `arr[i]`.
- **Time Complexity:** $O(N^2)$ due to nested loops.
- **Space Complexity:** $O(1)$ as no extra space is used.

---

### 2. Better Approach (Using HashMap)
Count the frequencies of all elements using a hash map and check if any element has a frequency greater than `n / 2`.

- **Algorithm:**
  1. Initialize a hash map to store `(element, frequency)`.
  2. Traverse the array and insert/update the count of each element in the map.
  3. Iterate through the keys of the hash map.
  4. If any element's frequency is greater than `n / 2`, return that element.
- **Time Complexity:** $O(N)$ on average (assuming hash map operations are $O(1)$).
- **Space Complexity:** $O(N)$ to store the array elements in the map.

---

### 3. Optimal Approach (Boyer-Moore Voting Algorithm)
Since a majority element appears more than `n / 2` times, it will always survive the cancellation against other elements.

- **Algorithm:**
  1. Initialize `count = 0` and `element = 0`.
  2. Traverse the array:
     - If `count == 0`, select the current element as the candidate (`element = arr[i]`) and set `count = 1`.
     - Else if the current element is equal to `element`, increment `count`.
     - Else, decrement `count`.
  3. (Verification step) Check if the candidate `element` actually appears more than `n / 2` times by counting its total occurrences. If it does, return `element`; otherwise, return `-1`.
- **Time Complexity:** $O(N)$ since we traverse the array at most twice.
- **Space Complexity:** $O(1)$ as no extra space is used.