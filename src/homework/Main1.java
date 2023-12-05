package homework;

public class Main1 {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(6.0,5.0);
        Rectangle rectangle2 = new Rectangle(2.5,2.0);
        Rectangle rectangle3 = new Rectangle(4,1.5);

        System.out.println("Rectangle 1: " + "Area "  + rectangle1.recArea());
        System.out.println("Perimeter " + rectangle1.recPerimeter());
        System.out.println("Rectangle 2: " + "Area "  + rectangle2.recArea());
        System.out.println("Perimeter " + rectangle2.recPerimeter());
        System.out.println("Rectangle 3: " + "Area "  + rectangle3.recArea());
        System.out.println("Perimeter " + rectangle3.recPerimeter());
    }
}
