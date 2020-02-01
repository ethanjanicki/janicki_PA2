package janicki_PA2;

import java.util.Scanner;

public class Encrypter {
public static Scanner scanner = new Scanner(System.in);
	
	static int temp_num=0;
	static int num1=0;
	static int num2=0;
	static int num3=0;
	static int num4=0;
	static int enc_num=0;
	static int p_end =1;
	
	/*public static void main(String[] args) {
		encrypt();
	}*/

	
public static void encrypt() {
	//ask for num input
	System.out.println("Please enter a 4 digit number that you would like to encrypt");
	//scan in 4 digits including leading zeros
	read_num();
	//seperate digits
	sep_dig();
	//add 7 to each digit
	add7();
	//divide each digit by 10 and get remainder
	//replace orginal digit with the remainder
	remain_10();
	//swap the first and third digit
	swap13();
	//swap the second and the fourth digit
	swap24();
	//print the integer
	//combine numbers
	combine_digits();
	//print num
	lead_z_check_print();
}
public static void sep_dig() {
	num4 =temp_num %10;
	temp_num=temp_num / 10;
	num3 =temp_num %10;
	temp_num=temp_num / 10;
	num2 =temp_num %10;
	temp_num=temp_num / 10;
	num1 =temp_num %10;
	temp_num=temp_num / 10;
				
	
}
public static void add7() {
	num4=num4+7;
	num3=num3+7;
	num2=num2+7;
	num1=num1+7;
}
public static void remain_10(){
	num1=num1 %10;
	num2=num2 %10;
	num3=num3 %10;
	num4=num4 %10;
}
public static void swap13() {
	temp_num=num1;
	num1=num3;
	num3=temp_num;
}
public static void swap24() {
	temp_num=num2;
	num2=num4;
	num4=temp_num;
}
public static void combine_digits() {
	enc_num = Integer.valueOf(String.valueOf(num1) + String.valueOf(num2)+String.valueOf(num3) + String.valueOf(num4));
}
public static void lead_z_check_print() {
	if(num1==0 && num2==0 && num3==0 && num4==0) {
		System.out.print("Your encrypted number is :");
		for(int i =0;i<4;i++) {
			System.out.print("0");
		}
		System.out.println("");
	}else if(num1 == 0 && num2 == 0 && num3 == 0) {
		System.out.print("Your encrypted number is :");
		for(int i =0;i<3;i++) {
			System.out.print("0");
		}
		System.out.println(num4);
	}else if (num1 == 0 && num2 == 0) {
		System.out.print("Your encrypted number is :");
		for(int i =0;i<2;i++) {
			System.out.print("0");
		}
		System.out.println(String.valueOf(num3) + String.valueOf(num4));
	}else if(num1 == 0) {
		System.out.print("Your encrypted number is :");
		System.out.print("0");
		System.out.println(String.valueOf(num2)+String.valueOf(num3) + String.valueOf(num4));
	}else {
		System.out.print("Your encrypted number is :");
		System.out.println(String.valueOf(num1) + String.valueOf(num2)+String.valueOf(num3) + String.valueOf(num4));
	}
}

public static int undo_mod(int digit) {
	if(digit == 7 || digit == 8 || digit == 9) {
		return digit;
	}else {
		digit = digit + 10;
		return digit;
	}
	
}
public static void undo_mod_all() {
	num1 = undo_mod(num1);
	num2 = undo_mod(num2);
	num3 = undo_mod(num3);
	num4 = undo_mod(num4);
}

public static void  read_num() {
	
	int num = scanner.nextInt();
	//print_num(num);
	temp_num=num;
	
}
}
