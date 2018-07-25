package Chapter9;

/**
 * Created by Wilbur Hsu on 2016/11/8.
 */
public class TestCircle1 {
    public static void main(String[] args) {
        Circle_1 circle_1 = new Circle_1();
        System.out.println("The area of the circle of radius " + circle_1.radius + " is " + circle_1.getArea());

        Circle_1 circle_2 = new Circle_1(25);
        System.out.println("The area of the circle of radius " + circle_2.radius + " is " + circle_2.getArea());

        Circle_1 circle_3 = new Circle_1(125);
        System.out.println("The area of the circle of radius " + circle_3.radius + " is " + circle_3.getArea());

        circle_2.radius = 100;
        System.out.println("The area of the circle of radius " + circle_2.radius + " is " + circle_2.getArea());
    }
}

class Circle_1{
    double radius;

    Circle_1(){
        radius = 1.0;
    }

    Circle_1(double newRadius){
        radius = newRadius;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }
}
