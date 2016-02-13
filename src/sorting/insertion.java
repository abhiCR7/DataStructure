package sorting;

import java.util.ArrayList;

public class insertion {
	public ArrayList<Integer> sort(ArrayList<Integer> a){
		for(int j=2;j<a.size()-1;j++){
			int k=a.get(j);
			int i=j-1;
			while(i>0 && a.get(i)>k){
				a.set(i+1, a.get(i));
				i--;
			}
			a.set(i+1, k);
		}
		return a;
	}

}
