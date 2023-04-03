package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stud = new Student();
		
		stud.name = sc.nextLine();
		stud.grade1 = sc.nextDouble();
		stud.grade2 = sc.nextDouble();
		stud.grade3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL = %.2f%n", stud.finalGrade());
		if (stud.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("FALTARAM %.2f PONTOS %n", stud.missingPoints());
		}else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
