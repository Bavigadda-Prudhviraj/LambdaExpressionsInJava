package lamdaExp.predicate;

import java.util.function.Predicate;

public class MultiplePredicates {
	//and or , negate
	/*
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1=i->(i%2==0);
		Predicate<Integer> p2=i->(i>50);
		int[] arr= {22,32,42,54,57,62,78,12,51};
		System.out.println("and ");
		for(int i=0;i<arr.length;i++) {
//			if(p1.test(arr[i]) && p2.test(arr[i])) {
//				System.out.print(arr[i]+" ");
//			}
			
			//same thing will do as above
			if(p1.and(p2).test(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		
		 }
		
		System.out.println("\n"+"or");
		for(int i=0;i<arr.length;i++) {
			if(p1.or(p2).test(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		
		 }
		System.out.println("\n"+"negate"+"it is oppostite to conditon");
		for(int i=0;i<arr.length;i++) {
			if(p1.negate().test(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		
		 }
		

	}

}
