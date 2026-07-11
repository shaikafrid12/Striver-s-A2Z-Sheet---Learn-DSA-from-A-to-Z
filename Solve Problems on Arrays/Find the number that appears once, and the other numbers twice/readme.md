# Find the Number That Appears Once

**Problem Statement:** Given a non-empty array of integers `arr`, every element appears twice except for one. Find that single one.

---

## Examples

### Example 1
- **Input:** `arr[] = [2, 2, 1]`
- **Output:** `1`
- **Explanation:** In this array, only the element 1 appears once, so it is the answer.

### Example 2
- **Input:** `arr[] = [4, 1, 2, 1, 2]`
- **Output:** `4`
- **Explanation:** In this array, only the element 4 appears once and the other elements appear twice. So, 4 is the answer.

---

## Algorithm

### Brute Force Approach (Nested Loops)
1. For every element in the array, run a second loop to count its occurrences.
2. If the count of an element is exactly `1`, return that element.

**Complexity:**
- **Time Complexity:** $O(N^2)$ (two nested loops running up to $N$ times)
- **Space Complexity:** $O(1)$ (no extra space used)

---

### Better Approach (Hashing)
1. Create a hash map to store the frequency of each element in the array.
2. Iterate through the array to populate the frequency map: `map.put(arr[i], map.getOrDefault(arr[i], 0) + 1)`.
3. Iterate through the map's keys to find the element whose frequency is `1` and return it.

**Complexity:**
- **Time Complexity:** $O(N)$ (one pass to populate the hash map, and another to find the unique element)
- **Space Complexity:** $O(N)$ (requires a hash map to store frequencies of up to $N/2 + 1$ distinct elements)

---

### Optimal Approach (XOR Method)
1. Initialize a variable `xor = 0`.
2. Iterate through the array and XOR each element with `xor`: `xor = xor ^ arr[i]`.
3. Since $A \oplus A = 0$ and $A \oplus 0 = A$, all numbers appearing twice will cancel each other out, leaving only the number that appears once.
4. Return `xor`.

**Complexity:**
- **Time Complexity:** $O(N)$ (single traversal of the array)
- **Space Complexity:** $O(1)$ (constant space)
