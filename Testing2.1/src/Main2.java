import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		
		printName();
		printAge();
		printGender();
		printWork();
		printLanguage();
		printCGPA();
		printGrade();
		printTotalCGPA();
	}
	
	public static void printName() {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter your name :");
		String name = in.next(); 
		System.out.println("Name : " +name);
	}
	
	public static void printAge() {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter your age :");
		int age = in.nextInt();
		System.out.println("Age : " +age);
	}
	
	public static void printGender() {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter your gender :");
		String str = in.next();
		char gender = str.charAt(0);
		System.out.println("Gender : " +gender);
	
	}
	
	public static void printWork() {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter your working experience : 1. ");
		String work1 = in.next(); 
		System.out.println("\t\t\t\tWork1 : " +work1);
		
		System.out.print("\t\t\t\t2. ");
		String work2 = in.next();
		System.out.println("\t\t\t\tWork2 : " +work2);
		
	}
		
	public static void printLanguage() {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter your languages:   1. ");
		String language1 = in.next(); 
		System.out.println("\t\t\tLanguage1 : " +language1);
		
		System.out.print("\t\t\t2. ");
		String language2 = in.next();
		System.out.println("\t\t\tLanguage2 : " +language2);
		
		System.out.print("\t\t\t3. ");
		String language3 = in.next();
		System.out.println("\t\t\tLanguage3 : " +language3);
		
	}
	

	public static void printCGPA() {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter your STPM CGPA :");
		double cgpa = in.nextDouble();
		System.out.println("CGPA : " +cgpa);
	}
	
	public static void printGrade() {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter grade STIA1113 : ");
		String str  = in.next();
		char grade = str.charAt(0);
		System.out.println("Grade : " +grade);
	}
		
	public static void printTotalCGPA() {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter GPA semester 1 :");
		double num1 = in.nextDouble();
		System.out.print("Enter GPA semester2 :");
		double num2 = in.nextDouble();
		
		double sum = num1+num2;
		double totalgpa = sum/2;
		System.out.println("Sum equal to : " +totalgpa);
		
		in.close();
	}
		

}
