package trees;

public class treeHeight {
	public static int BinaryTreeHeight(BinaryTreeNode root){
		if(root==null)
			return 0;
		int leftHeight=BinaryTreeHeight(root.left);
		int rightHeight=BinaryTreeHeight(root.right);
		return ((leftHeight>rightHeight)?leftHeight+1:rightHeight+1);
	}
	
}
