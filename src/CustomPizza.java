public class CustomPizza {

    private String toppings;
    private double price;

    public String getToppings() {
        return toppings;
    }
    public double getPrice() {
        return price;
    }
    public void setToppings(String toppings) {
        this.toppings = toppings;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "Custom Pizza with " + toppings + " toppings";
    }
}
