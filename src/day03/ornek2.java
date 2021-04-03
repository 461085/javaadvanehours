package day03;

import java.util.Scanner;

public class ornek2 {
	/*
	    girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
	 
	  input      output
	  axyzm  ==   true
	  xyz    ==   true
	  x.yz   ==   false
	  xyaz   ==   false*/
	public static void main(String[] args) {
	  Scanner scan =new Scanner(System.in);
	  System.out.println("lütfen bir string giriniz");
	  String input=scan.nextLine().toLowerCase();
	  
	  System.out.println(xyzVarMi(input));
	  
	  scan.close();

	}

	public static boolean xyzVarMi (String str) {
		
		if(str.contains("xyz")) {
			return true;
		
		}else {
			return false;
		}
				
		
		
		
		

	}

}
