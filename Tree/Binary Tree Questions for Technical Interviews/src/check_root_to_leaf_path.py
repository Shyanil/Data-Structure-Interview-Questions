def isPathExist(root, arr, index):
    """
    Function to check if a root-to-leaf path in a binary tree matches a given sequence.

    Time Complexity:
    - Each node is visited once in the worst case, so the time complexity is O(N),
      where N is the number of nodes in the binary tree.

    Space Complexity:
    - The space complexity is O(H), where H is the height of the tree,
      due to the recursive call stack.

    Parameters:
    - root: The current node of the binary tree.
    - arr: List of integers representing the sequence.
    - index: The current index in the array to match with the node value.

    Returns:
    - True if the sequence matches a root-to-leaf path, otherwise False.
    """
    if root is None:
        return False
    if index > len(arr) - 1 or root.val != arr[index]:
        return False
    # Check if it's a leaf node and the full array is matched
    if root.left is None and root.right is None and index == len(arr) - 1:
        return True
    # Recursively check left and right subtrees
    return isPathExist(root.left, arr, index + 1) or isPathExist(root.right, arr, index + 1)
