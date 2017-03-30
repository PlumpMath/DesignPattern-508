package factory;

import java.util.ArrayList;

/**
 * Created by zjy on 2017/3/30.
 */
public abstract class Pizza  {
    String name;
    String dough;
    ArrayList<String> toping = new ArrayList<String>();
    public abstract void prapare();

    public String getName() {
        return name;
    }
}
