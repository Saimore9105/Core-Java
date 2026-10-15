package com.tka;

public class switchcase {

	public static void main(String[] args) {
		
		
		
		System.out.println("Write a program to print the day name using a number.");
		int day = 3;
		
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("Sunday");
		break;
		default:
			System.out.println("Invalid Input");
		}
		System.out.println("\n");
		
		
		
		System.out.println("Write a program to print month name based on number (1–12).");
		int month = 2;
		
		switch(month) {
		
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Aprl");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sept");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;
			
		default:
			System.out.println("Invaild Input");
		}
		System.out.println("\n");
		
		
		
		System.out.println("Create a calculator using switch case for operations:");
		 int a = 30;
	        int b =38;
	        char operator = '+';

	        switch (operator) {
	            case '+':
	                System.out.println("Addition = " + (a + b));
	                break;

	            case '-':
	                System.out.println("Subtraction = " + (a - b));
	                break;

	            case '*':
	                System.out.println("Multiplication = " + (a * b));
	                break;

	            case '/':
	                System.out.println("Division = " + (a / b));
	                break;

	            default:
	                System.out.println("Invalid operator");
	        }
		System.out.println("\n");
	        
		
		
		System.out.println("Write a program to check whether a character is a vowel or consonant using switch.");
	        char vowels = 'a';
	        	switch(vowels) {
	        	
	        	case 'a','e','i','o','u','A','E','I','O','U':
	        	System.out.println("Vowels");
	        	break;
	        	default:
	        		System.out.println("Invalid Input");
	        	}
	        	System.out.println("\n");
	        	
	        		
	        		
	 
	       System.out.println("Write a program to check even or odd using switch case."); 	
	        	int num = 10;

	            switch (num % 2) {
	                case 0:
	                    System.out.println("Even Number");
	                    break;
	                default:
	                    System.out.println("Odd Number");
	            }
		      System.out.println("\n");
	            
		      
	            
	          System.out.println("Menu Driven Program");  
	            int choice = 2;

	            switch (choice) {
	                case 1:
	                    System.out.println("Login");
	                    break;
	                case 2:
	                    System.out.println("Register");
	                    break;
	                case 3:
	                    System.out.println("Profile");
	                    break;
	                case 4:
	                    System.out.println("Logout");
	                    break;
	                default:
	                    System.out.println("Invalid Choice");
	            }
	            System.out.println("\n");
	            
	            
	            
	            System.out.println("Check if the day is Weekend or Weekday.");
	            int days = 4;

	            switch (days) {
	                case 1:
	                case 2:
	                case 3:
	                case 4:
	                case 5:
	                    System.out.println("Weekday");
	                    break;
	                case 6:
	                case 7:
	                    System.out.println("Weekend");
	                    break;
	                default:
	                    System.out.println("Invalid Day");
	            }
	            System.out.println("\n");
	            
	            
	            
	            System.out.println("Arithmetic Operator Program");
	            char op = '+';

	            switch (op) {
	                case '+':
	                    System.out.println("Result = " + (a + b));
	                    break;
	                case '-':
	                    System.out.println("Result = " + (a - b));
	                    break;
	                case '*':
	                    System.out.println("Result = " + (a * b));
	                    break;
	                case '/':
	                    if (b != 0) {
	                        System.out.println("Result = " + (a / b));
	                    } else {
	                        System.out.println("Cannot divide by zero");
	                    }
	                    break;
	                default:
	                    System.out.println("Invalid Operator");
	            }
	            System.out.println("\n");
	           
	            
	            
	            System.out.println("Input language code and print name.");
	            int code = 4;

	            switch (code) {
	                case 1:
	                    System.out.println("Java");
	                    break;
	                case 2:
	                    System.out.println("Python");
	                    break;
	                case 3:
	                    System.out.println("C++");
	                    break;
	                case 4:
	                    System.out.println("JavaScript");
	                    break;
	                default:
	                    System.out.println("Invalid Code");
	            }
	            System.out.println("\n");
	            
	            
	            
	            System.out.println("Traffic Signal Program");
	            String signal = "red";

	            switch (signal) {
	                case "red":
	                    System.out.println("Stop");
	                    break;
	                case "yellow":
	                    System.out.println("Ready");
	                    break;
	                case "green":
	                    System.out.println("Go");
	                    break;
	                default:
	                    System.out.println("Invalid Signal");
	            } 
	            System.out.println("\n");
	            
	            
	            
	            System.out.println("Print Number in Words");
	            int nums = 5;

	            switch (nums) {
	                case 1:
	                    System.out.println("One");
	                    break;
	                case 2:
	                    System.out.println("Two");
	                    break;
	                case 3:
	                    System.out.println("Three");
	                    break;
	                case 4:
	                    System.out.println("Four");
	                    break;
	                case 5:
	                    System.out.println("Five");
	                    break;
	                default:
	                    System.out.println("Invalid Number");
	            }
	            System.out.println("\n");
	            
	            
	            
	            System.out.println("Print department name."); 
	            int coding = 5;

	            switch (coding) {
	                case 1:
	                    System.out.println("Computer Science");
	                    break;
	                case 2:
	                    System.out.println("Mechanical");
	                    break;
	                case 3:
	                    System.out.println("Civil");
	                    break;
	                case 4:
	                    System.out.println("Electrical");
	                    break;
	                default:
	                    System.out.println("Invalid Department");
	            } 
	            System.out.println("\n");
	            
	            
	            
	            System.out.println("Print season based on month number.");
	            int seasons= 6;

	            switch (seasons) {
	                case 12:
	                case 1:
	                case 2:
	                    System.out.println("Winter");
	                    break;
	                case 3:
	                case 4:
	                case 5:
	                    System.out.println("Summer");
	                    break;
	                case 6:
	                case 7:
	                case 8:
	                    System.out.println("Monsoon");
	                    break;
	                case 9:
	                case 10:
	                case 11:
	                    System.out.println("Autumn");
	                    break;
	                default:
	                    System.out.println("Invalid Month");
	            }
	            System.out.println("\n");
	            
	            
	            
	            System.out.println("Create a mobile settings menu.");
	            int selected= 2;

	            switch (selected) {
	                case 1:
	                    System.out.println("WiFi Selected");
	                    break;
	                case 2:
	                    System.out.println("Bluetooth Selected");
	                    break;
	                case 3:
	                    System.out.println("Mobile Data Selected");
	                    break;
	                case 4:
	                    System.out.println("Airplane Mode Selected");
	                    break;
	                default:
	                    System.out.println("Invalid Choice");
	            }
	            System.out.println("\n");
	            
	            
	            
	           System.out.println("Create food menu."); 
	            int food = 6;

	            switch (food) {
	                case 1:
	                    System.out.println("Pizza");
	                    break;
	                case 2:
	                    System.out.println("Burger");
	                    break;
	                case 3:
	                    System.out.println("Sandwich");
	                    break;
	                case 4:
	                    System.out.println("Pasta");
	                    break;
	                default:
	                    System.out.println("Invalid Choice");
	            }
	            System.out.println("\n");
	            
	            
	            
	            System.out.println("");
	            char grade = 'A';

	            switch (grade) {
	                case 'A':
	                    System.out.println("Excellent");
	                    break;

	                case 'B':
	                    System.out.println("Good");
	                    break;

	                case 'C':
	                    System.out.println("Average");
	                    break;

	                case 'D':
	                    System.out.println("Pass");
	                    break;

	                case 'F':
	                    System.out.println("Fail");
	                    break;

	                default:
	                    System.out.println("Invalid grade");
	            }
               System.out.println("\n");
               
               
               
               System.out.println("Area Calculator");
               int choices = 3;
               double r = 5;
               int l = 10, p = 5, s = 4;

               switch (choice) {
                   case 1:
                       System.out.println("Area of Circle = " + (3.14 * r * r));
                       break;

                   case 2:
                       System.out.println("Area of Rectangle = " + (l * p));
                       break;

                   case 3:
                       System.out.println("Area of Square = " + (s * s));
                       break;

                   default:
                       System.out.println("Invalid choice");
               }
               System.out.println("\n");
               
               
               
               System.out.println("Check character type.");
               char ch = 'A';

               switch (Character.getType(ch)) {
                   case Character.UPPERCASE_LETTER:
                       System.out.println("Uppercase");
                       break;

                   case Character.LOWERCASE_LETTER:
                       System.out.println("Lowercase");
                       break;

                   case Character.DECIMAL_DIGIT_NUMBER:
                       System.out.println("Digit");
                       break;

                   default:
                       System.out.println("Special Character");
               }
              System.out.println("\n");
              
              
              
              System.out.println("Based on marks category.");
              int category = 2;

              switch (category) {
                  case 1:
                      System.out.println("Pass");
                      break;

                  case 2:
                      System.out.println("Distinction");
                      break;

                  case 3:
                      System.out.println("Fail");
                      break;

                  default:
                      System.out.println("Invalid category");
              }
              System.out.println("\n");
              
              
              
              System.out.println("Create ATM options.");
              int choic = 1;
              int balance = 5000;
              int amount = 1000;

              switch (choic) {
                  case 1:
                      System.out.println("Balance = " + balance);
                      break;

                  case 2:
                      balance = balance - amount;
                      System.out.println("Withdraw Successful");
                      System.out.println("Balance = " + balance);
                      break;

                  case 3:
                      balance = balance + amount;
                      System.out.println("Deposit Successful");
                      System.out.println("Balance = " + balance);
                      break;

                  case 4:
                      System.out.println("Thank you for using ATM");
                      break;

                  default:
                      System.out.println("Invalid choice");
              }
              System.out.println("\n");
			
	}
	
	
	
	

	
	
	
}
