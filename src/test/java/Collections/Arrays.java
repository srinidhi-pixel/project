package Collections;

import java.util.Iterator;

// array is a collection of elements of homogeneous data. single dimnsion array
public class Arrays {
	public static void main(String[] args) {
		
		// whwn the size is fixed go with this
		int a[] = new int[5];
		a[0]=1;
		a[1]=2;
	    a[2]=3;
	    a[3]=5;
	     a[4]=4;
	    System.out.println(a[0]);
	    System.out.println(a.length);
		
//		int a[]= {100,200,300};
//		  System.out.println(a.length);
//		  for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
	//	multidimensional array
	//	int a[][]=new int[3][2];
		
//		int a[][]= {{100,200},{300,400},{500,600}};
//		
//		System.out.println(a.length);//row 
//		System.out.println(a[0].length);//row +column
//		System.out.println(a[2][1]);
		
//		 for (int r = 0; r <= a.length-1; r++) {
//			 for (int c = 0; c <=a[r].length-1; c++) {
//				System.out.print(a[r][c]+"  ");
//			}
//			 System.out.println();
//			
//		}
		
//		for (int arr[] : a) {
//			for (int x  : arr) {
//				System.out.print(x+" ");
//			}
//			System.out.println();
//		}
	}

}
