package sorting;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count c=new count();
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);a.add(2);a.add(4);a.add(2);a.add(5);a.add(2);a.add(6);a.add(3);
		System.out.println(c.countSort(a, 7).toString());

	}

}
