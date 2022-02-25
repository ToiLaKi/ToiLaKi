import java.util.Scanner;

public class GPTBac2 {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Nhap a,b,c: ");
		Long a=s.nextLong();
		Long b=s.nextLong();
		Long c=s.nextLong();
		if(a=0) {
			System.out.println("Khong phai la phuong trinh bac 2!!!");
		}
		else {
			Long Delta = b*b-4*a*c;
			if(Delta>0)
				System.out.println("Phuong trinh co 2 nghiem phan biet do la: " + (-b + Math.sqrt(Delta))/(2*a) +" va " + (-b - Math.sqrt(Delta))/(2*a));
			else
				if(Delta==0)
					System.out.println("Phuong trinh co  nghiem kep la: " + (-b/(2*a)));
				else
					System.out.println("Phuong trinh vo nghiem ");
		}
	}
}
