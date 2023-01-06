import java.util.Scanner;

public class TestDraw {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Shape shape = null;
        int shapeNumber;
        System.out.println("::Enter:: 1:Square 2:RightTriangle 3:EquilateralTriangle::");
        shapeNumber = in.nextInt();
            switch (shapeNumber){
                case 1:shape = new Square(4,'*');
                  break;
                case 2:shape = new RightTriangle(5,'#');
                  break;
                case 3:shape = new Triangle(6,'+');
                  break;
                default:
                    System.out.println("invalid entry");
                    System.exit(1);

            }
            shape.draw(1,1);
    }
}
