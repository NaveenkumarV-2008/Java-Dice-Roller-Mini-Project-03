/*  Author : Naveen Kumar V
    Date : 23 Nov 2025

    DICE ROLLER PROGRAM in JAVA.
*/

import java.util.Random;
import java.util.Scanner;
public class DiceRoller
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int roll;
        int numOfDie;
        int total = 0;

        System.out.print("How many die you want to roll : ");
        numOfDie = scanner.nextInt();

        if (numOfDie <= 0)
        {
            System.out.print("No of Die must be > 0 !");
        }
        else
        {
            for (int i = 0; i < numOfDie ; i++)
            {
                roll = random.nextInt(1,7);
                dicePic(roll);
                total = total + roll;
            }
            System.out.print("Total : "+ total);
        }
        scanner.close();
    }
    static void dicePic(int roll)
    {
        String dice1;
        dice1 = """
         -------
        |       |
        |   ●   |
        |       |
         -------
        """ ;

        String dice2;
        dice2 = """
         -------
        | ●     |
        |       |
        |     ● |
         -------
        """ ;

        String dice3;
        dice3 = """
         -------
        | ●     |
        |   ●   |
        |     ● |
         -------
        """ ;

        String dice4;
        dice4 = """
         -------
        | ●   ● |
        |        |
        | ●   ● |
         -------
        """ ;

        String dice5;
        dice5 = """
         -------
        | ●   ● |
        |   ●   |
        | ●   ● |
         -------
        """ ;

        String dice6;
        dice6 = """
         -------
        | ●   ● |
        | ●   ● |
        | ●   ● |
         -------
        """ ;

        switch (roll)
        {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid input");
        }
    }
}