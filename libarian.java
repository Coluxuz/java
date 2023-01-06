public class libarian {

    public String name;
    public String S_name;
    public String work_time;
    public String DOB;
    public String ID;



    public void show(){
        System.out.print("=======================================\n");
        System.out.print("||           LIBARIAN INFO           ||");
        System.out.print("\n|| NAME:"+name+"                 ||");
        System.out.print("\n|| SURNAME:"+S_name+"                    ||");
        System.out.print("\n|| DATE OF BIRTH:"+DOB+"          ||");
        System.out.print("\n|| ID:"+ID+"                  ||");
        System.out.print("\n|| WORK TIME:"+work_time+"             ||");
        System.out.print("\n=======================================");
    }

    public static void main(String[] args) {
        libarian type = new libarian();
        type.name = "MRS.PORNPIYA";
        type.S_name = "SAETAE";
        type.work_time = "23.00-03.00";
        type.DOB = "01/01/2011";
        type.ID = "3120100895466";
        type.show();
    }
}
