package sorting;

import java.util.ArrayList;

public class bubble {
	public ArrayList<Integer> bubbleSort(ArrayList<Integer> a){
		int n=a.size();
		int i=0;
		while(i<n){
			for(int j=0;j<n;j++){
				if(a.get(j)>a.get(j+1)){
					bubble.swap(a, j, j+1);
				}
			}
			i++;
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
