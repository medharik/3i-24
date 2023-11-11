package base1;

import java.util.Iterator;

public class Boucle {
public static void main(String[] args) {
	
	//boucle (loop)
	// for : souvent utilisee pour un nombre de repetition ( n iteration)
	// bien determine 
	

	for( int i=2  ; i<=4  ;i++   ) 		System.out.println("1- ITERATION "+i); //2,3,4 = 3 fois
	for( int i=0  ; i<=4  ;i+=2   ) System.out.println("2- ITERATION"+i);//0,2,4 = 3 fois
	for( int i=20  ; i>=17  ;i--   ) 		System.out.println("3- ITERATION "+i);//20,19,18,17 = 4fois
	for( int i=20  ; i<=17  ;i--   ) 		System.out.println("4- ITERATION "+i);// 0 fois
//	for( int i=16  ; i<=17  ;i--   ) 		System.out.println("5- ITERATION "+i);//-infini
	boolean trouve=false;
	for( int i=1  ; i<=1000 && !trouve ;i++   ) {
		System.out.println("6- ITERATION "+i);
		if(i%5==4) trouve=true;
	}
	
		
}
}
