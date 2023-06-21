package java_assignment_2;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise_2 {
	public static void main(String[] args) {
		
		
		// Question 1
		
		int i = 5;
		System.out.println("so nguyen i = " + i);
		System.out.println("--------");
		
		
		// Question 2
		
		DecimalFormat df = new DecimalFormat("#,000");
		int n = 100000000;
		
		System.out.println("so nguyen n = " + df.format(n));
		System.out.println("--------");
		
		
		// Question 3
		
		double a = 5.567098;
		System.out.println("so thuc a = " + Math.round(a*100000.0)/100000.0);
		System.out.println("--------");
		
		// Question 4
		
		String firstname = "Nguyen";
		String lastname = "Van A";
		
		System.out.println("I am " + firstname + " " + lastname + " and I am aloning");
		System.out.println("--------");
		
		// Question 5
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("DD/MM/YYYY HH:MM:SS");
		LocalDateTime Time = LocalDateTime.now();
		System.out.println("now time is " + dtf.format(Time));
		
	}

}
