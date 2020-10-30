
import java.util.*;
public class Resume {
	
	public static void main(String[] args) {
		Scanner input =  new Scanner (System.in);
		
		printname();
		printgender();
		printage();
		printbirthday();
		printmarital();
		printcitizenship();
		printhomeaddress();
		printhp();
		printexamresult();
		printcgpa();
		printworkexperiences();
		printlanguage();
		printskills();
		printawards();
	}
		public static void printname() {
			Scanner string = new Scanner(System.in);
			String name = "Nurafiza Binti Abdul Rashid";
			System.out.println("Name \t\t:" + name);
		
	}
		public static void printgender() {
			Scanner sc = new Scanner(System.in);
			char gender = 'F';
			System.out.println("Gender \t\t:" + gender);
		
	}
		public static void printage() {
			Scanner sc= new Scanner(System.in);
			int age = 20;
			System.out.println("Age \t\t:" + age + " Years old" );
		}
		
		public static void printbirthday() {
			Scanner sc = new Scanner(System.in);
			String birthday = "8 May 2000";
			System.out.println("Birthday \t:" + birthday);
			
		}
		public static void printmarital() {
			Scanner sc = new Scanner(System.in);
			String marital = "Single";
			System.out.println("Marital Status \t:" + marital);
		}
		public static void printcitizenship() {
			Scanner sc = new Scanner(System.in);
			String citizenship = "Malaysia";
			System.out.println("Citizenship \t:" + citizenship);
			
		}
		public static void printhomeaddress() {
			Scanner sc = new Scanner(System.in);
			String homeaddress = "Blok A, Taman Seri Berlian,07000, Kuah, Langkawi";
			System.out.println("Home Address \t:" + homeaddress);
		}
		public static void printhp() {
			Scanner sc = new Scanner(System.in);
			String hp = "+60198518043";
			System.out.println("Phone number \t:" + hp);
		}
		public static void printexamresult() {
			Scanner sc = new Scanner(System.in);
			String exam = "A";
			System.out.println("Exam Result \t:" + exam);
			
		}
		public static void printcgpa() {
			Scanner sc = new Scanner(System.in);
			Double cgpa1 = 3.50;
			Double cgpa2 = 3.45;
			Double cgpa=(cgpa1 + cgpa2)/2;
			System.out.println("CGPA \t\t:" + cgpa);
		}
		public static void printworkexperiences() {
			Scanner sc = new Scanner(System.in);
			String work = "none";
			System.out.println("Work Experiences:" + work);
		}
		public static void printlanguage() {
			Scanner sc = new Scanner(System.in);
			String language1 = "Malay (100%)";
			String language2 = "English(60%)";
			System.out.println("Languange\t:1."+ language1 +"\n\t\t:2."+ language2);
		}
		public static void printskills() {
			Scanner sc = new Scanner(System.in);
			String skills1 = "Drawing";
			String skills2 = "Games";
			System.out.println("Skills\t\t:1." + skills1 + "\n\t\t:2."+ skills2);
			
		}
		public static void printawards() {
			Scanner sc = new Scanner(System.in);
			String award1 = "Best Student STPM";
			String award2 = "Malaysian University English Test - Band 4";
			System.out.println("Certificates \t:1." + award1 +"\n\t\t:2." + award2);
		}
}
