package lamdaExp.consumerAndSupplier;

import java.util.function.Consumer;

public class Consumers {

	public static void main(String[] args) {
		Consumer<String> str=s->System.out.println(s);
		str.accept("Bavigadda Prudhviraj");

	}

}
