package controller;

public class FatorialDuplo {

	public FatorialDuplo() {
		super();
	}
	
	public int calcularFatorialDuplo(int n) {
		if(n == 1) {
			return 1;
		}
		
		return n * calcularFatorialDuplo(n - 2);
	}
}
