package Java07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Hangar {

    public static void main(String[] args){

        List<Vehicle> hangar = new ArrayList<>();

        Car clio = new Car("Clio",20000);
        Boat titanic = new Boat("Titanic", 400000);

        hangar.add(clio);
        hangar.add(titanic);

        for (Vehicle vehicle : hangar) {
            System.out.println(vehicle.doStuff());
        }

    }
}
