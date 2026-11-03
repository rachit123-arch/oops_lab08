package labsheet08.question02;

public class Question02RectangleBean {
    public static void main(String[] args) {
        RectangleBean rectangle = new RectangleBean();
        rectangle.setLength(8);
        rectangle.setWidth(5);

        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
