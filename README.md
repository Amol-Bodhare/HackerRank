# HackerRank

## Binary Perfection
 This program finds the parent node of a particular node in a binary tree based on the given height of the tree. The Binary tree can be constructed in the increasing order of positive integers using Post-order traversal. 
 Example:
 
 Height: 3 
 Post-order: 1,2,3,4,5,6,7
 
 Complete Binary Tree:
 ```
               7
              /  \    
             /    \     
            3      6  
           / \    /  \     
          1   2  4    5
```
### Input
height: 3
number of nodes : 4
nodes: 1 2 6 7
### Output:
3 3 7 -1

Since, parent 1 & 2 is 3, parent of 6 is 7
        and parent of 7 is -1 (Root node)
