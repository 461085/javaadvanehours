package day03;

import java.util.Scanner;

public class Ornek {
	/*Kulanicidan alina bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
	 * return eden metod yaziniz
	 *
	 * ornek
	 * input  elma  2
	 *        army  3
	 *
	 * output  eaea
	 *         ayayay*/
	  
	  
	 
	

	    public static void main(String[] args) {
	      Scanner scan =new Scanner(System.in);
	  	  System.out.println("lütfen bir string giriniz");
	  	  String input=scan.nextLine();
	  	  System.out.println("lütfen bir sayı giriniz");
	  	  int sayi=scan.nextInt();
	  	  System.out.println(IlkSonHarf(input,sayi));
	  	  scan.close();
	  	  
	    }
	  	  
		
		
		public static String IlkSonHarf(String str,int n) {
			
		   String s=str.substring(0,1)+str.substring(str.length()-1);
		   
		   String b="";
		   
		   for(int i=1;i<=n; i++) {//döngüyü sağlayabilmek için 1 den başlatıyoruz.
			   b=b+s;
			   
			   
				   
			   }
		   
			
			
			return b;
			
		}

	}


