package lamdaExp;

import java.util.function.Predicate;

public class Lambdatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface tes=()->System.out.print("prudhvi");
		tes.test();
		
		

	}
	class FinctionalImplementaion implements MyFunctionalInterface{
			
		public void test() {
			// TODO Auto-generated method stub
			System.out.println("tsting function");
			
		}
		
	}

}
