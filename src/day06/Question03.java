package day06;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		/*
	 	Kullanicidan yasini alin ve eger kullanici yasini 0 veya daha az bir yas girerse
	 kullaniciya musade etmeyin(Exception throw edin)
	 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Yasiniz giriniz: ");
		int yas=scan.nextInt();
		if(yas>0) {
			System.out.println("yasiniz: "+yas);
		}else {
			throw new IllegalArgumentException("yasiniz 0 dan kucuk olamaz");
		}
		/*2.yol
		  if(yas<=0){
		  try{
		  throw new IllegalArgumentException();
		  }catch(Exception e){
		  	  System.out.println("yasınız 0 dan kucuk");
		  }
		 */
	}

}
