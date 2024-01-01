

// Level 2 - Task 1 - Password Stregnth Checker

import java.util.Scanner;
/**
 * Passwordcheck
 */
public class Passwordcheck {

    public void checker() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Password::");
        String pass = scanner.next();

        char elments1[] = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char elments2[] = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char elments3[] = new char[]{'1','2','3','4','5','6','7','8','9','0'};
        char elments4[] = new char[]{'~','`','@','!','#','$','^','%','&','*','(',')','-','_','=','+','[',']','|',';',':','<','>','?','/'};

        int hasCap = 0 , hasSml = 0, hasNum = 0 , hasSpeCh = 0;

        char ele;

        for (int i = 0; i < pass.length(); i++) {
            ele = pass.charAt(i);

        for (char c : elments1) {
            if (ele == c) {
                hasCap = 1;
            }
        }
        }

        for (int i = 0; i < pass.length(); i++) {
            ele = pass.charAt(i);

        for (char c : elments2) {
            if (ele == c) {
                hasSml = 1;
            }
        }
        }

        for (int i = 0; i < pass.length(); i++) {
            ele = pass.charAt(i);

            for (char c : elments3) {
                if (ele == c) {
                    hasNum =1;
                }
            }
        }


        for (int i = 0; i < pass.length(); i++) {
            ele = pass.charAt(i);

        for (char c : elments4) {
            if (ele == c) {
                hasSpeCh = 1;
            }
        }
        }

        int len = pass.length();

        if (hasCap == 1 && hasSml ==1 && hasNum == 1 && hasSpeCh == 1 && len>8) {
            System.out.println("Password is Strong");
        }
        else if (hasCap == 1 && hasSml ==1 && hasNum == 1 && hasSpeCh == 1 && len>6 || hasCap == 1 && hasSml ==1 && hasSpeCh == 1 && len>6 || hasCap == 1 && hasNum == 1 && hasSpeCh == 1 && len>6 || hasSml ==1 && hasNum == 1 && hasSpeCh == 1 && len>6) {
            System.out.println("Password is Intermediate");
        }
        else if (hasCap == 1 && hasSml ==1 && hasNum == 1 && len>6 || hasCap == 1 && hasSml ==1 && len>6 || hasCap == 1 && hasNum == 1 && len>6 || hasSml ==1 && hasNum == 1 && len>6) {
            System.out.println("Password is Intermediate");
        }
        else {
            System.out.println("Password is Weak");
        }
        
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;

        Passwordcheck object = new Passwordcheck();
        do {
            System.out.println("1. Check Password Stregnth");
            System.out.println("2. Exit");

            System.out.println("Enter your Choice::");
            int Choice = scanner.nextInt();

            switch (Choice) {
                case 1:
                    object.checker();
                    break;
                

                case 2:
                    System.out.println("Exiting..");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter Valid Choice!!");
                    break;
            }
            System.out.println("Do you want to Continue?(y/n)");
            ch = scanner.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }
}