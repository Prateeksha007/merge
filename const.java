package constructor;
public class const{
    String model;
    int year;
    const(String m,int y,int n) {
        model = m;
        year = y;
        num = n;
}
void displayCarDetails() {
    System.out.println("Const Model: "+model);
    System.out.println("Const Year: "+year);
    System.out.println("Const num: "+num);

}
public static void main(String[]args) {
    const c = new const("toyota",20);
    c.displayCarDetails();
}
}
