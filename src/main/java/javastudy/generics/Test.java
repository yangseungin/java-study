package javastudy.generics;

public class Test {
    public static void main(String[] args) {
        Toy<Integer> toy = new Toy<>();
        toy.setPrice(10000);
        System.out.println(toy.getPrice());
    }
}
