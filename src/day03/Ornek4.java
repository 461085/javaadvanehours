package day03;

import java.util.Scanner;

public class Ornek4 {
	/*Bir Stringin tersten ayni olup olmadigini bulunuz.  (Palindrom)
		 *
		 * ornek
		 *  madam , nurses run  ==> palindromdur*/
	
	public static void main(String[] args) {
			  Scanner scan =new Scanner(System.in);
			  System.out.println("lütfen bir string giriniz");
			  String str=scan.nextLine().replace(" ","").toLowerCase();
			  palindrom(str);
			  
			  scan.close();
	}	  

		public static void palindrom (String str) {
			
			String strTers="";
			
			for (int i = str.length()-1; i >=0; i--) {
				strTers=strTers+str.charAt(i);
				
				
			}
			
			if(strTers.equals(str)) {
				System.out.println("girilen string palindromdur");
			}else {
				System.out.println("girilen string palindrom değildir");
			}
		}

	}


