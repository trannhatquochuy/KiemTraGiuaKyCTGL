
public class Cau1A {
	public static int fibonacc1(int n) {
		if(n<=2) {
			return 1;
		}else {
			return fibonacc1 (n-1)+fibonacc1(n-2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int result = fibonacc1(n);
		System.out.println("F("+ n + ")= "+result);
	}

}
