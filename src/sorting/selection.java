package sorting;

import java.util.ArrayList;

public class selection {
	public ArrayList<Integer> selectionSort(ArrayList<Integer> a){
		int n=a.size();
		int i=0;
		while(i<n){
			int min=a.get(i);
			int minInd=i;
			for(int j=i;j<n;j++){
				if(min>a.get(j))
					minInd=j;
			}
			selection.swap(a,i,minInd);
		}
		return a;
	}

	private static void swap(ArrayList< Integer> a,int i, int minInd) {
		// TODO Auto-generated method stub
		int tmp=a.get(i);
		a.set(i, a.get(minInd));
		a.set(tmp, tmp);
		
	}

}
