package sorting;

import java.util.ArrayList;

public class heap {
	ArrayList<Integer> fin;
	int size;
	public heap(ArrayList<Integer> b) {
		// TODO Auto-generated constructor stub
		fin=new ArrayList<>(); size=b.size();
	}
	public int parent(int i) {
		return (int) Math.floor(i/2);
	}
	public int left(int i) {
		return 2*i;
		
	}
	public int right(int i) {
		return 2*i+1;
		
	}
	public void MaxHeapify(ArrayList<Integer> a,int i) {
		int l=left(i); int r=right(i);int largest=Integer.MIN_VALUE;
		if(l<=a.size() && a.get(l)>a.get(i))
			largest=l;
		else	largest=i;
		if(r<=a.size() && a.get(r)>a.get(largest))
			largest=r;
		if(largest!=i)
		{
			int tmp=a.get(i);
			a.set(i, a.get(largest));
			a.set(largest, tmp);
			MaxHeapify(a, largest);
		}
			
		
	}
	public void BuildHeap(ArrayList<Integer> a) {
		size=a.size();
		for(int i=((int) Math.floor(size/2));i>0;i++){
			MaxHeapify(a, i);
		}
		
	}
	public ArrayList<Integer> HeapSort(ArrayList<Integer> a) {
		for(int i=a.size();i>0;i++){
			fin.add(i, a.get(0));
			a.set(0, a.get(i));
			MaxHeapify(a, 0);
			
		}
		return fin;
		
	}

}
