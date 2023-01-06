public class Triangle extends Shape{
    public Triangle(){
        super();
    }
    public Triangle(int x, char ch){
        super(x, ch);
    }

    public void draw(int x, int y) {
        for (int i = 1; i <= y;i++){
            System.out.println();
        }
        for (int len = 1 ;len <= rows;len++){
            for (int i = 0;i<=rows-len+x;i++){
                System.out.println("");
            }
            for (int i = 1;i<=len;i++){
                System.out.println(character+"");
            }
            System.out.println();
        }
    }
}
