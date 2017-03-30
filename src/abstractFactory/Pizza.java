package abstractFactory;

import java.util.ArrayList;

/**
 * Created by zjy on 2017/3/30.
 */
public abstract class Pizza {
    String name;
    Object dough;

    ArrayList<Object> toping = new ArrayList<Object>();

    public abstract void prapare();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
