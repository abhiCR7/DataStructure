package sorting;

import java.util.ArrayList;

public class shell {
	public ArrayList<Integer> shellSort(ArrayList<Integer> a){
		int n=a.size();
		int gap=n/2;
		while(gap>0){
			for(int i=gap;i<n;i++){
				int tmp=a.get(i);
				int j;
				for(j=i;j>=gap && a.get(j-gap)>tmp;j-=gap)
					a.set(j, a.get(j-gap));
				a.set(j, tmp);
			}
		}
		return a;
	}

}
