
class Circle {
    final double PI = 3.14159;//[1]
 
    final double calculateAreaOfCircle(double radius) {//[2]
        return PI * radius * radius;//[3]
    }
}
 
 class AreaOfCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();//[10]
        double area = circle.calculateAreaOfCircle(2.0);//[11]
        System.out.println("area = " + area);//[12]
    }
}