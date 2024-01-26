# DataStructures - 
Learn about Arrays, Linked Lists, Trees, Hashtable, Stacks, Queues, Heaps, Sort algorithms and Search algorithms.
Data structures are storages that are used to store and organize all sorts of data. It is a way of arranging data on a computer so that it can be accessed and updated efficiently.

# JAVA DATA STRUCTURES
- Arrays
- Lists
- Stacks
- Queues
- HashTables
- Trees
- Heaps
- Sets
- 
# ALGORITHMS
- Search algorithms
- Sort algorithms
- Recursion

# BIG O NOTATION
What is Big O Notation? 
**A mathematical notation that describes the limiting behavior of a function when the argument tends towards a particular value or infinity:** 
- O(1) Constant time complexity
- O(logn) Logarithmic time complexity
- O(n) Linear time complexity
- O(nlogn) n log-star n time complexity
- O(n^2) quadratic time complexity

# ARRAYS
Pros: reading elements is easiest with the array O(1)
Cons: Since arrays are fixed in size once they are created, it's hard to insert or delete an element in the array. Often times you will have to generate a new array and add each element in the old array to the new array except for the one you are trying to delete, and in the case you are trying to add the same will apply.



O(n) - Linear Time
O(1) - Constant Time

| OPERATION                                             | Time Complexity |
|-------------------------------------------------------|:---------------:|
| Retrieve with index                                   |      O(1)       |
| Retrieve without index                                |      O(n)       |
| Add an element to a full array                        |      O(n)       |
| Add an element to the end of ana array that has space |      O(1)       |
| Insert or update an element at a specif index         |      O(1)       |
| Delete an element by setting it to null               |      O(1)       |
| Delete an element by shifting elements                |      O(n)       |

# SORT ALGORITHM
- **BUBBLE SORT** - A simple sorting algorithm that works by swapping neighboring elements if they are in the wrong order. However, it's not ideal for large datasets because of its relatively high average and worst-case time complexity.
  - In-place algorithm
  - 0(n^2) time complexity - quadratic algorithm
  - The Bubble Sort algorithm degrades if the items that are being sorted increase 
  - Selection Sort is a stable sort when dealing with duplicates

- **SELECTION SORT** - 
Selection sort is a simple sorting algorithm that divides the input into two parts: a sorted region and an unsorted region. During each iteration, it identifies the smallest (or largest) element in the unsorted region and exchanges it with the first unsorted element. This continues until the entire list is sorted. Despite its simplicity, selection sort is not the most efficient choice for sorting large datasets.
  - time complexity of the selection sort algorithm is O(n^2)
  - for each element in the array, selection sort performs n - 1 comparisons in the worst case, and for each comparison, it may perform a swap
  - Selection Sort is a stable sort when dealing with duplicates
- **INSERTION SORT** - Insertion Sort is a fundamental sorting algorithm designed to arrange elements in a specific order within an array. Unlike more complex sorting algorithms, such as quicksort or mergesort, Insertion Sort operates by building the sorted sequence gradually. The primary advantage lies in its simplicity and suitability for small datasets. 
  - Insertion Sort's time complexity is O(n^2) in the worst-case scenario.
  - Despite its less favorable time complexity compared to more advanced algorithms, Insertion Sort can outperform them, particularly when dealing with small datasets or nearly sorted arrays.