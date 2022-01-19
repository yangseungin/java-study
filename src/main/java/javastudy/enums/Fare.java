package javastudy.enums;

enum Fare {
    BUS(1200),
    TRAIN(10000),
    AIRPLANE(30000),
    SHIP(50000);

    private final int fare;

    Fare(int fare) {
        this.fare=fare;
    }

    public int getFare() {
        return fare;
    }
}
