package JavaTemel;


import java.util.Scanner;
public class ArraysPro {

	public static void main(String[] args) {
		int i, s = 0;
		int array[] = new int[5];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("5 Sayı Giriniz: ");
		
		for(i = 0; i < 5; i++) {
		  array[i] = scan.nextInt();  
		  
		  }
		
		
		System.out.println("\nÇift Sayılar: ");
		for(i = 0; i < 5; i++) {
			if(array[i] % 2 == 0) {
				System.out.println(" " + array[i]);
			}
		}
		
		System.out.println("\nTek Sayılar: ");
		for(i = 0; i < 5; i++) {
			if(array[i] % 2 != 0) {
				System.out.println(" " + array[i]);
			}
		}

	}

}
