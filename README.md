## 114. Flatten Binary Tree to Linked List

Given the root of a binary tree, flatten the tree into a "linked list":

    The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.

    The "linked list" should be in the same order as a pre-order traversal of the binary tree.


questiones:
1. If left child is null, can it be flattened into linked list? No, only flatten no "null" node into linked list.
2. Can the node value be negative integers? Yes

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-100 <= Node.val <= 100

Example 1:
Input: root = [2,1,3]
Output: true

Example 2:

Input: root = [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.


