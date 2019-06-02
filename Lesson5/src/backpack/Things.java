package backpack;

public class Things {
    private String name;
    private int price;
    private int weight;

    public Things (String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + ": вес = " + weight + ", цена = " + price;
    }
}
