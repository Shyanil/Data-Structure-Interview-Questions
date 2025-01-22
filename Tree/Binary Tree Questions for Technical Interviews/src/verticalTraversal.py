from collections import defaultdict, deque

class Solution:
    def verticalTraversal(self, root):
        if not root:
            return []

        # The result list that will hold the final vertical order traversal
        result = []

        # column_map will store the nodes in each column, where the key is the column index
        # and the value is a list of tuples (row, value) for that column
        column_map = defaultdict(list)

        # Queue for BFS traversal: stores tuples of (node, row, column)
        # We initialize it with the root node at row 0, column 0
        queue = deque([(root, 0, 0)])

        # We also need to keep track of the range of columns visited
        # min_col will track the minimum column index
        # max_col will track the maximum column index
        min_col = max_col = 0

        while queue:
            node, row, col = queue.popleft()

            # Insert the node value along with its row index into the column_map
            column_map[col].append((row, node.val))

            # Update the min and max column indices as we traverse the tree
            min_col = min(min_col, col)
            max_col = max(max_col, col)

            # Add the left child to the queue (row + 1, col - 1)
            if node.left:
                queue.append((node.left, row + 1, col - 1))

            # Add the right child to the queue (row + 1, col + 1)
            if node.right:
                queue.append((node.right, row + 1, col + 1))

        # Process the column_map and sort the nodes for each column
        # Time complexity: Sorting within each column takes O(k log k) for k nodes in that column
        for col in range(min_col, max_col + 1):
            # Sort the nodes first by row, then by value (to handle same row nodes)
            column_map[col].sort(key=lambda x: (x[0], x[1]))  # Sort by row first, then by value

            # Extract the values from the sorted tuples
            result.append([val for row, val in column_map[col]])

        return result

