package begineerjava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x=10;
        int res;
        res =+ x;
        System.out.println("x ="+res);
        res =- x;
        System.out.println("x ="+res);
        int a = 25;
        res =--a;
        System.out.println("Prefix Decrement of a="+res);
        res =a--;
        System.out.println("Postfix Decrement of a ="+res);
        res =++a;
        System.out.println("Prefix Increment of a="+res);
        res =a++;
        System.out.println("Postfix Increment of a ="+res);

    }
}
