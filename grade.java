
import java.util.Scanner;

public class grade {
    public static void main(String[] args){
        int s;
        Scanner in = new Scanner(System.in);
        s = in.nextInt();
        if(s > 80){
            System.out.println("grade is: A");
        }
        else if(s >= 75){
            System.out.println("grade is: B+");
        }
        else if(s >= 70){
            System.out.println("grade is: B");
        }
        else if(s >= 65){
            System.out.println("grade is: C+");
        }
        else if(s >= 60){
            System.out.println("grade is: C");
        }
        else if(s >= 55){
            System.out.println("grade is: D+");
        }
        else if(s >= 50){
            System.out.println("grade is: D");
        }
        else if(s >= 49){
            System.out.println("grade is: u r son of bitch");
        }
    }
}

