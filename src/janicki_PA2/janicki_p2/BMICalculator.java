package janicki_PA2;

import java.util.Scanner;


public class BMICalculator {
	static String unitType;
	static float height=0;
	static float weight=0;
	static int while_end=0; 
	static float Bmi;
	static String BmiCatagory;
	
	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	    BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	}
	
	
	
	
	public void readUserData() {
		//ask for unit type
		System.out.println("Please specify if you will use imperial measurmearments or metric");
		//ends loop if input is successful
		while(while_end==0) {
			
		readUnitType();		
		readMeasurementData();
	
		}
	}
	private void readUnitType() {
		unitType = scanner.nextLine();
		 
	}
	private void readMeasurementData() {
	if("imperial".equals(unitType)) {
			
			readImperialData();
			//ends loop if input is successful
			while_end=1;
		}else if("metric".equals(unitType)) {
			readMetricData();
			//ends loop if input is successful
			while_end=1;
		}else {
			//prints if not a valid typr
			System.out.println("That is not a valid unit type");
		}
		
	}
	private void readMetricData() {
		//get weight and height for metric
		getHight();
		getWeight();
	}
	private void readImperialData() {
		//get weight and height for imperial
		getHight();
		getWeight();
	}
	public void calculateBmi() {
		if("imperial".equals(unitType)) {
			//do imperial calculations
			weight = weight * 703;
			height = height * height;
			
			getBmi();
			
		}else if("metric".equals(unitType)) {
			//do metric calculations
			height = height * height;
			
			getBmi();
		}
		calculateBmiCategory();
	}
	private void calculateBmiCategory() {
		if(Bmi<18.5) {
			//set to under weight if below 18.5
			getBmiCategory("UnderWeight");
		}else if(Bmi >= 18.5 && Bmi <= 24.9) {
			//set to normal if between 18.5 and 24.9
			getBmiCategory("Normal Weight");
		}else if(Bmi >= 25 && Bmi <= 29.9) {
			//set to overweight if between 25 and 29.9
			getBmiCategory("OverWeight");
		}else if(Bmi >= 30) {
			//set to obese if over 30
			getBmiCategory("Obese");
		}
		
	}
	public void displayBmi() {
		//prints out bmi
		System.out.println("Your BMI is: "+Bmi);
		System.out.println("Your BMI Catagory is: "+BmiCatagory);
	}
	public void getWeight() {
		//determines if imperial or metric
		if("imperial".equals(unitType)) {
			System.out.println("Please enter your weight in pounds.");
			}else if("metric".equals(unitType)) {
				System.out.println("Please enter your weight in kilograms.");
			}
		setWeight();
		
	}
	private void setWeight() {
		
		weight =scanner.nextInt();
		if(weight <0) {
			System.exit(0);
		}
		
		
	}
	public void getHight() {
		//determines if imperial or metric
		if("imperial".equals(unitType)) {
		System.out.println("Please enter your height in inches.");
		}else if("metric".equals(unitType)) {
			System.out.println("Please enter your height in meters.");
		}
		setHeight();
		
	}
	private void setHeight() {
		height = scanner.nextInt();
		if(height <0) {
			System.exit(0);
		}
	}
	public void getBmi() {
		//get bmi
		Bmi= weight/height;
	}
	public void getBmiCategory(String Cat) {
		//gets car from argument and sets it to bmi cat
		BmiCatagory =Cat;
	}
	

}
