package Part1_Recursion_Demonstration;

import java.util.Scanner;

public class Recursion_Demonstration {
    public static void main(String[] args) {
        //call of Part 1.3 Exception
        RunOverflowException();
        //call of Part 1.1
        printNumberBackward(9);
        System.out.println(" ");
        //call of Part 1.2
        printNumber(9);
    }

    //This method allows the user to choose whether or not they wish to create an overflow error
    public static void RunOverflowException() {
        String UserChoice = GetUserString("Do you wish to run this method? It will cause a stack overflow exception. Y/N");
        if (UserChoice.toUpperCase().contains("Y")) {
            Overflow();
        }
    }

    //Part 1.1
    public static void printNumberBackward(int n1) {
        System.out.print(n1 + " ");
        if (n1 == 0) {
            return;
        }
        printNumberBackward(n1 - 1);
    }

    //Part 1.2
    public static void printNumber(int n2) {
        if (n2 < 0) {
            return;
        }
        printNumber(n2 - 1);
        System.out.print(n2 + " ");
    }

    //Part 1.3 Overflow exception
    public static void Overflow() {
        int y = 1;
        System.out.println(y + 1);
        Overflow();
    }

    //these next two methods are for ease of coding only
    public static String GetUserString(String systemMessage) {
        Scanner userScanner = new Scanner(System.in);
        print(systemMessage);
        return userScanner.nextLine();
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
