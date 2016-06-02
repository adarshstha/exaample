/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counting;

import java.util.Scanner;

/**
 *
 * @author sita
 */
public class Counting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String string1;
        System.out.println("Enter a string");
        string1 = stdin.nextLine();
        string1 = string1.toLowerCase();
 int count = 0;
        int vowels = 0;
        int consonants = 0;
         for (String retval: string1.split(" ")){
             for (int i = 0; i < retval.length(); i++){
            char ch = retval.charAt(i);
                        if (ch == 'a' || ch == 'e' || ch == 'i' || 
                                        ch == 'o' || ch == 'u')
                        {
                                vowels++;
                        }
                        else
                        { 
                                consonants++;
                        }
                }
            System.out.println(retval.substring(0, 1).toUpperCase() + retval.substring(1)+" has "+vowels+" vowels and "+consonants+" cosonants");
         vowels=0;
         consonants=0;
      }

        }

   

       