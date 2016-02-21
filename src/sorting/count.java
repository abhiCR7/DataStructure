package sorting;

import java.util.ArrayList;
import java.util.Iterator;

public class count {
	public ArrayList<Integer> countSort(ArrayList<Integer> a,int k){
		ArrayList<Integer> count,out;
		count=new ArrayList<>(k);
		out=new ArrayList<Integer>();
		Iterator<Integer> it=a.listIterator();
		int i2=k-1;
		System.out.println(count.toString()+" "+count.size());
		while(i2>0){ count.set(i2, 0); i2--;}
		while(it.hasNext()){
			count.set(it.next(), count.get(it.next())+1);
		}
		int total=0,oldCnt=0;
		for(int i=0;i<k;k++){
			oldCnt=count.get(i);
			count.set(i, total);
			total+=oldCnt;
		}
		it.remove();
		Iterator<Integer> i1=a.listIterator();
		while(i1.hasNext()){
			out.add(count.get(i1.next()),i1.next() );
			count.set(count.get(i1.next()),count.get(i1.next())+1 );
		}
		return out;	
			
	}

}
