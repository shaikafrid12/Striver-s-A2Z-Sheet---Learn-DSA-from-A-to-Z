# Next Permutation

Given an array of integers, rearrange the numbers into the lexicographically next greater permutation of numbers.
If such an arrangement is not possible, it must rearrange to the lowest possible order (i.e., sorted in ascending order).

## Examples
- **Input**: `Arr[] = {1, 3, 2}`
  - **Output**: `{2, 1, 3}`
  - **Explanation**: All permutations of `{1, 2, 3}` are `{{1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}}`. The next permutation just after `{1, 3, 2}` is `{2, 1, 3}`.
- **Input**: `Arr[] = {3, 2, 1}`
  - **Output**: `{1, 2, 3}`
  - **Explanation**: Since `{3, 2, 1}` is the last permutation, we wrap around to return the lowest permutation `{1, 2, 3}`.

---

## 1. Brute Force Approach
1. **Generate**: Recursively generate all unique permutations of the array.
2. **Sort**: Sort all permutations lexicographically.
3. **Search**: Search for the index of the current permutation in the sorted list.
4. **Next**: Return the permutation at `(index + 1) % total_permutations`.

### Complexity Analysis
- **Time Complexity**: $O(N! \times N)$ to generate all permutations, and $O(N! \log(N!) \times N)$ to sort them.
- **Space Complexity**: $O(N! \times N)$ to store the generated permutations.

---

## 2. Optimal Approach
Instead of generating all permutations, we can find the next permutation in a single pass ($O(N)$ time) with the following steps:
1. **Find the break-point**: Find the first element from the right that is smaller than its next element:
   Find the largest index $k$ such that $arr[k] < arr[k+1]$.
2. **If no break-point exists**: The array is in descending order (last permutation). Reverse the entire array to get the lowest permutation and return.
3. **Find the element to swap**: Find the largest index $l > k$ such that $arr[l] > arr[k]$.
4. **Swap**: Swap $arr[k]$ and $arr[l]$.
5. **Reverse**: Reverse the suffix starting at $arr[k+1]$ to make it sorted in ascending order (which is the lexicographically smallest suffix).

### Complexity Analysis
- **Time Complexity**: $O(N)$ (One pass to find $k$, one pass to find $l$, and one pass to reverse).
- **Space Complexity**: $O(1)$ auxiliary space as we modify the array in place.