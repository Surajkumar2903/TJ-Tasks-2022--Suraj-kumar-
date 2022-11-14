
# TJ-Tasks-2022--Suraj-kumar-
approach and algorithm for 69 problem.java: 
Traverse from left to right and change the first occurrence of 6 to 9. 
If there is not any 6 while traversal then does not change any digit.

approach and algorithm for common factors.c:
In this program, two integers entered by the user are stored in variable n1 and n2.Then, for loop is iterated until i is less than n1 and n2.
In each iteration, if both n1 and n2 are exactly divisible by i, the value of i is assigned to gcd.
When the for loop is completed, the greatest common divisor of two numbers is stored in variable gcd.

approach and algorithim for maxbitwise.cpp:
The Bitwise AND of two different numbers will always be strictly less than the maximum of those two numbers
so the longest subarray with max bitwise AND would be the subarray containing only the max numbers

approach and algortihm for minimum divsion.cpp:
We use a min heap to track the rightmost number of each group.
First, we sort the intervals. Then, for each interval, we check if the top of the heap is less than left.
If it is, we can add that interval to an existing group: pop from the heap, and push right, updating the rightmost number of that group.
If not, we need a new group: push right into the heap.
In the end, the size of the heap is the number of groups we need.

approach and algo for popular youtber.cpp:
Maintain a hashmap along with a class which will store:

sum : Denotes the total view count of a creator, this will help us in finding popular creator among two different people.
small : Denotes the lexicographical smallest id with greatest frequency of this creator.
max_view : Denotes the maximum view count of this creator , this will help us in finding a single creators lexicographically smallest id with maximum view count at a particular video.
We will simple use a counter which will have the maximum view count among all creator.

We will use this count to find the creators with this total view count from hashmap.

We can use 3 different hashmap for 3 different values also, but in that case the repetition of same key thrice in the memory is costly as compared to binding all values for a single key.

appraoch and algorithim for negative positive.cpp:
First, convert the nums into a set for quick access.
Second, go over the entire nums, for each element k, do:

check if k is positive.

approach and algorithm for power of 2.c
This is classical bit manipulation problem for n & (n-1) trick, which removes the last non-zero bit from our number
check if -k exist in nums using the set, which takes O(1).
check if k is larger than the largest element we have seen so far. And if it is, update the largest element so far and the result.
