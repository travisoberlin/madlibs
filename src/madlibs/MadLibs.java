package madlibs;

import com.sun.java_cup.internal.runtime.Scanner;

public class MadLibs {
	
	public static void main(String[] args) {
		
        int agelimit=18;
        Scanner userInput = new Scanner(System.in);
        System.out.println("How old are you?");
        int age= Integer.parseInt(userInput.nextLine());
        if ( age >= agelimit) {
            System.out.println("Awesome old man. Let's make a madlib.");

            System.out.println("Enter a name: ");
            String name = userInput.nextLine();
            System.out.println("Give me an adjective: ");
            String adjective = userInput.nextLine();
            System.out.println("Give me a verb: ");
            String verbOne = userInput.nextLine();
            System.out.println("Give me another verb: ");
            String verbTwo = userInput.nextLine();
            System.out.println("Give me a number: ");
            String number = userInput.nextLine();
            System.out.println("Give me your name: ");
            String yourName = userInput.nextLine();
         //   int ageLimit = 18;

            System.out.printf("Here is your story: \n");
            System.out.printf("\n Dear %s,", name);
            System.out.printf("\n You are extremely %s and I want to %s you!", adjective, verbOne);
            System.out.printf("\n I want to %s you %s times.", verbTwo, number);
            System.out.printf("\n Sincerely, %s \n", yourName);

        }
        else{

            System.out.println("You're not adult enough for theis madlib! Go play Fornite.");
            }






    }
			






}

