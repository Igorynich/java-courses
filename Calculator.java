public class Calculator {

	private int result;

	public void add(int ... params) {
		for (Integer param : params) {
			this.result +=param;
		}
	}	

	public void diff(int param1, int param2) {
		this.result = param1 - param2;
	}

	public void multi(int param1, int param2) {
		this.result = param1 * param2;
		/*for (Integer param : params) {
			this.result *= param;
		}*/
	}
	public int getResult() {
		return this.result;
	}

	public void cleanResult() {
		this.result = 0;
	}
}