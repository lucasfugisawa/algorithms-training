package leetCode.binaryTreeInorderTraversal

class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        val stack = mutableListOf<TreeNode>()
        var currentNode = root

        while (currentNode != null || stack.isNotEmpty()) {
            while (currentNode != null) {
                stack.add(currentNode)
                currentNode = currentNode.left
            }

            currentNode = stack.removeAt(stack.lastIndex)
            result.add(currentNode.`val`)
            currentNode = currentNode.right
        }

        return result

    }

    fun inorderTraversalRecursive(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        if (root != null) {
            result.addAll(inorderTraversalRecursive(root.left))
            result.add(root.`val`)
            result.addAll(inorderTraversalRecursive(root.right))
        }
        return result
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
