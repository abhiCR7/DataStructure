package trees;

public class FindElement {
	public static boolean findInBinaryTree(BinaryTreeNode root,int data){
		if(root==null)
			return false;
		if(root.data==data){
			return true;
		}
		return (findInBinaryTree(root.left, data) || findInBinaryTree(root.right, data));
	}
	
}
