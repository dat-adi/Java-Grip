package Assignments;

import java.util.*;

class lab01{
    private static class Admin{
        private static final int a = 17;
		private static final int b = 20;

		protected static String encryptMessage(char[] msg) {
			StringBuilder cipher = new StringBuilder();
			for(char c : msg) {
				if (c != ' ') {
					cipher.append((char) ((((a * (c - 'A')) + b) % 26) + 'A'));
				} else {
					cipher.append(c);
				}
			}
			return cipher.toString();
		}
	
		protected static String decryptMessage(String cipher) {
			StringBuilder msg = new StringBuilder();
			int a_inv = 0;
			int flag;
			for(int i = 0; i < 26; i++) {
				flag = (a * i) % 26;
				if (flag == 1) {
					a_inv = i;
				}
			}
			
			for (int i = 0; i < cipher.length(); i++) {
				if (cipher.charAt(i) != ' ') {
					msg.append((char) (((a_inv *
						((cipher.charAt(i) + 'A' - b)) % 26)) + 'A'));
				} else {
					msg.append(cipher.charAt(i));
				}
			}
		
			return msg.toString();
		}
	}

    private static class Student extends Admin{
        public String name;
        public String regID;
        private final String password;
        
        Student(String name, String regID, String password){
            this.name = name;
            this.regID = regID;
            
            this.password = encryptMessage(password.toCharArray());
        }
        
		private void displayDetails(String testReg){
        	if(testReg.equals(this.regID)){
				System.out.println("Student: " + this.name);
				System.out.println("Password: " + decryptMessage(this.password));
			}
		}
		
		String getName(){
        	return this.name;
		}
		String getRegID(){
        	return this.regID;
		}
	}

    private static class Faculty{
    	void displayDetails(Student[] students){
    		for(Student student: students){
    			System.out.println("\nName: " + student.getName() + "\nRegistration ID: " + student.getRegID());
			}
		}
	}

    static class TestClass{
        public static void main(String[] args){
        	Scanner sc = new Scanner(System.in);
        	
			// Use student objects to create individual entities
			Student[] students = {
            	new Student("Abhiram", "19BCD7118", "demonslayer98"),
				new Student("Adi", "19BCE7119", "lordsaveme"),
				new Student("Santhosh", "19BCN7091", "helpmeplsineedhelpsomeoneplshelp")
            };
            
			while(true) {
				System.out.println("Student or Faculty Access?(s/f/q): ");
				char choice = sc.next().charAt(0);
				if (choice == 's' || choice == 'S') {
					sc.nextLine();
					System.out.println("Enter student registration number: ");
					String askRegID = sc.nextLine();
					
					for (Student student : students) {
						student.displayDetails(askRegID);
					}
				} else if (choice == 'f' || choice == 'F') {
					System.out.println("Here is the required information regarding the students...");
					
					Faculty faculty = new Faculty();
					faculty.displayDetails(students);
				} else if (choice == 'q' || choice == 'Q') {
					System.out.println("Exiting the application...");
					break;
				} else {
					System.out.println("Pick a valid option.\nThank you.");
				}
			}
            
            sc.close();
        }
    }
}