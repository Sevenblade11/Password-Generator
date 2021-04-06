package main;

import generator.GeneratePassword;

public class Driver {

    public static void main(String[] args){
        System.out.println("Password Generator test with booleans:\n");
        System.out.println("Password length 20, Uppercase, Special Characters: " +GeneratePassword.generatePassword(20, true, true));
        System.out.println("Password length 20, Special Characters: " +GeneratePassword.generatePassword(20, true, false));
        System.out.println("Password length 20, Uppercase: " +GeneratePassword.generatePassword(20, false, true));

        System.out.println("Password length 10, Uppercase, Special Characters: " +GeneratePassword.generatePassword(10, true, true));
        System.out.println("Password length 10, Uppercase: " +GeneratePassword.generatePassword(10, false, true));
        System.out.println("Password length 10, Special Characters: " +GeneratePassword.generatePassword(10, true, false));

        System.out.println("\nPassword Generator test with numbers:\n");
        System.out.println("Password length 20, 5 Uppercase, 10 Special Characters: " +GeneratePassword.generatePassword(20, 10, 5));
        System.out.println("Password length 20, 10 Special Characters: " +GeneratePassword.generatePassword(20, 10, 0));
        System.out.println("Password length 20, 3 Uppercase: " +GeneratePassword.generatePassword(20, 0, 3));

        System.out.println("Password length 10, 5 Uppercase, 5 Special Characters: " +GeneratePassword.generatePassword(10, 5, 5));
        System.out.println("Password length 10, 10 Uppercase: " +GeneratePassword.generatePassword(10, 0, 10));
        System.out.println("Password length 10, 6 Special Characters: " +GeneratePassword.generatePassword(10, 6, 0));
    }
}
