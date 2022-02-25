import java.util.Scanner;

public class GPT {
	public static void main(String[] args) {
		System.out.println("Nhap a,b: ");
		Scanner scan = new Scanner(System.in);
		Long a=scan.nextLong();
		Long b=scan.nextLong();
		//ax+b=0
		if(a!=0) {
		System.out.println("x= "+ -b/a);
		}
		else
		System.out.println("Vi a = 0 nen phuong trinh vo so nghiem");
	}
}
