import java.util.Scanner;
public class stdtest {
    public static void main(String[] args) {
        std std = new std();
        Scanner in = new Scanner(System.in);
        System.out.println("enter name :");
        std.name = in.nextLine();
        System.out.println("enter surname :");
        std.surname = in.nextLine();
        System.out.println("enter age :");
        std.age = in.nextInt();
        System.out.println("enter sex :");
        std.gender = in.nextLine();
        System.out.println("enter subject :");
        std.subject = in.nextLine();
        System.out.println("enter code :");
        std.code = in.nextLine();
        std.show();



    }
}
