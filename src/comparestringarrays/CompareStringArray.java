package comparestringarrays;

import org.eclipse.jdt.annotation.NonNull;

public class CompareStringArray {

	CompareStringArray() {
		
	}
	
	/*public static boolean compareStringArraysUnrolledOnce(String[] arr1, String[] arr2) {
		if(arr1.length != arr2.length) {
			return false;
		}
		for(int i = 0; i < arr1.length; i++) {
			if(!arr1[i].equals(arr2[i]))
				return false;
		}
		return true;
	}*/
	
	public static boolean compareStringArrays(String[] arr1,  String[] arr2) {
		if(arr1.length != arr2.length) {
			return false;
		}
		int i  = 0;
		if(i < arr1.length) {
			if(!arr1[i].equals(arr2[i]))
				return false;
			i++;
			while(i < arr1.length) {
				if(!arr1[i].equals(arr2[i]))
					return false;
				i++;
			}
		}
		String test = arr1[0];
		if(arr1[0] == arr2[0])
			test = arr1[0];
		test.compareTo(arr1[0]);
		return true;
	}
	
/*	// Driver program 
	 public static void main(String args[]) 
	 { 
	     String[] arr1 = {"eins", "zwei", "drei"}; 
	     String[] arr2 = {"eins", "zwei", "drei"};
	     
	     boolean result = compareStringArrays(arr1, arr2);
	     
	     System.out.println("equal?: " + (result ? "yes" : "no"));
	     @ assert(result  ==> (\forall int i; 0 <= i && i < arr1.length; arr1[i].compareTo(arr2[i]) == 0));
	      @
	     
	 } */
} 
	

