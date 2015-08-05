package ca.fresher;

import junit.framework.TestCase;

public class TestLargest extends TestCase{
	
	public void testFirstExample()
	{
		int arr[]={7,8,9,5,4,3};
		Largest largest = new Largest();
		assertEquals(9, largest.Find(arr));
	}
	public void testSecondExample()
	{
		int arr[]={7,8,5,4,3};
		Largest largest = new Largest();
		assertEquals(8, largest.Find(arr));
	}

}
