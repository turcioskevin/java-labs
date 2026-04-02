# Sorting Algorithms (Java)

## Description
This program demonstrates three fundamental sorting algorithms — Bubble Sort, Selection Sort, and Insertion Sort — by sorting an integer array and printing the array after each pass. This allows users to observe how each algorithm progressively organizes the data.

## Features
- Implements three classic sorting algorithms:
  - Bubble Sort
  - Selection Sort
  - Insertion Sort
- Displays the array after every pass for step-by-step visualization
- Uses separate arrays to preserve original data for each algorithm

## Algorithms Explained

### Bubble Sort
Repeatedly compares adjacent elements and swaps them if they are in the wrong order. Largest values "bubble" to the end.

### Selection Sort
Finds the smallest element in the unsorted portion and swaps it with the current position.

### Insertion Sort
Builds a sorted array one element at a time by inserting elements into their correct position.

## Concepts Used
- Arrays
- Nested loops
- Algorithm design
- Time complexity fundamentals
- Iterative problem solving

## Example Output
```
After pass 1: 3 6 4 9 8 11 7 17
After pass 2: 3 4 6 8 9 7 11 17
...
```

## How to Run
```bash
javac Sorting.java
java Sorting
```

## Time Complexity
| Algorithm       | Best Case | Average Case | Worst Case |
|----------------|----------|--------------|------------|
| Bubble Sort    | O(n)     | O(n²)        | O(n²)      |
| Selection Sort | O(n²)    | O(n²)        | O(n²)      |
| Insertion Sort | O(n)     | O(n²)        | O(n²)      |

## Use Case
This project is ideal for:
- Learning how sorting algorithms work step-by-step
- Visualizing intermediate states of arrays
- Understanding algorithm efficiency differences

## Future Improvements
- Add user input for custom arrays
- Add timing comparisons between algorithms
- Visual GUI representation of sorting (bars/animations)
- Include additional algorithms (Merge Sort, Quick Sort)
