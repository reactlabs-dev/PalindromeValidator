/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromevalidator;

import java.util.Scanner;

/**
 *
 * @author MVegas
 */
public class PalindromeValidator {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean isPalindrome = false;
        
        System.out.println("Welcome to the Palindrome Validator");
        System.out.println("\nPlease enter a word to validate:");
        
        Scanner sc = new Scanner(System.in);
        
        String wordToValidate = sc.next();
        int x = wordToValidate.length() -1;
        for (int i = 0; i < wordToValidate.length(); i++) {
            isPalindrome = wordToValidate.toLowerCase().charAt(i) == wordToValidate.toLowerCase().charAt(x);
            x--;
        }
        
        if(isPalindrome)
            System.out.println(wordToValidate + " is a palindrome!");
        else
            System.out.println(wordToValidate + " is not a palindrome");
    }
    
}
