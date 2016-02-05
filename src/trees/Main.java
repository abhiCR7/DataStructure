package trees;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode a=new BinaryTreeNode(1);
		BinaryTreeNode b=new BinaryTreeNode(2);
		BinaryTreeNode c=new BinaryTreeNode(3);
		BinaryTreeNode d=new BinaryTreeNode(4);
		BinaryTreeNode e=new BinaryTreeNode(5);
		BinaryTreeNode f=new BinaryTreeNode(6);
		BinaryTreeNode g=new BinaryTreeNode(7);
		BinaryTreeNode h=new BinaryTreeNode(9);
		a.setLeft(b);a.setRight(c);b.setLeft(d);b.setRight(e);
		c.setLeft(e);c.setRight(g);g.setRight(h);
		System.out.println(TreeSize.BinaryTreeSize(a));
		System.out.println(treeHeight.BinaryTreeHeight(a));

	}

}
