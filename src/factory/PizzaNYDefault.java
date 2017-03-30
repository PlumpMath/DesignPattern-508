package factory;

/**
 * Created by zjy on 2017/3/30.
 */
public class PizzaNYDefault extends Pizza {
    @Override
    public void prapare() {
        System.out.println("prepare"+getClass().getName());
    }
}
