package begineerjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int a,b,x,y,c,d;
        System.out.println("ENter 1st & 2nd numbers: ");
        a= input.nextInt();
        b= input.nextInt();
        x = a&b;
        System.out.println(a+" & "+b +"= "+x);
        y = a|b;
        System.out.println(a+" | "+b +"= "+y);
        c = a>>2;
        System.out.println(a+" >>"+2 +"= "+c);
        d = a<<3;
        System.out.println(a+" <<"+3 +"= "+d);
    }
}
