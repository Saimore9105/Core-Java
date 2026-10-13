   package com.tka;

    public class Demo {
	
	public static void main(String[] args) {
		
		
System.out.println("Write a program that checks if a person's age is greater tham 18,then print (Adult) ");
		int age = 20;
		
	if( age> 18) {
		System.out.println("Adult");
			}
	else 
		{System.out.println("Not adult");
			
		}
		System.out.println("\n");
		
		
	
		
System.out.println("Write a program to check whether a number is divisible by 10.");
		int num1 = 60;
		
		if(num1 % 10 == 0) {
			System.out.println("Number is divisible by 10 ");
			}
		else
		{
		System.out.println("Number is not divisible by 10");
		}
		System.out.println("\n");
		
		
		
		
System.out.println("Write a program to check whether a temperature is above 30°C, then print \"Hot Day.");
	int temp = 40;
		
		if(temp > 30) {
			System.out.println("Hot Day ");
			}
		else
		{
			System.out.println("Normal Day");
		}
			System.out.println("\n");
		
			
			
			
System.out.println("Write a program to check whether a number is even or odd.");
		int numb = 7;
		
		if(numb % 2 == 0) {
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		System.out.println("\n");
		
		
		
		
System.out.println("Write a program to check whether a number is positive or negative.");
		       int num2 = -5;

		       if (num2 >= 0) {
		         System.out.println("Positive");
		       } else {
		           System.out.println("Negative");
		        }
		    System.out.println("\n");		
		    
		    
		    
		    
System.out.println("Write a program to check whether a given year is leap year or not.");
		 int year = 2024;

	        if (year % 4 == 0) {
	            if (year % 100 == 0) {
	                if (year % 400 == 0) {
	                    System.out.println("Leap Year");
	                } else {
	                    System.out.println("Not a Leap Year");
	                }
	            } else {
	                System.out.println("Leap Year");
	            }
	        } else {
	            System.out.println("Not a Leap Year");
	        }
			 System.out.println("\n");
		
			 

			 
System.out.println("Write a program to find grade of a student based on marks:");
		 int marks = 85;

	       if (marks >= 90 && marks <= 100) {
	            System.out.println("Grade A");
	        } else if (marks >= 75 && marks < 90) {
	            System.out.println("Grade B");
	        } else if (marks >= 50 && marks < 75) {
	            System.out.println("Grade C");
	        } else if (marks >= 35 && marks < 50) {
	            System.out.println("Grade D");
	       } else if (marks >= 0 && marks < 35) {
	            System.out.println("Fail");
	        } else {
	            System.out.println("Invalid Marks");
	        }
		System.out.println("\n");
	
		
		
		
System.out.println("Write a program to print the day of the week based on day number (1–7).");
		int day = 7;

        if (day == 1) {
           System.out.println("Monday");
       } else if (day == 2) {
          System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
     } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
          System.out.println("Friday");
        } else if (day == 6) {
          //  System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Day");
       }
		System.out.println("\n");
		
		
		
		
System.out.println("Write a program to check the type of triangle (Equilateral, Isosceles, or Scalene).");
		 int a = 4;
	        int b = 4;
	        int c = 4;

	       if (a == b && b == c) {
	            System.out.println("Equilateral Triangle");
	      } else if (a == b || b == c || a == c) {
	           System.out.println("Isosceles Triangle");
	       } else {
	            System.out.println("Scalene Triangle");
	       }
		System.out.println("\n");
		
		
		
		
System.out.println("Write a program to print a message based on age group:");
		 int age1 = 45;

	       if (age >= 0 && age <= 12) {
	           System.out.println("Child");
	        } else if (age >= 13 && age <= 19) {
	            System.out.println("Teenager");
	       } else if (age >= 20 && age <= 59) {
	            System.out.println("Adult");
	        } else if (age >= 60) {
	           System.out.println("Senior Citizen");
	       } else {
	            System.out.println("Invalid Age");
	        }
	       System.out.println("\n");
		
		
	       
	       
System.out.println("Write a program to classify a temperature as Hot, Warm, Cool, or Cold.");
		 int temperature = 40;

	        if (temperature >= 30) {
	            System.out.println("Hot");
	        } else if (temperature >= 20) {
	           System.out.println("Warm");
	       } else if (temperature >= 10) {
	           System.out.println("Cool");
	        } else {
	           System.out.println("Cold");
	        }
	        System.out.println("\n");
		
	        
	  
	        
System.out.println("Write a program to check whether a number is positive, negative, or zero.");
		 int num3 = -10;

	        if (num3 > 0) {
	            System.out.println("Positive");
	        } else if (num3 < 0) {
	            System.out.println("Negative");
	        } else {
	           System.out.println("Zero");
	       }
		System.out.println("\n");
		
		
		
		
System.out.println("Write a program to check if a person is eligible to vote, and if eligible, check if they can contest in elections (age ≥ 25).");
		 int age2 = 26;

	        if (age2 >= 18) {
	            System.out.println("Eligible to Vote");

	            if (age2 >= 25) {
	                System.out.println("Eligible to Contest Elections");
	            } else {
	                System.out.println("Not Eligible to Contest Elections");
	            }

	        } else {
	            System.out.println("Not Eligible to Vote");
	        }
	        System.out.println("\n");
	        
	        
	        
	        
System.out.println("Write a program to check if a year is leap year, and if leap, check if it's a century year.");
	         int leapyear = 2000;

	        if (year % 4 == 0) {
	            if (year % 100 == 0) {
	                if (year % 400 == 0) {
	                    System.out.println("Leap Year");
	                    System.out.println("Century Year");
	                } else {
	                    System.out.println("Not a Leap Year");
	                    System.out.println("Century Year");
	                }
	            } else {
	                System.out.println("Leap Year");
	                System.out.println("Not a Century Year");
	            }
	        } else {
	            System.out.println("Not a Leap Year");
	            System.out.println("Not a Century Year");
	        }
	        System.out.println("\n");
	        
	        
	        
	        
System.out.println("Write a program to check whether a number is even, and if even, check whether it's greater than 50.");
	        int num4 = 60;

	        if (num4 % 2 == 0) {
	            System.out.println("Even Number");

	            if (num4 > 50) {
	                System.out.println("Greater than 50");
	            } else {
	                System.out.println("Not Greater than 50");
	            }

	        } else {
	            System.out.println("Odd Number");
	        }
		
		
	}
 }






