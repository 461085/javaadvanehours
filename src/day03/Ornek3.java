package day03;

import java.util.Iterator;
import java.util.Scanner;

public class Ornek3 {
	/*Girilen sayinin  Amstrong sayi olup olmadigini yazdiran java programi yaziniz
    Ornek, 153 bir Armstrong sayidir. cunku 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
    
   
   */
	
	  

	public static void main(String[] args) {
		  Scanner scan =new Scanner(System.in);
		  System.out.println("bir sayinin amstrong sayi olup olmadığını öğrenmek için bir rakam giriniz");
		  int sayi=scan.nextInt();
		  amstrong(sayi);
		  
		  scan.close();

		
}
	public static void amstrong(int n) {
		
		int sayininKupleriToplami=0;
		
		int basamakDegeri=0;
		
		int a=n;
		
		while(n>0) {
			basamakDegeri=n%10;
			sayininKupleriToplami=sayininKupleriToplami+(basamakDegeri*basamakDegeri*basamakDegeri);
			n=n/10;
			
		}
	   if(a==sayininKupleriToplami) {
		   System.out.println(a+"Sayisi amstrong sayisidir");
		   
	
	}else {
		
		System.out.println(a+"Sayisi amstrong sayisi değildir");
	}
	
		  
		  
		

	}

}
