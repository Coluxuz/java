import java.io.Console;
import java.util.Scanner;

public class matafakies {
    public static void main(String args[]){
        int a;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        while (a!=-1){
            System.out.println("enter something:");
            int b;
            b = in.nextInt();
            if(b==1){
                System.out.print("something:");
            }
            else{
                System.out.print("matafakies\n");
            }
        }
        System.out.println("process was end:");
        System.exit(505);
    }
}
