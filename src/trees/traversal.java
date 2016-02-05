package trees;

import java.util.ArrayList;
import java.util.Queue;

public class traversal {
	public void PreOrder(BinaryTreeNode root){
		if(root!=null)
		{
			System.out.println(root.data);
			PreOrder(root.left);
			PreOrder(root.right);
		}
	}
	public void InOrder(BinaryTreeNode root){
		if(root!=null){
		InOrder(root.left);
		System.out.println(root.data);
		InOrder(root.right);
		}
	}
	public void PostOrder(BinaryTreeNode  root){
		if(root!=null){
			PostOrder(root.left);
			PostOrder(root.right);
			System.out.println(root.data);
		}
	}
	public ArrayList<Integer> levelOrder(BinaryTreeNode root){
		ArrayList<Integer> res=new ArrayList<>();
		if(root==null)
			return res;
		sun.misc.Queue<BinaryTreeNode> q=new sun.misc.Queue<>();
		q.enqueue(root);
		q.enqueue(null);
		ArrayList<Integer> curr=new ArrayList<Integer>();
		while(!q.isEmpty()){
			BinaryTreeNode tmp;
			try {
				tmp=q.dequeue();
				if(tmp!=null){
					curr.add(tmp.data);
					if(tmp.left!=null)
						q.enqueue(tmp.left);
					if(tmp.right!=null)
						q.enqueue(tmp.right);
				}
				else
				{
					res.addAll(curr);
					curr.clear();
					if(!q.isEmpty())
						q.enqueue(null);
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return res;
	}
	

}
