package lamdaExp.functionInterface;
import java.util.*;

public class Function {

	public static void main(String[] args) {
		java.util.function.Function<Integer,Integer> function=n->n*n;
		int squareNumber=function.apply(5);
		System.out.println(squareNumber);
		
		 //Finding length of sting
		java.util.function.Function<String,Integer> function2=n->n.length();
		int strLen=function2.apply("raj");
		System.out.println(strLen);

	}

}
