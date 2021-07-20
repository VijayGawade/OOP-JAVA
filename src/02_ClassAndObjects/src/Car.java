public class Car {
    private String modelName;
    private String color;
    private int seats;

    Car(String modelName,String color, int seats){
        this.modelName=modelName;
        this.color=color;
        this.seats=seats;

        System.out.println("Car object initialized ...");
    }
    void display() {
        System.out.println("Model Name is "+ this.modelName);
        System.out.println("Color is "+ this.color);
        System.out.println("No of seats available is "+ this.seats);
    }
}
