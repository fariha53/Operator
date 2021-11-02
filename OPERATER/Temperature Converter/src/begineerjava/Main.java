package begineerjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        double celsius,farhrenheit;
        System.out.println("Celsius =");
        celsius = input.nextDouble();
        farhrenheit = 1.8*celsius+ 32;
        System.out.println("Farhrenheit = "+farhrenheit);

    }
}
