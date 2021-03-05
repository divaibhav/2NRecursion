package main;

public class MyMain {
    public static void main(String[] args) {
        System.out.println(factorial(17));
        System.out.println(Integer.MAX_VALUE +"<-- max value");
        System.out.println(mul(5,6));
    }
    //factorial
    public static int factorial(int n){
        if(n>=0) {
            //base case
            if (n == 0) {
                return 1;
            }
            //recursive call
            else {
                return n * factorial(n - 1);
            }
        }
        else {
            return n;
        }
    }
    //multiplication of positive integers
    public static int mul(int a, int b){
        if(b == 1){
            return a;
        }
        else{
            return a + mul(a, b-1);
        }
    }
}
