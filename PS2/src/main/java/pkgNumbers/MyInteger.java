package pkgNumbers;

public class MyInteger {

	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	public boolean isEven() {
		if (getiValue() % 2 == 0) {
			return true;
		}
		return false;
	}

	public boolean isOdd() {
		if (getiValue() % 2 != 0) {
			return true;
		}
		return false;
	}

	public boolean isPrime() {
		int i;
		for (i = 2; i < getiValue(); i++) {
			if (getiValue() % i == 0) {
				return false;
			}}
		return true;
		}

	public static boolean isEven(int a){
		if (a % 2 == 0){
			return true;
		}
		return false;
		
	}
	
	public static boolean isOdd(int a){
		if (a%2 != 0){
			return true;
		}
		return false;
	}
	
	public static boolean isPrime(int a){
		for (int i = 2; i < a; i++){
			if (a%i == 0){
				return false;
		}
			}
		return true;
		
	}
	
	public static boolean isEven(MyInteger a) {
		return a.isEven();
	}

	public static boolean isOdd(MyInteger a) {
		return a.isOdd();
	}

	public static boolean isPrime(MyInteger a) {
		return a.isPrime();
	}
	public boolean Equals(int a) {
		if (a == iValue){
			return true;
		}
		return false;	
	}
	public boolean Equals(MyInteger a){
		return (a.getiValue() == iValue);
	}
}

