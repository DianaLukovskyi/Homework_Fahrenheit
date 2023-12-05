package homework;

public class Rectangle {
    double length;
    double width;

    public Rectangle (double length, double width){
        this.length =length;
        this.width = width;
    }
    double recArea(){
        return length * width;
    }
  double recPerimeter(){
        return 2 * (length + width);
  }



}
