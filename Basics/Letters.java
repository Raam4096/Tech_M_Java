package Basics;

import java.util.Scanner;


public class Letters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vowel=0;
        int cons=0;
        char c=s.next().charAt(0);
        if(Character.isAlphabetic(c)){
        c=Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.println("its an vowel");
        }
        else{
            System.out.println("its an Consonant");
        }

        }
        else{
            System.out.println("enter an alphabet");
        }
    }
}
