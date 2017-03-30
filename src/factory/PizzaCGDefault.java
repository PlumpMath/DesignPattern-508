package factory;

/**
 * Created by zjy on 2017/3/30.
 */
public class PizzaCGDefault extends Pizza {
    @Override
    public void prapare() {
        System.out.println("prepare"+getClass().getName());

    }
}
