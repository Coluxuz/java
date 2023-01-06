public class shirt {
    public int id = 1000;
    public String description = "โรงงานเสื้อ";
    public String colorCode = "BLACK";
    public int price = 150;
    public int qulity = 100;

    public void show(){
        System.out.println("รหัสเสื้อ : "+id);
        System.out.println("คำอธิบาย : "+description);
        System.out.println("สี : "+colorCode);
        System.out.println("ราคา : "+price+" บาท");
        System.out.println("จำนวนเสื้อ : "+qulity+" ตัว");
        System.out.println("_________________________________");
    }

}
