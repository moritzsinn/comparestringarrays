package comparestringarrays;

import org.eclipse.jdt.annotation.NonNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;

class TestCompareStringArrays {

	@Test
	void test0() {
		new CompareStringArray();
		@NonNull String[] arr1 = {}; 
	     String[] arr2 = {};
	     
	     boolean result = CompareStringArray.compareStringArrays(arr1, arr2);
	     assert(result);
		//fail("Not yet implemented");
	}
	
	
	@Test
	void test1() {
		String[] arr1 = {new String("eins"), new String("zwei"), "drei"}; 
	     String[] arr2 = {"eins", "zwei", "drei"};
	     
	     boolean result = CompareStringArray.compareStringArrays(arr1, arr2);
	     assert(result);
		//fail("Not yet implemented");
	}
	
	@Test
	void test2() {
		String[] arr1 = {"eins", "zwei"}; 
	     String[] arr2 = {"eins", "zwei", "drei"};
	     
	     boolean result = CompareStringArray.compareStringArrays(arr1, arr2);
	     assert(!result);
		//fail("Not yet implemented");
	}
	
	@Test
	void test3() {
		String[] arr1 = {"eins", "zwei"}; 
	     String[] arr2 = {"eins", "drei"};
	     
	     boolean result = CompareStringArray.compareStringArrays(arr1, arr2);
	     assert(!result);
		//fail("Not yet implemented");
	}
	

	@Test
	void test5() {
		 String[] arr1 = {"eins", null}; 
	     String[] arr2 = {"eins", "drei"};
	     
	     boolean result = CompareStringArray.compareStringArrays(arr1, arr2);
	     assert(!result);
		//fail("Not yet implemented");
	}

}
