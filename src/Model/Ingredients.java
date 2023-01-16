package Model;

public class Ingredients {
    String name;
    int price;

    int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Ingredients(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity=quantity;
    }
}
