package sorting;

import java.util.ArrayList;

public class mergeSort {
	int fl=0;
	public ArrayList<Integer> merge(ArrayList<Integer> a,int p,int q,int r ){
		int i,j;i=j=0;
		ArrayList<Integer> l=new ArrayList<Integer>();
		ArrayList<Integer> rh=new ArrayList<Integer>();
		while(i<(q-p+1)) l.add(i++, a.get(p+i-1));
		l.add(i, Integer.MAX_VALUE);
		while(j<(r-q)) rh.add(j++, a.get(q+j));
		rh.add(j, Integer.MAX_VALUE);
		//ArrayList<Integer> a=new ArrayList<>();
		int k;i=j=0;k=p;
		while(k<r){
			if(l.get(i)<=rh.get(j)){
				a.set(k++, l.get(i++));
			}
			else
				a.set(k++, rh.get(j++));
		}
		return a;
	}
	
	private ArrayList<Integer> mergeSort(ArrayList<Integer> a, int p, int r) {
		// TODO Auto-generated method stub
		if((p+r%2)!=0) fl=1;
		int q=((p+r)/2)+fl;
		mergeSort(a,p,q);
		mergeSort(a, q+1, r);
		return merge(a, p,q,r);
	}

}
