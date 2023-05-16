package lamdaExp.consumerAndSupplier;

import java.util.function.Consumer;

public class ConsumerChanining {

	public static void main(String[] args) {
		Consumer<String> c1=str->System.out.println(str+" length is "+str.length());
		Consumer<String> c2=str->System.out.println(str+" first character is "+str.charAt(0));
		Consumer<String> c3=str->System.out.println(str+" last character is "+str.charAt(str.length()-1));
		
		c1.accept("raj");
		c2.accept("raj");
		c3.accept("raj");
		System.out.println("<-----Consumer chainning using andThen---------->");
		c1.andThen(c2).andThen(c3).accept("abc");
		System.out.println("<------adding all consumers in one consumer---------->");
		Consumer<String> c4=c1.andThen(c2).andThen(c3);
		c4.accept("Bavigadda");
	}

}
