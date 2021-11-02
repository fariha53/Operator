package begineerjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if(ch =='a'||ch =='i'||ch =='u'||ch =='e'||ch =='o'||ch =='A'||ch =='I'||ch =='U'||ch =='E'||ch =='O')
        {
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }

    }
}
