import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
        if (prc1.compareTo(prc2) >= 0) {
            return Arrays.asList(new ProductionRemoteControlCar[] {prc2, prc1});
        } else {
            return Arrays.asList(new ProductionRemoteControlCar[] {prc1, prc2});
        } 
    }
}
