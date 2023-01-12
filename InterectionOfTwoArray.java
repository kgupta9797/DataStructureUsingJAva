import java.util.*;
public class InterectionOfTwoArray {
	public static void main(String args[])
	{
		int arr1[]={1,2,3,4};
		int arr2[]={2,3};
		//0p-->2,3 ==>interection
		HashSet<Integer>hashset = new HashSet<>();
		
		for(int element:arr1)
		{
			hashset.add(element);
		}
		
		for(int element:arr2)
		{
		if(hashset.contains(element))
		{
			
		System.out.print("["+element+"]");
			
		}
		}
		//System.out.println(hashset);
	}
}
