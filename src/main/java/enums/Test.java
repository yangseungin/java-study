package enums;

import java.util.EnumSet;

public class Test {
    public static void main(String[] args) {
//        Fare[] values = Fare.values();
//        for (Fare value : values) {
//            System.out.println(value);
//        }

//        Fare fare = Fare.valueOf("BUS");
//        System.out.println(fare.getFare());
//        Fare fare2 = Fare.valueOf("SPACESHIP");
//        System.out.println(fare2.getFare());

//        Fare fare = Fare.valueOf("SHIP");
//        System.out.println(fare.ordinal());
//        System.out.println(fare.name());
//        System.out.println(fare.getDeclaringClass());

        EnumSet<Fare> allVehicle = EnumSet.allOf(Fare.class); //모든 Fare Enum을 가진 set 반환
        for (Fare vehicle : allVehicle) {
            System.out.println(vehicle);
        }
        EnumSet vehicleOnLoad = EnumSet.of(Fare.BUS, Fare.TRAIN); //특정값으로 set 반환
        System.out.println("땅에서 탈것 " + vehicleOnLoad);
        EnumSet notLand = EnumSet.complementOf(vehicleOnLoad);  //특정값을 제외하고 set 반환
        System.out.println("땅에서 탈수없는것 " + notLand);


    }
}
