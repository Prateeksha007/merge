package constructor;
public class const{
    String model;
    int year;
    const(String m,int y) {
        model = m;
        year = y;
}
void displayCarDetails() {
    System.out.println("Const Model: "+model);
    System.out.println("Const Year: "+year);
}
public static void main(String[]args) {
    const c = new const("toyota",20);
    c.displayCarDetails();
}
}
