package programering;

import java.util.Scanner;

public class l�xa {
public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
	
		System.out.println("vad heter du?");
		String namn = scan1.next();
		
		System.out.println("hur gammal �r du?");
		int gammal = scan1.nextInt();
		
		System.out.println("vad �r din adress?");
		String adress = scan1.next();
		
		System.out.println("vad �r ditt postnummer?");
		int postnummer = scan1.nextInt();
		
		System.out.println("vilken stad bor du i?");
		String stad = scan1.next();
		
		System.out.println("vad �r ditt telefonummer?");
		int nummer = scan1.nextInt();
		
		
}
}
