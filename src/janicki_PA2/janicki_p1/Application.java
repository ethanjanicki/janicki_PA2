package janicki_PA2;

import java.util.Scanner;

public class Application {
	 static String in;
	 static Scanner inp = new Scanner(System.in);
	 static int indicator=0;
	public static void main(String[] args) {
		while (indicator==0) {
		System.out.println("Would you like to encrypt or decrypt the data");
		System.out.println("Please Enter encrypt or decrypt");
		in=inp.nextLine();
		if("encrypt".equals(in)) {
		Encrypter.encrypt();
		indicator=1;
		}else if("decrypt".equals(in)) {
			Decrypter.decrypt();
			indicator=1;
		}else {
			System.out.println("That is not a valid input");
		}
	}
	}
}
