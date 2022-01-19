package javastudy.generics;

public class Toy<T> {
    T price;

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }
}
