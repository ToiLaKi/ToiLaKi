
import java.util.Scanner;

public class baitap {
	
	public void cau1() {
		System.out.println("Nhap a: (Bytes)");
		Scanner scan = new Scanner(System.in);
		Byte a= nextBytes();
		System.out.println("Nhap b: (Bytes)");
		Byte b= nextBytes();
		System.out.println("a + b = "+ a+b);
		System.out.println("a - b = "+ (a-b));
		System.out.println("a * b = "+ a*b);
		System.out.println("a / b = "+ a/b);
		System.out.println("a % b = "+ a%b);
		System.out.print("a^b = ");
		int i=1,pow=1;
		while(i<=b) {
			pow=pow*a;
			i++;
		}
		System.out.println(pow);
	}
	public void cau2() {
		System.out.println("Nhap a: (int)");
		Scanner scan = new Scanner(System.in);
		int a= nextInt();
		System.out.println("Nhap b: (int)");
		int b= nextInt();
		System.out.println("a + b = "+ a+b);
		System.out.println("a - b = "+ (a-b));
		System.out.println("a * b = "+ a*b);
		System.out.println("a / b = "+ a/b);
		System.out.println("a % b = "+ a%b);
		System.out.print("a^b = ");
		long i=1,pow=1;
		while(i<=b) {
			pow=pow*a;
			i++;
		}
		System.out.println(pow);
	}
	public void cau3() {
		System.out.println("Nhap a: (double)");
		Scanner scan = new Scanner(System.in);
		Double a= nextDouble();
		System.out.println("Nhap b: (double)");
		Double b= nextDouble();
		System.out.println("a + b = "+ a+b);
		System.out.println("a - b = "+ (a-b));
		System.out.println("a * b = "+ a*b);
		System.out.println("a / b = "+ a/b);
		System.out.println("a % b = "+ a%b);
		System.out.print("a^b = ");
		long i=1,pow=1;
		while(i<=b) {
			pow=pow*a;
			i++;
		}
		System.out.println(pow);
	}
	
}
