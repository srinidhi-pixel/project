package Collections;

import java.util.Arrays;

public class SortArray {
public static void main(String[] args) {
	int a[]= {100,600,200,400,500};
	
	System.out.println("bfr sorting");
   System.out.println(Arrays.toString(a));
    Arrays.sort(a);
	System.out.println(Arrays.toString(a));
//	for (int i : a) {
//		System.out.println(i);
//	}
}
}
