# Union of Two Sorted Arrays

## Problem Statement
Given two sorted arrays, `arr1` and `arr2` of size `n` and `m` respectively, find the union of these two sorted arrays.

The union of two arrays can be defined as the common and distinct elements in the two arrays. The elements in the union should be sorted in ascending order.

---

## Examples

### Example 1
* **Input**: 
  * `n = 5`, `m = 5`
  * `arr1[] = {1, 2, 3, 4, 5}`
  * `arr2[] = {2, 3, 4, 4, 5}`
* **Output**: `{1, 2, 3, 4, 5}`
* **Explanation**: 
  * Common elements: `2, 3, 4, 5`
  * Distinct elements in `arr1`: `1`
  * Distinct elements in `arr2`: None
  * Union: `{1, 2, 3, 4, 5}`

### Example 2
* **Input**: 
  * `n = 10`, `m = 7`
  * `arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}`
  * `arr2[] = {2, 3, 4, 4, 5, 11, 12}`
* **Output**: `{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}`
* **Explanation**: 
  * Common elements: `2, 3, 4, 5`
  * Distinct elements in `arr1`: `1, 6, 7, 8, 9, 10`
  * Distinct elements in `arr2`: `11, 12`
  * Union: `{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}`

---

## Approaches

### 1. Using a Map (TreeMap)
We can use a `TreeMap` to store the frequencies or presence of the elements. Since `TreeMap` maintains its keys in natural sorted order, all keys in the map will represent the sorted union.

#### Java Implementation
```java
import java.util.*;

public static ArrayList<Integer> findUnionUsingMap(int arr1[], int arr2[], int n, int m) {
    TreeMap<Integer, Integer> map = new TreeMap<>();
    for (int i = 0; i < n; i++) {
        map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
    }
    for (int i = 0; i < m; i++) {
        map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
    }
    
    ArrayList<Integer> unionList = new ArrayList<>();
    for (int key : map.keySet()) {
        unionList.add(key);
    }
    return unionList;
}
```

#### Complexity
* **Time Complexity**: $O((n + m) \log(n + m))$ - Inserting elements into a `TreeMap` takes logarithmic time.
* **Space Complexity**: $O(n + m)$ - To store unique elements of both arrays in the map.

---

### 2. Using a Set (TreeSet)
Since a `Set` only stores unique elements, and a `TreeSet` maintains them in natural sorted order, we can insert all elements of both arrays into a `TreeSet` and convert it back to a list/array.

#### Java Implementation
```java
import java.util.*;

public static ArrayList<Integer> findUnionUsingSet(int arr1[], int arr2[], int n, int m) {
    TreeSet<Integer> set = new TreeSet<>();
    for (int i = 0; i < n; i++) {
        set.add(arr1[i]);
    }
    for (int i = 0; i < m; i++) {
        set.add(arr2[i]);
    }
    
    return new ArrayList<>(set);
}
```

#### Complexity
* **Time Complexity**: $O((n + m) \log(n + m))$ - Inserting elements into a `TreeSet` takes logarithmic time.
* **Space Complexity**: $O(n + m)$ - To store unique elements of both arrays in the set.

---

### 3. Two Pointers (Optimal Approach)
Since both arrays are already sorted, we can avoid the $O(\log K)$ insertion overhead of trees by using a two-pointer approach:
1. Initialize two pointers `i = 0` and `j = 0` to point to the start of `arr1` and `arr2` respectively.
2. Compare elements:
   * If `arr1[i] <= arr2[j]`, check if it's already in the result list (compare with the last element of the list to avoid duplicates). If not, add it. Then increment `i`.
   * If `arr1[i] > arr2[j]`, check if `arr2[j]` is already in the result list. If not, add it. Then increment `j`.
3. Add any remaining elements from `arr1` or `arr2` while checking for duplicates.

#### Java Implementation
```java
import java.util.*;

public static ArrayList<Integer> findUnionOptimal(int arr1[], int arr2[], int n, int m) {
    int i = 0, j = 0;
    ArrayList<Integer> unionList = new ArrayList<>();
    
    while (i < n && j < m) {
        if (arr1[i] <= arr2[j]) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i]) {
                unionList.add(arr1[i]);
            }
            i++;
        } else {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr2[j]) {
                unionList.add(arr2[j]);
            }
            j++;
        }
    }
    
    // Add remaining elements of arr1
    while (i < n) {
        if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i]) {
            unionList.add(arr1[i]);
        }
        i++;
    }
    
    // Add remaining elements of arr2
    while (j < m) {
        if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr2[j]) {
            unionList.add(arr2[j]);
        }
        j++;
    }
    
    return unionList;
}
```

#### Complexity
* **Time Complexity**: $O(n + m)$ - Single pass traversal of both arrays.
* **Space Complexity**: $O(1)$ auxiliary space (ignoring the space to store/return the output list).