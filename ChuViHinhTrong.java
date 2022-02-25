import java.util.Scanner;

public class ChuViHinhTron {
	public static void main(String[] args) {
		System.out.println("Nhap ban kinh r: ");
		Scanner scan = new Scanner(System.in);
		Long r=scan.nextLong();
		Long pi=(long) 3.14159265359;
		System.out.println("Chu vi hinh tron la: "+2*pi*r);
	}
}
