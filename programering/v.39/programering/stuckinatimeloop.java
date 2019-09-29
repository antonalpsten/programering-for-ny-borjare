package programering;

import java.util.Scanner;

public class stuckinatimeloop {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int antal = Scanner.nextInt();
				
		for (int iteration = 1; iteration <= antal; iteration++) {
		    System.out.println(iteration + " Abracadabra");
		}
	}
}
