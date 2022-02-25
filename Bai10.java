import java.util.Scanner;

public class Bai10 {
	public static void main (String[] args) {
		try {
		System.out.println("Nhap usename: ");
		Scanner s=new Scanner(System.in);
		String tk=s.toString();
		
		lsSystem.out.println("Nhap passwork: ");
		String mk=s.toString();
		if(tk.contains("Hoang") && mk.contains("123"))
			System.out.println("Nhap dung usename va passwork ");
		else 
			System.out.println("Nhap khondung usename va passwork ");
		
		}catch(Exception tt){
			System.out.println("Nhap Loi ");
		}
		
	}
}
