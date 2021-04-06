package generator;

import java.util.Random;

public class GeneratePassword {

    private static final char[] LOWERCASELIST = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] UPPERCASELIST = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] SPECIALCHARLIST = "!@#$%&^*()?".toCharArray();

    private static final int MAXLETTERCOUNT = 26;
    private static final int MAXSPECIALCHARCOUNT = 11;

    private static Random randomNumber = new Random();

    public static String generatePassword(int length, boolean specialCharacters, boolean upperCase){
        StringBuilder password = new StringBuilder();
        int character;

        for(int i = 0; i < length; i++){
            character = randomNumber.nextInt(3);

            if(upperCase && character == 1)
                password.append(generateUpperCharacter());
            else if(specialCharacters && character == 2)
                password.append(generateSpecialCharacter());
            else
                password.append(generateLowerCharacter());

        }
        return password.toString();
    }

    public static String generatePassword(int length, int specialCharacterAmount, int upperCaseAmount){
        StringBuilder password = new StringBuilder();
        int character;

        if(specialCharacterAmount + upperCaseAmount > length)
            return "ERROR";

        while(password.length() < length){
            character = randomNumber.nextInt(3);

            if(specialCharacterAmount > 0 && character == 1) {
                password.append(generateSpecialCharacter());
                specialCharacterAmount--;
            }
            else if(upperCaseAmount > 0 && character == 2) {
                password.append(generateUpperCharacter());
                upperCaseAmount--;
            }
            else if ( (upperCaseAmount <= 0 && specialCharacterAmount <= 0) || (upperCaseAmount + specialCharacterAmount < length - password.length()) )
                password.append(generateLowerCharacter());
        }

        return password.toString();
    }

    private static String generateUpperCharacter(){
        return ""+UPPERCASELIST[randomNumber.nextInt(MAXLETTERCOUNT)];
    }

    private static String generateSpecialCharacter(){
        return "" +SPECIALCHARLIST[randomNumber.nextInt(MAXSPECIALCHARCOUNT)];
    }

    private static String generateLowerCharacter(){
        return "" + LOWERCASELIST[randomNumber.nextInt(MAXLETTERCOUNT)];
    }


}
