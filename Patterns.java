 import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("enter a number");

        n = sc.nextInt();

        int revnum = 0;

        while(n > 0){

            int lastdigit = n % 10;

            revnum = revnum * 10 + lastdigit;

            n = n / 10;
        }

        System.out.println(revnum);
    }
} 
    

