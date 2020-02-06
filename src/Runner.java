public class Runner {
    public static void main(String[] args){
        Car myCar = new Car(2020, "Land Rover", "Range Rover Sport");
        System.out.println(myCar.toString());
        myCar.drive(2000);
        System.out.println(myCar.toString());

        Rectangle rect = new Rectangle(5,5);
        System.out.println(rect.getArea());
        System.out.println(rect.getDiagonal());
        System.out.println(rect.isSquare());
    }
}
