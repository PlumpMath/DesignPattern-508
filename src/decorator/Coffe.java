package decorator;

import java.io.InputStream;

/**
 * Created by zjy on 2017/3/29.
 */
public class Coffe extends Beverage {
    @Override
    public double cost() {
        return 1.2;
    }

    public Coffe() {
    }

    @Override
    public String getDescription() {
        System.out.print("coffe");

        return super.getDescription();
    }
}
