import java.util.ArrayList;
import java.util.Scanner;


public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        int n,i,c;
        c=0;
        long d1,d2,diff;d1=d2=0;
        i=0;
        n=in.nextInt();
        ArrayList<Integer> ar=new ArrayList<Integer>();
        while(i<n*n)
        {
        	ar.add(in.nextInt());
        }
        while(c<n)
        {
        	d1+=ar.get(1+(c*n)+1);
        	d2+=ar.get(1+((c+1)*n)-1);
        	c++;
        }
        diff=d2-d1;
        System.out.println(diff);
        
	}

}
