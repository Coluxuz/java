import java.util.Scanner;
public class shirttest {
    public static void main(String[] args) {
        shirt shirt = new shirt();
        shirt.show();
        shirt shirt2 = new shirt();
        Scanner in = new Scanner(System.in);
        System.out.println("enter id:");
        shirt2.id = in.nextInt();
        System.out.println("enter description:");
        shirt2.description = in.nextLine();
        System.out.println("enter Color Code:");
        shirt2.colorCode = in.nextLine();
        System.out.println("enter price:");
        shirt2.price = in.nextInt();
        System.out.println("enter qulity:");
        shirt2.qulity = in.nextInt();
        shirt2.show();
    }
}
