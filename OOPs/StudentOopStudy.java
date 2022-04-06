package OOPs;

import java.util.Scanner;

public class StudentOopStudy {
	private static class Student {
		private String name;
		private int age;
		
		private Student(String name, int age){
			this.name = name;
			this.age = age;
		}
		
		private String getName(){
			return this.name;
		}
		private void setName(String name){
			this.name = name;
		}
		
		private int getAge(){
			return this.age;
		}
		private void setAge(int age){
			this.age = age;
		}
	}
	
	
	private static class EngineeringStudent extends Student {
		private String registration_number;
		private float GPA;
		
		private EngineeringStudent(String name, int age, String registration_number, float GPA) {
			super(name, age);
			this.registration_number = registration_number;
			this.GPA = GPA;
		}
		
		private String getDeets(){
			return super.getName();
		}
		
		private void setDeets(String name){
			super.name = name;
		}
		
		private int getMoreDeets(){
			return super.getAge();
		}
		private void setMoreDeets(int age){
			super.age = age;
		}
		
		private String getRegistration_number(){
			return this.registration_number;
		}
		private void setRegistration_number(String registration_number){
			this.registration_number = registration_number;
		}
		
		private float getGPA(){
			return this.GPA;
		}
		
		private void setGPA(float GPA){
			this.GPA = GPA;
		}
	}
	
	private static void StudentSurvey(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the student : ");
		String name = sc.nextLine();
		System.out.println("Enter the class of the student : ");
		int age = sc.nextInt();
		System.out.println("Is the student an engineering student?(y/n) : ");
		char response = sc.next().charAt(0);
		
		if (response == 'y' || response == 'Y'){
			System.out.println("Enter the registration number of the student : ");
			String regisNo = sc.nextLine();
			System.out.println("Enter the GPA of the student : ");
			float GPA = sc.nextFloat();
			EngineeringStudent student = new EngineeringStudent(name, age, regisNo, GPA);
			
			System.out.println("Get info? (y/n) : ");
			response = sc.next().charAt(0);
			if (response == 'y' || response == 'Y'){
				System.out.println(student.getDeets() + "\n" + student.getMoreDeets() + "\n" +  student.getRegistration_number() + "\n" +  student.getGPA());
			}
			
			System.out.println("Change info? (y/n) : ");
			response = sc.next().charAt(0);
			if (response == 'y' || response == 'Y'){
				System.out.println("Enter the name of the student : ");
				student.setDeets(sc.nextLine());
				System.out.println("Enter the age of the student : ");
				student.setMoreDeets(sc.nextInt());
				System.out.println("Enter the registration number of the student : ");
				student.setRegistration_number(sc.nextLine());
				System.out.println("Enter the GPA of the student : ");
				student.setGPA(sc.nextFloat());
			}
		}
		else {
			Student student = new Student(name, age);
			System.out.println("Get info? (y/n) : ");
			response = sc.next().charAt(0);
			if (response == 'y' || response == 'Y'){
				System.out.println(student.getName() + "\n" +  student.getAge());
			}
			System.out.println("Change info? (y/n) : ");
			response = sc.next().charAt(0);
			if (response == 'y' || response == 'Y') {
				System.out.println("Enter the name of the student : ");
				student.setName(sc.nextLine());
				System.out.println("Enter the age of the student : ");
				student.setAge(sc.nextInt());
			}
		}
	}
	
	public static void main(String[] args){
		StudentSurvey();
	}
}
