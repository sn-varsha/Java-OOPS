package oops.collections;

import java.util.Collection;
import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
//		Collection nums=new ArrayList();
		Collection<Integer> nums=new ArrayList<Integer>();
		
		nums.add(6);
		nums.add(5);
		nums.add(8);
		nums.add(2);
		
//		System.out.println(nums);
		for(int n : nums) {
			System.out.println(n);
		}
		
/*		if you have not mentioned the type of the object like, Collection nums=new ArrayList(); then do
 *      for(Object n : nums){
 *        int num=(Integer)n;
 *        System.out.println(num*2);
 *       }
 */
		
/*      if you want to work with index then use list then do
 *      List<Integer> nuyms=new ArrayList<Integer>();
 *      ....
 *      ....
 *      System.out.println(nums.indexOf(5));
 *      System.out.println(nums.get(2));		
 */

	}

}