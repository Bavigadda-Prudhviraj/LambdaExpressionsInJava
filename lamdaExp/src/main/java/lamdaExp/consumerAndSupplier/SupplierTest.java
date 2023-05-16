package lamdaExp.consumerAndSupplier;

import java.util.Date;
import java.util.function.Supplier;

import javax.print.DocFlavor.INPUT_STREAM;

public class SupplierTest {

	public static void main(String[] args) {
		//it wont take any input it returns values
		// so we need to mention the return type in supplier
		Supplier<Date> supplier=()->new Date();
		//generate current data
		System.out.println(supplier.get());;
		
		

	}

}
