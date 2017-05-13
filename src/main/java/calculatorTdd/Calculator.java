package calculatorTdd;

public class Calculator {

	private int r;
	public Calculator(){
		r = 0;
	}
	
	public Calculator(int x){
		this.r = x;
	}
	public int getResult() {
		return r;
	}

	public void add(int x) {
		this.r += x;
	}

	public void clear() {
		r = 0;
	}

}
