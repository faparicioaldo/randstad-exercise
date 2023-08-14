# randstad-exercise
Exercise provided by randstad

# Explanation

This time I opted for a simple algorithm to solve the problem, separating the code so that it is easy to understand and manipulate.

The central part is the algorithm used to execute the operations, which uses a double cycle to iterate the list of operations and takes advantage of the use of indices to apply the operations to each range indicated in the array.

A better alternative to this algorithm is the prefix sum technique to optimize the process of performing trades and calculating the maximum value. This technique takes advantage of the fact that, by adding a value at the start position and subtracting it at the end position of a range, you can calculate the cumulative sum in the range using only two elements in the array, however being a bit more difficult to understand I opted for the simpler version.

# Requirements to run

> java 8+

# How to run 

> Execute command: java Solution.java
> The program will show the message 

    "Type the input separated by spaces and operations in new lines:"

> Type the input as described on instructions file 

    Sample Input:
        5 3
        1 2 100
        2 5 100
        3 4 100

> The program will generate an ouput as follows

    Sample Output:
        Max: 200


