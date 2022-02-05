package base;

import java.util.Random;

public class Helper {

    public static int randomNumber() {
        return new Random().nextInt(0, 1000);
    }
}
