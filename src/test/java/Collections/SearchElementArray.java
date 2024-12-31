package Collections;

public class SearchElementArray {
public static void main(String[] args) {
	
	int a[]= {10,20,30,40,50,30,30,30};//when it finds the element it will exit the for loop.it will not check further elements 
	int searchElement=10;
	boolean status=false; // false-not fund true- found
//	
//	for (int i = 0; i < a.length; i++)
//	{
//		   if(a[i]==searchElement)
//	{
//            System.out.println("Elementfound");
//            status=true;
//            break;
//	}
//	}		   
	for (int i : a) {
		if (i==searchElement) {
			System.out.println("element fund");
			status=true;
			break;
		}
		
	}

	if (status==false) {
		System.out.println("element not found");
	}
}
}