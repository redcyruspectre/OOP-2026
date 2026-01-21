package Pratice1.week1;
public class Cars {
    public static void main(String[] args) {
        Car cars1 = new Car();
        // use dot notation to access object's property
        cars1.make = "ferrari";
        cars1.ownership = "Piero Ferrari";

        cars1.print();

        Car cars2 = new Car();
        cars2.make = "lamborghini";
        cars2.ownership = "Audi";

        System.out.println();
        cars2.print();

    }
}
