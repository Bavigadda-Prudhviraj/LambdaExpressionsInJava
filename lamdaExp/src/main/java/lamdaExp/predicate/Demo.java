package lamdaExp.predicate;

import java.util.function.Predicate;

import lamdaExp.Lambdatest;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Example one
		/*here data type not needed
		 * we wroten just lambda expression
		*/
		Predicate<Integer> numP=i->(i>10);
		//to invoke the lambada expression we need abstact method
		System.out.println(numP.test(10));
		System.out.println(numP.test(11));
		
		
		//example two
		//to check the length of the string grater than or not
		
		Predicate<String> lenString=i->(i.length()>5);
		System.out.println("Esample two: "+lenString.test("abcsdfg"));
		
		//predicate with arrays
		//Print array elements whose size is greater than 4
		String[] nameStrings= {"raj","shake","kalyan","prud","prudhvi"};
		for(int i=0;i< nameStrings.length;i++) {
			if(lenString.test(nameStrings[i])) {
				System.out.print(nameStrings[i]+" ");
			}
		}
		
		//predicate with multiple conditions
	}

}
