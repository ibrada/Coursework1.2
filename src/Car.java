public class Car {

    private String model;
    private int number;

    public Car(String model, int number) {
        this.model = model;
        this.number = number;
    }

    public String getModel() {
        return this.model;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
