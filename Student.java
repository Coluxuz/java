public class Student {

    public String Name;
    public String S_Name;
    public String ID;
    public String Year;
    public String Facullty;
    public int stdcls;

    public void displayData(){
        System.out.print("======================\n");
        System.out.print("||   STUDENTS INFO   ||");
        System.out.print("\n|| NAME:"+Name+"    ||");
        System.out.print("\n|| SURNAME:"+S_Name+"  ||");
        System.out.print("\n|| ID:"+ID+" ||");
        System.out.print("\n|| YEAR:"+Year+"            ||");
        System.out.print("\n|| CLASS:"+stdcls+"           ||");
        System.out.print("\n|| FACULLTY:"+Facullty+"      ||");
        System.out.print("\n======================");
    }

    public static void main(String[] args) {
        Student type  = new Student();
        type.Facullty = "SCI";
        type.ID = "065350201234-4";
        type.Name = "Putthipol";
        type.S_Name = "Nonlapat";
        type.Year ="2";
        type.stdcls = 3;
        type.displayData();

    }

}
