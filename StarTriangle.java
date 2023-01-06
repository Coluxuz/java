import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args){
        int i,j,a,x,len;


        do {
            System.out.println("##===> enter 0 to exit <===##");
            System.out.print("chose the symbol 1. * to slope , 2. # to pyramid :");
            Scanner in = new Scanner(System.in);
            a = in.nextInt();
            if (a!=0){

                if (a == 1){
                    System.out.print("enter line of "+"* : ");
                    x = in.nextInt();
                    for (i=0;i<=x;i++){
                        for (j=0;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                }
                else if (a == 2){
                    System.out.print("enter line of "+"# : ");
                    x = in.nextInt();
                    for (i=1;i<=x;i++){
                        for (j=1;j<=2*x-1;j++){
                            if (j >= x-(i-1)&& j<=x+(i-1)){
                                System.out.print("⛵");
                            }
                            else{
                                System.out.print(" ");
                            }
                        }
                        System.out.print("\n");
                    }
                }
            }
            else {
                System.out.println("____invalid input please enter 1 or 2____");
            }
            System.out.println("____invalid input please enter 1 or 2____");
        }
        while (a!=0);
        System.exit(-1);


    }
}
