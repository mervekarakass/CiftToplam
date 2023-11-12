package CiftToplam;

import java.util.Scanner;

public class CiftToplam {

	public static void main(String[] args) {
		int n;
		int total =0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Sayi giriniz: ");
			n = input.nextInt();
			
			total += n;
			
		} while (n % 2 == 0);
		
		System.out.println("Toplam: " + total);

	}

}
