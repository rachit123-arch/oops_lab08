package labsheet08.question09;

public class Question09CarBean {
    public static void main(String[] args) {
        CarBean car = new CarBean();
        car.setMake("Toyota");
        car.setModel("Camry");
        car.setYear(2024);

        System.out.println(car.getMake() + " " + car.getModel() + " (" + car.getYear() + ")");
    }
}
