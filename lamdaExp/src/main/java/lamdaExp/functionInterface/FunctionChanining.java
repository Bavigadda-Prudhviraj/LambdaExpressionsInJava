package lamdaExp.functionInterface;
import java.util.function.Function;

public class FunctionChanining {

	public static void main(String[] args) {
		Function<Integer,Integer> f1=n->{
			return n*n;
		};
		Function<Integer, Integer> f2=n->{
			return n*n*n;
		};
		int sq_cub=f1.andThen(f2).apply(2);
		System.out.println(sq_cub);
		
		int sq=f1.compose(f2).apply(2);
		System.out.println(sq);
		

	}

}
