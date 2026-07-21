# Sort an Array of 0s, 1s, and 2s

## Problem Statement
Given an array `nums` consisting of only `0`, `1`, or `2`. Sort the array in non-decreasing order. The sorting must be done in-place, without making a copy of the original array.

## Examples

### Example 1
- **Input:** `nums = [1, 0, 2, 1, 0]`
- **Output:** `[0, 0, 1, 1, 2]`
- **Explanation:** The `nums` array in sorted order has 2 zeroes, 2 ones, and 1 two.

### Example 2
- **Input:** `nums = [0, 0, 1, 1, 1]`
- **Output:** `[0, 0, 1, 1, 1]`
- **Explanation:** The `nums` array in sorted order has 2 zeroes, 3 ones, and zero twos.

## Algorithms

### 1. Brute Force Approach (Sorting)
The simplest way to solve this is by using a standard sorting algorithm (such as Merge Sort or Heap Sort) or the built-in library sort.

- **Algorithm:**
  1. Simply call the sorting function on the array (e.g., `Arrays.sort(arr)` in Java).
- **Time Complexity:** $O(N \log N)$
- **Space Complexity:** $O(1)$ to $O(N)$ depending on the sorting algorithm used.

---

### 2. Better Approach (Counting Frequency)
Since the array only contains `0`s, `1`s, and `2`s, we can count the frequency of each element and then overwrite the original array.

- **Algorithm:**
  1. Initialize three variables `count0 = 0`, `count1 = 0`, and `count2 = 0` to keep track of the counts.
  2. Traverse the array once and increment the respective counter for each element.
  3. Overwrite the array:
     - Fill the first `count0` positions with `0`.
     - Fill the next `count1` positions with `1`.
     - Fill the remaining positions with `2`.
- **Time Complexity:** $O(N)$ since we iterate through the array twice (once to count, once to overwrite).
- **Space Complexity:** $O(1)$ as we only use three integer variables.

---

### 3. Optimal Approach (Dutch National Flag Algorithm)
Solve this problem in a single pass using three pointers: `low`, `mid`, and `high`.

- **Algorithm:**
  1. Initialize three pointers: `low = 0`, `mid = 0`, `high = n - 1`.
  2. The array is divided into four sections:
     - `arr[0 ... low-1]` contains only `0`s.
     - `arr[low ... mid-1]` contains only `1`s.
     - `arr[mid ... high]` is the unsorted/unexplored region.
     - `arr[high+1 ... n-1]` contains only `2`s.
  3. Run a loop while `mid <= high`:
     - If `arr[mid] == 0`: Swap `arr[low]` and `arr[mid]`, increment `low` and `mid`.
     - If `arr[mid] == 1`: Increment `mid`.
     - If `arr[mid] == 2`: Swap `arr[mid]` and `arr[high]`, decrement `high`.
- **Time Complexity:** $O(N)$ since we traverse the array in a single pass.
- **Space Complexity:** $O(1)$ as no extra space is used.