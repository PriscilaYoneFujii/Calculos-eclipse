package beans;
import java.util.ArrayList;
import java.util.List;

public abstract class Contas implements Operacoes, RangeJump{
	private List<Integer> li = new ArrayList<Integer>();
	
	@Override
	public long soma(long a, long b) {
		return a + b;
	}

	@Override
	public int subi(long a, long b) {
		long c =  a+b;
		return (int) c;
	}

	@Override
	public double multi(long a, long b) {
		return a * b;
	}

	@Override
	public float divi(long a, long b) {
		try{// div p/ zero -> n1 / n2 | n1={0*, 1*} , n2={0=!}
			return a / b;
		}catch(ArithmeticException e) {
			//System.out.println("não é possível fazer divisão por zero!");
			return 0;
		}
	}
	@Override
	public List<Integer> range(int n, int m) {
		for(int i = n; i <= m; i++) {
			li.add(i);
		}
		return li;
	}
	public List<Integer> rangeSkip(int n, int m, int p) {
		for(int i = n; i <= m; i++) {
			if(i % p == 0) {
				li.add(i);
			}
		}
		return li;
	}
	@Override
	public List<Integer> rangeRetro(int n, int m){
		int var = m;
		for(int i = n; i <= m; i++) {
			li.add(i,var);
			var--;
		}
		return li;
	}
	@Override
	public List<Integer> rangeSkipRetro(int n, int m, int p){
		for(int i = n; i <= m; i++) {
			if(i % p == 0) {
				int result = (i % p);
				li.add(i,result);
			}
		}
		return li;
	}
	
}
