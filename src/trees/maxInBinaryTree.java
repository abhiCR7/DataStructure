package trees;

public class maxInBinaryTree {
	
	public static Integer maxInTree(BinaryTreeNode root){
		int max=Integer.MIN_VALUE;
		if(root!=null){
			int leftMax=maxInTree(root.left);
			int rightMax=maxInTree(root.right);
			if(leftMax>rightMax)
				max=leftMax;
			else 
				max=rightMax;
			if(max<root.data)
				max=root.data;
		}
		return max;
	}

}
