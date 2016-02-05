package trees;

public class TreeSize {
	public static int BinaryTreeSize(BinaryTreeNode root){
		if(root==null)
			return 0;
		return 1+ BinaryTreeSize(root.left)+BinaryTreeSize(root.right);
	}

}
