package sorting;

public class quick {
	int a[],q;
	public void quickSort(int p,int r){
		if(p<r)
			q=partition(p,r);
		quickSort(p, q-1);
		quickSort(q+1, r);
	}
	public int partition(int p,int r){
		int x=a[r];
		int i=p-1;
		int j=p;
		while(j<r-1){
			if(a[j]<=x){
				i++;
				int tmp=a[j];
				a[j]=a[i];a[i]=tmp;
			}
			j++;
			
		}
		int tmp=a[r];
		a[r]=a[i+1];
		a[i+1]=tmp;
		return i+1;
	}

}
